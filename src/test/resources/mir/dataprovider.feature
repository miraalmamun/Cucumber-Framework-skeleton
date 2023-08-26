Feature: DataProvider Example

  Scenario: Using DataProvider
    Given User has entered numbers
    When I add them
    Then The result should be <expectedResult>
