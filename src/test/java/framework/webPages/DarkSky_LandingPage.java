package framework.webPages;

import org.openqa.selenium.By;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class DarkSky_LandingPage extends BasePage {


    //Locators

      //Timeline
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

      //Menu Tab
    private By darkSkyApiButton = By.xpath("//div[@class='inner']//a[contains(text(),'Dark Sky API')]");

    //Today High Low expand
    public By openTodayIcon = By.xpath("//a[@data-day='0']//span[@class='open']");

    // Min and Max temps on Range
    private By todayMinTempTimeline = By.xpath("//a[1]//span[2]//span[1]");
    private By todayMaxTempTimeline = By.xpath("//body[@class='forecast']/div[@id='week']/a[1]/span[2]" +
            "/span[@class='maxTemp']");

    // Min and Max temps on detail
    private By todayMinTempDetail = By.xpath("//div[@class='dayDetails revealed']//span[@class='highTemp swip']/span[@class='temp']");

    //div[@class='dayDetails revealed']//span[@class='highTemp swip']/span[@class='temp']
    private By todayMaxTempDetail = By.xpath("//div[@class='dayDetails revealed']//span[@class='lowTemp swap']/span[@class='temp']");


    //Methods

    //Click API Menu
    public void clickOnApiButton() {
        clickOn(darkSkyApiButton);
    }
    // Click
    public void clickOnOpenTodayTimeline() {
        webAction(openTodayIcon);
    }

    //Temp Compare
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


    //Temp Compare
    public void maxTempCompare() {
        boolean dailyMaxTemp;
        if ( getTextFromElement(todayMaxTempTimeline).equals
                ((getTextFromElement(todayMaxTempDetail))) ) {
            dailyMaxTemp = true;
            System.out.println("Daily Max Temperature is displayed correct");
        } else dailyMaxTemp = false;
        {
            System.out.println("Daily Max Temperature is displayed incorrect");
        }

    }

    //

    public class TwoHourTimeLineSd_DarkSky {

        private DarkSky_LandingPage landingPageDarkSky = new DarkSky_LandingPage();

        public void selectCurrentTime() {
            SimpleDateFormat sdf = new SimpleDateFormat("hh");
            Date date = new Date();
            String currentHour = sdf.format(date);}

        public void addTwoHoursInTime(){
            Integer currentHour = null;
            Integer currentHourPlusTwo = currentHour + 2;
        }

        // create an ArrayList using java system time
        ArrayList<String> systemTime = new ArrayList<String>();
         //   systemTime.add("now");

        public void addCurrentHoursToArrayList(){
            //for (int b = 1, b < 13, b++)
            //    if (


        }

        public void convertCurrentTime() {
            
            addCurrentHoursToArrayList();

            // create an ArrayList from website timeline
            ArrayList<String> webTimeLine = new ArrayList<String>();
            webTimeLine.add("now");
            webTimeLine.add("2pm");
            webTimeLine.add("4pm");
            webTimeLine.add("6pm");
            webTimeLine.add("8pm");
            webTimeLine.add("10pm");
            webTimeLine.add("12am");
            webTimeLine.add("2am");
            webTimeLine.add("4am");
            webTimeLine.add("6am");
            webTimeLine.add("8am");
            webTimeLine.add("10am");
            System.out.println(webTimeLine);


            System.out.println(systemTime);



        }

    }
}




