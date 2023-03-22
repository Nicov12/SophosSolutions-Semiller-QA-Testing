@tag
Feature: Title of your feature
  I want to use this template for my feature file

  Background: 
    Given The user need to be in "SauceDemo Page"
    When insert user "standard_user" and password "secret_sauce"
    Then validate the message   "PRODUCTS"
    And Be in the "Home" section
    When I select the filter and add the products
      | option              |
      | Name (A to Z)       |
      | Name (Z to A)       |
      | Price (low to high) |
      | Price (high to low) |
    Then I see the products in the cart and check the text "YOUR CART"
    And Be in the "YOUR CART"
    When Select button Checkout
    Then validate the message "CHECKOUT: YOUR INFORMATION"
    And The user nedd to be in "CHECKOUT: YOUR INFORMATION"
    When insert firts name "Gallo" last name "Claudio" ans posta doce "134578"
    Then Validate el mensaje "CHECKOUT: OVERVIEW"

  @tag1
  Scenario: User validate your buy
    Given User valide you payment information
    When Select button Finish
    Then Finish test "CHECKOUT: COMPLETE!"