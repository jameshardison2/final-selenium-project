package stepdefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import framework.webPages.DarkSky_ApiPage;
import framework.webPages.DarkSky_LandingPage;
import framework.webPages.DarkSky_RegisterPage;
import org.testng.Assert;

public class DarkSkySD_SignUp {

    private DarkSky_LandingPage landingPage_darkSky = new DarkSky_LandingPage();
    private DarkSky_ApiPage _darkSkyApiPage = new DarkSky_ApiPage();
    private DarkSky_RegisterPage darkSkyRegisterPage = new DarkSky_RegisterPage();

    @Given("^I am on the landing page$")
    public void iAmOnLandingPage() {
        Assert.assertEquals(SharedSD.getDriver().getTitle(),"Dark Sky - Broadway, New York, NY", "Invalid Register Page");
    }

    @When( "^I click on (api) button on landing page$")
    public void clickOnApiButton(String button){
        landingPage_darkSky.clickOnApiButton();
    }

    @When("^I click on (sign up) button on api page$")
    public void clickSignUpButton(String button){
        _darkSkyApiPage.clickSignUpButton();
    }

    @When("^I click on (register button) on register page$")
    public void clickRegisterButton(String button){
        darkSkyRegisterPage.clickOnRegisterButton();
    }

    @Then("^I verify that i am on register page by asserting register header$")
    public void verifyHeader(){
        Assert.assertEquals(SharedSD.getDriver().getTitle(),"Dark Sky API: Register","Invalid Sign Up Page");

    }


}
