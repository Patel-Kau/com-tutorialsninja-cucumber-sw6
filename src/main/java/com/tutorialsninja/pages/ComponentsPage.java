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
public class ComponentsPage extends Utility {
    private  static final org.apache.log4j.Logger log = LogManager.getLogger(ComponentsPage.class.getName());
    public ComponentsPage() {
        PageFactory.initElements(driver, this);
    }


    @CacheLookup
    @FindBy(xpath = "//h2[contains(text(),'Components')]")
    WebElement componentsText;

    public String getComponentsText() {
       log.info("Get component Text  " + componentsText.toString());

        return getTextFromElement(componentsText);
    }
}
