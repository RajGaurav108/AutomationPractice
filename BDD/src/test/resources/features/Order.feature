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
#@tagParsa
#@tag
@tagOrder
Feature: Order Feature
  This would contain scenarios for Order 
  
  
  Background: User is logged in
  	Given This is the background
  	And User is on login page
    And user has entered Username
    And user has entered Password
    
    And user has clicked on login button
    And user has performed the validation


  @tagSmoke @tagSearch  
  Scenario: Search Product
    
    Given user is on the products page
    When user searches for appliance for Model
    | appliance  | model 	| range |
    | mobile		 | iPhone | 90k		|
    | laptop		 | Macb		| 140k		|
    Then user should be able to find the product on the page
    #And some other action
    #And yet another action
    #Then I validate the outcomes
    #And check more outcomes

 @tagWeekly @tagSmoke
  Scenario: Add Product to cart
    #Given User is on login page
    #And user has entered Username
    #And user has entered Password
    #And user has clicked on login button
    #And user has performed the validation
    Given user is on the products page
    And user searches for "Mobile"
    When User adds product to cart
    Then The product should be added to cart succesfully
  
  
  #@tag2
  #Scenario Outline: Title of your scenario outline
    #Given I want to write a step with <name>
    #When I check for the <value> in step
    #Then I verify the <status> in step
#
    #Examples: 
      #| name  | value | status  |
      #| name1 |     5 | success |
      #| name2 |     7 | Fail    |
