Feature: Adding credit card

  Scenario:  verify credit card added and is displayed

Given I am on the Homepage
When I Login
And I go to My Accounts page
And I add credit card
Then I verify credit card is added successfully in My Accounts
And I verify added card is displayed when shopping using credit card