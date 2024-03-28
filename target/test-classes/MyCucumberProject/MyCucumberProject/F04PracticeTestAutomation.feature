Feature: Practice Test Automation Login

  Background: 
    Given open practicetestautomation

  Scenario: Test the Login functionality of Practice Test Automation Application using valid data
    When Enter valid Username as "student"
    And Enter valid Password as "Password123"
    And Click on submit
    Then login page should be displayed

  Scenario: Test the Login functionality of Practice Test Automation Application using invalid data
    When enter invalid username as "deepu"
    And enter invalid password as "deepu123"
    And Click on Submit
    Then error msg should be displayed
