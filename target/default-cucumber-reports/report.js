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
  "name": "User can like comment",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@event"
    },
    {
      "name": "@like_comment"
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
  "name": "User logs in as \"hr\"",
  "keyword": "And "
});
formatter.match({
  "location": "LoginStepDefinitions.user_logs_in_as(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User hover over the like button under event comment",
  "keyword": "When "
});
formatter.match({
  "location": "EventStepDefinitions.user_hover_over_the_like_button_under_event_comment()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User verifies that six emoji showed up",
  "keyword": "Then "
});
formatter.match({
  "location": "EventStepDefinitions.user_verifies_that_six_emogi_showed_up()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks \"Like\" under event comment",
  "keyword": "And "
});
formatter.match({
  "location": "EventStepDefinitions.user_clicks_under_event_comment(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User verifies that like image was displayed on the comment",
  "keyword": "Then "
});
formatter.match({
  "location": "EventStepDefinitions.user_verifies_that_like_image_was_displayed_on_the_comment()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});