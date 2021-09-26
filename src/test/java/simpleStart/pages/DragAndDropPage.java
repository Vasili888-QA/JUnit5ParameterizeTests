package simpleStart.pages;

import com.codeborne.selenide.Selenide;

import static com.codeborne.selenide.Condition.matchText;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class DragAndDropPage {
    public void pageWithTitleOpened(String title) {
        Selenide.$x("//div[@class='example']//h3").shouldHave(matchText(title));
    }

    public void columnsWithTextIsAppeared(String columnA, String columnB, String textOncolumnA, String textOncolumnB) {
        $("#column-" + columnA + "").shouldHave(text(textOncolumnA));
        $("#column-" + columnB + "").shouldHave(text(textOncolumnB));
    }

    public void dragAndDropColumnToColumn(String columnA, String columnB) {
        $("#column-" + columnA + "").dragAndDropTo($("#column-" + columnB + ""));
    }
}
