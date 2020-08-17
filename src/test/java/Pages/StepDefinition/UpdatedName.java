package Pages.StepDefinition;

import Pages.Scholastic.LandingPage;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class UpdatedName {

    LandingPage landingPage = new LandingPage();

    @When ("^I update the name to (.*)$")
    public void updateName(String name){
      landingPage.updateName(name);
    }

    @Then( "^I verify name to (.*) is updated successfully in My Accounts$")

    public void verifyNameUpdateInMyAccount(String name){

        Assert.assertTrue( landingPage.verifyUpdatedNameInMyAccount(name), "Name is not updated in MyAccount");

    }
    @Then( "^I verify name to (.*) is updated successfully in Page Header$")

    public void verifyNameUpdateInPageHeader(String name){

        Assert.assertTrue(landingPage.verifyUpdatedNameInPageHeader(name), "Name is not updated in PageHeader");

    }
}
