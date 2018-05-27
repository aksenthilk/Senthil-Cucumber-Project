Feature: Free CRM Hooks Test 

Scenario: Free CRM Create Deal Test 

	Given user is on deal page 
	When user fills the deals page 
	Then deal is created 
	
Scenario: Free CRM Verify Hooks Test 

	Given user is on hooks page 
	When user fills the hooks page 
	Then hooks is created 
	
Scenario Outline: Free CRM Create Email Test 

	Given user is on mail page 
	When user fills the mail page 
	Then mail is created 
	Examples:
	|mail1|
	|mail2|
	|mail3|
