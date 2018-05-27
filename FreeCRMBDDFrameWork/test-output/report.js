$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("G:/SeleniumCucumberWorkSpace/FreeCRMBDDFrameWork/src/main/java/Features/contacts.feature");
formatter.feature({
  "line": 1,
  "name": "Free CRM Create Contacts",
  "description": "",
  "id": "free-crm-create-contacts",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "Free CRM Create a new contact scenario",
  "description": "",
  "id": "free-crm-create-contacts;free-crm-create-a-new-contact-scenario",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 6,
  "name": "User is already on Login Page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "Title of Login page is Free CRM",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "User enters \"\u003cusername\u003e\" and \"\u003cpassword\u003e\"",
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
  "name": "User moves to new contact page",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "User enter \"\u003cfirstname\u003e\" and \"\u003clastname\u003e\" and \"\u003cposition\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "Closes Browser",
  "keyword": "And "
});
formatter.examples({
  "line": 15,
  "name": "",
  "description": "",
  "id": "free-crm-create-contacts;free-crm-create-a-new-contact-scenario;",
  "rows": [
    {
      "cells": [
        "username",
        "password",
        "firstname",
        "lastname",
        "position"
      ],
      "line": 16,
      "id": "free-crm-create-contacts;free-crm-create-a-new-contact-scenario;;1"
    },
    {
      "cells": [
        "naveenk",
        "test@123",
        "Senthil",
        "kumar",
        "Engineer"
      ],
      "line": 17,
      "id": "free-crm-create-contacts;free-crm-create-a-new-contact-scenario;;2"
    },
    {
      "cells": [
        "naveenk",
        "test@123",
        "Shital",
        "kumar",
        "Engineer"
      ],
      "line": 18,
      "id": "free-crm-create-contacts;free-crm-create-a-new-contact-scenario;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 17,
  "name": "Free CRM Create a new contact scenario",
  "description": "",
  "id": "free-crm-create-contacts;free-crm-create-a-new-contact-scenario;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 6,
  "name": "User is already on Login Page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "Title of Login page is Free CRM",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "User enters \"naveenk\" and \"test@123\"",
  "matchedColumns": [
    0,
    1
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
  "name": "User moves to new contact page",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "User enter \"Senthil\" and \"kumar\" and \"Engineer\"",
  "matchedColumns": [
    2,
    3,
    4
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "Closes Browser",
  "keyword": "And "
});
formatter.match({
  "location": "CreateContactsStepDefinition_DataDrivenWithExamples2.user_is_already_on_Login_Page()"
});
formatter.result({
  "duration": 24631890921,
  "status": "passed"
});
formatter.match({
  "location": "CreateContactsStepDefinition_DataDrivenWithExamples2.title_of_Login_page_is_Free_CRM()"
});
formatter.result({
  "duration": 124133097,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "naveenk",
      "offset": 13
    },
    {
      "val": "test@123",
      "offset": 27
    }
  ],
  "location": "CreateContactsStepDefinition_DataDrivenWithExamples2.user_enters_username_and_password(String,String)"
});
formatter.result({
  "duration": 1126926399,
  "status": "passed"
});
formatter.match({
  "location": "CreateContactsStepDefinition_DataDrivenWithExamples2.user_clicks_on_Login_button()"
});
formatter.result({
  "duration": 7175334916,
  "status": "passed"
});
formatter.match({
  "location": "CreateContactsStepDefinition_DataDrivenWithExamples2.user_is_on_home_page()"
});
formatter.result({
  "duration": 25644744,
  "status": "passed"
});
formatter.match({
  "location": "CreateContactsStepDefinition_DataDrivenWithExamples2.user_moves_to_new_contact_page()"
});
formatter.result({
  "duration": 772954035,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Senthil",
      "offset": 12
    },
    {
      "val": "kumar",
      "offset": 26
    },
    {
      "val": "Engineer",
      "offset": 38
    }
  ],
  "location": "CreateContactsStepDefinition_DataDrivenWithExamples2.user_enter_and_and(String,String,String)"
});
formatter.result({
  "duration": 4341982153,
  "status": "passed"
});
formatter.match({
  "location": "CreateContactsStepDefinition_DataDrivenWithExamples2.closes_Browser()"
});
formatter.result({
  "duration": 2763213854,
  "status": "passed"
});
formatter.scenario({
  "line": 18,
  "name": "Free CRM Create a new contact scenario",
  "description": "",
  "id": "free-crm-create-contacts;free-crm-create-a-new-contact-scenario;;3",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 6,
  "name": "User is already on Login Page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "Title of Login page is Free CRM",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "User enters \"naveenk\" and \"test@123\"",
  "matchedColumns": [
    0,
    1
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
  "name": "User moves to new contact page",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "User enter \"Shital\" and \"kumar\" and \"Engineer\"",
  "matchedColumns": [
    2,
    3,
    4
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "Closes Browser",
  "keyword": "And "
});
formatter.match({
  "location": "CreateContactsStepDefinition_DataDrivenWithExamples2.user_is_already_on_Login_Page()"
});
formatter.result({
  "duration": 12243232190,
  "status": "passed"
});
formatter.match({
  "location": "CreateContactsStepDefinition_DataDrivenWithExamples2.title_of_Login_page_is_Free_CRM()"
});
formatter.result({
  "duration": 37290339,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "naveenk",
      "offset": 13
    },
    {
      "val": "test@123",
      "offset": 27
    }
  ],
  "location": "CreateContactsStepDefinition_DataDrivenWithExamples2.user_enters_username_and_password(String,String)"
});
formatter.result({
  "duration": 708084625,
  "status": "passed"
});
formatter.match({
  "location": "CreateContactsStepDefinition_DataDrivenWithExamples2.user_clicks_on_Login_button()"
});
formatter.result({
  "duration": 7438491879,
  "status": "passed"
});
formatter.match({
  "location": "CreateContactsStepDefinition_DataDrivenWithExamples2.user_is_on_home_page()"
});
formatter.result({
  "duration": 21010849,
  "status": "passed"
});
formatter.match({
  "location": "CreateContactsStepDefinition_DataDrivenWithExamples2.user_moves_to_new_contact_page()"
});
formatter.result({
  "duration": 604710560,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Shital",
      "offset": 12
    },
    {
      "val": "kumar",
      "offset": 25
    },
    {
      "val": "Engineer",
      "offset": 37
    }
  ],
  "location": "CreateContactsStepDefinition_DataDrivenWithExamples2.user_enter_and_and(String,String,String)"
});
formatter.result({
  "duration": 4285301919,
  "status": "passed"
});
formatter.match({
  "location": "CreateContactsStepDefinition_DataDrivenWithExamples2.closes_Browser()"
});
formatter.result({
  "duration": 1256233399,
  "status": "passed"
});
});