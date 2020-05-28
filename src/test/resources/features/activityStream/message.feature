@message
Feature:

  Background:
    Given User is on the landing page
    When User logs in "hr"

  @message_options1
  Scenario: Message options are displayed
    Then User clicks on "MESSAGE" button
    And  User enters "Hello everyone! Let's have a meeting."
    And User clicks "Add more" options to window
    And User clicks "Employees and departments" options on people window
    Then User choose first address from people window
    And User close people window
    And User close "All employees" option from to window
    Then User clicks "SEND" button
    Then User verifies message is displayed on the main page
