#Sample Feature Definition Template
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

  @tag1
  Scenario: User validate yours product cart
    Given Be in the "YOUR CART"
    When Select button Checkout
    Then validate the message "CHECKOUT: YOUR INFORMATION"
