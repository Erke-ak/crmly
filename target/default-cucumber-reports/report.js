$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/activityStream/more.feature");
formatter.feature({
  "name": "",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@more_feature"
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is on the landing page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginStepDefinitions.User_is_on_the_landing_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User logs in \"hr\"",
  "keyword": "When "
});
formatter.match({
  "location": "LoginStepDefinitions.user_logs_in(String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "More options are displayed",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@more_feature"
    },
    {
      "name": "@more_options"
    }
  ]
});
formatter.step({
  "name": "User clicks on \"More\" button",
  "keyword": "Then "
});
formatter.match({
  "location": "EventStepDefinitions.user_clicks_on_button(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User verified that following drop down menu options are displayed",
  "rows": [
    {
      "cells": [
        "File"
      ]
    },
    {
      "cells": [
        "Appreciation"
      ]
    },
    {
      "cells": [
        "Announcement"
      ]
    },
    {
      "cells": [
        "Workflow"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "MoreStepDefinitions.user_verified_that_following_drop_down_menu_options_are_displayed(String\u003e)"
});
formatter.result({
  "error_message": "java.lang.AssertionError: expected:\u003c4\u003e but was:\u003c0\u003e\r\n\tat org.junit.Assert.fail(Assert.java:88)\r\n\tat org.junit.Assert.failNotEquals(Assert.java:834)\r\n\tat org.junit.Assert.assertEquals(Assert.java:645)\r\n\tat org.junit.Assert.assertEquals(Assert.java:631)\r\n\tat com.crmly.stepDefinitions.MoreStepDefinitions.user_verified_that_following_drop_down_menu_options_are_displayed(MoreStepDefinitions.java:17)\r\n\tat ✽.User verified that following drop down menu options are displayed(file:src/test/resources/features/activityStream/more.feature:11)\r\n",
  "status": "failed"
});
formatter.embedding("image/png", "embedded0.png", null);
formatter.after({
  "status": "passed"
});
});