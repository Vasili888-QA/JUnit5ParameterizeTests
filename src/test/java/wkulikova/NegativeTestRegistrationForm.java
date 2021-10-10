package wkulikova;

import org.junit.jupiter.api.Test;
import parameterizeTests.TestBase;
import parameterizeTests.pages.RegistrationForm;

import static com.codeborne.selenide.Condition.cssValue;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class NegativeTestRegistrationForm extends TestBase {

    @Test
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
