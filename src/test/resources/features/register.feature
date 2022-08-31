Feature:Register module

  as a user
  you want to register on the page
  to enter make a purchase

  Scenario: Registration Successful
    Given that the user is on the page
    When he enter his data
      | cedula         | email                         | password        |
      | 111111111111 | examplepruebaqasena@gmail.com | g.8uw69JywvUmM2 |
    Then the user will be logged in

  Scenario: Bad Registration
    Given that the user is on the page
    When he enter invalid password
      | cedula   | email              | password |
      | 39625487 | example2@gmail.com | 123      |
    Then the user will not be able to register

  Scenario: Incorrect acceptance
    Given that the user is on the page
    When he enter his datas
      | cedula     | email              | password        |
      | 1008569245 | example3@gmail.com | g.8uw69JywvUmM2 |

    Then print an error