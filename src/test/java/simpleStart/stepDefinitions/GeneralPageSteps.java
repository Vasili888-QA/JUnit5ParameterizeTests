package simpleStart.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import simpleStart.pages.GeneralPage;
import io.cucumber.java.en.Given;


public class GeneralPageSteps {
    GeneralPage generalPage = new GeneralPage();

    @And("Main page is open")
    public void mainPageOnDemoQAOpened() {
        generalPage.mainPageOnDemoQAOpened();
    }

    @When("I click to card {string}")
    public void iClickToCard(String cardName) {
        generalPage.iClickToCard(cardName);
    }

    @Given("Open site {string} with endpoint {string}")
    public void openSiteWithEndpoint(String siteURL, String endpoint) {
        generalPage.openSite(siteURL, endpoint);
    }
}