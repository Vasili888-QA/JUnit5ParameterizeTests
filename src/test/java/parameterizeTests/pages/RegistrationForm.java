package parameterizeTests.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class RegistrationForm {
    private  SelenideElement
            firstNameField = $("#firstName"),
            lastNameField = $("#lastName"),
            emailField = $("#userEmail"),
            maleRadioButton = $x("//*[contains(text(), 'Male')]"),
            mobilePhoneField = $("#userNumber"),
            subjectField = $("#subjectsInput"),
            buttonClose = $x("//button[contains(text(),'Close')]");
    String
            form = "//tr/td[text()='Student Name']/following-sibling::td[contains(text(), '%s')]",
            radioCheckbox = "//*[contains(text(), '%s')]",
            radioCheckboxStrict = "//*[text()='%s']";

    public RegistrationForm openPage() {
        open("https://demoqa.com/automation-practice-form");
        return this;
    }

    public RegistrationForm enterFirstName(String firstName) {
        firstNameField.setValue(firstName);
        return this;
    }

    public RegistrationForm enterLastName(String lastName) {
        lastNameField.setValue(lastName);
        return this;
    }

    public RegistrationForm enterEmail(String email) {
        emailField.setValue(email);
        return this;
    }

    public RegistrationForm clickMaleRadioButton() {
        maleRadioButton.click();
        return this;
    }

    public void enterMobilePhone(String mobilePhone) {
        mobilePhoneField.setValue(mobilePhone);
    }

    public RegistrationForm setSubjectField(String subjects) {
        subjectField.click();
        subjectField.sendKeys(subjects);
        subjectField.pressEnter();
        return this;
    }

    public void clickButtonClose() {
        buttonClose.click();
    }

    public RegistrationForm checkSubmitFormIsDisplayed(String textOnForm) {
        $x(String.format(form, textOnForm)).shouldBe(visible);
        return this;
    }

    public RegistrationForm selectGenderWithEnum(Gender gender) {
        $x(String.format(radioCheckbox, gender.getGenderOption())).click();
        return this;
    }


    public void submitForm() {
        $("#submit").scrollIntoView(true).click();
    }
//
//    public RegistrationForm selectRadioButton(String buttonName) {
//        $x(String.format(radioCheckboxStrict, buttonName)).click();
//        return this;
//    }
//
//    public RegistrationForm selectRadioButton1(String buttonName) {
//        $x(String.format(radioCheckboxStrict, buttonName)).click();
//        return this;
//    }

}