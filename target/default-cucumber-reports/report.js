$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/activityStream/message.feature");
formatter.feature({
  "name": "",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@message"
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
  "name": "Message options are displayed",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@message"
    },
    {
      "name": "@message_options"
    }
  ]
});
formatter.step({
  "name": "User clicks on \"MESSAGE\" button",
  "keyword": "Then "
});
formatter.match({
  "location": "EventStepDefinitions.user_clicks_on_button(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters \"Hello everyone! Let\u0027s have a meeting.\"",
  "keyword": "And "
});
formatter.match({
  "location": "MessageStepDefinitions.user_enters(String)"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchFrameException: No frame element found by name or id bx-html-editor-iframe-cnt-idPostFormLHE_blogPostForm\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027DESKTOP-D2A67PV\u0027, ip: \u0027192.168.1.251\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002712.0.1\u0027\nDriver info: driver.version: unknown\r\n\tat org.openqa.selenium.remote.RemoteWebDriver$RemoteTargetLocator.frame(RemoteWebDriver.java:885)\r\n\tat com.crmly.pages.MessagePage.writeMessage(MessagePage.java:17)\r\n\tat com.crmly.stepDefinitions.MessageStepDefinitions.user_enters(MessageStepDefinitions.java:18)\r\n\tat ✽.User enters \"Hello everyone! Let\u0027s have a meeting.\"(file:src/test/resources/features/activityStream/message.feature:11)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "User clicks \"Add more\" options to window",
  "keyword": "And "
});
formatter.match({
  "location": "MessageStepDefinitions.user_clicks_options_to_window(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User clicks \"Employees and departments\" options on people window",
  "keyword": "And "
});
formatter.match({
  "location": "MessageStepDefinitions.user_clicks_options_on_people_window(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User choose first address from people window",
  "keyword": "Then "
});
formatter.match({
  "location": "MessageStepDefinitions.user_choose_first_address_from_people_window()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User close people window",
  "keyword": "And "
});
formatter.match({
  "location": "MessageStepDefinitions.user_close_people_window()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User close \"All employees\" option from to window",
  "keyword": "And "
});
formatter.match({
  "location": "MessageStepDefinitions.user_close_option_from_to_window(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User clicks \"SEND\" button",
  "keyword": "Then "
});
formatter.match({
  "location": "MessageStepDefinitions.user_clicks_button(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User verifies message is displayed on the main page",
  "keyword": "Then "
});
formatter.match({
  "location": "MessageStepDefinitions.user_verifies_message_is_displayed_on_the_main_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.embedding("image/png", "embedded0.png", null);
formatter.after({
  "status": "passed"
});
});