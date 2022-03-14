Feature: Plus icon
  plus icon should not work without entering a todo item

  @test1
  Scenario: Plus icon
    Given user is on homepage
    And   click on add link
    Then  item place holder should be empty