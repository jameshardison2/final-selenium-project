package stepdefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import framework.webPages.LandingPage_DarkSky;
import org.testng.Assert;

public class TimeLineSd_DarkSkySD {

    private LandingPage_DarkSky landingPageDarkSky = new LandingPage_DarkSky();

    @Given("^I am on DarkSky landing page$")
    public void iAmOnLandingPage() {
        Assert.assertEquals(SharedSd_DarkSkySD.getDriver().getTitle(), "Dark Sky - Broadway, New York, NY", "Invalid Register Page");
    }

    @When("^I expand today's timeline$")
    public void expandTimeline(){
        landingPageDarkSky.clickOnTodayIcon();
    }

    @Then("^I verify lowest and highest temp is displayed correctly$")
    public void verifyDailyTemps(){
        landingPageDarkSky.minTempCompare();
        landingPageDarkSky.maxTempCompare();
    }
}
