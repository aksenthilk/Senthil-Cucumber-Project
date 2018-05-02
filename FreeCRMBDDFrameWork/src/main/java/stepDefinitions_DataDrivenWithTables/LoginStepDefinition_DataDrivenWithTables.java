package stepDefinitions_DataDrivenWithTables;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class LoginStepDefinition_DataDrivenWithTables {
	WebDriver driver;
	
	@Given("^user is already on Login Page$")
	public void user_is_already_on_Login_Page() {
		System.setProperty("webdriver.chrome.driver", "G:\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.freecrm.com");
	  
	}
	
	@When("^title of login page is Free CRM$")
	public void title_of_login_page_is_Free_CRM() throws Throwable {
		String title = driver.getTitle();
		Assert.assertEquals("Free CRM software in the cloud powers sales and customer service", title);
		   
	}	
	
	//credentials refer to the data in the data table in the TestRunner_Deals.java class
	@Then("^user enters username and password$")
	public void user_enters_username_and_password(DataTable credentials)  {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
	    List<List<String>> data = credentials.raw();
	    driver.findElement(By.name("username")).sendKeys(data.get(0).get(0));
		driver.findElement(By.name("password")).sendKeys(data.get(0).get(1));
	}

	
   
	
	@Then("^User clicks on Login button$")
	public void user_clicks_on_Login_button()  {
		WebElement loginBtn = driver.findElement(By.xpath("//input[@type='submit']"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();",loginBtn);
		
	   
	}
	
	@Then("^User is on home page$")
	public void user_is_on_home_page() {
		String homePageTitle = driver.getTitle();
		String expectedTitle = "CRMPRO";
		Assert.assertEquals(expectedTitle, homePageTitle);
	   
	}

	
	
	@Then("^User moves to new deal page$")
	public void user_moves_to_new_deal_page() {
		driver.switchTo().frame("mainpanel");
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//a[@title='Deals']"))).build().perform();
		driver.findElement(By.xpath("//a[@title='New Deal']")).click();
		
	    
	}

	@Then("^User enters deal details$")
	public void user_enters_deal_details(DataTable dealData ) throws Exception  {
		    List<List<String>> dealValues = dealData.raw();
		    Thread.sleep(3000);
			driver.findElement(By.id("title")).sendKeys(dealValues.get(0).get(0));
			driver.findElement(By.id("amount")).sendKeys(dealValues.get(0).get(1));
			driver.findElement(By.id("probability")).sendKeys(dealValues.get(0).get(2));
			driver.findElement(By.id("commission")).sendKeys(dealValues.get(0).get(3));
			
			driver.findElement(By.xpath("//input[@value='Save']/following-sibling::input[@name='addmore']")).click();
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
	    
	}
	
	@Then("^Closes Browser$")
	public void closes_Browser(){
		driver.quit();
	}



}
