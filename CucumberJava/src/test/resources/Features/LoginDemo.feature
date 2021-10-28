Feature: feature to test login feature

  Scenario Outline: check login is successful with valid credentials
    Given user is on login test page
    When user enters the <username> and <password>
    And clicks on the login button
    Then user should be nevigated to nextpage

    Examples: 
      | username | password |
      | ankur    |    12345 |
      | bhawna   |    12345 |
