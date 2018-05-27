package ExcelTest;

import org.apache.poi.xssf.usermodel.XSSFSheet;

import lib.ExcelDataConfig;

public class ReadExcelData {
	
	public static void main(String args[]){
		ExcelDataConfig excel = new ExcelDataConfig("G:\\TestData_Excel.xlsx");
		
		int size = excel.rowCount(0);
		System.out.println("Number of rows are "+(size-1));
		for(int i=0;i<size-1;i++){
		
		System.out.println(excel.getData(i, 0));
		System.out.println(excel.getData(i, 1));
		}
		
		
	}

}
