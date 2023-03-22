	
@tag
Feature: Login into SauceDemo

  @tag1
  Scenario: Login with correct user and password
		Given The user need to be in "SauceDemo Page"
		When insert user "standard_user" and password "secret_sauce"
		Then validate the message   "PRODUCTS"