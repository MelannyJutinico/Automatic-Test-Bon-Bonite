Feature: Cart module

  as a user
  I want to add products to my cart
  and delete the ones I don't want to buy

  Scenario: Add and remove product
    Given the user is on the page
    When the user add a product to the cart
    And remove the product from the cart
    Then print a notification of his deletion