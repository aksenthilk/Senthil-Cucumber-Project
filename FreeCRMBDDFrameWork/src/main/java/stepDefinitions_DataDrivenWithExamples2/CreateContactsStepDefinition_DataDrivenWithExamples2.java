package stepDefinitions_DataDrivenWithExamples2;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class CreateContactsStepDefinition_DataDrivenWithExamples2 {
	WebDriver driver;
		
	@Given("^User is already on Login Page$")
	public void user_is_already_on_Login_Page() {
		System.setProperty("webdriver.chrome.driver", "G:\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.freecrm.com");
	    
	}

	@When("^Title of Login page is Free CRM$")
	public void title_of_Login_page_is_Free_CRM()  {
		String title = driver.getTitle();
		Assert.assertEquals("Free CRM software in the cloud powers sales and customer service", title);
		
	    
	}

	@Then("^User enters \"(.*)\" and \"(.*)\"$")
	public void user_enters_username_and_password(String username,String password)  {
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
	   
	}

	@Then("^User clicks on Login button$")
	public void user_clicks_on_Login_button()  {
		WebElement loginBtn = driver.findElement(By.xpath("//input[@type='submit']"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();",loginBtn);
		
	   
	}
	
	@Then("^User is on home page$")
	public void user_is_on_home_page(){
		String homePageTitle = driver.getTitle();
		String expectedTitle = "CRMPRO";
		//Assert.assertEquals(expectedTitle,homePageTitle,"User is not on the Home page");
		Assert.assertEquals(expectedTitle, homePageTitle);
	    
	}

	
	@Then("^User moves to new contact page$")
	public void user_moves_to_new_contact_page(){
		driver.switchTo().frame("mainpanel");
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//a[@title='Contacts']"))).build().perform();
		driver.findElement(By.xpath("//a[@title='New Contact']")).click();
		
	}
	
	@Then("^User enter \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enter_and_and(String firstname, String lastname, String position) throws Exception {
		Thread.sleep(3000);
		driver.findElement(By.id("first_name")).sendKeys(firstname);
		driver.findElement(By.id("surname")).sendKeys(lastname);
		driver.findElement(By.id("company_position")).sendKeys(position);
		driver.findElement(By.xpath("//input[@value='Save']/following-sibling::input[@name='addmore']")).click();
	  
	}
	
	
	
	
	
	@Then("^Closes Browser$")
	public void closes_Browser(){
		driver.quit();
	}



}
