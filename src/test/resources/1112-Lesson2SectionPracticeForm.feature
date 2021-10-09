@Lesson2
Feature: Lesson #2 - Available action on Section Practice Form in the DemoQA site

  Scenario: Fill Practice Form and submit it
    Given Open site "demoqa.com/" with endpoint "automation-practice-form"
    And Page is open with title "Practice Form"
    When I enter "Vasili" in the field "firstName"
    And I enter "QA" in the field "lastName"
    And I enter "test@mail.ru" in the field "userEmail"
    And Select radio button "Female"
    And I enter "375257000000" in the field "userNumber"
    And I enter date "28"-"July"-"2001" to calendar
    And I enter random address on the field Current Address
    And I enter "Test description" on the field Subject
    Then Pop-up is open with title "Thanks for submitting the form"
    And I click button "Close"
    And Page is open with title "Practice Form"