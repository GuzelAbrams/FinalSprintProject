Feature:  Recommended list

  Scenario:  verify item is added to recommended list

Given I am on the Homepage
When I Login
And I search 'Harry' using search box
And I click on 'star' icon
Then I verify item is added to recommended list