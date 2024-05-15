Feature: Find patient
  Scenario: Find and delete patient profile
    Given User is on home page clicks on find patient record
    Then User clicks on search bar and search for patient
    And User clicks on patients identifier
    Then User is now on patient profile page and user clicks delete patient option
    When User write the reason then click confirm button
    Then User get confirming message validate the message
