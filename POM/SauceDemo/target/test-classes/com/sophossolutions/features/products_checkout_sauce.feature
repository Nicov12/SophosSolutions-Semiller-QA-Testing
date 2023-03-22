#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
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
		And Be in the "YOUR CART"
    When Select button Checkout
    Then validate the message "CHECKOUT: YOUR INFORMATION"


  @tag1
  Scenario: User register your information
    Given The user nedd to be in "CHECKOUT: YOUR INFORMATION"
    When insert firts name "Gallo" last name "Claudio" ans posta doce "134578"
    Then Validate el mensaje "CHECKOUT: OVERVIEW"


