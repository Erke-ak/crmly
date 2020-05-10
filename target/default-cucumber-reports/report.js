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
  "name": "User confirm attendance",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@event"
    },
    {
      "name": "@confirm_attendance"
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
  "location": "LoginStepDefinitions.User_is_on_the_landing_page()"
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
  "name": "User clicks on \"Confirm Attendance:\" button on the Event Window",
  "keyword": "And "
});
formatter.match({
  "location": "EventStepDefinitions.user_clicks_on_button_on_the_Event_Window(String)"
});
formatter.result({
  "error_message": "java.lang.RuntimeException: Invalid role!\n\tat com.crmly.pages.MainPage.clickButtonOnEventWindow(MainPage.java:96)\n\tat com.crmly.stepDefinitions.EventStepDefinitions.user_clicks_on_button_on_the_Event_Window(EventStepDefinitions.java:66)\n\tat ✽.User clicks on \"Confirm Attendance:\" button on the Event Window(file:src/test/resources/features/activityStream/event.feature:26)\n",
  "status": "failed"
});
formatter.step({
  "name": "User verifies that \"You are attending this event\" and \"Attendees confirmed\" message displayed on the Event Window",
  "keyword": "Then "
});
formatter.match({
  "location": "EventStepDefinitions.user_verifies_that_and_message_displayed_on_the_Event_Window(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.embedding("image/png", "embedded0.png", null);
formatter.after({
  "status": "passed"
});
});