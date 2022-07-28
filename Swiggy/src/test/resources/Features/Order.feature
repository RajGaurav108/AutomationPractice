@tagItems
Feature: Search, Cart Items
  This would contain scenarios for search, order, cart 
 
 @tagSearch
   Scenario: Search Items
    Given User clicks on Search Button
    When User search for item "Aaloo Paratha"
    Then User clicks on item

 
@tagOrder
  Scenario: Cart Items
    Given User is on search page
    And User select item from options
    When User clicks on image
    And User added item into the cart       
    Then User open the cart
