 package wait;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class setScriptTimeout {
	
//	SetScriptTimeOut()->It sets the amount of time to wait for an asynchronous script to finish execution before throwing an error. If the timeout is negative, then the script will be allowed to run indefinitely.
	
	//This script is useful while working with ajax application
	@Test
	public void setscript() {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Setup\\Selenium Driver\\Chrome Driver\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().setScriptTimeout(30, TimeUnit.SECONDS);

		driver.get("http://learn-automation.com/");
		
		System.out.println(driver.getTitle());
	}

}
