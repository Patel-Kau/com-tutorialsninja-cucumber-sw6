package com.tutorialsninja.steps;

import com.tutorialsninja.pages.ComponentsPage;
import com.tutorialsninja.pages.DesktopPage;
import com.tutorialsninja.pages.HomePage;
import com.tutorialsninja.pages.LaptopsAndNotebooksPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class TopMenuSteps {
    @Given("^User is on the homepage$")
    public void userIsOnTheHomepage() {
    }

    @When("^Mouse hover on DesktopsMenu Tab and click$")
    public void mouseHoverOnDesktopsMenuTabAndClick() {
        new HomePage().mouseHoverOnDesktopsLinkAndClick();
    }

    @And("^Select Menu \"([^\"]*)\"$")
    public void selectMenu(String menu) throws InterruptedException {
        new HomePage().selectMenu(menu);
    }

    @Then("^Verify the text \"([^\"]*)\" on desktop page$")
    public void verifyTheTextOnDesktopPage(String textDesktop )  {
        Assert.assertEquals(new DesktopPage().getDesktopsText(),textDesktop,"Error Message : 'Desktop' text is not matching");

    }

    @When("^Mouse hover on Laptops&NotebooksMenu Tab and click$")
    public void mouseHoverOnLaptopsNotebooksMenuTabAndClick() {
       new HomePage().mouseHoverOnLaptopsAndNotebooksLinkAndClick();
    }


    @Then("^Verify the text \"([^\"]*)\" on Laptops & Notebooks page$")
    public void verifyTheTextOnLaptopsNotebooksPage(String textLaptopandnotebooks)  {
        Assert.assertEquals(new LaptopsAndNotebooksPage().getLaptopsAndNotebooksText(),textLaptopandnotebooks,"Error Message : 'Laptops & Notebooks' text is not matching");
    }

    @When("^Mouse hover on ComponentsMenu Tab and click$")
    public void mouseHoverOnComponentsMenuTabAndClick() throws InterruptedException {
       new HomePage().mouseHoverOnComponentLinkAndClick();

    }

    @Then("^Verify the text \"([^\"]*)\" on components page$")
    public void verifyTheTextOnComponentsPage(String textComponents)  {
        Assert.assertEquals(new ComponentsPage().getComponentsText(),textComponents,"Error Message : 'Desktop' text is not matching");


    }
}
