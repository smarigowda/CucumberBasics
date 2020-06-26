Feature: Application Login

  Scenario: Login from Home Page
    Given User is on Home Page
    When User logs into the application using username and password
    Then Home page is populated
    And Cards are displayed
