Feature: Login Test

  Scenario: Go to amazon website and test login page
    Given Go to Amazon website
    And Click on login button
    And Enter your username
    And Enter your password
    When Click on submit button
    Then Verify the success message