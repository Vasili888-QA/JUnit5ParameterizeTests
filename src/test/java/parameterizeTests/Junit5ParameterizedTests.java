package parameterizeTests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;
import parameterizeTests.pages.Gender;
import parameterizeTests.pages.RegistrationForm;
import simpleStart.pages.components.CalendarComponent;

@Epic("JUnit-5")
@Feature("Parameterize Tests")
@DisplayName("JUnit-5 --> Parameterize Tests")
public class Junit5ParameterizedTests {
    RegistrationForm registrationForm = new RegistrationForm();
    TestDataWithFaker testDataWithFaker = new TestDataWithFaker();
    CalendarComponent calendarComponent = new CalendarComponent();

    @ValueSource(strings = {
            "Vasili",
            "Pavel",
            "Tatiana"
    })
    @ParameterizedTest(name = "Registration test with ValueSource: {0}")
    public void registrationFormTest(String name) {
        Configuration.startMaximized = true;
        SelenideLogger.addListener("allure", new AllureSelenide());
        registrationForm
                .openPage()
                .enterFirstName(name)
                .enterLastName(testDataWithFaker.lastName)
                .enterEmail(testDataWithFaker.email)
                .clickMaleRadioButton()
                .enterMobilePhone(testDataWithFaker.mobilePhone);
        calendarComponent.setDate("10", "September", "1981");
        registrationForm
                .setSubjectField(testDataWithFaker.subjects)
                .checkSubmitFormIsDisplayed(name)
                .clickButtonClose();
    }

    @CsvSource(value = {
            "Vasili; QA",
            "Pavel; Dev",
            "Tatiana; PM"
    }, delimiter = ';')
    @ParameterizedTest(name = "Registration test with CsvSource: {0}, {1}")
    public void registrationFormTestWithCSVSource(String name, String lastName) {
        Configuration.startMaximized = true;
        SelenideLogger.addListener("allure", new AllureSelenide());
        registrationForm
                .openPage()
                .enterFirstName(name)
                .enterLastName(lastName)
                .enterEmail(testDataWithFaker.email)
                .clickMaleRadioButton()
                .enterMobilePhone(testDataWithFaker.mobilePhone);
        calendarComponent.setDate("10", "September", "1981");
        registrationForm
                .setSubjectField(testDataWithFaker.subjects)
                .checkSubmitFormIsDisplayed(name)
                .clickButtonClose();
    }

    @EnumSource(Gender.class)
    @ParameterizedTest(name = "Registration test with EnumSource: {0}")
    public void registrationFormTestWithEnumSource(Gender gender) {
        Configuration.startMaximized = true;
        SelenideLogger.addListener("allure", new AllureSelenide());
        registrationForm
                .openPage()
                .enterFirstName(testDataWithFaker.firstName)
                .enterLastName(testDataWithFaker.lastName)
                .enterEmail(testDataWithFaker.email)
                .selectGenderWithEnum(gender)
                .enterMobilePhone(testDataWithFaker.mobilePhone);
        calendarComponent.setDate("10", "September", "1981");
        registrationForm
                .setSubjectField(testDataWithFaker.subjects)
                .checkSubmitFormIsDisplayed(testDataWithFaker.firstName)
                .clickButtonClose();
    }
}