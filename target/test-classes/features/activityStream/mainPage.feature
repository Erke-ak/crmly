@main_page
Feature:

  Background:
    Given User is on the landing page
    When User logs in "hr"

  @logo
  Scenario: CRM24 logo is displayed
    And User verifies that "CRM24" logo is displayed

  @task_options
  Scenario: Task Options are displayed
    And User verified that following options are displayed
      | MESSAGE |
      | TASK    |
      | EVENT   |
      | POLL    |
      | MORE    |

  @subtitles
  Scenario: Subtitles of Activity Stream
    And User verified that following subtitles are displayed for Activity Stream
      | Activity Stream  |
      | Tasks            |
      | Chat and Calls   |
      | Workgroups       |
      | Drive            |
      | Calendar 9       |
      | Mail             |
      | Contact Center   |
      | Time and Reports |
      | Employees        |
      | Services         |
      | Company          |

  @more_options
  Scenario: More options are displayed
    And User verified that following popup window options are displayed
      | File         |
      | Appreciation |
      | Announcement |
      | Workflow     |
