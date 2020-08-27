package AdvanceReport;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.LogStatus;

public class VerifyPageTitle {
	
	
	@Test
	public void verifyTitle() {
		
		ExtentReports logger=ExtentReports.get(VerifyPageTitle.class);
		
		logger.init("./Report/advanceReport.html", true);
		
		logger.startTest("Verify Title of Page");
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Setup\\Selenium Driver\\Chrome Driver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		logger.log(LogStatus.INFO, "Browser is up and running");
		
		
		driver.get("https://democityfinance.dhwaniris.in/login");
		logger.log(LogStatus.INFO, "Application/URL is up and running");
		
		String pageTitle=driver.getTitle();
		logger.log(LogStatus.INFO, "Title captured");
		
//		Assert.assertTrue(pageTitle.contains("qwerty"));
		Assert.assertEquals(pageTitle, "City finance");
		logger.log(LogStatus.PASS, "Title verified successfully");
		
		
		logger.attachScreenshot("C:\\Users\\user\\Pictures\\Camera Roll\\manisha.jpg");
		
		logger.endTest();
	}

}
