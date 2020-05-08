
@event
  Feature:

    @event_create
    Scenario:
      Given user is on the landing page
      And User logs in as "helpdesk"
      Then User clicks on "Event" button
      And User enters following information
      |Event Name           |Start Date |Start Time |End Date  |End Time |Meeting Room     | Members        |
      |Job Offer Celebration|8/12/2020  |8:00 pm    |8/12/2020 |11:45 pm |East Meeting Room|To All employees|

