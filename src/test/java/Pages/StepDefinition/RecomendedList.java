package Pages.StepDefinition;

import Pages.Scholastic.LandingPage;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class RecomendedList {

    LandingPage landingPage = new LandingPage();


    @When("^I search (.*) using search box$")

    public void searchInSearchBox(String text){
        landingPage.searchInSearchBox(text);
    }

    @When ("^I click on 'star' icon$")

    public void clickOnStar(){

        landingPage.clickOnStar();
    }

    @Then ("^I verify item is added to recommended list$")

    public void verifyItemIsAdded(){

        Assert.assertTrue(landingPage.verifyInRecommendedList());

    }
}
