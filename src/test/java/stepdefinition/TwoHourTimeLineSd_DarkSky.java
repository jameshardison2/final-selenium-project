package stepdefinition;

import com.sun.xml.internal.ws.spi.db.DatabindingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import framework.webPages.ApiPage_DarkSky;
import framework.webPages.LandingPage_DarkSky;
import framework.webPages.RegisterPage_DarkSky;
import org.testng.Assert;


public class TwoHourTimeLineSd_DarkSky{
    private LandingPage_DarkSky landingPage_darkSky = new LandingPage_DarkSky();
    private ApiPage_DarkSky apiPage_darkSky = new ApiPage_DarkSky();
    private RegisterPage_DarkSky darkSkyRegisterPage = new RegisterPage_DarkSky();


@Given("^Given I am on landing page$")
public void iAmOnLandingPage2(){
    Assert.assertEquals(SharedSd_DarkSkySD.getDriver().getTitle(),"Dark Sky - Broadway, New York, NY", "Invalid Register Page");
}


@Then("^I verify timeline is displayed with two hours incremented$")
public void secondMethod(){
    long selectCurrentTime;
    Assert.assertEquals(landingPage_darkSky.selectCurrentTime,landingPage_darkSky.



}
