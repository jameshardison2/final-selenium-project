package stepdefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import framework.webPages.DarkSky_LandingPage;
import org.testng.Assert;

public class DarkSkySD_TimeLine {

    private DarkSky_LandingPage landingPageDarkSky = new DarkSky_LandingPage();
    private SharedSD sharedSd_darkSkySD = new SharedSD();


    @Given("^I am on DarkSky landing page$")
    public void iAmOnLandingPage() {
        Assert.assertEquals(SharedSD.getDriver().getTitle(), "Dark Sky - Broadway, New York, NY", "Invalid Register Page");
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
