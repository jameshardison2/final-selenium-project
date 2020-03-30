package framework.webPages;

import org.openqa.selenium.By;

public class Hotels_SearchResultsPage extends BasePage {

    //Locators

       // 5 Stars clickable icon
       private By fiveStars = By.xpath("//input[@id='f-star-rating-5']");
       private By fourStars = By.xpath("//input[@id='f-star-rating-4']");
       private By threeStars = By.xpath("//input[@id='f-star-rating-3']");
       private By twoStars = By.xpath("//input[@id='f-star-rating-2']");
       private By oneStar = By.xpath("//input[@id='f-star-rating-1']");



       // Listing of hotels locator
       private By listOfHotels = By.xpath("//a['@class=property-name-link']");
       // End of page locator
       private By endOfPage = By.xpath("//a['@class=property-name-link']");


    //Methods
       //Click on Five stars
       public void clickFiveStarCheckBox(){
           //click on each star if then statement here?
           clickOn(fiveStars); }
       //Click on Four stars
       public void clickFourStarsCheckBox(){
           clickOn(fourStars);
       }
       //click Three stars
       public void clickThreeStarsCheckBox(){
           clickOn(threeStars);
       }



}
