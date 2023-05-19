package com.tutorialsninja.steps;

import com.tutorialsninja.pages.AccountRegisterPage;
import com.tutorialsninja.pages.MyAccountPage;
import com.tutorialsninja.utility.Utility;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.testng.Assert;

/**
 * Created By Kaushik Patel
 */
public class AccountRegisterPageTestSteps {
    Utility utility = new Utility();
    @Then("^Verify the text \"([^\"]*)\" on register page$")
    public void verifyTheTextOnRegisterPage(String registerAccountTextMessage) {
        Assert.assertEquals(new AccountRegisterPage().getRegisterAccountText(),registerAccountTextMessage,"Error Message : Text 'Register Account' not Matching");
    }

    @And("^User enter First Name \"([^\"]*)\"$")
    public void userEnterFirstName(String firstName)  {
        new AccountRegisterPage().enterFirstName(firstName);
    }

    @And("^User enter Last Name  \"([^\"]*)\"$")
    public void userEnterLastName(String lastName)  {
    new AccountRegisterPage().enterLastName(lastName);
    }

    @And("^User enter Email \"([^\"]*)\"$")
    public void userEnterEmail(String email)  {
        new AccountRegisterPage().enterEmail(email+utility.generateRandomNumber()+"@gmail.com");
    }

    @And("^User enter Telephone number \"([^\"]*)\"$")
    public void userEnterTelephoneNumber(String telephoneNumber)  {
    new AccountRegisterPage().enterTelephone(telephoneNumber);
    }

    @And("^User enter Password \"([^\"]*)\"$")
    public void userEnterPassword(String password)  {
    new AccountRegisterPage().enterPassword(password);
    }

    @And("^User enter Confirm password \"([^\"]*)\"$")
    public void userEnterConfirmPassword(String confirmPassword)  {
        new AccountRegisterPage().enterConfirmPassword(confirmPassword);

    }

    @And("^User select Subscription\"([^\"]*)\"$")
    public void userSelectSubscription(String subscription)  {
        new AccountRegisterPage().selectSubscription(subscription);

    }

    @And("^User click on Privacy policy check box$")
    public void userClickOnPrivacyPolicyCheckBox() {
        new AccountRegisterPage().clickOnPrivacyPolicyCheckBox();
    }
    @And("^User click on Continue button on account register page$")
    public void userClickOnContinueButtonOnAccountRegisterPage() {
        new AccountRegisterPage().clickOnContinueButton();
    }

    @Then("^Verify the text \"([^\"]*)\" on account page$")
    public void verifyTheTextOnAccountPage(String accountRegisterMessage) throws InterruptedException {
        Assert.assertEquals(new MyAccountPage().getYourAccountHasBeenCreatedText(),accountRegisterMessage);

    }



    @And("^User click on Continue button account page$")
    public void userClickOnContinueButtonAccountPage() throws InterruptedException {
        new MyAccountPage().clickOnContinueButton();
    }

    @Then("^Verify the text Logout \"([^\"]*)\" on account page$")
    public void verifyTheTextLogoutOnAccountPage(String logoutText) {
        Assert.assertEquals(new MyAccountPage().getAccountLogoutText(),logoutText);

    }


}
