@web @regression @searchResults
Feature: Search Results

  Background:
    Given I am on default locations search result screen

@searchResults1
  Scenario: List of all of hotel within 10 miles radius of airport or downtown
    Then I verify system displays all hotels within 10 miles radius of airport
    And I verify Hilton Hotel is within radius


@searchResults2
  Scenario Outline: Verify user can only view the result by selected property class
    When I select property class <stars>
    Then I verify system displays only <stars> hotels on search result

  Examples:
    | stars   |
    | 5 stars |
    | 4 stars |
    | 3 stars |


@searchResults3
  Scenario: Verify todays deal price value
    Then I verify todays deal is less than $200


