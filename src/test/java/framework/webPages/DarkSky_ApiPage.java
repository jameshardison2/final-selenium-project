package framework.webPages;

import org.openqa.selenium.By;

public class DarkSky_ApiPage extends BasePage {

    //Locators
      //Sign Up locator
    private By signUpButton = By.xpath("//a[@class='button filled']");

    //Methods
       // Click on Sign up button
     public void clickSignUpButton() {
         clickOn(signUpButton);
     }

}
