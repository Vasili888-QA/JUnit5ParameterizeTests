@Lesson4
Feature: Lesson4 -Task3- Check Drag and Drop action on Internet-Herokuapp

  Scenario: Check drag and drop with Selenide
    Given Open site "the-internet.herokuapp.com/" with endpoint "drag_and_drop"
    And Page with title "Drag and Drop" opened
    And Columns "a" and "b" with text "A" and "B" is appeared
    When Drag and drop column "a" to column "b"
    Then Columns "a" and "b" with text "B" and "A" is appeared