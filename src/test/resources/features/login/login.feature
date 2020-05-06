@login
Feature: Login

@login_hr
  Scenario: User should be able to login as hr with credentials
    Given User is on the landing page
    And User logs in as hr
    Then User verifies that "Portal" Page title is displayed


  @login_credentials
  Scenario: User should be able to login with credentials
    Given User is on the landing page
    And User enters "helpdesk47@cybertekschool.com" as a username and "UserUser" as password
   Then User verifies that "Portal" Page title is displayed
