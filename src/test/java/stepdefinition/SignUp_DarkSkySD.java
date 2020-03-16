package stepdefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import framework.webPages.ApiPage_DarkSky;
import framework.webPages.LandingPage_DarkSky;
import framework.webPages.RegisterPage_DarkSky;
import org.testng.Assert;

public class SignUp_DarkSkySD {

    private LandingPage_DarkSky landingPage_darkSky = new LandingPage_DarkSky();
    private ApiPage_DarkSky apiPage_darkSky = new ApiPage_DarkSky();
    private RegisterPage_DarkSky darkSkyRegisterPage = new RegisterPage_DarkSky();

    @Given("^I am on the DarkSky landing page$")
    public void iAmOnLandingPage() {
        Assert.assertEquals(SharedSd_DarkSkySD.getDriver().getTitle(), "Dark Sky - Broadway, New York, NY", "Invalid Register Page");
    }

    @When("^I click on (.*) button on landing page$")
    public void clickOnApiButton(String button){
        landingPage_darkSky.clickOnApiButton();
    }

    @When("^I click on (.*) button on api page$")
    public void clickSignUpButton(String button){
        apiPage_darkSky.clickSignUpButton();
    }

    @When("^I click on (.*) button on register page$")
    public void clickRegisterButton(String button){
        darkSkyRegisterPage.clickOnRegisterButton();
    }

    @Then("^I verify that i am on register page by asserting register header$")
    public void verifyHeader(){
        Assert.assertEquals(SharedSd_DarkSkySD.getDriver().getTitle(), "Register", "Invalid Register Page");
    }

}
