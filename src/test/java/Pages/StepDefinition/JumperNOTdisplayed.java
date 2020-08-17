package Pages.StepDefinition;

import Pages.Scholastic.LandingPage;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class JumperNOTdisplayed {

    LandingPage landingPage = new LandingPage();


    @When("^I click on BonusPoint-Qty box$")
    public void clickOnBonusPoint(){
        landingPage.clickOnBonusQuantity();

    }


    @Then ("^I click on Price-Qty box$")
    public void clickOnPriceQtyBox(){
        landingPage.clickOnPriceQuantity();
    }




    }

