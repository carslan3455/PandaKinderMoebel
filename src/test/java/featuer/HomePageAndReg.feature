Feature: HomePage and Registrieren Functionality

  @Smoke
  Scenario: Home Page and Login
    Given User should be able to navigate to Pandakindermoebel home page
    When User should be able to enter to Mein Konto and create a new Account
    Then User should be able to enter his personal info
    Then User should not be able to record with the same Username
    Then User should be able to access the contents of the menuitem
