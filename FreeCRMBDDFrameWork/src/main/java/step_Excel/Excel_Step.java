package step_Excel;

import java.io.File;
import java.io.FileInputStream;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import lib.ExcelDataConfig;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_Step {
	WebDriver driver;
	
	@Given("^User is is in the Login page$")
	public void user_is_is_in_the_Login_page() throws Throwable {
		//driver.get("https://github.com/login");
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//driver.manage().window().maximize();
		
	    
	}

	@When("^User fills in the login details from by reading from the Excel sheet$")
	public void user_fills_in_the_login_details_from_by_reading_from_the_Excel_sheet() throws Throwable {
		
			ExcelDataConfig excel = new ExcelDataConfig("G:\\TestData_Excel.xlsx");
			
			int size = excel.rowCount(0);
			System.out.println("Number of rows are "+(size-1));
			for(int i=0;i<size-1;i++){
			
			System.out.println(excel.getData(i, 0));
			System.out.println(excel.getData(i, 1));
			}
			
		}
		/*File file = new File("G:\\TestData_Excel.xlsx");
		FileInputStream fis = new FileInputStream(file);
		XSSFWorkbook wb = new XSSFWorkbook(fis);//loads the total work book.Should use XSSFWorkBook for .xlsx and  HSSFWorkBook for .xls
		XSSFSheet sheet1 = wb.getSheetAt(0);//loads sheet 1
		
		int rowCount = sheet1.getLastRowNum();
		
		System.out.println("Total number of rows are "+(rowCount-1));
		
		for(int i=0;i<rowCount;i++){
			
			String dataR = sheet1.getRow(i).getCell(0).getStringCellValue();
			System.out.println("Data from row is "+dataR);
			String dataC = sheet1.getRow(i).getCell(1).getStringCellValue();
			System.out.println("Data from row is "+dataC);
		}
		
		String name1 = sheet1.getRow(0).getCell(0).getStringCellValue();
		System.out.println(name1);
		
		String name2 = sheet1.getRow(0).getCell(1).getStringCellValue();
		System.out.println(name2);*/
		
		//wb.close();  

	@Then("^User Navigates to the Dash board page$")
	public void user_Navigates_to_the_Dash_board_page() throws Throwable {
	 
	}

	@Then("^User closes the Application$")
	public void user_closes_the_Application() throws Throwable {
	   
	}


}
