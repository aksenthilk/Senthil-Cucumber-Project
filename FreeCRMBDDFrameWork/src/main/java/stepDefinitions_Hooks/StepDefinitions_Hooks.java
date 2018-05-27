package stepDefinitions_Hooks;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinitions_Hooks {
	
	@Before	
	public void setUp(){
		System.out.println("Launch Chrome");
		System.out.println("Enter URL");
	}
	
	@After
	public void tearDown(){
		System.out.println("Close Browser");
	}
	
	@Given("^user is on deal page$")
	public void user_is_on_deal_page(){
		System.out.println("user is on deal page");
	    
	}

	@When("^user fills the deals page$")
	public void user_fills_the_deals_page(){
		System.out.println("user fills the deals page");
	    
	}

	@Then("^deal is created$")
	public void deal_is_created() {
		System.out.println("deal is created");
	    
	}
	
	@Given("^user is on hooks page$")
	public void user_is_on_hooks_page() {
		System.out.println("user is on hooks page");
	}

	@When("^user fills the hooks page$")
	public void user_fills_the_hooks_page() {
		System.out.println("user fills the hooks page");
	}

	@Then("^hooks is created$")
	public void hooks_is_created() {
		System.out.println("hook is created");
	   
	}
	
	@Given("^user is on mail page$")
	public void user_is_on_mail_page() {
	    System.out.println("user is on mail page");
	}

	@When("^user fills the mail page$")
	public void user_fills_the_mail_page(){
		System.out.println("user fills the mail page");
	}

	@Then("^mail is created$")
	public void mail_is_created(){
		System.out.println("mail is created");
	}


}
