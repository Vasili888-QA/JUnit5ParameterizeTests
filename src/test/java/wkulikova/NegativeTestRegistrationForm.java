package wkulikova;

import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import parameterizeTests.TestBase;
import parameterizeTests.pages.RegistrationForm;

import static com.codeborne.selenide.Condition.cssValue;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;
@Epic("JUnit-5")
@Feature("Validate Tests")
public class NegativeTestRegistrationForm extends TestBase {

    @Test
    @Tag("prod")
    @Tag("smoke")
    @DisplayName("JUnit-5 --> Validate Tests")
    public void testSubmitEmptyForm() {
        RegistrationForm registrationForm = new RegistrationForm();
        registrationForm.openPage();
        registrationForm.submitForm();
        //проверили, что поле first name выделено красной рамкой
        //$("#firstName").shouldHave(cssValue("border-color", "rgb(220, 53, 69)"));
        //проверка полей формы на валидацию
        $x("//form[@class='was-validated']").shouldBe(visible);
    }
}
