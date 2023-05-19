package com.tutorialsninja.steps;

import com.tutorialsninja.pages.HomePage;
import com.tutorialsninja.pages.LaptopsAndNotebooksPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * Created By Kaushik Patel
 */
public class LaptopsAndNotebooksTestSteps {
    @When("^user select currency \"([^\"]*)\"$")
    public void userSelectCurrency(String selectCurrency) throws InterruptedException {
        new HomePage().selectCurrency(selectCurrency);
    }

    @And("^User mouse hover on Laptops And Notebooks Link And Click$")
    public void userMouseHoverOnLaptopsAndNotebooksLinkAndClick() {
        new HomePage().mouseHoverOnLaptopsAndNotebooksLinkAndClick();
    }

    @And("^User select menu option \"([^\"]*)\"$")
    public void userSelectMenuOption(String menuOption) throws InterruptedException {
        new HomePage().selectMenu(menuOption);

    }

    @And("^user select sort by option \"([^\"]*)\"$")
    public void userSelectSortByOption(String sortByOption)  {
        new LaptopsAndNotebooksPage().selectSortByOption(sortByOption);
    }

    @Then("^Verify all product shorted in price \\(High > Low\\) order$")
    public void verifyAllProductShortedInPriceHighLowOrder() {
    }
}
