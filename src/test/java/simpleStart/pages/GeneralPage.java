package simpleStart.pages;

import com.codeborne.selenide.Selenide;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;


public class GeneralPage {

//    public void openGooglePageByDirectLink() {
//        //Selenide.open("https://www.google.com/");
//        open(baseUrl);
//    }

    public void mainPageOnDemoQAOpened() {
        Selenide.$x("//div[@class='card-body']/h5[contains(text(),'Elements')]").shouldBe(visible).shouldHave(text("Elements"));
    }

    public void iClickToCard(String cardName) {
        //Selenide.$x("//div[@class='card-body']/h5[contains(text(),'Book Store Application')]").scrollIntoView("end");
        Selenide.$x("//div[@class='card-body']/h5[contains(text(),'" + cardName + "')]").click();
    }

    public void openSite(String siteURL, String endpoint) {
        Selenide.open("https://" + siteURL + endpoint);
    }
}
