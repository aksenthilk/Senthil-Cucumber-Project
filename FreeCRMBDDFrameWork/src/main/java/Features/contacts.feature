Feature: Free CRM Create Contacts

Scenario Outline: Free CRM Create a new contact scenario


Given User is already on Login Page
When Title of Login page is Free CRM
Then User enters "<username>" and "<password>"
Then User clicks on Login button
Then User is on home page
And User moves to new contact page
Then User enter "<firstname>" and "<lastname>" and "<position>"
And Closes Browser

Examples:
|username|password|firstname|lastname|position|
|naveenk |test@123|Senthil  |kumar   |Engineer|
|naveenk |test@123|Shital   |kumar   |Engineer|