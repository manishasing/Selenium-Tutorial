package screenshot;

//import java.io.File;
//import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
//import org.openqa.selenium.OutputType;
//import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import library.Utility;


public class CaptureFailedScreenshotWithUtility {

	WebDriver driver;
	
	@Test
	public  void screenShot() throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Setup\\Selenium Driver\\Chrome Driver\\chromedriver.exe");
		
		driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://stgmgrant.dhwaniris.in/site/login");
		
		driver.findElement(By.id("loginform-username")).sendKeys("dhwani");
		driver.findElement(By.id("loginform-password")).sendKeys("123456");
		driver.findElement(By.xpath("//button[@type='submitt']")).click();
	}
	
	
	@AfterMethod
	public void tearDown(ITestResult result) {
		
		if(ITestResult.FAILURE==result.getStatus()) {
			
			Utility.captureScreennshot(driver, result.getName());
		}
		
//		driver.quit();
		
	}

	
}
