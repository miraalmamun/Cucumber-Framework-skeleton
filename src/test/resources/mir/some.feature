Feature: login without member id
  @SetCookies
  Scenario Outline: eating
    Given there are <start> cucumbers
    When I eat <eat> cucumbers
    Then I should have <left> cucumbers
    And user enters '<Username>' username
    And user enters '<Password>' password


    Examples:
      | start | eat | left | Username | Password |
      | 12    | 5   | 7    | mir      | mimo123  |
      | 20    | 5   | 15   | mimo     | 12mj5@d  |