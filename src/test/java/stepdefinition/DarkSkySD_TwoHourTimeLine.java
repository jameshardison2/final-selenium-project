package stepdefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import framework.webPages.DarkSky_ApiPage;
import framework.webPages.DarkSky_LandingPage;
import framework.webPages.DarkSky_RegisterPage;
import org.testng.Assert;


public class DarkSkySD_TwoHourTimeLine {
    private DarkSky_LandingPage landingPage_darkSky = new DarkSky_LandingPage();
    private DarkSky_ApiPage _darkSkyApiPage = new DarkSky_ApiPage();
    private DarkSky_RegisterPage darkSkyRegisterPage = new DarkSky_RegisterPage();


    @Given("^Given I am on landing page$")
    public void iAmOnLandingPage2() {
        Assert.assertEquals(SharedSD.getDriver().getTitle(), "Dark Sky - Broadway, New York, NY", "Invalid Register Page");
    }


    @Then("^I verify timeline is displayed with two hours incremented$")
    public void secondMethod() {
        long selectCurrentTime;
      //  Assert.assertEquals(landingPage_darkSky.selectCurrentTime,landingPage_darkSky.

    }

}
