Feature: Menu Management

  Background: Setup a menu item
    Given I have menu item wth name "Cucumber Sandwich" and price 60
    When I add that menu item
    Then Menu Item with name "Cucumber Sandwich" should be added

  @SmokeTest
  Scenario: Add menu item
    Given I have menu item wth name "Cucumber" and price 45
    When I add that menu item
    Then Menu Item with name "Cucumber" should be added

  @RegularTest
  Scenario: Add menu salad item
    Given I have menu item wth name "Cucumber Salad" and price 60
    When I add that menu item
    Then Menu Item with name "Cucumber Salad" should be added

  @NightlyBuildTest @RegularTest
  Scenario: Add menu salad item
    Given I have menu item wth name "Cucumber Sandwich" and price 60
    When I add that menu item
    Then Menu Item with name "Cucumber Sandwich" should be added