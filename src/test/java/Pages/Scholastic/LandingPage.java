package Pages.Scholastic;

import Drivers.Web;
import Pages.StepDefinition.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class LandingPage extends BasePage {

    By closeAddLocator = By.xpath("//span[@class='notification-close']");
    By upperSigninButtonLocator =By.xpath("//a[@class='signin']");
    By logInEmailLocator = By.xpath("(//input[contains(@id,'login_username')])[2]");
    By logInPasswordLocator = By.xpath("//div[contains(@class,'form-row row-password-input required')]//input[@id='dwfrm_login_password']");
    By smallSighinButtonLocator = By.xpath("//div[@id='dialog-container']//button[1]");
    By enterOrderLocator = By.xpath("(//a[@id='enter-orders'])[2]");
    By teacherOrderLocator = By.xpath("//div[@class='hide-mobile desktop_nav_menu']//a[contains(text(),'Your Teacher Order')]");
    By byFlyerLocator = By.xpath("//ul[@class='hidden-xs']//span[contains(text(),'By Flyer')]");

    By priceQuantityLocator = By.xpath("//input[@class='itm-qty-usd input-qty numericenteronly']");
    By bonusPointQuantityLocator = By.xpath("//input[@class='itm-qty-pts input-qty numericenteronly']");

    By myAccountLocator = By.xpath("//span[@class='hide-mobile user-account-name']");
    By profileLocator = By.xpath("//a[@class='null'][contains(text(),'Profile')]");
    By addCardButtonLocator = By.xpath("//a[text()='Add a Card']");
    By cardNumberLocator = By.xpath("//input[contains(@id,'paymentinstruments_creditcards_newcreditcard_number')]");
    By securityCodeLocator = By.xpath("//input[@id='dwfrm_paymentinstruments_creditcards_newcreditcard_cvn']");
    By firstNameLocator = By.xpath("//input[@id='dwfrm_paymentinstruments_creditcards_address_firstname']");
    By lastNameLocator = By.xpath("//input[@id='dwfrm_paymentinstruments_creditcards_address_lastname']");
    By addressLocator = By.xpath("//input[@id='dwfrm_paymentinstruments_creditcards_address_address1']");
    By zipCodeLocator = By.xpath("//input[@id='dwfrm_paymentinstruments_creditcards_address_postal']");
    By phoneNumberLocator = By.xpath("//input[@id='dwfrm_paymentinstruments_creditcards_address_phone']");
    By saveButtonLocator = By.xpath("//button[@id='applyBtn']");

    By monthDropDownLocator = By.xpath("//div[contains(text(),'Month')]");
    By monthDisplayedLocator = By.xpath("//div[@id='scrollbar-1']//span[contains(text(),'02')]");
    By yearDropDownLocator = By.xpath("//div[contains(text(),'Year')]");
    By yearDisplayedLocator = By.xpath("//span[contains(text(),'2024')]");


    By jumperLocator = By.xpath("//div[@class='info-modal-hd']");

    By editProfileLocator = By.xpath("//div[@class='name-section']//a[@class='reading-club'][contains(text(),'Edit')]");
    By updateLastNameLocator = By.xpath("//input[@id='dwfrm_profile_customer_lastname']");
    By updateSaveButton = By.xpath("//button[@name='dwfrm_profile_save']");


    By searchBoxLocator = By.xpath("//input[@data-placeholder='Search by Title, Author, Item # or Keyword']");
    By searchButtonLocator = By.xpath("//i[@class='fa fa-search']");

    By allStarsLocator = By.xpath("//i[@class='icon-a fa-tcool-star tooltipstered']");
    By starDisplayedLocator = By.xpath("//i[@class='icon-a fa-tcool-star tooltipstered active']");


    By myListRecommendLocator = By.xpath("//li[@class='recommend']");

    By myListLocator = By.xpath("//a[@class='toggle-item']");

    By recommendListLocator = By.xpath("//div[@class='product-list-item']");

    By nameSectionLocator = By.xpath("//div[@class='name-section']//div[@class='info']//div[1]");
    By userDataLocation = By.xpath("//span[@class='user-data']");

    By visaEndsLocator = By.xpath("//span[@class='bold']");
    By reviewCardLocator = By.xpath("//button[@class='secondary']");
    By proceedToCheckOutLocator = By.xpath("//button[@id='dwfrm_cart_checkoutCart']");
    By secondProceedToCheckOutLocator = By.xpath("(//button[@type='submit' and @name='dwfrm_cart_checkoutCart'])[2]");

    By continueCheckOutLocator = By.xpath("//button[@id='btn-continue-checkout']//span[contains(text(),'Continue Checkout')]");

    By paymentMethodLocator = By.xpath("//div[@class='selected-option']");

    By creditCardMethodLocator = By.xpath("//span[text()='Credit Card']");
    By cardTypeLocator = By.xpath("(//div[@class='selected-option input-select selected-active'])[2]");


    public void enterLoginEmailAndPassword(String userEmail, String userPassword) {

        clickThis(upperSigninButtonLocator);
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        type(logInEmailLocator, userEmail);
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        type(logInPasswordLocator, userPassword);
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        clickThis(smallSighinButtonLocator);
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        clickThis(closeAddLocator);
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void goToYTO(){
       mouseHoverOnElementByLocator(enterOrderLocator);
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        clickThis(teacherOrderLocator);
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void goToByFlyer(){
        clickThis(byFlyerLocator);
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void clickOnPriceQuantity(){
        List<WebElement>  elements = findingElementsUsingFluentWait(priceQuantityLocator);
        clickThis(elements.get(1));
    }

    public boolean isDisplayedJumper(){
        boolean a = findingElementUsingFluentWait(jumperLocator).isDisplayed();
        return a;
    }
    public void clickOnBonusQuantity(){
        List<WebElement> elements = findingElementsUsingFluentWait(bonusPointQuantityLocator);
        clickThis(elements.get(3));
    }

    public void clickOnStar(){
        List<WebElement> ele = findingElementsUsingFluentWait(allStarsLocator);
        clickThis(ele.get(0));

    }
    public boolean verifyInRecommendedList(){
        boolean a = findingElementUsingFluentWait(starDisplayedLocator).isDisplayed();
        clickThis(myListLocator);
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        boolean b = getTextFromElement(myListRecommendLocator).contains("1 item");
        clickThis(myListRecommendLocator);
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        boolean c = getTextFromElement(recommendListLocator).contains("Harry");

        boolean abc = a==b==c;
        return abc;

    }

    public void goToMyAccount(){
        clickThis(myAccountLocator);
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        clickThis(profileLocator);
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }



    }

    public void clickAddCreditCard(){

        clickThis(addCardButtonLocator);
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void addCardNumber(String text){
        type(cardNumberLocator,text);
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    public void addExpDateMonth(){
        clickThis(monthDropDownLocator);
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        clickThis(monthDisplayedLocator);
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void AddExpDateYear(){
        clickThis(yearDropDownLocator);
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        clickThis(yearDisplayedLocator);
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void addSecurityCode(String code){
        type(securityCodeLocator, code);
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
     public void addFirstName(String firstNAme){
        type(firstNameLocator, firstNAme);

     }
     public void addLastName(String lastName){
        type(lastNameLocator, lastName);

     }
     public void addAddress(String address){
        type(addressLocator, address);

     }

    public void addZipCode(String zipCode){
        type(zipCodeLocator, zipCode);

    }
    public void addPhoneNumber(String number){
        type(phoneNumberLocator,number);

        }
    public void clickSaveButton(){
        clickThis(saveButtonLocator);
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void updateName( String newName){

        clickThis(editProfileLocator);
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        clearField(updateLastNameLocator);
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        type(updateLastNameLocator, newName);
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        clickThis(updateSaveButton);
         try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public boolean verifyUpdatedNameInMyAccount(String newName){

        boolean a = getTextFromElement(nameSectionLocator).contains(newName);
        return a;
    }

    public boolean verifyUpdatedNameInPageHeader(String newName){
        boolean a = getTextFromElement(userDataLocation).contains(newName);
        return a;
    }

    public void searchInSearchBox(String nameOfItem){
        type(searchBoxLocator, nameOfItem);
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        clickThis(searchButtonLocator);
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public boolean verifyCardAddedInMyAccount(String cardEnding){
        boolean a = getTextFromElement(visaEndsLocator).contains(cardEnding);
    return a;
    }

    public boolean isDisplayedCreditCard(String cardEndingNumber){
        clickThis(paymentMethodLocator);
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        clickThis(creditCardMethodLocator);
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        boolean a = getTextFromElement(cardTypeLocator).contains(cardEndingNumber);
        return a;


    }

    public void typeInQuantity(){
        type(priceQuantityLocator, "1");
    }
    public void goToBilling(){
        clickThis(reviewCardLocator);
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        clickThis(proceedToCheckOutLocator);
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        clickThis(secondProceedToCheckOutLocator);
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        clickThis(continueCheckOutLocator);

        try {
            Thread.sleep(100000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }
}
