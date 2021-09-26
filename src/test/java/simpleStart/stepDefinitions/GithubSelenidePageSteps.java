package simpleStart.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import simpleStart.pages.GithubSelenidePage;

public class GithubSelenidePageSteps {
    GithubSelenidePage githubSelenidePage = new GithubSelenidePage();

    @Given("I open Selenide page")
    public void iOpenSelenidePage() {
        githubSelenidePage.iOpenSelenidePage();
    }

    @When("I click on Wiki tab")
    public void iClickOnWikiTab() {
        githubSelenidePage.iClickOnWikiTab();
    }

    @Then("Page with title {string} is open")
    public void pageWithTitleIsOpen(String title) {
        githubSelenidePage.pageWithTitleIsOpen(title);
    }

    @And("Chapters block contains Soft assertions")
    public void chaptersBlockContainsSoftAssertions() {
        githubSelenidePage.chaptersBlockContainsSoftAssertions();
    }

    @And("I click on Soft assertions")
    public void iClickOnSoftAssertions() {
        githubSelenidePage.iClickOnSoftAssertions();
    }

    @Then("Code for JUnit5 is appeared")
    public void codeForJUnit5IsAppeared() {
        githubSelenidePage.codeForJUnit5IsAppeared();
    }
}
