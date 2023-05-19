package com.tutorialsninja.pages;

import com.tutorialsninja.utility.Utility;
import org.apache.log4j.LogManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Kaushik Patel
 */
public class MyAccountPage extends Utility {
    private  static final org.apache.log4j.Logger log = LogManager.getLogger(MyAccountPage.class.getName());
    public MyAccountPage() {
        PageFactory.initElements(driver, this);
    }
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Account Logout')]")
    WebElement accountLogoutText;
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Your Account Has Been Created!')]")
    WebElement accountCreatedText;
    @FindBy(xpath = "//a[contains(text(),'Continue')]")
    WebElement continueBtn;

    public String getAccountLogoutText() {
       log.info("get Account Logout Text  " + accountLogoutText.toString());
       return getTextFromElement(accountLogoutText);
    }

    public String getYourAccountHasBeenCreatedText() throws InterruptedException {
        Thread.sleep(2000);
       log.info("get Your Account Has Been Created Text  " + accountCreatedText.toString());
       return getTextFromElement(accountCreatedText);
    }

    public void clickOnContinueButton() throws InterruptedException {
       log.info("Click on continue button " + continueBtn.toString());

       Thread.sleep(1000);
        clickOnElement(continueBtn);
    }
}
