package stepdefinition;

import cucumber.api.java.en.Given;
import framework.webPages.LandingPage_DarkSky;
import org.testng.Assert;

public class CurrentTempFormatTimeline {

    private LandingPage_DarkSky landingPageDarkSky = new LandingPage_DarkSky();


    @Given("^I am on DarkSky landing page$")
    public void iAmOnLandingPage() {
        Assert.assertEquals(SharedSd_DarkSkySD.getDriver().getTitle(), "Dark Sky - Broadway, New York, NY", "Invalid Register Page");
    }
}
