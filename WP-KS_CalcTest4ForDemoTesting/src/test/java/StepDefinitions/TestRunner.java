package StepDefinitions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class) 
@CucumberOptions(features="src/test/resources/Features",glue={"StepDefinitions"},
monochrome=true,
tags= {"@majorpriority"},
plugin = { "pretty", "html:target/HtmlReports","json:target/JsonReports/cucumber.json","junit:target/Reports/cucumber.xml"})
public class TestRunner {

}

