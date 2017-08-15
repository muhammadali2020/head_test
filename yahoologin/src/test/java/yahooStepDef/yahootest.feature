Feature: Yahoo application testing
  Scenario: Yahoo Login Test

    Given user opens yahoo login page
    Then user enters loginid
    Then user enters password
    And user clicks on signin button
    And close the browser
