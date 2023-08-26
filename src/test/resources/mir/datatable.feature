Feature: Testing
  Scenario Outline: Creation of a Lead
    When I go to create lead page
    And enter and submit lead details '<FirstName>', '<LastName>', '<Email>', '<Company>'
    Then Lead Description Page should load
    And I verify lead details
    When I click on 'Leads' in top menu
    Then Lead '<FirstName>' should 'be present' inside the grid
    Examples:
      | FirstName | LastName | Email         | Company |
      | Alex      | Jones    | xyz@gmail.com | MRF     |
      | Mir       | Mamun    | mir@gmail.com | CNN     |

  Scenario Outline: Creation of a Lead second example
    When I go to create lead page
    And enter and submit lead details
      | FirstName   | LastName   | Email   | Company   |
      | <FirstName> | <LastName> | <Email> | <Company> |
    Then Lead Description Page should load
    And I verify lead details
    When I click on 'Leads' in top menu
    Then Lead '<FirstName>' should 'be present' inside the grid
    Examples:
      | FirstName | LastName | Email         | Company |
      | Alex      | Jones    | xyz@gmail.com | MRF     |
      | Mir       | Mamun    | mir@gmail.com | CNN     |
