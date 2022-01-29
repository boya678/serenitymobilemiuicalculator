Feature: as a user i want a functionality to make sums

  Scenario: sum two digits
    Given that pedro open the calculator
    When he makes the operation
      | number1 | operand | number2 |
      | 23      | +       | 44      |
    Then he should see the result 67

