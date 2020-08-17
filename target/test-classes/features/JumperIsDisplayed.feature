Feature: Jumper is Displayed

Scenario: Verify jumper is displayed

Given I am on the Homepage
When I Login
And I go to YTO page
And I go to By Flyer tab
And I click on Price-Qty
Then I verify jumper with text is displayed
When I click on Price-Qty
Then I verify jumper is NOT displayed