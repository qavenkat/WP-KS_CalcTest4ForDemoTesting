package StepDefinitions;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import junit.framework.Assert;
import io.cucumber.java.en.*;
import pages.ksrCalculator_page;

public class HighRiskProfileCalculateProjectedBalanceSteps {
	
	WebDriver driver=null;
	ksrCalculator_page ksrCalculator_page;
	
		
	@Given("user is on KiwisaverretirementCalculator")
	public void user_is_on_KiwisaverretirementCalculator() throws InterruptedException {
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

	@And("user enters Current age is 30years")
	public void user_enters_Current_age_is_30years() {
		ksrCalculator_page= new ksrCalculator_page(driver);
		ksrCalculator_page.enterCurrentAge("30");
	}

	@And("user enters Employment status as employed")
	public void user_enters_Employment_status_as_employed() {
		ksrCalculator_page.clickEmploymentStatus();
		ksrCalculator_page.selectemploymentStausbyText("Employed");
		
	}

	@And("user enters annual salary 82000")
	public void user_enters_annual_salary_82000() {
		ksrCalculator_page.enterSalaryorWage("82000");
	}

	@And("user enters Kiwisaver Contriubtion 4percentage")
	public void user_enters_Kiwisaver_Contriubtion_4percentage() {
		ksrCalculator_page.clickFourPerKiwiSaverRadiobutton();
	}

	@And("user chooses high risk profile")
	public void user_chooses_high_risk_profile() {
		ksrCalculator_page.clickGrowthRadioButton();
	}

	@When("user Clicks on View your Kiwisaver Retirement projection")
	public void user_Clicks_on_View_your_Kiwisaver_Retirement_projection() {
		ksrCalculator_page.buttonClickViewSummaryProejction();
	}

	@Then("User able to view Summary")
	public void user_able_to_view_Summary() {
		ksrCalculator_page.viewKiwiSaverBalanceEstimate();
		
	}

	@Then("Checks the Summary Fields")
	public void checks_the_Summary_Fields() {

		ksrCalculator_page.viewKiwiSaverBalanceLumpsumAmt();
		ksrCalculator_page.viewKiwiSaverBalanceSummary();
		
		driver.close();
		
	
}
}
