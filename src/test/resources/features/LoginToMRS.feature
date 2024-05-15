Feature: Login to OpenMRS

  Scenario: Happy Path
    Given User is on Login page user click on Username and enter admin
    Then User click on password form and enter Admin123
    And User select any locator
    Then User clicks on LogIn button


