@tagBooking
Feature: Booking tickets through FlyAway
I want to use this template for my feature file

@tag1
Scenario: Navigate home page
Given user has opened Application
When user opens Home page
Then user should be navigated to home page

@tag2
Scenario: User Performs the Registration
Given user has opened login page
And user opts to register
When user enters details required

Examples:
| email | password |
| user@user.com | user |