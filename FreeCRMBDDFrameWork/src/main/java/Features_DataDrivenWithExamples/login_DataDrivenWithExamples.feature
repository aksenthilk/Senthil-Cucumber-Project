Feature: Free CRM Login Feature

Scenario Outline: Free Crm Login Test Scenario

Given User is already on Login Page
When Title of Login page is Free CRM
Then User enters "<username>" and "<password>"
Then User clicks on Login button
And User is on Home page
And Closes Browser

Examples:
| username | password |
| naveenk  | test@123 |
| naveenk  | test@123 |

