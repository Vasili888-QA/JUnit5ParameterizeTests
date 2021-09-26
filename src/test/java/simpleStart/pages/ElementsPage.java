package simpleStart.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;

public class ElementsPage {
    public void pageIsOpenWithTitle(String titleName) {
        Selenide.$x("//div[@class='main-header'][contains(text(),'" + titleName + "')]")
                .shouldBe(Condition.visible);
    }
}
