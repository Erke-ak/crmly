$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/login/login.feature");
formatter.feature({
  "name": "Login",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@login"
    }
  ]
});
formatter.scenarioOutline({
  "name": "DDT examples with \u003cusername\u003e and \u003cpassword\u003e",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@login_credentials_ddt"
    }
  ]
});
formatter.step({
  "name": "User is on the landing page",
  "keyword": "Given "
});
formatter.step({
  "name": "User enters \"\u003cusername\u003e\" as a username and \"\u003cpassword\u003e\" as password",
  "keyword": "And "
});
formatter.step({
  "name": "User verifies that \"Portal\" Page title is displayed",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ]
    },
    {
      "cells": [
        "helpdesk47@cybertekschool.com",
        "UserUser"
      ]
    },
    {
      "cells": [
        "marketing47@cybertekschool.com",
        "UserUser"
      ]
    },
    {
      "cells": [
        "hr47@cybertekschool.com",
        "UserUser"
      ]
    },
    {
      "cells": [
        "helpdesk48@cybertekschool.com",
        "UserUser"
      ]
    },
    {
      "cells": [
        "marketing48@cybertekschool.com",
        "UserUser"
      ]
    },
    {
      "cells": [
        "hr48@cybertekschool.com",
        "UserUser"
      ]
    }
  ]
});
formatter.scenario({
  "name": "DDT examples with helpdesk47@cybertekschool.com and UserUser",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@login"
    },
    {
      "name": "@login_credentials_ddt"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is on the landing page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginStepDefinitions.user_is_on_the_landing_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters \"helpdesk47@cybertekschool.com\" as a username and \"UserUser\" as password",
  "keyword": "And "
});
formatter.match({
  "location": "LoginStepDefinitions.user_enters_as_a_username_and_as_password(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User verifies that \"Portal\" Page title is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefinitions.user_verifies_that_Page_title_is_displayed(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "DDT examples with marketing47@cybertekschool.com and UserUser",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@login"
    },
    {
      "name": "@login_credentials_ddt"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is on the landing page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginStepDefinitions.user_is_on_the_landing_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters \"marketing47@cybertekschool.com\" as a username and \"UserUser\" as password",
  "keyword": "And "
});
formatter.match({
  "location": "LoginStepDefinitions.user_enters_as_a_username_and_as_password(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User verifies that \"Portal\" Page title is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefinitions.user_verifies_that_Page_title_is_displayed(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "DDT examples with hr47@cybertekschool.com and UserUser",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@login"
    },
    {
      "name": "@login_credentials_ddt"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is on the landing page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginStepDefinitions.user_is_on_the_landing_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters \"hr47@cybertekschool.com\" as a username and \"UserUser\" as password",
  "keyword": "And "
});
formatter.match({
  "location": "LoginStepDefinitions.user_enters_as_a_username_and_as_password(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User verifies that \"Portal\" Page title is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefinitions.user_verifies_that_Page_title_is_displayed(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "DDT examples with helpdesk48@cybertekschool.com and UserUser",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@login"
    },
    {
      "name": "@login_credentials_ddt"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is on the landing page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginStepDefinitions.user_is_on_the_landing_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters \"helpdesk48@cybertekschool.com\" as a username and \"UserUser\" as password",
  "keyword": "And "
});
formatter.match({
  "location": "LoginStepDefinitions.user_enters_as_a_username_and_as_password(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User verifies that \"Portal\" Page title is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefinitions.user_verifies_that_Page_title_is_displayed(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "DDT examples with marketing48@cybertekschool.com and UserUser",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@login"
    },
    {
      "name": "@login_credentials_ddt"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is on the landing page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginStepDefinitions.user_is_on_the_landing_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters \"marketing48@cybertekschool.com\" as a username and \"UserUser\" as password",
  "keyword": "And "
});
formatter.match({
  "location": "LoginStepDefinitions.user_enters_as_a_username_and_as_password(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User verifies that \"Portal\" Page title is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefinitions.user_verifies_that_Page_title_is_displayed(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "DDT examples with hr48@cybertekschool.com and UserUser",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@login"
    },
    {
      "name": "@login_credentials_ddt"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is on the landing page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginStepDefinitions.user_is_on_the_landing_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters \"hr48@cybertekschool.com\" as a username and \"UserUser\" as password",
  "keyword": "And "
});
formatter.match({
  "location": "LoginStepDefinitions.user_enters_as_a_username_and_as_password(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User verifies that \"Portal\" Page title is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefinitions.user_verifies_that_Page_title_is_displayed(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});