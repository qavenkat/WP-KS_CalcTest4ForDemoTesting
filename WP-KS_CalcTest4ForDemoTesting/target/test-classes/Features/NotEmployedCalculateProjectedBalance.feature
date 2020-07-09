#Author: Venkatesham Varikuppala(nzvenkatesh20@gmail.com)
#Keywords Summary :

Feature: As a Product Owner 
I want that the KiwiSaver Retirement Calculator users are able to calculate what their KiwiSaver projected balance would be at retirement
So that 
The users are able to plan their investments better.

 	@majorpriority
  Scenario: TestCase4_NotEEmployed able to view Projected projected at his retirement
     Given Not Employed is on KiwisaverretirementCalculator
    Given Not Employed enters age 55Years
    Given Not Employed enters Employment status as Not-employed
    Given Not Employed enters kiwisaver balance $140000
    Given Not Employed enters voluntary contribution $10  annually
    Given Not Employed chooses medium risk profile
    Given Not Employed saving goals requirement $200000 
    Then Not Employed able to click KiwiSaver Retirement projection 
    And Not Employed able view Summary
    And Not Employed able to check projected balance

  