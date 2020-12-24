
@event
Feature:

  @event_create
  Scenario: User creates events
    Given User is on the landing page
    And User logs in as "hr"
    Then User clicks on "Event" button
    And User enters following information
      |Event Name           |Start Date |Start Time |End Date  |End Time |Meeting Room     | Members        |
      |Job Offer Celebration|8/12/2020  |8:00 pm    |8/12/2020 |11:45 pm |East Meeting Room|To All employees|
      |Customer Dinner      |8/12/2020  |8:00 pm    |8/12/2020 |11:45 pm |West Meeting Room|To All employees|
      |Sales Manager Birthday Party|8/12/2020  |8:00 pm    |8/12/2020 |11:45 pm |East Meeting Room|To All employees|


  @confirm_attendance
  Scenario: User confirm attendance
    Given User is on the landing page
    And User logs in as "helpdesk"
    And User clicks on "Confirm Attendance:" button on the Event Window
    Then User verifies that "You are attending this event" and "Attendees confirmed:" message displayed on the Event Window


  @event_more_options
  Scenario: Verifying more options on the event window
    Given User is on the landing page
    And User logs in as "helpdesk"
    Then user verifies that more button on the event page has following options
      |Open message|
      |Copy link |
      |Add to favorites   |
      |Create task  |

  @comment_event
  Scenario: User can comment to event
    Given User is on the landing page
    And User logs in as "helpdesk"
    When User enters "My pleasure!" message on the comment box
    And User verifies that "My pleasure!" message showed up on the event window


  @like_comment
  Scenario: User can like comment
    Given User is on the landing page
    And User logs in as "hr"
    When User hover over the like button under event comment
    Then User verifies that six emoji showed up
    And User clicks "Like" under event comment
    Then User verifies that like image was displayed on the comment

#    event
#  yesim


#   git push --set-upstream origin Event
