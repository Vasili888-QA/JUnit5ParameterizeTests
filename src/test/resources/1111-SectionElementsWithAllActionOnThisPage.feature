@Lesson1
Feature: Feature file #1 with Cucumber - Available action on Elements Section in the DemoQA site

  Scenario: Open Elements Section and check elements on the page
    Given Open site "demoqa.com/" with endpoint " "
    And Main page is open
    When I click to card "Elements"
    Then Page is open with title "Elements"