Feature: Add item
  user should be able to add todo item

  Scenario: add todo item
    Given user is on homepage
    And   enter a todo item
    And   click on add link
    Then  verify item is added


  Scenario: add multiple todo item
    Given user is on homepage
    And   enter multiple todo items
    Then  verify items is added
