package from_kulikova;

import org.junit.jupiter.api.Test;
import parameterizeTests.pages.RegistrationForm;
import static com.codeborne.selenide.Condition.cssValue;
import static com.codeborne.selenide.Selenide.$;

public class NegativeTestRegistrationForm {

    @Test
        public void testSubmitEmptyForm(){
        RegistrationForm registrationForm = new RegistrationForm();
        registrationForm.openPage();
        registrationForm.submitForm();
        //проверили, что поле first name выделено красной рамкой
        $("#firstName").shouldHave(cssValue("border-color","rgb(220, 53, 69)"));
    }
}
