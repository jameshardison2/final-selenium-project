@web @regression @signUpDarkSky
Feature: Sign-up feature

  Background:
    Given I am on the landing page

  @signUpDarkSky-1
    Scenario: Verify invalid sign-up message is displayed
      When I click on api button on landing page
      And I click on sign up button on api page
      And I click on register button on register page
      Then I verify that i am on register page by asserting register header