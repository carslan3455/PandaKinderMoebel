Feature: HomePage and Registrieren Functionality

  @Smoke
  Scenario: Home Page and Login
    Given User navigate to Pandakindermoebel home page
    When User enter to Mein Konto and create a new Account
    Then User enter his personal info
    Then User record with the same Username
    Then User should be able to access the contents of the menuitem


