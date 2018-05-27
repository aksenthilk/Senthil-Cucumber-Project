package lib;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataConfig {
	static XSSFWorkbook wb;
    XSSFSheet sheet1;
	
	public ExcelDataConfig(String excelPath){
		
		File fil = new File(excelPath);
		try {
			FileInputStream fis = new FileInputStream(fil);
			wb = new XSSFWorkbook(fis);
			//sheet1 = wb.getSheetAt(0);
			
		} catch (Exception e) {
			e.printStackTrace();		
		}
		
		
	}
	
	

public String getData(int row,int column){
	
	String data = sheet1.getRow(row).getCell(column).getStringCellValue();
	try {
		wb.close();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return data;
	
	
}

public int rowCount(int sheet){
	sheet1 = wb.getSheetAt(sheet);
	int rowCount = sheet1.getLastRowNum();
	
	return rowCount;
}

}