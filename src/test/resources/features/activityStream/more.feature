@more_feature
Feature:

  Background:
    Given User is on the landing page
    When User logs in "hr"

  @more_options
  Scenario: More options are displayed
    Then User clicks on "MORE" button
    And User verified that following drop down menu options are displayed
      | File         |
      | Appreciation |
      | Announcement |
      | Workflow     |
