Feature: Data Tables

  @ListOfStrings
  Scenario: Bill Amount Generation
    Given I placed an order for the following items
      | Sandwich name |
      | Chicken       |
      | Beef          |
      | Pork          |
    When I generate the bill
      | 34       |
      | 76       |
      | Cucumber |
    Then a bill for sandwich should be generated
      | Sandwich | 35 |
      | Salad    | 23 |
      | Dessert  | 12 |