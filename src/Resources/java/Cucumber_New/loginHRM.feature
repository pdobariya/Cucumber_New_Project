@login
Feature: login Functionality


  Scenario Outline: User should be Not able to login with in valid credential
    Given user should be on login page
    When user enter invalid "<Username>" and "<password>"
    And  click on login button
    Then user should not able to log in with "<Errormassage>"


    Examples:

      | Username | password |       Errormassage         |
      |  Admin   |   Admin1 |Csrf token validation failed|
      |  admin1  |   Admin1 |Csrf token validation failed|
      |          |   admin  | Username cannot be empty   |
      |          |          |  Username cannot be empty  |
      |          |   Admin1 |  Username cannot be empty  |
      |  Admin   |          | Password cannot be empty   |
      |  admin1  |          |  Password cannot be empty  |
