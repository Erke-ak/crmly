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
  "name": "User clicks on \"MORE\" button",
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
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});