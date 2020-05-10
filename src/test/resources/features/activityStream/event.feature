
@event
  Feature:

#     Background:
#      Given User is on the landing page
#      And User logs in as "hr"


    @event_create
    Scenario: User creates events
      Given User is on the landing page
      And User logs in as "hr"
      Then User clicks on "Event" button
      And User enters following information
      |Event Name           |Start Date |Start Time |End Date  |End Time |Meeting Room     | Members        |
      |Job Offer Celebration|8/12/2020  |8:00 pm    |8/12/2020 |11:45 pm |East Meeting Room|To All employees|
      |Customer Dinner      |8/12/2020  |8:00 pm    |8/12/2020 |11:45 pm |West Meeting Room|To All employees|
      |Sales Manager Birhtday Party|8/12/2020  |8:00 pm    |8/12/2020 |11:45 pm |East Meeting Room|To All employees|


  @confirm_attendance
  Scenario: User confirm attendance
    Given User is on the landing page
    And User logs in as "helpdesk"
   And User clicks on "Confirm Attendance:" button on the Event Window
  Then User verifies that "You are attending this event" and "Attendees confirmed" message displayed on the Event Window


  @
  Scenario: Verifiying informers
   And user verifies following informers options are displayed
  |Comment|
  |Follow |
  |More   |
  |View   |
  Then User can write comment first 5 event






#    @textbox_images
#    Scenario: Textbox images
#      And User verifies that Textbox has "Upload files" image
#      Then User verifies that Event page has following area
#      |Upload files and images |
#      |Download from external drive|
#      |Select document from Bitrix24|
#      |Create using Desktop applications|