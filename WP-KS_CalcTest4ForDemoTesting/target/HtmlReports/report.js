$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Features/HighRiskProfileCalculate%20projected%20balance.feature");
formatter.feature({
  "name": "Calculate Projected balance",
  "description": "  As a product Owner,I want that the KiwiSaver Retirement Calculator users are able\n   to calculate what their KiwiSaver projected balance would be at retirement",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "TC02_High Riskprofile able to calculate projected balance at retirement",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@majorpriority"
    }
  ]
});
formatter.step({
  "name": "user is on KiwisaverretirementCalculator",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitions.HighRiskProfileCalculateProjectedBalanceSteps.user_is_on_KiwisaverretirementCalculator()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters Current age is 30years",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.HighRiskProfileCalculateProjectedBalanceSteps.user_enters_Current_age_is_30years()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters Employment status as employed",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.HighRiskProfileCalculateProjectedBalanceSteps.user_enters_Employment_status_as_employed()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters annual salary 82000",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.HighRiskProfileCalculateProjectedBalanceSteps.user_enters_annual_salary_82000()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters Kiwisaver Contriubtion 4percentage",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.HighRiskProfileCalculateProjectedBalanceSteps.user_enters_Kiwisaver_Contriubtion_4percentage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user chooses high risk profile",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.HighRiskProfileCalculateProjectedBalanceSteps.user_chooses_high_risk_profile()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user Clicks on View your Kiwisaver Retirement projection",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitions.HighRiskProfileCalculateProjectedBalanceSteps.user_Clicks_on_View_your_Kiwisaver_Retirement_projection()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User able to view Summary",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.HighRiskProfileCalculateProjectedBalanceSteps.user_able_to_view_Summary()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Checks the Summary Fields",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.HighRiskProfileCalculateProjectedBalanceSteps.checks_the_Summary_Fields()"
});
formatter.result({
  "status": "passed"
});
formatter.uri("file:src/test/resources/Features/KiwiSaverCalculatorSelection.feature");
formatter.feature({
  "name": "Westpac KiwiSaver Scheme Retirement Calculator",
  "description": "\t  As a Product Owner \n\t  I want that while using the KiwiSaver Retirement Calculator all fields in the calculator have got the information icon present\n\t  So that The user is able to get a clear understanding of what needs to be entered in the field",
  "keyword": "Feature"
});
formatter.background({
  "name": "User is on KiwiSaverRetirementCalculator page",
  "description": "",
  "keyword": "Background"
});
formatter.scenario({
  "name": "TC01_User clicks on infomration icon besides Current age",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@majorpriority"
    }
  ]
});
formatter.step({
  "name": "user is on KiwiSaver Retirement Calculator page",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitions.HighRiskProfileCalculateProjectedBalance.user_is_on_KiwiSaver_Retirement_Calculator_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks information icon besides Current age",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitions.HighRiskProfileCalculateProjectedBalance.user_clicks_information_icon_besides_Current_age()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "valid help text  message for age  displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.HighRiskProfileCalculateProjectedBalance.valid_help_text_message_for_age_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on Employment status icon",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitions.HighRiskProfileCalculateProjectedBalance.user_clicks_on_Employment_status_icon()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "employment status help text displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.HighRiskProfileCalculateProjectedBalance.employment_status_help_text_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on Current KiwiSavebalance icon",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitions.HighRiskProfileCalculateProjectedBalance.user_clicks_on_Current_KiwiSavebalance_icon()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "kiwisaver balance information is dispalyed",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.HighRiskProfileCalculateProjectedBalance.kiwisaver_balance_information_is_dispalyed()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on voluntary contributions help icon",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitions.HighRiskProfileCalculateProjectedBalance.user_clicks_on_voluntary_contributions_help_icon()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "volunatry contribution infromation is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.HighRiskProfileCalculateProjectedBalance.volunatry_contribution_infromation_is_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on RiskProfile icon",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitions.HighRiskProfileCalculateProjectedBalance.user_clicks_on_RiskProfile_icon()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "riskProfile information help information dsiplayed",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.HighRiskProfileCalculateProjectedBalance.riskprofile_information_help_information_dsiplayed()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on savings goal at retirement icon",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitions.HighRiskProfileCalculateProjectedBalance.user_clicks_on_savings_goal_at_retirement_icon()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "savings goal at retirement help information is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.HighRiskProfileCalculateProjectedBalance.savings_goal_at_retirement_help_information_is_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.uri("file:src/test/resources/Features/NotEmployedCalculateProjectedBalance.feature");
formatter.feature({
  "name": "As a Product Owner",
  "description": "I want that the KiwiSaver Retirement Calculator users are able to calculate what their KiwiSaver projected balance would be at retirement\nSo that \nThe users are able to plan their investments better.",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "TestCase4_NotEEmployed able to view Projected projected at his retirement",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@majorpriority"
    }
  ]
});
formatter.step({
  "name": "Not Employed is on KiwisaverretirementCalculator",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitions.NotEmployedCalculateProjectedBalanceSteps.not_Employed_is_on_KiwisaverretirementCalculator()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Not Employed enters age 55Years",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitions.NotEmployedCalculateProjectedBalanceSteps.not_Employed_enters_age_55Years()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Not Employed enters Employment status as Not-employed",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitions.NotEmployedCalculateProjectedBalanceSteps.not_Employed_enters_Employment_status_as_Not_employed()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Not Employed enters kiwisaver balance $140000",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitions.NotEmployedCalculateProjectedBalanceSteps.not_Employed_enters_kiwisaver_balance_$140000()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Not Employed enters voluntary contribution $10  annually",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitions.NotEmployedCalculateProjectedBalanceSteps.not_Employed_enters_voluntary_contribution_$10_annually()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Not Employed chooses medium risk profile",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitions.NotEmployedCalculateProjectedBalanceSteps.not_Employed_chooses_medium_risk_profile()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Not Employed saving goals requirement $200000",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitions.NotEmployedCalculateProjectedBalanceSteps.not_Employed_saving_goals_requirement_$200000()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Not Employed able to click KiwiSaver Retirement projection",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.NotEmployedCalculateProjectedBalanceSteps.not_Employed_able_to_click_KiwiSaver_Retirement_projection()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Not Employed able view Summary",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.NotEmployedCalculateProjectedBalanceSteps.not_Employed_able_view_Summary()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Not Employed able to check projected balance",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.NotEmployedCalculateProjectedBalanceSteps.not_Employed_able_to_check_projected_balance()"
});
formatter.result({
  "status": "passed"
});
formatter.uri("file:src/test/resources/Features/SelfEmployedCalculateProjectedBalance.feature");
formatter.feature({
  "name": "As a Product Owner",
  "description": "I want that the KiwiSaver Retirement Calculator users are able to calculate what their KiwiSaver projected balance would be at retirement\nSo that \nThe users are able to plan their investments better.",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "TestCase3_SelfEmployed able to view Projected projected at his retirement",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@majorpriority"
    }
  ]
});
formatter.step({
  "name": "self Employed is on KiwisaverretirementCalculator",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitions.SelfEmployedCalculateProjectedBalanceSteps.self_Employed_is_on_KiwisaverretirementCalculator()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "self Employed enters age 45Years",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitions.SelfEmployedCalculateProjectedBalanceSteps.self_Employed_enters_age_45Years()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "self Employed enters Employment status as self-Employed",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitions.SelfEmployedCalculateProjectedBalanceSteps.self_Employed_enters_Employment_status_as_self_Employed()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "self Employed enters kiwisaver balance 100000",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitions.SelfEmployedCalculateProjectedBalanceSteps.self_Employed_enters_kiwisaver_balance_100000()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "self Employed enters voluntary contribution $90 fortnightly",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitions.SelfEmployedCalculateProjectedBalanceSteps.self_Employed_enters_voluntary_contribution_$90_fortnightly()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "self Employed chooses medium risk",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitions.SelfEmployedCalculateProjectedBalanceSteps.self_Employed_chooses_medium_risk()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "self Employed saving goals requirement $290000",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitions.SelfEmployedCalculateProjectedBalanceSteps.self_Employed_saving_goals_requirement_$290000()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "self Employed able to click KiwiSaver Retirement projection",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.SelfEmployedCalculateProjectedBalanceSteps.self_Employed_able_to_click_KiwiSaver_Retirement_projection()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "self Employed able view Summary",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.SelfEmployedCalculateProjectedBalanceSteps.self_Employed_able_view_Summary()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "self Employed able to check projected balance",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.SelfEmployedCalculateProjectedBalanceSteps.self_Employed_able_to_check_projected_balance()"
});
formatter.result({
  "status": "passed"
});
});