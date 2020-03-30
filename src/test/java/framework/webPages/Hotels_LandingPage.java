package framework.webPages;

import org.openqa.selenium.By;

public class Hotels_LandingPage extends BasePage {

    //Locators

    // Search button
    private By searchButton = By.xpath("//button[@class='cta cta-strong']");
    private By searchField = By.xpath("//input[@id='qf-0q-destination']");


    //Methods

    //Click Search Button
    public void clickOnSearchButton(By xpath) {
        clickOn(searchButton);
    }

    //Enter Destination
    public void enterDestination() {
        enterText(searchField);
    }
}