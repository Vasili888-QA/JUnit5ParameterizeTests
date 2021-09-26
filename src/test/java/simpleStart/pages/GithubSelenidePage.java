package simpleStart.pages;

import com.codeborne.selenide.Selenide;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.open;

public class GithubSelenidePage {

    public void iOpenSelenidePage() {
        open("https://github.com/selenide/selenide");
        Selenide.$x("//h2[contains(text(),'About')]//..//a[contains(text(),'selenide.org')]").shouldBe(visible);
    }

    public void iClickOnWikiTab() {
        Selenide.$("#wiki-tab").click();
    }

    public void pageWithTitleIsOpen(String title) {
        Selenide.$x("//div[@class='page']//h1").shouldHave(matchText(title));
    }

    public void chaptersBlockContainsSoftAssertions() {
        Selenide.$("#wiki-body").$(byText("Soft assertions")).shouldBe(visible);
    }

    public void iClickOnSoftAssertions() {
        Selenide.$("#wiki-body").$(byText("Soft assertions")).click();
    }

    public void codeForJUnit5IsAppeared() {
        Selenide.$("#wiki-body").shouldHave(text("JUnit5"));
    }
}
