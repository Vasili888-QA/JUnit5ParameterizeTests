package simpleStart.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class PracticeFormPage {
    public void iEnterInTheField(String inputData, String fieldName) {
        Selenide.$x("//input[@id='" + fieldName + "']").setValue(inputData);
    }

    public void selectRadioButtonFemale(String fieldName) {
        $x("//input[@value='" + fieldName + "']").closest("div").click();
    }

    public void iEnterOnTheFieldSubject(String inputData) {
        $x("//div[@id='subjectsContainer']//input").setValue(inputData).pressEnter();
    }

    public void iEnterDataOnTheFieldCurrentAddress(String randomAddress) {
        $("#currentAddress").setValue(randomAddress);
    }

    public void iClickButton(String buttonName) {
        $x("//button[contains(text(),'" + buttonName + "')]").click();
    }

    public void popUpIsOpenWithTitle(String title) {
        $x("//div[@class='modal-header']//div").shouldHave(Condition.text(title));
    }
}

//реализация с занятия
//@Test
//void fillFormTest() {
////        String permanentAddress = "some street 1";
//
//    open("/automation-practice-form");
//    $("#firstName").setValue("Alex");
//    $("#lastName").setValue("Egorov");
//    $("#userEmail").setValue("alex@egorov.com");
////        $("#gender-radio-3").click();
////        $(byText("Other")).click();
////        $("#gender-radio-3").parent().click();
//    $("#genterWrapper").$(byText("Other")).click();
////        $$("label.custom-control-label").filter(text("Other")).get(0).click();
////        $("#genterWrapper").selectRadio("Other"); // not working
//    $("#userNumber").setValue("1231231231");
//    $("#dateOfBirthInput").click();
//    $(".react-datepicker__month-select").selectOption("July");
//    $(".react-datepicker__year-select").selectOption("2005");
//
//    $(".react-datepicker__day--028:not(.react-datepicker__day--outside-month)").click();
////        $$(".react-datepicker__day--028")
////                .filter(not(cssClass("react-datepicker__day--outside-month"))).first().click();
////        react-datepicker__day--028 react-datepicker__day--outside-month
////        react-datepicker__day--028
////        $("[aria-label=\"Choose Tuesday, June 28th, 2005\"]").click();
////        $x("//*[@aria-label=\"Choose Tuesday, June 28th, 2005\"]").click();
////        $x("//*[contains(@aria-label, \"June 28th, 2005\")]").click();
//
////        aria-label="Choose Tuesday, June 28th, 2005"
////        aria-label="Choose Thursday, July 28th, 2005"
//
//    $("#subjectsInput").setValue("Math").pressEnter();
//    $("#hobbiesWrapper").$(byText("Reading")).click();
//    $("#uploadPicture").uploadFromClasspath("img/1.png");
////        $("#uploadPicture").uploadFile(new File("src/test/resources/img/1.png"));
//    $("#currentAddress").setValue("Qa guru street 7");
//    $("#state").click();
//    $("#stateCity-wrapper").$(byText("NCR")).click();
//    $("#city").click();
//    $("#stateCity-wrapper").$(byText("Delhi")).click();
//
//    $("#submit").click();
//    $("#submit").click();
//
//
//    $(".modal-title").shouldHave(text("Thanks for submitting the form"));
//    $(".table-responsive").shouldHave(text("Alex Egorov"), text("alex@egorov.com"), text("28 July,2005"));
//    $(".table-responsive").$(byText("Student Name")).shouldHave(text("Alex Egorov"));
//    $(".table-responsive").$(byText("Email")).shouldHave(text("alex@egorov.com"));
//    $x("//td[text()='Student Name']").parent()
//            .shouldHave(text("Alex Egorov"));
//
//
//
//
//
//
//    ;
////        $("#userName").setValue("Alex");
////        $("#userEmail").setValue("alex@qaguru.com");
////        $("input#currentAddress").setValue("some street 1");
////        $("#permanentAddress").setValue(permanentAddress);
////
////        $("#output #name").shouldHave(text("Alex"));
////        $("#output #email").shouldHave(text("alex@qaguru.com"));
////        $("#output p#currentAddress").shouldHave(text("some street 1"));
////        $("#output #permanentAddress").shouldHave(text(permanentAddress));
//}
//    @Test
//    void emptyFillFormTest() {
//        open("/automation-practice-form");
//        $("#submit").click();
//
//        $("#firstName").shouldHave(cssValue("border-color", "rgb(220, 53, 69)"));
//    }