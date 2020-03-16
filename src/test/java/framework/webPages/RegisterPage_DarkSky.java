package framework.webPages;

import org.openqa.selenium.By;

public class RegisterPage_DarkSky extends BasePage_DarkSky {

    //Register button locator
    private By darkSkyRegisterButton = By.xpath("//button[contains(text(),'Register')]");
    private By registerHeader = By.xpath("//h1[@class='stand-alone title']");


    public void clickOnRegisterButton(){
        clickOn(darkSkyRegisterButton);
    }

    public String getPageHeader(By registerHeader){ return webAction(registerHeader).getText(); }

}
