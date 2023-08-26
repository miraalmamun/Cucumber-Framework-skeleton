@Leads
Feature: Managing Leads
  Creation and Deletion of Leads

  Background: Logged In
    Given I am logged in zoho.com
    And I click on 'Leads' in top menu
    #List Map

  @CreateLead
  Scenario Outline: Creation of a Lead
    When I go to create lead page
    And enter and submit lead details
#      | mir |
#      | 123 |

      | FirstName   | LastName   | Email   | Company   |
      | <FirstName> | <LastName> | <Email> | <Company> |
    Then Lead Description Page should load
    And I verify lead details
    When I click on 'Leads' in top menu
    Then Lead '<FirstName>' should 'be present' inside the grid
    Examples:
      | FirstName | LastName | Email         | Company |
      | Alex      | Jones    | xyz@gmail.com | MRF     |


  @DeleteLead
  Scenario Outline: Deletion of the lead
    When I select the lead '<LeadName>'
    And I click on delete button
    Then Lead '<LeadName>' should 'not be present' inside the grid

    Examples:
      | LeadName   |
      | Alex Jones |
       
