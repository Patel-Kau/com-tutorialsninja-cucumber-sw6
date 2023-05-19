package com.tutorialsninja.steps;

import com.tutorialsninja.pages.AccountLoginPage;
import com.tutorialsninja.pages.HomePage;
import com.tutorialsninja.pages.MyAccountPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class AccountLoginPageSteps {
    @When("^User click on My account tab$")
    public void userClickOnMyAccountTab() throws InterruptedException {
        new HomePage().clickOnMyQAccountTab();
    }

    @Then("^Verify the text \"([^\"]*)\" on Login page$")
    public void verifyTheTextOnLoginPage(String verifyReturningCustomerText)  {
        Assert.assertEquals(new AccountLoginPage().getReturningCustomerText(),verifyReturningCustomerText,"Error Message : 'Returning Customer' is not matching");
    }


    @And("^user enter email Address \"([^\"]*)\"$")
    public void userEnterEmailAddress(String emailaddress)  {
        new AccountLoginPage().enterEmailAddress(emailaddress);
    }

    @And("^user enter Password \"([^\"]*)\"$")
    public void userEnterPassword(String password)  {
        new AccountLoginPage().enterPassword(password);
            }

    @And("^User click on login button$")
    public void userClickOnLoginButton() {
        new AccountLoginPage().clickOnLoginButton();
    }

    @Then("^Verify the text\"([^\"]*)\"$")
    public void verifyTheText(String verifyTextAccountLogout){
      Assert.assertEquals(new MyAccountPage().getAccountLogoutText(), verifyTextAccountLogout,"Error Message : The Text 'Account Logout' not matching");
    }

    @And("^User click on account option \"([^\"]*)\"$")
    public void userClickOnAccountOption(String loginOptions)  {
       new HomePage().selectMyAccountOptions(loginOptions);
    }


}
