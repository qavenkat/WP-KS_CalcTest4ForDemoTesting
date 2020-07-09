	#Author: nzvenkatesh20@gmail.com

	Feature: Westpac KiwiSaver Scheme Retirement Calculator
	  As a Product Owner 
	  I want that while using the KiwiSaver Retirement Calculator all fields in the calculator have got the information icon present
	  So that The user is able to get a clear understanding of what needs to be entered in the field
	  
	  Background:User is on KiwiSaverRetirementCalculator page
	@majorpriority
	  Scenario: TC01_User clicks on infomration icon besides Current age
	    Given user is on KiwiSaver Retirement Calculator page
	    When user clicks information icon besides Current age
	    Then valid help text  message for age  displayed
	    When user clicks on Employment status icon
	    Then employment status help text displayed
	    When user clicks on Current KiwiSavebalance icon
	    Then kiwisaver balance information is dispalyed
	    When user clicks on voluntary contributions help icon
	    Then volunatry contribution infromation is displayed
	    When user clicks on RiskProfile icon
	    Then riskProfile information help information dsiplayed
	    When user clicks on savings goal at retirement icon
	    Then savings goal at retirement help information is displayed
	    