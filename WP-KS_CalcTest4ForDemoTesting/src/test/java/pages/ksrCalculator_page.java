package pages;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ksrCalculator_page {

	WebDriver driver = null;
	ksrCalculator_page ksrCalculator_page;

	// Initialize Page
	public ksrCalculator_page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	// Current Age Icon

	@FindBy(css = "[help-id='CurrentAge'][cl-help-toggle] .icon")
	WebElement currentAge_Icon;

	public void clickonCurrentAgeIcon() {
		currentAge_Icon.click();

	}

	// Current Age Icon Help Text
	@FindBy(css = "div.wpnib-field-current-age p")
	WebElement currentAge_IconText;

	public String CurrentAgeHelpDisplayedText() {
		return currentAge_IconText.getText();
	}

	// Employment Status Icon
	@FindBy(css = "[help-id='EmploymentStatus'][cl-help-toggle] .icon")
	WebElement EmploymentStatus_icon;

	public void clickonEmploymentStatusicon() {
		EmploymentStatus_icon.click();

	}

	// Employment Status Icon Help text
	@FindBy(css = "div.wpnib-field-employment-status p")
	WebElement EmploymentStatus_icontext;

	public String EmploymentStatusHelpText() {
		return EmploymentStatus_icontext.getText();
	}

	// Employment Status List

	@FindBy(css = "ul.option-list li div.label span")
	WebElement employeeSatusLists;

	// Kiwi Saver Balance Icon
	@FindBy(css = "[help-id='KiwiSaverBalance'][cl-help-toggle] .icon")
	WebElement KiwiSaverBalIcon;

	public void clickonKiwisaverbalicon() {
		KiwiSaverBalIcon.click();

	}

	// Kiwi Saver Balance Icon HelpText
	@FindBy(css = "div.wpnib-field-kiwi-saver-balance p")
	WebElement KiwiSaverBalIcontext;

	public String KiwiSaverbalHelpText() {
		return KiwiSaverBalIcontext.getText();
	}

	// Voluntary Contribution Icon
	@FindBy(css = "[help-id='VoluntaryContributions'][cl-help-toggle] .icon")
	WebElement voluntaryContributionIcon;

	public void clickonvolconticon() {
		voluntaryContributionIcon.click();

	}

	// VoluntaryIcon contribution help text
	@FindBy(css = "div.wpnib-field-voluntary-contributions p")
	WebElement voluntaryContributionIcontext;

	public String volContriIconHelpText() {
		return voluntaryContributionIcontext.getText();
	}

	// Risk Profile Icon
	@FindBy(css = "[help-id='RiskProfile'][cl-help-toggle] .icon")
	WebElement riskprofileIcon;

	public void clickonRiskProfileIcon() {
		riskprofileIcon.click();

	}

	// Risk Profile Icon Help Text
	@FindBy(css = "div.wpnib-field-risk-profile p:nth-of-type(1)")
	WebElement riskprofileIcontext;

	public String riskprofileconHelpText() {
		return riskprofileIcontext.getText();
	}

	// Savings Goal Icon
	@FindBy(css = "[help-id='SavingsGoal'][cl-help-toggle] .icon")
	WebElement savingsgoalicon;

	public void clickonsavingsIcon() {
		savingsgoalicon.click();

	}

	// Savings Goal Icon Help Text
	@FindBy(css = "div.wpnib-field-savings-goal p")
	WebElement savingsgoalicontext;

	public String savingsgoaliconhelptext() {
		return savingsgoalicontext.getText();
	}

	// Calculator Functional Flow Web Elements and Methods

	// CurrentAgeField

	@FindBy(css = "div[model='ctrl.data.CurrentAge'] [placeholder]")
	WebElement txt_currentAgeinput;

	public void enterCurrentAge(String age) {
		txt_currentAgeinput.sendKeys(age);
		txt_currentAgeinput.sendKeys(Keys.TAB);
	}

	// Employment Status "Contains" Field to click

	@FindBy(xpath = "//div[@class='well-value ng-binding'][contains(.,'Select')]")
	WebElement click_EmploymentStatusSelectField;

	// method to click EmploymentStatus
	public void clickEmploymentStatus() {
		click_EmploymentStatusSelectField.click();
	}

	// Employment Status Drop down to pick based on the given value

	// method to select EmploymentStatus by drop down value
	public void selectemploymentStausbyText(String employstatustext) {
		java.util.List<WebElement> EmploymentStatus = driver
				.findElements(By.cssSelector("ul.option-list li div.label span"));
		for (int i = 0; i < EmploymentStatus.size(); i++) {
			System.out.println(EmploymentStatus.get(i).getText());
			if (EmploymentStatus.get(i).getText().contains(employstatustext)) {
				EmploymentStatus.get(i).click();
				break;
			}
		}
	}

	// Salary or Wages before Per Year

	@FindBy(css = "div[model='ctrl.data.AnnualIncome'] [placeholder]")
	WebElement input_SalaryOrWage;
	// Enter salary into field method

	public void enterSalaryorWage(String salary) {
		input_SalaryOrWage.sendKeys(salary);
		input_SalaryOrWage.sendKeys(Keys.TAB);
	}

	// KiwiSaver Member Contributions
	// 3% KiwiSaver Member Contribution Radio button
	@FindBy(css = "[for='radio-option-04C']")
	WebElement Radio_ThreePercentContribution;

	public void clickThreePerKiwiSaverRadiobutton() {
		Radio_ThreePercentContribution.click();
	}

	// 4% KiwiSaver Member Contribution Radio button
	@FindBy(css = "[for='radio-option-04F']")
	WebElement Radio_FourPercentContribution;

	public void clickFourPerKiwiSaverRadiobutton() {
		Radio_FourPercentContribution.click();
	}

	// 6% KiwiSaver Member Contribution Radio button

	@FindBy(css = "[for='radio-option-04I']")
	WebElement Radio_SixPercentContribution;

	public void clickSixPerKiwiSaverRadiobutton() {
		Radio_SixPercentContribution.click();
	}

	// 8% KiwiSaver Member Contribution Radio button
	@FindBy(css = "[for='radio-option-04L']")
	WebElement Radio_EightPercentContribution;

	public void clickEightPerKiwiSaverRadiobutton() {
		Radio_EightPercentContribution.click();
	}

	// 10% KiwiSaver Member Contribution Radio button
	@FindBy(css = "[for='radio-option-04O']")
	WebElement Radio_TenPercentContribution;

	public void clickTenPerKiwiSaverRadiobutton() {
		Radio_TenPercentContribution.click();
	}

	@FindBy(css = "div[model='ctrl.data.KiwiSaverBalance'] [placeholder='Optional']")
	WebElement input_CurrentKiwiSaverBalance;
	// Input CurrentKiwiSaverBalance Method

	public void inputcurrentKiwiSaverBalance(String balance) {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		input_CurrentKiwiSaverBalance.sendKeys(balance);
		input_CurrentKiwiSaverBalance.sendKeys(Keys.TAB);
	}

	// Voluntary Contribution
	@FindBy(css = "div.control-with-period [placeholder='Optional']")
	WebElement input_volountarycontribtutionfield;

	public void entervoluntarycontributionAmt(String volAmount) {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Actions builder = new Actions(driver);
		builder.moveToElement(input_volountarycontribtutionfield).build().perform();

		input_volountarycontribtutionfield.click();
		input_volountarycontribtutionfield.sendKeys(volAmount);
		input_volountarycontribtutionfield.sendKeys(Keys.TAB);
	}

	// Voluntary Contribution frequency Method selection
	public void selectVoluntaryContributionFrequency(String frequency) {
		java.util.List<WebElement> Frequencies = driver.findElements(By.xpath(
				"//div[contains(@class,'wpnib-field-voluntary-contributions field-group ng-isolate-scope')]//li"));
		System.out.println("size:" + Frequencies.size());
		for (int i = 0; i < Frequencies.size(); i++) {
			System.out.println(Frequencies.get(i).getText());
			if (Frequencies.get(i).getText().contains("frequency")) {
				Frequencies.get(i).click();
				break;
			}
		}

	}

	// Risk Profile Radio buttons

	// Defensive

	@FindBy(id = "radio-option-013")
	WebElement Radio_DefensiveField;

	// Conservative field
	@FindBy(id = "radio-option-016")
	WebElement Radio_ConservativeField;

	// Balanced
	@FindBy(id = "radio-option-019")
	WebElement Radio_BalancedField;

	// Growth
	@FindBy(id = "radio-option-01C")
	WebElement Radio_GrowthField;

	// Risk Profile DefensiveRadio Button Method
	public void clickDefensiveRadioButton() {
		Radio_DefensiveField.click();
		Radio_DefensiveField.sendKeys(Keys.TAB);
		Radio_ConservativeField.sendKeys(Keys.TAB);
		Radio_BalancedField.sendKeys(Keys.TAB);
		Radio_GrowthField.sendKeys(Keys.TAB);
	}

	// Risk Profile Conservative RadioButtonMethod
	public void clickConservativeRadioButton() {
		Radio_ConservativeField.click();
		Radio_ConservativeField.sendKeys(Keys.TAB);
		Radio_BalancedField.sendKeys(Keys.TAB);
		Radio_GrowthField.sendKeys(Keys.TAB);
	}

	// Risk Profile Balanced RadioButtonMethod
	public void clickBalancedRadioButton() {
		Radio_BalancedField.click();
		Radio_BalancedField.sendKeys(Keys.TAB);
		Radio_GrowthField.sendKeys(Keys.TAB);
	}

	// Risk Profile Growth RadioButtonMethod
	public void clickGrowthRadioButton() {
		Radio_GrowthField.click();
		Radio_GrowthField.sendKeys(Keys.TAB);
	}

	// Savings Goal at retirement

	@FindBy(css = "div[model='ctrl.data.SavingsGoal'] [placeholder='Optional']")
	WebElement input_savingsGoalfield;

	// Savings Goal input method
	public void inputSavingsGoal(String savingsAmount) {
		input_savingsGoalfield.sendKeys(savingsAmount);
		input_savingsGoalfield.sendKeys(Keys.TAB);

	}

	// View Your KiwiSaver Summary Projections

	// Summary projection Button
	@FindBy(css = ".btn-results-reveal")
	WebElement buttonViewSummaryProjectionfield;

// method to click on View Summary Projection button
	public void buttonClickViewSummaryProejction() {
		buttonViewSummaryProjectionfield.click();
	}

// Summary estimate display text
	@FindBy(css = ".result-title")
	WebElement text_KiwiSaverBalanceEstimate;

	public void viewKiwiSaverBalanceEstimate() {
		text_KiwiSaverBalanceEstimate.getText();
	}

	// Summary estimate display text
	@FindBy(css = ".result-value")
	WebElement text_KiwiSaverBalanceLumpsumAmt;

	public void viewKiwiSaverBalanceLumpsumAmt() {
		text_KiwiSaverBalanceLumpsumAmt.getText();
	}

	// Summary estimate Summary label
	@FindBy(css = ".result-label")
	WebElement text_KiwiSaverBalanceSummary;

	public void viewKiwiSaverBalanceSummary() {
		text_KiwiSaverBalanceSummary.getText();
	}
}
