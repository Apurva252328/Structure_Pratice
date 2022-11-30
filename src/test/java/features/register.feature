Feature: As a user , I should able to be register so that i Can use account facility

  Scenario: I should able to register successfully with valid credentials

    Given I am register page
    When I enter valid credentials
    And  I Should click on Register button
    Then I should able to register successfully
