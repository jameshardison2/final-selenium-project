package stepdefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import framework.webPages.LandingPage_DarkSky;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class TimeLineSd_DarkSkySD {

    private LandingPage_DarkSky landingPageDarkSky = new LandingPage_DarkSky();
    private SharedSd_DarkSkySD sharedSd_darkSkySD = new SharedSd_DarkSkySD();


    @Given("^I am on DarkSky landing page$")
    public void iAmOnLandingPage() {
        Assert.assertEquals(SharedSd_DarkSkySD.getDriver().getTitle(), "Dark Sky - Broadway, New York, NY", "Invalid Register Page");
    }

    @When("^I expand today's timeline$")
    public void clickOnOpenTodayTimeline() {
        landingPageDarkSky.clickOnOpenTodayTimeline();
        // Actions actions;
       //
        // actions = sharedSd_darkSkySD.actions.moveToElement
          //      ((WebElement) landingPageDarkSky.openTodayIcon);

        // public void expandTimeline(){
      //  sharedSd_darkSkySD.moveToElement();

        //public void moveToElement(){
            //landingPageDarkSky.clickOnOpenTodayTimeline();

        }

    @Then("^I verify lowest and highest temp is displayed correctly$")
    public void verifyDailyTemps(){
        landingPageDarkSky.minTempCompare();
        landingPageDarkSky.maxTempCompare();
    }
}
