Feature: Final Bill Calculation

  Scenario Outline: Customer Bill Amount Calculation
    Given Select User name "<userName>"
    When User enters initial bill amount <initialBillAmount>
    And Sales Tax Rate is <taxRate> percent
    Then Final bill amount is <calculateBillAmount>
    Examples:
      | userName | initialBillAmount | taxRate | calculateBillAmount |
      | Gago     | 100               | 10      | 110                 |
      | Lena     | 200               | 8       | 216                 |
      | Ani      | 100               | 1       | 101                 |