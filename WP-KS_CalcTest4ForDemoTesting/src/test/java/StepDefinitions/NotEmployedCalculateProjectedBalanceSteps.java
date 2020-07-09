package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import pages.ksrCalculator_page;

public class NotEmployedCalculateProjectedBalanceSteps {
	
	WebDriver driver=null;
	ksrCalculator_page ksrCalculator_page;
	
	@Given("Not Employed is on KiwisaverretirementCalculator")
	public void not_Employed_is_on_KiwisaverretirementCalculator() {
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
	}

	@Given("Not Employed enters age 55Years")
	public void not_Employed_enters_age_55Years() {
		ksrCalculator_page= new ksrCalculator_page(driver);
		ksrCalculator_page.enterCurrentAge("55");
	}

	@Given("Not Employed enters Employment status as Not-employed")
	public void not_Employed_enters_Employment_status_as_Not_employed() {
		
		ksrCalculator_page.clickEmploymentStatus();
		ksrCalculator_page.selectemploymentStausbyText("Not employed");
	}

	@Given("Not Employed enters kiwisaver balance $140000")
	public void not_Employed_enters_kiwisaver_balance_$140000() {
		
		ksrCalculator_page.inputcurrentKiwiSaverBalance("14000");
		ksrCalculator_page.clickonKiwisaverbalicon();
		
	}

	@Given("Not Employed enters voluntary contribution $10  annually")
	public void not_Employed_enters_voluntary_contribution_$10_annually() {
		ksrCalculator_page.entervoluntarycontributionAmt("10");
		ksrCalculator_page.selectVoluntaryContributionFrequency("Annually");
	}

	@Given("Not Employed chooses medium risk profile")
	public void not_Employed_chooses_medium_risk_profile() {
		ksrCalculator_page.clickBalancedRadioButton();
	}

	@Given("Not Employed saving goals requirement $200000")
	public void not_Employed_saving_goals_requirement_$200000() {
		ksrCalculator_page.inputSavingsGoal("200000");
	}

	@Then("Not Employed able to click KiwiSaver Retirement projection")
	public void not_Employed_able_to_click_KiwiSaver_Retirement_projection() {
		ksrCalculator_page.buttonClickViewSummaryProejction();
	}

	@Then("Not Employed able view Summary")
	public void not_Employed_able_view_Summary() {
		ksrCalculator_page.viewKiwiSaverBalanceSummary();
		ksrCalculator_page.viewKiwiSaverBalanceLumpsumAmt();
	}

	@Then("Not Employed able to check projected balance")
	public void not_Employed_able_to_check_projected_balance() {
		ksrCalculator_page.viewKiwiSaverBalanceLumpsumAmt();
		driver.close();
	}

}
