package Pages.StepDefinition;

import Drivers.Web;

import Pages.Scholastic.LandingPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class AddCreditCard {

    LandingPage landingPage = new LandingPage();



    @When("^I Login$")

    public void logIn(){
        landingPage.enterLoginEmailAndPassword("guzelimamieva@gmail.com","Ima987mir" );
    }
    @When( "^I go to My Accounts page$")

    public void launchAccountsPage(){

        landingPage.goToMyAccount();

    }
    @When( "^I add credit card$")

    public void addingCreditCard(){
        landingPage.clickAddCreditCard();
        landingPage.addCardNumber("4482330030444954");
        landingPage.addExpDateMonth();
        landingPage.AddExpDateYear();
        landingPage.addSecurityCode("339");
        landingPage.addFirstName("Guzel");
        landingPage.addLastName("Abrams");;
        landingPage.addAddress("3255 shore");
        landingPage.addZipCode("11235");
        landingPage.addPhoneNumber("7189540775");
        landingPage.clickSaveButton();

    }
    @Then("^I verify credit card is added successfully in My Accounts$")
    public void verifyCreditCardAdded(){

        Assert.assertTrue(landingPage.verifyCardAddedInMyAccount("4954"), "Card didn't add");


    }
    @Then("^I verify added card is displayed when shopping using credit card$")
    public void verifyCreditCardIsDisplayed(){
        landingPage.goToYTO();
        landingPage.typeInQuantity();
        landingPage.goToBilling();
        Assert.assertTrue(landingPage.isDisplayedCreditCard("4954"), "Card is not displayed");



    }
}
