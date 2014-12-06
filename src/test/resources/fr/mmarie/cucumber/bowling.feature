Feature: Bowling game

  Scenario:
    Given a new game
    Then the number of skittles  is 10

  Scenario:
    Given a new game
    When 5 skittles fall
    Then the number of skittles  is 5

  Scenario:
    Given a new game
    When 5 skittles fall
    And 3 skittles fall
    Then the number of skittles  is 2

  Scenario:
    Given a new game
    When 11 skittles fall
    Then it fails