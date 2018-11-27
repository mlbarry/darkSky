package stepdefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import framework.web_pages.DarkSkyHomePage;
import org.testng.Assert;

public class DarkskySD extends DarkSkyHomePage {
    DarkSkyHomePage homePage = new DarkSkyHomePage();

    @Given("^I am on Darksky home page$")
    public void searcHomePage() {
        //homePage.verifyPageTitle();
    }

    @Then("^I verify timeline is displayed with two hours incremented")
    public void verifyTimeline() {

    }

    @When("^I expand todays timeline$")
    public void expendTodayTimeline() {
        homePage.clickOnExpandTodayTimeline();
    }

    @Then("^I verify lowest and highest temp is displayed correctly$")
    public void expectedLowerTempToday() {
        homePage.setVerifyLowerTemperature("lowerTemperature");

    }

    @Then("^I verify lowest and highest temp is displayed correctly$")

    public void expectedMaxTempToday() {
        homePage.setVerifyMaxTemperature("maxTemperature");
    }

    @Then("^I verify lowest and highest temp is displayed correctly$")

    public void expectedMinTemeperature() {
        homePage.setVerifyMinTemerature("minTemp");

    }

    @Then("^I verify lowest and highest temp is displayed correctly$")

    public void expectedHighTemperature() {
        homePage.setVerifyHighTemperature("highTemp");
}
}