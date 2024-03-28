Feature: Amazon Search Functionality

  Background: 
    Given Open Amazon

  Scenario: Test Amazon search functionality
    When Click on Search functionality
    Then Cursor should be placed in the search box

  Scenario: Test amazon search functionality for iphone
    When Search "iphone" under the Price 50000
    Then Found "iphone" with Price 50000 Should be displayed

