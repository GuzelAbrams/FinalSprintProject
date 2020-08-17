@yto @regression
Feature: Jumper is not displayed

  Scenario: Jumper is not displayed

  @yto-1
Given I am on the Homepage
When I Login
And I go to YTO page
And I go to By Flyer tab
And I click on BonusPoint-Qty box
Then I verify jumper is NOT displayed
And I click on Price-Qty box
Then I verify jumper with text is displayed