package Pages.Hotels;

import Drivers.Web;
import Pages.StepDefinition.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class LandingPage extends BasePage {

    By childrenDropDownLocator= By.xpath("//select[@name='q-room-0-children']");
    By searchButtonLocator=By.xpath("//button[@type='submit']");
    By quantityChildrenLocator =By.xpath("//form[@role='search']/div[3]/div[2]/div[2]/div/label");
    By searchBoxLocator=By.id("qf-0q-destination");
    By autoSuggestionsLocator=By.xpath("//div[@class='autosuggest-category-result']");


   public boolean verifyQuantityOfKids(int count){
       try {
           Thread.sleep(10000);
       } catch (InterruptedException e) {
           e.printStackTrace();
       }
       int count2 = findingElementsUsingFluentWait(quantityChildrenLocator).size();
     boolean a = (count2==count);
     return a;
   }

    public void selectDropDown(String child){
       selectFromDropdownByVisibleText(childrenDropDownLocator, child);

    }


    public void clickSearchButton(){
        WebElement ele= findingElementUsingFluentWait(searchButtonLocator);
        clickThis(ele);
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    public void enterDestination(String destination){
        type(searchBoxLocator, destination);
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void selectDestFromAutoSuggestions(String userWantsToSelectThis){
        selectFromAutoSuggestion(autoSuggestionsLocator, userWantsToSelectThis);
        try {
            Thread.sleep(9000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}
