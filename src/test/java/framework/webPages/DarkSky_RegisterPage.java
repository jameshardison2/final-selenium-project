package framework.webPages;

import org.openqa.selenium.By;

public class DarkSky_RegisterPage extends BasePage {

    public long getPageHeader;

    //Locators

     //Register button locator

    private By darkSkyRegisterButton = By.xpath("//button[contains(text(),'Register')]");


    //Methods

    public void clickOnRegisterButton(){
        clickOn(darkSkyRegisterButton);
    }


    //Current issue with SignUp test: 1. The Assertion step does not verify
     // the page title is correct. a. I tried to use S1 S2 assertion type
     // b. I tried to use the same assertion that was used in step 1 but it didnt work

}
