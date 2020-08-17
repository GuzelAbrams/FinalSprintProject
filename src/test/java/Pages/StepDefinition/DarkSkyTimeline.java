package Pages.StepDefinition;

import Drivers.Web;

import Pages.DarkSky.LandingPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.testng.Assert;

public class DarkSkyTimeline {
    LandingPage landingPage = new LandingPage();

    @Given("^I am on DarkSky home page$")
    public void launchDarkSky(){
       Web.inItDriver("https://www.darksky.net");
    }

    @Then("^I verify timeline is displayed with (.*) hours increment$")
    public void verifyTwoHoursIncrement(int interval){
        Assert.assertTrue(landingPage.findWebElementsFromDarkSky(interval));

    }

}
