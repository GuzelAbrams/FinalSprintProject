package Pages.StepDefinition;

import Drivers.Web;
import Pages.Hotels.LandingPage;
import Pages.Hotels.SearchPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class Filters {

    LandingPage landingPage = new LandingPage();
    SearchPage searchPage = new SearchPage();

    @Given("^I am on default locations search result screen$")

    public void launchSearchPage(){

       Web.inItDriver("https://www.hotels.com");
        landingPage.enterDestination("New York");
        landingPage.selectDestFromAutoSuggestions("New York, New York, United States of America");
        landingPage.clickSearchButton();

    }


    @When("^I click on (.*) star$")
    public void selectStar(String star){
        searchPage.ScrollToStarsElement();
        searchPage.selectingAStar(star);
    }


    @And("^I verify hotels are (.*) star rating$")
    public void verifyAsSelected(String star){
        //searchPage.scrollingPage();
        Assert.assertTrue(searchPage.verification(star));
    }
}
