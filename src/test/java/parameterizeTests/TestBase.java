package parameterizeTests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.remote.DesiredCapabilities;
import parameterizeTests.helper.Attach;

import static parameterizeTests.config.Credentials.credentials;

public class TestBase {
    @BeforeAll
    static void setup() {
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("enableVNC", true);
        capabilities.setCapability("enableVideo", true);

        Configuration.browserCapabilities = capabilities;
        Configuration.startMaximized = true;
        //закомментировать, если нужно запускать локально
//        Configuration.remote = "https://user1:1234@selenoid.autotests.cloud/wd/hub/";
        //так прячим креды с помощью библиотеки owner
        String login = credentials.login();
        String password = credentials.password();
        String url = System.getProperty("remote");
//        Configuration.remote = String.format("https://%s:%s@selenoid.autotests.cloud/wd/hub/", login, password);
        //так прячим креды с помощью библиотеки owner и добавляем возможность передавать удалённо URL
        Configuration.remote = String.format("https://%s:%s@%s", login, password, url);
    }

    @AfterEach
    public void tearDown() {
        Attach.screenshotAs("Last screenshot");
        Attach.pageSource();
        Attach.browserConsoleLogs();
        Attach.addVideo();
    }
}
