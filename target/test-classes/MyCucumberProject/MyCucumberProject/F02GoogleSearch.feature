Feature: Google Search Functionality

  Scenario: test google search functionality
    Given i open google
    When enter Youtube Keyword in Search box
    And Hit Enter
    Then Youtube Should Be Displayed in Searchbox
