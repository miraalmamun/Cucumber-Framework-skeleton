Feature: Login

  Rule: Login Functionality

    Scenario: User should be able to Login with valid Credentials
      Given User open "Chrome" with url "https://www.google.com"
      And User logged in with
        | name     | mir    |
        | password | mi123@ |
      And I logged in with the following roles: "admin", "user", "guest"
      And User logged in with the following roles:
        | admin |
        | user  |
        | guest |
      And You logged in with the following roles: 'admin, user, guest'
      And the user has preferences: apple, banana, orange




