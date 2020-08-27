package baseClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseClass {
		
	WebDriver driver;
	
	@BeforeClass
	public void setUpApplication() {
		
		Reporter.log("=====Browser Session Started======", true);
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Setup\\Selenium Driver\\Chrome Driver\\chromedriver.exe");
		
	    driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://stgmgrant.dhwaniris.in/site/login");
		
		Reporter.log("=====Application Started======", true);
	}
	
	@AfterClass
	public void closeApplication() {
		
		driver.quit();
		Reporter.log("=====Browser Session End======", true);
		
	}

}
