Feature: Desktops Page Steps

  Scenario: Verify product Arrange in alphabetical order
    Given User is on the homepage
    When user select currency "£Pound Sterling"
    And Mouse hover on DesktopsMenu Tab and click
    And User select menu option "Show AllDesktops"


    Scenario: Verify product added to shopping cart successFully
      Given User is on the homepage
      When user select currency "£Pound Sterling"
      And Mouse hover on DesktopsMenu Tab and click
      And User select menu option "Show AllDesktops"
      And user select sort by option "Name (A - Z)"
      And User select product by name "HP LP3065"
      Then Verify the product text "HP LP3065" is display on product page
      And User select delivery date "30", "November", "2023"
      And User enter quantity "1" on product page
      And User click on add to cart button
      Then Verify the text message "Success: You have added HP LP3065 to your shopping cart!"
      And User click on "Shopping Cart" link in to message
      Then Verify the text "Shopping Cart" on cart page
      Then Verify the text product name "HP LP3065" on cart page
      Then Verify the text Delivery Date "2023-11-30"
      Then Verify the text message "Product 21" message
      Then Verify the text get totla "£74.73"

