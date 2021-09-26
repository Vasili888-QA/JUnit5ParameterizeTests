package simpleStart.stepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import simpleStart.pages.PracticeFormPage;
import simpleStart.pages.components.CalendarComponent;

public class PracticeFormPageSteps {
    PracticeFormPage practiceFormPage = new PracticeFormPage();
    CalendarComponent calendar = new CalendarComponent();
    Faker faker = new Faker();

    @When("I enter {string} in the field {string}")
    public void iEnterInTheField(String inputData, String fieldName) {
        practiceFormPage.iEnterInTheField(inputData, fieldName);
    }

    @And("Select radio button {string}")
    public void selectRadioButtonFemale(String fieldName) {
        practiceFormPage.selectRadioButtonFemale(fieldName);
    }

    @And("I enter {string} on the field Subject")
    public void iEnterOnTheFieldSubject(String inputData) {
        practiceFormPage.iEnterOnTheFieldSubject(inputData);
    }

    @And("I enter random address on the field Current Address")
    public void iEnterDataOnTheFieldCurrentAddress() {
        String randomAddress = faker.address().fullAddress();
        practiceFormPage.iEnterDataOnTheFieldCurrentAddress(randomAddress);
    }

    @Then("I click button {string}")
    public void iClickButton(String buttonName) {
        practiceFormPage.iClickButton(buttonName);
    }

    @Then("Pop-up is open with title {string}")
    public void popUpIsOpenWithTitle(String title) {
        practiceFormPage.popUpIsOpenWithTitle(title);
    }

    @And("I enter date {string}-{string}-{string} to calendar")
    public void iEnterDateToCalendar(String day, String month, String year) {
        calendar.setDate(day, month, year);
    }
}
