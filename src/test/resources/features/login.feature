Feature:Login module

  as a user
  you want to login on the page
  with your credentials
  to enter make a purchase

  Scenario: Login Successful
    Given that the user is on the page
    When he enter his credentials correctly
      | cedula     | password        |
      | 1014856939 | g.8uw69JywvUmM2 |
    Then the user will be logged in

  Scenario: Bad login
    Given that the user is on the page
    When he enter invalid password
      | cedula   | password |
      | 1014856939 | 123      |
    Then the user will not be able to login

  Scenario: Dont exists user
    Given  that the user is on the page
    When  he enter nonexistent user
      | cedula      | password |
      | 88888888888 | 123      |
    Then print the error that the user does not exist
