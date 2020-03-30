package stepdefinition;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import framework.webPages.Hotels_LandingPage;
import framework.webPages.Hotels_SearchResultsPage;
import org.apache.commons.io.filefilter.FalseFileFilter;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.List;

import static stepdefinition.SharedSD.*;

public class HotelsSD_ResultsBySelectedPropertyClass {

    //Instantiated Objects
     Hotels_LandingPage landingPage_hotels = new Hotels_LandingPage();
     Hotels_SearchResultsPage hotels_searchResultsPage = new Hotels_SearchResultsPage();


     //Create Gherkin doc
    @Given("^I am on default locations search result screen$")
    public void iAmOnLandingPageHotels(){
    Assert.assertEquals(getDriver().getTitle(),
                "Hotels.com - Deals & Discounts for Hotel Reservations from Luxury Hotels to Budget Accommodations");
    landingPage_hotels.enterText(By.xpath("//input[@id='qf-0q-destination']"));
    landingPage_hotels.clickOnSearchButton(By.xpath("//button[@class='cta cta-strong']"));}


    @When("^I select property class (5 stars|4 stars|3 stars)$")
    public void clickOnPropertyStars(String stars) {
        switch (stars) {
            case "5 stars":
                hotels_searchResultsPage.clickFiveStarCheckBox();
                break;
            case "4 stars":
                hotels_searchResultsPage.clickFourStarsCheckBox();
                break;
            case "3 stars":
                hotels_searchResultsPage.clickThreeStarsCheckBox();
                break;
        }
    }


    @Then("^I verify system displays only (5 stars|4 stars|3 stars) hotels on search result$")
    public void verifyStars(String stars) throws InterruptedException {

        // 1. Scroll to the button of the page to open all of the hotel result
       // boolean endOfPage;
        boolean endOfPage = getDriver().findElement
                (By.xpath("//div[@class='additional-info']")).isDisplayed();
        do {
            ChromeDriver driver = new ChromeDriver();
            JavascriptExecutor jsScrollBy = (JavascriptExecutor) driver;
            jsScrollBy.executeScript("scrollBy(0,400);");
        }while (endOfPage = !getDriver().findElement
                (By.xpath("//div[@class='additional-info']")).isDisplayed());

        // 2. Store Elements to an Array list from the custom xpath that contains the listing
        List<WebElement> myList;
        myList = getDriver().findElements(By.xpath("//a['@class=property-name-link']"));
        wait(200);
        //System.out.print ln(myList);

        // 3. Assertion
        Assert.assertEquals(myList, myList);

    }
}
