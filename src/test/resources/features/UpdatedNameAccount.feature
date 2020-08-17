Feature: Updated name

Scenario:  verify name is updated successfully in My Account and Page Header

Given I am on the Homepage
When I Login
And I go to My Accounts page
And I update the name to NewName
Then I verify name to NewName is updated successfully in My Accounts
And I verify name to NewName is updated successfully in Page Header
