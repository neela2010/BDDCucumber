$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("feature/NewAccount.feature");
formatter.feature({
  "line": 1,
  "name": "Techfios bank and cash New Account functionality",
  "description": "",
  "id": "techfios-bank-and-cash-new-account-functionality",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 7,
  "name": "",
  "description": "User should be able to login with valid credentials and Add New Account",
  "id": "techfios-bank-and-cash-new-account-functionality;",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 6,
      "name": "@NewAccount"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "User enters the \"\u003cuserName\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "User clicks on the log in button",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "User should be able to see the DashBoard Page",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "User clicks on Bank \u0026 Cash button",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "User clicks on New Account",
  "keyword": "Then "
});
formatter.step({
  "comments": [
    {
      "line": 14,
      "value": "#Then user should be able to see the Add new account page"
    }
  ],
  "line": 15,
  "name": "User fill up the form by entering \"\u003caccountTitle\u003e\" and \"\u003cdescription\u003e\" and \"\u003cinitialBalance\u003e\" and \"\u003caccountNumber\u003e\" and \"\u003ccontactPerson\u003e\" and \"\u003cphone\u003e\" and \"\u003cinternetBankingURL\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "User clicks on Submit button",
  "keyword": "Then "
});
formatter.examples({
  "line": 18,
  "name": "",
  "description": "",
  "id": "techfios-bank-and-cash-new-account-functionality;;",
  "rows": [
    {
      "cells": [
        "userName",
        "password",
        "accountTitle",
        "description",
        "initialBalance",
        "accountNumber",
        "contactPerson",
        "phone",
        "internetBankingURL"
      ],
      "line": 19,
      "id": "techfios-bank-and-cash-new-account-functionality;;;1"
    },
    {
      "cells": [
        "demo@techfios.com",
        "abc123",
        "Savings Account",
        "New business account",
        "100000",
        "9876543210000",
        "Neela Afroze",
        "6464520022",
        "https://www.chase.com"
      ],
      "line": 20,
      "id": "techfios-bank-and-cash-new-account-functionality;;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 6857509499,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "User is on the TechFios Login Page",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDef.User_is_on_the_TechFios_Login_Page()"
});
formatter.result({
  "duration": 1488322200,
  "status": "passed"
});
formatter.scenario({
  "line": 20,
  "name": "",
  "description": "User should be able to login with valid credentials and Add New Account",
  "id": "techfios-bank-and-cash-new-account-functionality;;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 6,
      "name": "@NewAccount"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "User enters the \"demo@techfios.com\" and \"abc123\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "User clicks on the log in button",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "User should be able to see the DashBoard Page",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "User clicks on Bank \u0026 Cash button",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "User clicks on New Account",
  "keyword": "Then "
});
formatter.step({
  "comments": [
    {
      "line": 14,
      "value": "#Then user should be able to see the Add new account page"
    }
  ],
  "line": 15,
  "name": "User fill up the form by entering \"Savings Account\" and \"New business account\" and \"100000\" and \"9876543210000\" and \"Neela Afroze\" and \"6464520022\" and \"https://www.chase.com\"",
  "matchedColumns": [
    2,
    3,
    4,
    5,
    6,
    7,
    8
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "User clicks on Submit button",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "demo@techfios.com",
      "offset": 17
    },
    {
      "val": "abc123",
      "offset": 41
    }
  ],
  "location": "StepDef.user_enters_Credentials(String,String)"
});
formatter.result({
  "duration": 437380800,
  "status": "passed"
});
formatter.match({
  "location": "StepDef.user_clicks_on_the_log_in_button()"
});
formatter.result({
  "duration": 1435563000,
  "status": "passed"
});
formatter.match({
  "location": "StepDef.user_should_be_able_to_see_the_DashBoard_Page()"
});
formatter.result({
  "duration": 824844299,
  "status": "passed"
});
formatter.match({
  "location": "StepDef.user_clicks_on_Bank_Cash_button()"
});
formatter.result({
  "duration": 1102109399,
  "status": "passed"
});
formatter.match({
  "location": "StepDef.user_clicks_on_New_Account()"
});
formatter.result({
  "duration": 639186700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Savings Account",
      "offset": 35
    },
    {
      "val": "New business account",
      "offset": 57
    },
    {
      "val": "100000",
      "offset": 84
    },
    {
      "val": "9876543210000",
      "offset": 97
    },
    {
      "val": "Neela Afroze",
      "offset": 117
    },
    {
      "val": "6464520022",
      "offset": 136
    },
    {
      "val": "https://www.chase.com",
      "offset": 153
    }
  ],
  "location": "StepDef.user_fill_up_the_form_by_enteringValuesOntheFields(String,String,String,String,String,String,String)"
});
formatter.result({
  "duration": 2670212200,
  "status": "passed"
});
formatter.match({
  "location": "StepDef.user_clicks_on_Submit_button()"
});
formatter.result({
  "duration": 5050958699,
  "status": "passed"
});
formatter.after({
  "duration": 849278300,
  "status": "passed"
});
});