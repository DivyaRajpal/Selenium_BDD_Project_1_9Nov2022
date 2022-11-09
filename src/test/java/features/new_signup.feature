Feature: Sign up to elearning website


  Scenario: Sign up to elearning website through valid details
    Given User navigates to elearning application
    When User clicks on Sign up button
    And User enters the valid user details and click on Register
    Then Sign up done successfully
