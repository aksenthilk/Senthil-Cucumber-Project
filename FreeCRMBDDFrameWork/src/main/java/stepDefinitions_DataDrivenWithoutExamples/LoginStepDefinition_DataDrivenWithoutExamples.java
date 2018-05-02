package stepDefinitions_DataDrivenWithoutExamples;

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

public class LoginStepDefinition_DataDrivenWithoutExamples {
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

	@Then("^User is on Home page$")
	public void user_is_on_Home_page()  {
		String homePageTitle = driver.getTitle();
		String expectedTitle = "CRMPRO";
		//Assert.assertEquals(expectedTitle,homePageTitle,"User is not on the Home page");
		Assert.assertEquals(expectedTitle, homePageTitle);
	   
	}
	
	@Then("^Closes Browser$")
	public void closes_Browser(){
		driver.quit();
	}



}
