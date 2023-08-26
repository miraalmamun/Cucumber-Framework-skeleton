Feature: All about DataTable


  Scenario: Depending on the table shape as one of the following collections:
    Given List of Strings:
      | cow   |
      | horse |
      | sheep |
    * List of List of Strings:
      | 1 | 2 |
      | 3 | 4 |
    * List of Maps columns as keys:
      | name  | age |
      | Alice | 25  |
      | Bob   | 30  |
    * Map of Strings assuming two columns where first column values become keys:
      | theme | dark |
      | mode  | auto |

    * Map of Lists assuming two columns where first column values become keys:
      | fruits  | apple  |
      | fruits  | banana |
      | animals | cat    |
    Given the grouped items:
      | fruits  | apple  |
      | fruits  | banana |
      | animals | cat    |

  @SetCookies
  Scenario: Registering multiple users
    Given the following users are registered:
      | Firstname | Lastname | Email                 | Age | Address       |
      | Alice     | Smith    | alice.smith@email.com | 25  | 123 Main St.  |
      | Bob       | Johnson  | bob.j@email.com       | 30  | 456 Elm St.   |
      | Charlie   | Brown    | charlie.b@email.com   | 28  | 789 Maple St. |




