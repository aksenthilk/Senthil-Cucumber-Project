$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("G:/git/Senthil-Cucumber-Project/FreeCRMBDDFrameWork/src/main/java/Features/deals.feature");
formatter.feature({
  "line": 1,
  "name": "Deal data creation",
  "description": "",
  "id": "deal-data-creation",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Free CRM Create a new deal scenario",
  "description": "",
  "id": "deal-data-creation;free-crm-create-a-new-deal-scenario",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "user is already on Login Page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "title of login page is Free CRM",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user enters username and password",
  "rows": [
    {
      "cells": [
        "naveenk",
        "test@123"
      ],
      "line": 8
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "User clicks on Login button",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "User is on home page",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "User moves to new deal page",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "User enters deal details",
  "rows": [
    {
      "cells": [
        "test deal",
        "1000",
        "50",
        "10"
      ],
      "line": 13
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "Closes Browser",
  "keyword": "And "
});
formatter.match({
  "location": "LoginStepDefinition_DataDrivenWithTables.user_is_already_on_Login_Page()"
});
formatter.result({
  "duration": 17577401493,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition_DataDrivenWithTables.title_of_login_page_is_Free_CRM()"
});
formatter.result({
  "duration": 47376535,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition_DataDrivenWithTables.user_enters_username_and_password(DataTable)"
});
formatter.result({
  "duration": 861868686,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition_DataDrivenWithTables.user_clicks_on_Login_button()"
});
formatter.result({
  "duration": 5821028663,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition_DataDrivenWithTables.user_is_on_home_page()"
});
formatter.result({
  "duration": 15776789,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition_DataDrivenWithTables.user_moves_to_new_deal_page()"
});
formatter.result({
  "duration": 861433603,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition_DataDrivenWithTables.user_enters_deal_details(DataTable)"
});
formatter.result({
  "duration": 4123692884,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition_DataDrivenWithTables.closes_Browser()"
});
formatter.result({
  "duration": 1944582581,
  "status": "passed"
});
});