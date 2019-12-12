Feature: Printer


  Scenario:Print Bill
  Given the user is on the Make a Sale screen
  And the user has a saved basket
  And the basket is open
  When the user selects the basket options
  Then the Print Bill option is present


    Scenario:Printer is not connected
    When the user selects Print Bill
    And a printer is not connected
    Then an error "You cannot print as you are not currently connected to a printer." message is shown
    When the user selects 'OK'
    Then the user remains on the Make a Sale screen

  Scenario:Printer is connected
    When the user selects Print Bill
  And a printer is connected
  Then the print bill is printed