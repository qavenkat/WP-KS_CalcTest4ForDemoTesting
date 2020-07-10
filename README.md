# WP-KS_CalcTest4ForDemoTesting
Westpac KiwiSaver Retirement Calculator
## using KiwiSaver Retirement Calculator for Employed,Self-Employed and Not employed user scenarios are created using Cucumber Junit BDD framework.
*Page Object:
-Contains Calculator Web Elements and its methods
-Feature Files created
-Step Definitions file created
-TestRunner is created to glue Features with Step Defintions.
* CucumberOptions:
Contains the test runner class and function to execute all tests
* Features:  
Feature file containing test scenarios 
* StepDefinitions:  
Contains backgroun, hooks, and step definitions for executing tests
##Selenium WebDriver

This project is configured to use Chrome WebDriver's.  The default is set to Chrome.  The WebDriver's added to this project to run in windows  
Page Object Model
-----
Page object model is used in this framework.  Each web page will have its own java.class and within each class contains page element mappings and functions / methods used to interact /verify a specific web page under test.  

#Pre-requisites

    Java installed in the system
    Maven installed in the system

Run Scripts

    Fork this repo, keep the folder the structure intact
    Run the following maven command from command line

mvn clean test

#To view the reports in the project
target/HtmlReports/index.html - shows the Html report
