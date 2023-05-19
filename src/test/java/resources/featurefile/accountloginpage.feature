Feature: Account login Page Test
  @sanity @regression
  Scenario: verify user should navigate to the login page successfully
    Given User is on the homepage
    When User click on My account tab
    And User click on account option "Login"
    Then Verify the text "Returning Customer" on Login page


  @smoke @regression
    Scenario: Verify that user should login and logout successfully
      Given User is on the homepage
      When User click on My account tab
      And User click on account option "Login"
      And user enter email Address "admin123456@gmail.com"
      And user enter Password "Admin@123"
      And User click on login button
      And User click on My account tab
      And User click on account option "Logout"
      Then Verify the text"Account Logout"

