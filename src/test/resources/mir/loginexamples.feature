Feature: Login attempts

  Scenario Outline: Trying to login with different sets of usernames and passwords
    Given I am on the login page
    When I enter username "<username>" and password "<password>"
    Then I should see the message "<outcome>"

    Examples: Valid users
      | username | password | outcome         |
      | alice    | pass123  | Welcome, Alice! |
      | bob      | pass456  | Welcome, Bob!   |

    Examples: Invalid users
      | username | password | outcome                      |
      | intruder | hackme   | Invalid username or password |
      | ghost    | boo      | Invalid username or password |
