#Author: venkatesham Varikuppala
#Keywords Summary :


Feature: Calculate Projected balance
  As a product Owner,I want that the KiwiSaver Retirement Calculator users are able
   to calculate what their KiwiSaver projected balance would be at retirement
	@majorpriority
  Scenario: TC02_High Riskprofile able to calculate projected balance at retirement
    Given user is on KiwisaverretirementCalculator
    And user enters Current age is 30years
    And user enters Employment status as employed
    And user enters annual salary 82000
    And user enters Kiwisaver Contriubtion 4percentage
    And user chooses high risk profile
    When user Clicks on View your Kiwisaver Retirement projection
    Then User able to view Summary
    Then Checks the Summary Fields

 