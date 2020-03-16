package framework.webPages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.pagefactory.ByChained;

public class LandingPage_DarkSky extends BasePage_DarkSky {


    //Locators
    private By nowHourTimeLine = By.xpath("//span[@class='Now']");
    private By fourPmHourTimeLine = By.xpath("//span[@class='4pm']");
    private By sixPmHourTimeLine = By.xpath("//span[@class='6pm']");
    private By eightPmHourTimeLine = By.xpath("//span[@class='8pm']");
    private By tenPmHourTimeLine = By.xpath("//span[@class='10pm']");
    private By twelveAmHourTimeLine = By.xpath("//span[@class='12am']");
    private By twoAmHourTimeLine = By.xpath("//span[@class='2am']");
    private By fourAmHourTimeLine = By.xpath("//span[@class='4am']");
    private By sixAmHourTimeLine = By.xpath("//span[@class='6am']");
    private By eightAmHourTimeLine = By.xpath("//span[@class='8am']");
    private By tenAmHourTimeLine = By.xpath("//span[@class='10am']");
    private By twelvePmHourTimeLine = By.xpath("//span[@class='6pm']");

    private By darkSkyApiButton = By.xpath("//div[@class='inner']//a[contains(text(),'Dark Sky API')]");
    private By todayIcon = By.xpath("//body[@class='forecast']/div[@id='week']/a[1]/span[@class='name']");

    private By todayMinTempTimeline = new ByChained(By.xpath("//span[contains(text(),'Today')]"), By.className("minTemp"));
    private By todayMaxTempTimeline = new ByChained(By.xpath("//span[contains(text(),'Today')]"), By.className("maxTemp"));
    //private By todayMaxTempTimeline = By.xpath("//span[@class='maxTemp']");


    private By todayMinTempDetail = new ByChained(By.xpath("//div[@class='dayDetails revealed']"), By.className
            ("highTemp swip"), By.className("temp"));
    private By todayMaxTempDetail = new ByChained(By.xpath("//div[@class='dayDetails revealed']"), By.className
            ("lowTemp swap"), By.className("temp"));



    //Methods


    public void clickOnApiButton() {
        clickOn(darkSkyApiButton);
    }

    public void clickOnTodayIcon() {
        clickOn(todayIcon);
        try {
            wait(300);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    public void minTempCompare() {
        boolean dailyMinTemp;
        if ( getTextFromElement(todayMinTempTimeline).equals
                ((getTextFromElement(todayMinTempDetail))) ) {
            dailyMinTemp = true;
            System.out.println("Daily Min Temperature is displayed correct");
        } else dailyMinTemp = false;
        {
            System.out.println("Daily Min Temperature is displayed incorrect");
        }
    }


    public void maxTempCompare() {
        boolean dailyMaxTemp;
        if ( getTextFromElement(todayMinTempTimeline).equals
                ((getTextFromElement(todayMinTempDetail))) ) {
            dailyMaxTemp = true;
            System.out.println("Daily Max Temperature is displayed correct");
        } else dailyMaxTemp = false;
        {
            System.out.println("Daily Max Temperature is displayed incorrect");
        }

    }
}





