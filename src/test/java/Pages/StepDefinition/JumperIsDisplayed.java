package Pages.StepDefinition;


import Drivers.Web;
import Pages.Scholastic.LandingPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class JumperIsDisplayed {

    LandingPage landingPage = new LandingPage();
    @Given("^I am on the Homepage$")

    public void launchingHomePage(){

        Web.inItDriver("https://clubs3qa1.scholastic.com/home");
    }

    @When ( "^I go to YTO page$")
    public void goToYTO(){

        landingPage.goToYTO();
    }
    @When( "^I go to By Flyer tab$")
    public void goToBYFlyer(){

        landingPage.goToByFlyer();

    }
    @When("^I click on Price-Qty$")
    public void clickOnPrice(){

        landingPage.clickOnPriceQuantity();

    }
    @Then("^I verify jumper with text is displayed$")
    public void jumperIsDisplayed(){
        Assert.assertTrue(landingPage.isDisplayedJumper(), "Jumper is not displayed");

    }

    @Then ("^I verify jumper is NOT displayed$")
    public void JumperIsNotDisplayed(){
        Assert.assertFalse(landingPage.isDisplayedJumper(), "Jumper is displayed");

    }
}
