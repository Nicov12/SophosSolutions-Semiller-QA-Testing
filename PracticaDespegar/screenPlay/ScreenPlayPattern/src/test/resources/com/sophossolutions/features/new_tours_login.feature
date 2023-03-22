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
@NewTours
Feature: Login to the New Tours page
  As an automator, 
  I want to enter the New Tours page 
  to validate the information in the home

  @NewTours
  Scenario: Login to the New Tours with credentials
    Given Me loguearé en la página  "New Tours"
    When Ingreso el "nico" y la "1234"
    Then Valido el mensaje "Login Successfully"

