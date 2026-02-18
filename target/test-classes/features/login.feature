Feature: Verifying login facebook login

  Scenario Outline: scenario
    Given user is on the facebook page
    When user enters "<username>" and "<password>"
    And user clicks login button
    Then user should verify error message

    Examples:
      | username  | password  |
      | GreensOMR | hello@345 |
      | Guna      | guna@123  |

  Scenario Outline: scenario2
    Given user is on the facebook page
    When user enters "<username>" and "<password>"
    And user clicks login button
    Then user should verify error message

    Examples:
      | username | password  |
      | OMR      | hello@345 |
