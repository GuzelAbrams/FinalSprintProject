package Pages.StepDefinition;

import Drivers.Web;

import Pages.Hotels.LandingPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class ChildrenDDHotels {

    LandingPage landingPage = new LandingPage();

    @Given("^I am on hotels landing page$")
    public void launchHotels(){
     //   Web.inItDriver("https://www.hotels.com");
    }


    @When("^I select (.*) in children dropdown$")
    public void selectChildrenCount(String count){
        landingPage.selectDropDown(count);
    }



    @Then("^I see (.*) child age dropdowns$")
    public void  verifyChildAgeInDropDown(int count){
        Assert.assertTrue(landingPage.verifyQuantityOfKids(count));



    }

}
