Feature:Login


  Scenario: Successful Initial Login

    Given The initial login page is shown
    And The 'Login to get Started' button is pressed and the login page is shown
    When Correct login credentials are provided
    And PED pairing is skipped
    Then the What’s New presents
    And the VAT Breakdown promotion is displayed
    Then The user is logged in successfully - initial





