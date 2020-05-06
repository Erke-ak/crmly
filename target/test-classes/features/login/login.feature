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

  @login_with_data_table
    Scenario: Login as marketing (data table example)
      Given User is on the landing page
      And User logs in as marketing with following credentials

        | username | marketing47@cybertekschool.com    |
        | password | UserUser                          |
    Then User verifies that "Portal" Page title is displayed

  @login_with_ddt
  Scenario Outline: ddt example with <role>
    Given User is on the landing page
    And User logs in as "<role>"
    Then User verifies that "Portal" Page title is displayed

    Examples:
   | role|
   |hr|
   |helpdesk|
   |marketing|

  @login_credentials_ddt
  Scenario Outline: DDT examples with <username> and <password>
    Given User is on the landing page
    And User enters "<username>" as a username and "<password>" as password
    Then User verifies that "Portal" Page title is displayed

    Examples:
    |username               | password |
    |helpdesk47@cybertekschool.com| UserUser |
    |marketing47@cybertekschool.com| UserUser|
    |hr47@cybertekschool.com       |UserUser |
    |helpdesk48@cybertekschool.com| UserUser |
    |marketing48@cybertekschool.com| UserUser|
    |hr48@cybertekschool.com       |UserUser |


