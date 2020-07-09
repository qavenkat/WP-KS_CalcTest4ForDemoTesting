package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import pages.ksrCalculator_page;

public class SelfEmployedCalculateProjectedBalanceSteps {
	
	WebDriver driver=null;
	ksrCalculator_page ksrCalculator_page;
	
	@Given("self Employed is on KiwisaverretirementCalculator")
	public void self_Employed_is_on_KiwisaverretirementCalculator() {

		
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

	@Given("self Employed enters age 45Years")
	public void self_Employed_enters_age_45Years() {
		ksrCalculator_page= new ksrCalculator_page(driver);
		ksrCalculator_page.enterCurrentAge("45");
	}

	@Given("self Employed enters Employment status as self-Employed")
	public void self_Employed_enters_Employment_status_as_self_Employed() throws Exception {
		ksrCalculator_page.clickEmploymentStatus();
		ksrCalculator_page.selectemploymentStausbyText("Self-employed");
		
	}

	@Given("self Employed enters kiwisaver balance 100000")
	public void self_Employed_enters_kiwisaver_balance_100000() {
		ksrCalculator_page.inputcurrentKiwiSaverBalance("100000");
	}

	@Given("self Employed enters voluntary contribution $90 fortnightly")
	public void self_Employed_enters_voluntary_contribution_$90_fortnightly() {
		ksrCalculator_page.entervoluntarycontributionAmt("90");
	}

	@Given("self Employed chooses medium risk")
	public void self_Employed_chooses_medium_risk() {
		ksrCalculator_page.clickBalancedRadioButton();
	}

	@Given("self Employed saving goals requirement $290000")
	public void self_Employed_saving_goals_requirement_$290000() {
		ksrCalculator_page.inputSavingsGoal("290000");
	}

	@Then("self Employed able to click KiwiSaver Retirement projection")
	public void self_Employed_able_to_click_KiwiSaver_Retirement_projection() {
		ksrCalculator_page.buttonClickViewSummaryProejction();
	}

	@Then("self Employed able view Summary")
	public void self_Employed_able_view_Summary() {
		ksrCalculator_page.viewKiwiSaverBalanceSummary();
	}

	@And("self Employed able to check projected balance")
	public void self_Employed_able_to_check_projected_balance() {
		ksrCalculator_page.viewKiwiSaverBalanceSummary();
		ksrCalculator_page.viewKiwiSaverBalanceLumpsumAmt();
		driver.close();
	}




}
