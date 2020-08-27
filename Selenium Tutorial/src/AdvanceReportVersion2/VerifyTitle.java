package AdvanceReportVersion2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import library.Utility2;

public class VerifyTitle {

/* Incomplete task */
	
	ExtentReports report;
	ExtentTest logger; 
	WebDriver driver;
	
	@Test
	public void verifyCityfinancePageTitle() {
		
		report=new ExtentReports("./Report/advanceReport.html");
		

		
		report.startTest("Test1VerifyDemoTitle");
				
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Setup\\Selenium Driver\\Chrome Driver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		logger.log(LogStatus.INFO, "Browser Started");
		
		driver.get("https://democityfinance.dhwaniris.in/login");
		logger.log(LogStatus.INFO, "Applicatrion is up and running");
		
		String title=driver.getTitle();
		
		Assert.assertEquals(title, "City finance");
		logger.log(LogStatus.PASS, "Verified demo title successfully");
		
		
		
		
	}
	
	
	@AfterMethod
	public void tearDown(ITestResult result) {
		if(ITestResult.FAILURE==result.getStatus()) {
			String screenshot_path=Utility2.captureScreennshot(driver, result.getName());
			
			logger.log(LogStatus.FAIL, "Title verification", screenshot_path);
		}
		
	}
	
	
	
	
	
	
	
}
