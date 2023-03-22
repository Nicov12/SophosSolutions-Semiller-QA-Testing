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
Feature: Login into Guru page
  Yo como automatizador voy a probar el logueo del usuario

  @tag1
  Scenario: Title of your scenario
    Given Me encuentro en la pagina Guru99 "https://demo.guru99.com/V4/"
    When En la pagina Guru99 ingresa el usuario "mngr480421" y la clave "UjEqyqy" y se autentica
    Then valido el mensaje "Manger Id : mngr480421"
