Feature: Account Register Page Test

  @sanity @regression
  Scenario: Verify user should navigate to login page successfully
    Given User is on the homepage
    When User click on My account tab
    And User click on account option "Register"
    Then Verify the text "Register Account" on register page

    @smoke @regression
    Scenario: Verify that user should login and logout successfully
      Given User is on the homepage
      When User click on My account tab
      And User click on account option "Register"
      And User enter First Name "Kaushik"
      And User enter Last Name  "Patel"
      And User enter Email "kaushik"
      And User enter Telephone number "07812378123"
      And User enter Password "Test123"
      And User enter Confirm password "Test123"
      And User select Subscription"Yes"
      And User click on Privacy policy check box
      And User click on Continue button on account register page
      Then Verify the text "Your Account Has Been Created!" on account page
      And User click on Continue button account page
      And User click on My account tab
      And User click on account option "Logout"
      Then Verify the text"Account Logout"



