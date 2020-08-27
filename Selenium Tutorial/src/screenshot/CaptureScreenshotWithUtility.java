package screenshot;

//import java.io.File;
//import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
//import org.openqa.selenium.OutputType;
//import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import library.Utility;


public class CaptureScreenshotWithUtility {

	@Test
	public  void screenShot() throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Setup\\Selenium Driver\\Chrome Driver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://stgmgrant.dhwaniris.in/site/login");
		
		//Calling a method (captureScreennshot) from utility class to reuse that code

		Utility.captureScreennshot(driver, "Browser Started");
		
		driver.findElement(By.id("loginform-username")).sendKeys("dhwani");
		
		Utility.captureScreennshot(driver, "LoginScreen");
		
/*     "Remove all four line code from here and paste it in (library->utility class)"
 
		TakesScreenshot ts=(TakesScreenshot)driver;
		
		File source=ts.getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(source, new File("./CapturedScreenshotsImages/migrantlogin.png"));
				
		System.out.println("Screenshot taken successfully");
		
*/
		
//Calling a method (captureScreennshot) from utility class to reuse that code
		
//		Utility.captureScreennshot(driver,"screenshotnane");

		
}

	
}
