@AllTests
Feature: Google Links

  Background: 
    Given Open Google
@SmokeTest
  Scenario: test Home page link title
    When Read home page tilte
    Then Home page should display
@SanityTest
  Scenario: Test Gmail page title
    When click on gmail link
    And read the gmail page title
    Then gmail page should display
@ReTest
  Scenario: Test images page link title
    When click on images link
    And read the images page title
    Then Images page should display
@RegressionTest
  Scenario: Test Google apps page title
    When click on google apps link
    And read the google apps page title
    Then google apps should display
@UsabilityTest
  Scenario: Test about page title
    When click on about link
    And read the about page title
    Then about page should display
@CompatibiltyTest
  Scenario: Test about page title
    When click on about link
    And read the about page title
    Then about page should display
@SmokeTest
  Scenario: Test advertising page title
    When click on advertising link
    And read the advertising page title
    Then advertising page should display
