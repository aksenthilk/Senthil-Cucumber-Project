Feature: Deal data creation

Scenario: Free CRM Create a new deal scenario

Given user is already on Login Page
When title of login page is Free CRM
Then user enters username and password
| naveenk | test@123 |
Then User clicks on Login button
Then User is on home page
And User moves to new deal page
Then User enters deal details 
| test deal | 1000 | 50 |10 | 
And Closes Browser