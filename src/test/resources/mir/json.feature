Feature: JSON data processing

  @SetCookies
  Scenario: Parsing the given JSON data
    Given I have the following JSON data:
    """
    {
      "name": "John",
      "age": 30,
      "address": {
        "street": "123 Main St",
        "city": "Springfield"
      }
    }
    """
