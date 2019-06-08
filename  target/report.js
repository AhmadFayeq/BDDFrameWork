$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Features/TekSchoolTest.feature");
formatter.feature({
  "line": 2,
  "name": "Tek School Test",
  "description": "",
  "id": "tek-school-test",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@TekSchoolTest"
    }
  ]
});
formatter.before({
  "duration": 3871559619,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "User go to  Tek School page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User click on test environment",
  "keyword": "When "
});
formatter.match({
  "location": "StepDifinitions.user_go_to_Tek_School_page()"
});
formatter.result({
  "duration": 5090370454,
  "status": "passed"
});
formatter.match({
  "location": "StepDifinitions.user_click_on_test_environment()"
});
formatter.result({
  "duration": 1249594539,
  "status": "passed"
});
formatter.scenario({
  "line": 9,
  "name": "Login to test environment",
  "description": "",
  "id": "tek-school-test;login-to-test-environment",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 8,
      "name": "@LoginTest"
    },
    {
      "line": 8,
      "name": "@smoketest"
    },
    {
      "line": 8,
      "name": "@test"
    }
  ]
});
formatter.step({
  "line": 11,
  "name": "User should see the test environment page",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "User veriry test environment title",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDifinitions.user_should_see_the_test_environment_page()"
});
formatter.result({
  "duration": 755608218,
  "status": "passed"
});
formatter.match({
  "location": "StepDifinitions.user_veriry_test_environment_title()"
});
formatter.result({
  "duration": 7390063,
  "status": "passed"
});
formatter.after({
  "duration": 698411826,
  "status": "passed"
});
formatter.before({
  "duration": 3314088978,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "User go to  Tek School page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User click on test environment",
  "keyword": "When "
});
formatter.match({
  "location": "StepDifinitions.user_go_to_Tek_School_page()"
});
formatter.result({
  "duration": 5008771331,
  "status": "passed"
});
formatter.match({
  "location": "StepDifinitions.user_click_on_test_environment()"
});
formatter.result({
  "duration": 1250250987,
  "status": "passed"
});
formatter.scenario({
  "line": 15,
  "name": "Login to My Account",
  "description": "",
  "id": "tek-school-test;login-to-my-account",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 14,
      "name": "@loginPage"
    },
    {
      "line": 14,
      "name": "@test"
    }
  ]
});
formatter.step({
  "line": 16,
  "name": "User click on myAccount",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "User select login from dropdown",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "User should see login page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDifinitions.user_click_on_myAccount()"
});
formatter.result({
  "duration": 268547767,
  "status": "passed"
});
formatter.match({
  "location": "StepDifinitions.user_select_login_from_dropdown()"
});
formatter.result({
  "duration": 632377790,
  "status": "passed"
});
formatter.match({
  "location": "StepDifinitions.user_should_see_login_page()"
});
formatter.result({
  "duration": 388096529,
  "status": "passed"
});
formatter.after({
  "duration": 686015375,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 21,
  "name": "Testing login with different user and pass",
  "description": "",
  "id": "tek-school-test;testing-login-with-different-user-and-pass",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 20,
      "name": "@test001"
    }
  ]
});
formatter.step({
  "line": 22,
  "name": "User click on myAccount",
  "keyword": "When "
});
formatter.step({
  "line": 23,
  "name": "User select login from dropdown",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "User should see login page",
  "keyword": "Then "
});
formatter.step({
  "line": 25,
  "name": "User enter username \u003cuserName\u003e",
  "keyword": "When "
});
formatter.step({
  "line": 26,
  "name": "User enter password \u003cpassword\u003e",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "Click continue button",
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "User should be logged in successfully",
  "keyword": "Then "
});
formatter.examples({
  "line": 30,
  "name": "",
  "description": "",
  "id": "tek-school-test;testing-login-with-different-user-and-pass;",
  "rows": [
    {
      "cells": [
        "userName",
        "password"
      ],
      "line": 32,
      "id": "tek-school-test;testing-login-with-different-user-and-pass;;1"
    },
    {
      "cells": [
        "tes12@tek.com",
        "test0011"
      ],
      "line": 33,
      "id": "tek-school-test;testing-login-with-different-user-and-pass;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 3428978854,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "User go to  Tek School page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User click on test environment",
  "keyword": "When "
});
formatter.match({
  "location": "StepDifinitions.user_go_to_Tek_School_page()"
});
formatter.result({
  "duration": 5745786672,
  "status": "passed"
});
formatter.match({
  "location": "StepDifinitions.user_click_on_test_environment()"
});
formatter.result({
  "duration": 1873484757,
  "status": "passed"
});
formatter.scenario({
  "line": 33,
  "name": "Testing login with different user and pass",
  "description": "",
  "id": "tek-school-test;testing-login-with-different-user-and-pass;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@TekSchoolTest"
    },
    {
      "line": 20,
      "name": "@test001"
    }
  ]
});
formatter.step({
  "line": 22,
  "name": "User click on myAccount",
  "keyword": "When "
});
formatter.step({
  "line": 23,
  "name": "User select login from dropdown",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "User should see login page",
  "keyword": "Then "
});
formatter.step({
  "line": 25,
  "name": "User enter username tes12@tek.com",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 26,
  "name": "User enter password test0011",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "Click continue button",
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "User should be logged in successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDifinitions.user_click_on_myAccount()"
});
formatter.result({
  "duration": 81146241,
  "status": "passed"
});
formatter.match({
  "location": "StepDifinitions.user_select_login_from_dropdown()"
});
formatter.result({
  "duration": 366323191,
  "status": "passed"
});
formatter.match({
  "location": "StepDifinitions.user_should_see_login_page()"
});
formatter.result({
  "duration": 451372657,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "tes12@tek.com",
      "offset": 20
    }
  ],
  "location": "StepDifinitions.user_enter_username_test_test_com(String)"
});
formatter.result({
  "duration": 81141101,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "test0011",
      "offset": 20
    }
  ],
  "location": "StepDifinitions.user_enter_password_test_test_com(String)"
});
formatter.result({
  "duration": 64340222,
  "status": "passed"
});
formatter.match({
  "location": "StepDifinitions.click_continue_button()"
});
formatter.result({
  "duration": 511747454,
  "status": "passed"
});
formatter.match({
  "location": "StepDifinitions.user_should_be_logged_in_successfully()"
});
formatter.result({
  "duration": 399947566,
  "status": "passed"
});
formatter.after({
  "duration": 689075034,
  "status": "passed"
});
});