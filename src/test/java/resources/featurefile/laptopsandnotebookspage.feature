Feature:  Laptops and Notebooks Page Test
@sanity @regression
  Scenario: Verify product price display High to Low successfully
    Given User is on the homepage
    When user select currency "£Pound Sterling"
    And User mouse hover on Laptops And Notebooks Link And Click
    And User select menu option "Show AllLaptops & Notebooks"
    And user select sort by option "Price (High > Low)"
    Then Verify all product shorted in price (High > Low) order
