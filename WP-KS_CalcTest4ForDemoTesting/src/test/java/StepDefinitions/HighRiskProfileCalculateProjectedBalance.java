package StepDefinitions;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import junit.framework.Assert;
import pages.ksrCalculator_page;

public class HighRiskProfileCalculateProjectedBalance {
	WebDriver driver=null;
	ksrCalculator_page ksrCalculator_page;
	
	@Given("user is on KiwiSaver Retirement Calculator page")
	public void user_is_on_KiwiSaver_Retirement_Calculator_page() throws Exception {
	
		
		String projectPath=System.getProperty("user.dir");
	System.out.println(projectPath);
	System.setProperty("webdriver.chrome.driver",projectPath+"/src/test/resources/drivers/chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	driver.manage().window().maximize();
		
	driver.navigate().to("https://www.westpac.co.nz/kiwisaver/calculators/kiwisaver-calculator/");
	driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
	driver.manage().window().maximize();

	System.out.println("Clicked on main page");
		//switch to Frame	
	driver.switchTo().frame(driver.findElement(By.xpath("//div[@id='calculator-embed']/iframe[1]")));
	driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
	System.out.println("I am in the Frame");

	
	
	}
	@When("user clicks information icon besides Current age")
	public void user_clicks_information_icon_besides_Current_age() {
		ksrCalculator_page=new ksrCalculator_page(driver);
		ksrCalculator_page.clickonCurrentAgeIcon();
		String CurrentAgehelpText="This calculator has an age limit of 18 to 64 years old.";
		assertEquals(CurrentAgehelpText,ksrCalculator_page.CurrentAgeHelpDisplayedText());

	}
	
	@Then("valid help text  message for age  displayed")
	public void valid_help_text_message_for_age_displayed() {
		
		ksrCalculator_page.CurrentAgeHelpDisplayedText();
		
		String displayedTextforCurrentAge="This calculator has an age limit of 18 to 64 years old.";
		assertEquals(displayedTextforCurrentAge, ksrCalculator_page.CurrentAgeHelpDisplayedText());
		String CurrentAgehelpText="This calculator has an age limit of 18 to 64 years old.";
		assertEquals(CurrentAgehelpText,ksrCalculator_page.CurrentAgeHelpDisplayedText());
    
	}

	@When("user clicks on Employment status icon")
	public void user_clicks_on_Employment_status_icon() {
		ksrCalculator_page.clickonEmploymentStatusicon();
	}
		

	@Then("employment status help text displayed")
	public void employment_status_help_text_displayed() {
		ksrCalculator_page.EmploymentStatusHelpText();
		String actualempstaustext="If you are earning a salary or wage, select ‘Employed’. Your employer contributions will be automatically calculated at a rate of 3% of your before-tax salary or wages. You can also select ‘Self-employed’ or ‘Not employed’ and then enter below (in the Voluntary contributions field), the amount and frequency of any contributions that you wish to make.";
		assertEquals(actualempstaustext, ksrCalculator_page.EmploymentStatusHelpText());
	}

		
	
	

	@When("user clicks on Current KiwiSavebalance icon")
	public void user_clicks_on_Current_KiwiSavebalance_icon() {
		ksrCalculator_page.clickonKiwisaverbalicon();
		}

	@Then("kiwisaver balance information is dispalyed")
	public void kiwisaver_balance_information_is_dispalyed() {
		ksrCalculator_page.KiwiSaverbalHelpText();
		
		String actualKiwisaverbaltext="If you do not have a KiwiSaver account, then leave this field blank.";
		assertEquals(actualKiwisaverbaltext, ksrCalculator_page.KiwiSaverbalHelpText());
	}

	@When("user clicks on voluntary contributions help icon")
	public void user_clicks_on_voluntary_contributions_help_icon() {
		ksrCalculator_page.clickonvolconticon();
	}

	@Then("volunatry contribution infromation is displayed")
	public void volunatry_contribution_infromation_is_displayed() {
		ksrCalculator_page.volContriIconHelpText();
		
		String actualvolunhelp="If you are 'Self-Employed' or 'Not employed', you can make direct contributions to your KiwiSaver account. If you are 'Employed', you can make voluntary contributions in addition to your regular employee contributions.";
		assertEquals(actualvolunhelp, ksrCalculator_page.volContriIconHelpText());
	}

	@When("user clicks on RiskProfile icon")
	public void user_clicks_on_RiskProfile_icon() {
		ksrCalculator_page.clickonRiskProfileIcon();
	
	}

	@Then("riskProfile information help information dsiplayed")
	public void riskprofile_information_help_information_dsiplayed() {
		ksrCalculator_page.riskprofileconHelpText();
		
	String actualRiskhelptext="The risk profile affects your potential investment returns:";
				
	
	//assertThat(ksrCalculator_page.riskprofileconHelpText().contains("The risk profile"));
		
	}
	

	@When("user clicks on savings goal at retirement icon")
	public void user_clicks_on_savings_goal_at_retirement_icon() {
		ksrCalculator_page.clickonsavingsIcon();
	
	}
	  

	@Then("savings goal at retirement help information is displayed")
	public void savings_goal_at_retirement_help_information_is_displayed() {
	
		ksrCalculator_page.savingsgoaliconhelptext();
	
		String actualSavingsicontext="Enter the amount you would like to have saved when you reach your intended retirement age. If you aren’t sure what this amount is, you can leave it blank or use the Sorted Retirement Planner";
		assertEquals(actualSavingsicontext, ksrCalculator_page.savingsgoaliconhelptext());
		
		driver.close();
		
	}


}
