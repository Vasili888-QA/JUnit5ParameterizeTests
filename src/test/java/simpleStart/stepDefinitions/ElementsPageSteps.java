package simpleStart.stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import simpleStart.pages.ElementsPage;

public class ElementsPageSteps {
    ElementsPage elementsPage = new ElementsPage();

    @Then("Page is open with title {string}")
    public void pageIsOpenWithTitle(String titleName) {
        elementsPage.pageIsOpenWithTitle(titleName);
    }
}
