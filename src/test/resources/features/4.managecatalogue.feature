Feature: Manage Catalogue

  @Sprint
  Scenario: Manage Catalogue from Navigation Pane in online mode
    Given the user is logged in and on Manage Catalogue Page
    And the user selects 'ADD CATEGORY +'
    And the user is taken to the Add Category screen
    When the user enters a unique name
    And the user selects a colour
    And the user selects 'ADD'
    Then the category is added to the Catalogue


  Scenario: Cash payment quick link - exact amount

    Given The user is logged in and on the make a sale screen - custom sale
    And the user adds a custom item to the basket with a value of "£2.20" and VAT of "20%"
    And The cash option is chosen
    When the user clicks the "£2.20" quick link
    And the amount displayed in the Enter cash amount field is "£2.20"
    And the user ticks button
    Then the user is taken to the Issue Receipts screen
    And the change due is "£0.00"
    And the handwritten receipt option is chosen


  Scenario: Cash payment - product catalogue item within category
    Given The user is logged in and on the make a sale screen
    And within a category with 2 or more items
    And the user selects a random catalogue item
    And the basket amount is known
    When The cash option is chosen
    And the user enters an amount equal to that of the basket
    And the user ticks button
    Then the user is taken to the Issue Receipts screen
    And the handwritten receipt option is chosen