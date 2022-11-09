Feature: Login to elearning website and send email

  Scenario: Login to elearning website through valid credentials
    Given User navigates to elearning application
    When User enters the valid credentials
    And User clicks on Login button
    Then User is successfully logged into elearning website
    And User clicks on Inbox and compose an email
  	And User click on Send Message button
  	And User is able to send message successfully.


 