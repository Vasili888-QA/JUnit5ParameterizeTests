package simpleStart.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
import parameterizeTests.TestBase;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources"},
        tags = "@Test or @Story or @Lesson1 or @Lesson2 or @Lesson4 or @Lesson8",
        glue = {"simpleStart/stepDefinitions"},
        plugin = {"pretty", "io.qameta.allure.cucumber6jvm.AllureCucumber6Jvm"})
public class RunTests extends TestBase {
}

