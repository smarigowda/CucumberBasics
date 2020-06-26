Feature: Application Login

  Scenario: Login from Home Page Cards Displayed
    Given User is on Home Page
    When User logs into the application using username "james" and password "shore"
    Then Home page is populated
    And Cards are displayed


  Scenario: Login from Home Page Cards Not Displayed
    Given User is on Home Page
    When User logs into the application using username "john" and password "smith"
    Then Home page is populated
    But Cards are not displayed