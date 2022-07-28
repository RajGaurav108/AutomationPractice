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

  @tag1
  Scenario: User should be able to login using valid login details
  
    Given User is registered
    And User is on Login page
    When User enters valid username 
    And User enters valid password 
    And User clicks on login
    Then User should have loggged in
    
  @tag2
  Scenario: User should not able to login using incorrect login details
  
    Given User is registered
    And User is on Login page
    When User enters  username 
    And User enters invalid password 
    And User clicks on login
    Then User should not logged in

  @tagDT
  Scenario Outline: Title of your scenario outline
    Given I want to write a step with "<name>" name
    When I check for the <value> in step
    Then I verify the status "<status>" in step

    Examples: 
      | name  | value | status  |
      | name1 |     5 | success |
      | name2 |     7 | Fail    |
      
      