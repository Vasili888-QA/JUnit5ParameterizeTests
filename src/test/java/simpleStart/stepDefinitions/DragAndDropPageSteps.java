package simpleStart.stepDefinitions;

import io.cucumber.java.en.When;
import simpleStart.pages.DragAndDropPage;
import io.cucumber.java.en.And;

public class DragAndDropPageSteps {
    DragAndDropPage dragAndDropPage = new DragAndDropPage();

    @And("Page with title {string} opened")
    public void pageWithTitleOpened(String title) {
        dragAndDropPage.pageWithTitleOpened(title);
    }

    @And("Columns {string} and {string} with text {string} and {string} is appeared")
    public void columnsWithTextIsAppeared(String columnA, String columnB, String textOncolumnA, String textOncolumnB) {
        dragAndDropPage.columnsWithTextIsAppeared(columnA, columnB, textOncolumnA, textOncolumnB);
    }

    @When("Drag and drop column {string} to column {string}")
    public void dragAndDropColumnToColumn(String columnA, String columnB) {
        dragAndDropPage.dragAndDropColumnToColumn(columnA, columnB);
    }
}
