Feature:  Top Menu Test

@sanity @regression
Scenario: verify user should navigate to desktops page successfully
  Given User is on the homepage
  When  Mouse hover on DesktopsMenu Tab and click
  And   Select Menu "Show AllDesktops"
  Then  Verify the text "Desktops" on desktop page

  @smoke @regression
  Scenario: verify user should navigate to laptops and notebooks page successfully
    Given  User is on the homepage
    When   Mouse hover on Laptops&NotebooksMenu Tab and click
    And   Select Menu "Show AllLaptops & Notebooks"
    Then   Verify the text "Laptops & Notebooks" on Laptops & Notebooks page

 @regression
  Scenario: verify user should navigate to components page successfully
    Given  User is on the homepage
    When Mouse hover on ComponentsMenu Tab and click
    And  Select Menu "Show AllComponents"
    Then  Verify the text "Components" on components page

