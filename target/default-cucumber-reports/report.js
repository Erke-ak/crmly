$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/activityStream/event.feature");
formatter.feature({
  "name": "",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@event"
    }
  ]
});
formatter.scenario({
  "name": "",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@event"
    },
    {
      "name": "@event_create"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is on the landing page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginStepDefinitions.user_is_on_the_landing_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User logs in as \"helpdesk\"",
  "keyword": "And "
});
formatter.match({
  "location": "LoginStepDefinitions.user_logs_in_as(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on \"Event\" button",
  "keyword": "Then "
});
formatter.match({
  "location": "EventStepDefinitions.user_clicks_on_button(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters following information",
  "rows": [
    {
      "cells": [
        "Event Name",
        "Start Date",
        "Start Time",
        "End Date",
        "End Time",
        "Meeting Room",
        "Members"
      ]
    },
    {
      "cells": [
        "Job Offer Celebration",
        "8/12/2020",
        "8:00 pm",
        "8/12/2020",
        "11:45 pm",
        "East Meeting Room",
        "To All employees"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "EventStepDefinitions.user_enters_following_information(String,String\u003e\u003e)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});