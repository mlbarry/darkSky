
@regression @testing @web
Feature: Testing DarkSky Home Page

  Background:
    Given I am on Darksky home page

@testing-1
Scenario: Verify timline is displayed in correct format
Then I verify timeline is displayed with two hours incremented


@testing-2
Scenario: Verify individual day temp timeline
When I expand todays timeline
Then I verify lowest and highest temp is displayed correctly


