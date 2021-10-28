Feature: feature to test google search

Scenario: validate google search is working

Given browser is open
And user is on google search page
When user enter text in searchbox
And click on search button
Then result should be displayed

