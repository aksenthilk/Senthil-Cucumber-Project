Feature: Free CRM Application Testing

@smokeTest @RegressionTest
Scenario: Login with correct username and password
Given This is a valid login test

@EndToEndTest
Scenario: Login with incorrect username and password
Given This is an invalid login test

@EndToEndTest
Scenario: Create a deal
Given This is an deal test

@smokeTest @EndToEndTest
Scenario: Create a contact
Given This is an contact test

@RegressionTest
Scenario: Search a contact
Given This is an contact search test

@EndToEndTest
Scenario: Verify a contact
Given This is an contact Verify test

@smokeTest @RegressionTest
Scenario: Search a deal
Given This is an deal search test

@RegressionTest
Scenario: Verify a deal
Given This is an deal Verify test

@RegressionTest
Scenario: Create a member
Given This is an create memeber test

@RegressionTest @EndToEndTest
Scenario: Search a member
Given This is an member search test

@smokeTest
Scenario: Verify a member
Given This is an member Verify test

@smokeTest
Scenario: Create a bill
Given This is an bill test

@RegressionTest
Scenario: Search a bill
Given This is a bill search test

@smokeTest
Scenario: Verify a bill
Given This is an bill Verify test