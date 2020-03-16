@web @regression @timelineDarkSky
Feature: Sign-up feature

  Background:
    Given I am on DarkSky landing page

  @timelineDarkSky-1
  Scenario: Verify individual day temp timeline
    When I expand today's timeline
    Then I verify lowest and highest temp is displayed correctly


  @timelineDarkSky-2

  Scenario: Verify timeline is displayed in correct format
    Given I am on Darksky home page
    Then I verify timeline is displayed with two hours incremented


  @timelineDarkSky-3
  Scenario: Verify Current Temperature should not be greater or less than the Temperature from Daily Timeline
    Given I am on Darksky Home Page
    Then I verify current temp is not greater or less then temps from daily timeline
