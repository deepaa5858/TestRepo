Feature: OHRM Login

  Background: 
  Given Open Orange HRM Application
@smoketest
  Scenario: Test the OHRM Login Functionality using valid data
    When Enter valid username
    And Enter valid password
    And Hit enter
    Then Login page should display
@regressiontest
  Scenario: Test the OHRM Login Functionality using invalid data
    When Enter invalid username
    And Enter invalid password
    And hit enter
    Then Error msg should display
