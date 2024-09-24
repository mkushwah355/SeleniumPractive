
Feature: Login
Description: Login should be quicky and user friendly.

Background: Navigate to home page and click on Login button.

Scenario: Successfull login with valid credentials
    Given User is on home page
    When User enter valid credentials
    Then User navigate to home page after sucessfull login
    And Welcome message display on home page
    
