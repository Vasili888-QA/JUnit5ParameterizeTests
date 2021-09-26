@Test
Feature: Lesson4 -Task2- Some action with Selenide page on Github

  Scenario: Check code for JUnit5 on Selenide page on Github
    Given I open Selenide page
    When I click on Wiki tab
    Then Page with title "Home" is open
    And Chapters block contains Soft assertions
    When I click on Soft assertions
    Then Page with title "SoftAssertions" is open
    And Code for JUnit5 is appeared