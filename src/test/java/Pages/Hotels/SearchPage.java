package Pages.Hotels;

import Drivers.Web;
import Pages.StepDefinition.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import java.util.List;

import static java.lang.Thread.sleep;

public class SearchPage extends BasePage {


    By starWidgetLocator =By.xpath( "//h3[contains(text(),'Star rating')]");

    By FiveStarRatingLocator = By.xpath("//div[@id='filter-star-rating-contents']/ul/li/input[@value='5']");

    By FourStarRatingLocator = By.xpath("//div[@id='filter-star-rating-contents']/ul/li/input[@value='4']");

    By ThreeStarRatingLocator = By.xpath("//div[@id='filter-star-rating-contents']/ul/li/input[@value='3']");

    By TwoStarRatingLocator = By.xpath("//div[@id='filter-star-rating-contents']/ul/li/input[@value='2']");

    By OneStarRatingLocator = By.xpath("//div[@id='filter-star-rating-contents']/ul/li/input[@value='1']");

    By starsOnHotelsLocator =By.xpath("//div[@id='listings']/ol/li/article/section/div/div/div/span");

    By messageLocator = By.xpath("//div[@class='info unavailable-info']");

    public void ScrollToStarsElement()  {
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement element = Web.getDriver().findElement(starWidgetLocator);
        JavascriptExecutor js = (JavascriptExecutor)Web.getDriver();
        js.executeScript("arguments[0].scrollIntoView(true);", element);

    }

    public void scrollingPage() {
        do {
            scrollToTheButtom();
            scrollByPixel(-300);
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        while (findingElementsUsingFluentWait(messageLocator).size()==0);
        }





    public boolean verification(String star){
        try {
            sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        List<String>  apple = getTextsFromWebElements(starsOnHotelsLocator);
        System.out.println(apple);
        System.out.println(star);
         boolean starts=true;
        for(String abc:apple){
            if (!abc.startsWith(star)){

                starts=false;
                break;
            }
        }
return starts;
    }


    public void selectingAStar(String star){
        try {
            sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        switch (star){
            case "1":
                clickThis(OneStarRatingLocator);
                break;

            case "2":
                clickThis(TwoStarRatingLocator);
                break;

            case "3":
                clickThis(ThreeStarRatingLocator);
                break;

            case "4":
                clickThis(FourStarRatingLocator);
                break;

            case "5":
                clickThis(FiveStarRatingLocator);

        }
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
