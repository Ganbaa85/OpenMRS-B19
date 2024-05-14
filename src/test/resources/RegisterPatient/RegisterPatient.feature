Feature: Register Patient fill out

  Scenario:
    Given User is on main page user clicks on register patient Link
    When User is on register patient page user validates url and title of the page
    Then User enters given middle and family name
    And User clicks on greenArrow
    Then User choose gender
    And User clicks on greenArrow1
    Then User enter birth date
    And User clicks on greenArrow3
    Then User enter address and city and country and postal code
    And User clicks on greenArrow4
    Then User enters phone number
    And User clicks on greenArrow5
    Then User choose relatives and clicks on green arrow
    And User confirm form