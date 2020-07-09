#Author: Venkatesham Varikuppala
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.

Feature: As a Product Owner 
I want that the KiwiSaver Retirement Calculator users are able to calculate what their KiwiSaver projected balance would be at retirement
So that 
The users are able to plan their investments better.


	@majorpriority
  Scenario: TestCase3_SelfEmployed able to view Projected projected at his retirement
    Given self Employed is on KiwisaverretirementCalculator
    Given self Employed enters age 45Years
    Given self Employed enters Employment status as self-Employed
    Given self Employed enters kiwisaver balance 100000
    Given self Employed enters voluntary contribution $90 fortnightly
    Given self Employed chooses medium risk
    Given self Employed saving goals requirement $290000 
    Then self Employed able to click KiwiSaver Retirement projection 
    And self Employed able view Summary
    And self Employed able to check projected balance

 