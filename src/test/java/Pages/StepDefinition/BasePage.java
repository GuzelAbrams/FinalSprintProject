package Pages.StepDefinition;

import Drivers.Web;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.function.Function;

public class BasePage {

    public static void openWebPage(String url) {
   //     Web.inItDriver(url);
    }

    public void type(By locator, String data) {
        Web.getDriver().findElement(locator).sendKeys(data);
    }

    public void typeJS(By locator, String data) {
        WebElement element = Web.getDriver().findElement(locator);
        JavascriptExecutor js = (JavascriptExecutor) Web.getDriver();
        js.executeScript("argument[0].value='%s';", element, data);
    }

    public void clickThis(By locator) {
        findingElementUsingFluentWait(locator).click();
    }
    public void clickThis(WebElement element) {
        element.click();
    }

    public void clickThisJS(By locator) {
        WebElement element = Web.getDriver().findElement(locator);
        JavascriptExecutor js = (JavascriptExecutor) Web.getDriver();
        js.executeScript("arguments[0].cliv();", element);
    }

    public String getTextFromElement(By locator) {
        return Web.getDriver().findElement(locator).getText();
    }

    public String getTextFromElement(WebElement element) {
        return element.getText();
    }

    public String getAttributeValueFromElement(By locator, String attributeName) {
        return Web.getDriver().findElement(locator).getAttribute(attributeName);
    }

    public String getWebPageTitle() {
        return Web.getDriver().getTitle();
    }

    public String getCurrentWebUrl() {
        return Web.getDriver().getCurrentUrl();
    }

    public void selectFromDropdownByVisibleText(By locator, String visibleText) {
        WebElement dropdownElement = Web.getDriver().findElement(locator);
        Select dropdown = new Select(dropdownElement);
        dropdown.selectByVisibleText(visibleText);
    }

    public boolean isWebElementEnabled(By locator) {
        return Web.getDriver().findElement(locator).isEnabled();
    }

    public void mouseHoverOnElementWithWebElement(WebElement element) {
        Actions act = new Actions(Web.getDriver());
        act.moveToElement(element).build().perform();
    }

    public void mouseHoverOnElementByLocator(By locator) {
        WebElement element = Web.getDriver().findElement(locator);
        Actions act = new Actions(Web.getDriver());
        act.moveToElement(element).build().perform();
    }

    public void selectFromAutoSuggestion(By locator, String userSelection) {
        List<WebElement> autoSuggestionsElements = Web.getDriver().findElements(locator);
        for (int i = 0; i <= autoSuggestionsElements.size(); i++) {
            if (autoSuggestionsElements.get(i).getText().equalsIgnoreCase(userSelection)) {
                autoSuggestionsElements.get(i).click();
                break;
            }
        }
    }

    public void clearField(By locator) {
        Web.getDriver().findElement(locator).clear();
    }

    public void clearField(WebElement element) {
        element.clear();
    }

    public void scrollByPixel(int y) {
        JavascriptExecutor js = (JavascriptExecutor) Web.getDriver();
        js.executeScript("scrollBy (0" + y + ")");
    }

    public void scrollUpToWebElement(By locator) {
        WebElement webElement = Web.getDriver().findElement(locator);
        JavascriptExecutor js = (JavascriptExecutor) Web.getDriver();
        js.executeScript("arguments[0].scrollIntoView(true)", webElement);
    }

    public void scrollToTheButtom() {
        JavascriptExecutor js = (JavascriptExecutor) Web.getDriver();
        js.executeScript("window,scrollTo(0,document.body.scrollHeight);");
    }

    public void switchWindow(String windowHandle) {
        Web.getDriver().switchTo().window(windowHandle);
    }

    public String getCurrentWindowHandle() {
        return Web.getDriver().getWindowHandle();
    }

    public Set<String> getAllWindowHandles() {
        return Web.getDriver().getWindowHandles();
    }

    public void switchToFrame(String frameId) {
        Web.getDriver().switchTo().frame(frameId);
    }

    public void switchTpFrame(By frameLocator) {
        WebElement myFrame = Web.getDriver().findElement(frameLocator);
        Web.getDriver().switchTo().frame(myFrame);
    }

    public void acceptAlert() {
        Web.getDriver().switchTo().alert().accept();
    }

    public void dismissAlert() {
        Web.getDriver().switchTo().alert().dismiss();
    }

    public String getTextFromAlert() {
        return Web.getDriver().switchTo().alert().getText();
    }

    public WebElement findingElementUsingFluentWait(By locator) {
        Wait fWait = new FluentWait<>(Web.getDriver())
                .withTimeout(Duration.ofSeconds(25))
                .pollingEvery(Duration.ofSeconds(1))
                .ignoring(NoSuchElementException.class)
                .ignoring(NoAlertPresentException.class)
                .ignoring(ElementNotInteractableException.class)
                .withMessage("Element is not found within 25 seconds");

        WebElement ele = (WebElement) fWait.until(new Function<WebDriver, WebElement>() {
            public WebElement apply(WebDriver driver) {
                return driver.findElement(locator);
            }
        });
        return ele;
    }

    public List<WebElement> findingElementsUsingFluentWait(By locator) {
        Wait fWait = new FluentWait<>(Web.getDriver())
                .withTimeout(Duration.ofSeconds(25))
                .pollingEvery(Duration.ofSeconds(1))
                .ignoring(NoSuchElementException.class)
                .ignoring(NoAlertPresentException.class)
                .ignoring(ElementNotInteractableException.class)
                .withMessage("Element is not found within 25 seconds");

        List<WebElement> ele = (List<WebElement>) fWait.until(new Function<WebDriver, List<WebElement>>() {
            public List<WebElement> apply(WebDriver driver) {
                return driver.findElements(locator);
            }
        });
        return ele;
    }

    public void selectDateFromCalendar(By locator, String userDate) {
        List <WebElement> allDates=findingElementsUsingFluentWait(locator);
        for(WebElement date: allDates){
            if(date.getText().equals(userDate)) {
                clickThis(date);
                break;
            }
        }
    }
    public void closeWebPage(){
        Web.getDriver().close();
    }
    public void quitWebPage(){
        Web.getDriver().quit();
    }

    public ArrayList<String> getTextsFromWebElements(By locator){
        List<WebElement> elements=findingElementsUsingFluentWait(locator);
        ArrayList<String> texts=new ArrayList<>();
        for(WebElement element: elements){
            texts.add(element.getText());
        }return texts;


    }

}
