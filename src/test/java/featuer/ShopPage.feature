Feature: Shop Page Functionality

  @Smoke
  Scenario: Verifying the product's information in shopping cart
    Given User should be able to navigate to Pandakindermoebel home page
    When  User should be able to Login
    Then  User should be able to navigate to Shop page
    Then  User should be able to select random product type and product
    Then  User should be able to  add to cart and check product info
    Then  User should be able go to payment and complete order process