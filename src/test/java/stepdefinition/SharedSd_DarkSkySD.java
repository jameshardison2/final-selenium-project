package stepdefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.pagefactory.ByAll;
import util.ConfigReader;

public class SharedSd_DarkSkySD {

    private static WebDriver driver;
    public Actions actions;


    @Before("@web")
    public static void before() {

        ConfigReader configReader = new ConfigReader();
        System.setProperty("webdriver.chrome.driver", configReader.getChromeDriverPath());
        driver = new ChromeDriver();
        Actions actions = new Actions(driver);


        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(configReader.getUrl());
        driver.findElement(new ByAll(By.className("minTemp"), By.className("day revealed")));
        //driver.get(url);
    }

    @After("@web")
    public static void after() {
        if ( driver != null ) {
            driver.manage().deleteAllCookies();
            driver.quit();
        }
    }

    public static WebDriver getDriver() {
        return
                driver;
    }
}






