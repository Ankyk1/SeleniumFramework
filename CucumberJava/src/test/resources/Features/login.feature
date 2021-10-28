
Feature: feature to test login feature
	
  Scenario: check login is successful with valid credentials
    Given user is on login page
    When user enters username and password
    And clicks on login button
    Then user should be nevigated to homepage

