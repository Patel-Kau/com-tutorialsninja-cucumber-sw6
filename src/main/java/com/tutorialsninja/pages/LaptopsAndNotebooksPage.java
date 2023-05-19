package com.tutorialsninja.pages;

import com.tutorialsninja.utility.Utility;
import org.apache.log4j.LogManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Kaushik Patel
 */
public class LaptopsAndNotebooksPage extends Utility {
    private  static final org.apache.log4j.Logger log = LogManager.getLogger(LaptopsAndNotebooksPage.class.getName());
    public LaptopsAndNotebooksPage() {
        PageFactory.initElements(driver, this);
    }


    By laptopsAndNotebooksText = By.xpath("//h2[contains(text(),'Laptops & Notebooks')]");

    By productsPrices = By.xpath("//p[@class ='price']");
    By productsList = By.xpath("//h4/a");
    By sortBy = By.id("input-sort");

    public String getLaptopsAndNotebooksText() {
        log.info("Get Laptop & Notebook text " + laptopsAndNotebooksText.toString());
        return getTextFromElement(laptopsAndNotebooksText);
    }

    public ArrayList<Double> getProductsPriceList() {
        log.info("Get product price list "+ productsPrices.toString());
        List<WebElement> products = getListOfElements(productsPrices);
        ArrayList<Double> originalProductsPrice = new ArrayList<>();
        for (WebElement e : products) {
            String[] arr = e.getText().split("Ex Tax:");
            originalProductsPrice.add(Double.valueOf(arr[0].substring(1).replaceAll(",", "")));
        }
        return originalProductsPrice;
    }

    public void selectSortByOption(String option) {
        log.info("Select sort by option "+ sortBy.toString());
        selectByVisibleTextFromDropDown(sortBy, option);
    }

    public void selectProductByName(String product) {
        log.info("Select product by name "+ productsList.toString());
        List<WebElement> products = getListOfElements(productsList);
        for (WebElement e : products) {
            if (e.getText().equals(product)) {
                e.click();
                break;
            }
        }
    }
}
