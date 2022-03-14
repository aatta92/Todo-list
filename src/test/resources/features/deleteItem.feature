Feature: Delete an added item from a todo list

  Scenario: Delete an item
    Given user is on homepage
    And   enter a todo item
    And   click on add link
    And   delete the added item
    Given item is deleted


