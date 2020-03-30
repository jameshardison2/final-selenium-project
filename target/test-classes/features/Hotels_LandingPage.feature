@web @regression @landingPage
Feature: Landing Page

  Background:
    Given I am on hotels.com home page

@landingPage1
  Scenario Outline: Verify room count dropdown
    Then I select <select_rooms> from room dropdown
    And I verify <number_of_room_dropdown> is displayed

    Examples:
    |select_rooms | number_of_room_dropdown|
    |1            | 1                      |
    |2            | 2                      |
    |3            | 3                      |
    |4            | 4                      |
    |5            | 5                      |
    |6            | 6                      |
    |7            | 7                      |
    |8            | 8                      |
    |9+           | 0                      |


