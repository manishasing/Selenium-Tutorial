package wait;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class PageLoadTimeOut {
	
	@Test
	public void pageload() {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Selenium Setup\\Selenium Driver\\Chrome Driver\\chromedriver.exe");
	
	WebDriver driver =new ChromeDriver();
	
	driver.manage().window().maximize();

	//Timeout is a saperate interface which is provided in selenium to manage all the time out
	Timeouts time=driver.manage().timeouts();
	
	//PageLoadTimeOut helps to wait for given time to load an application and if page doesnot load within given time then it fails
	time.pageLoadTimeout(60, TimeUnit.SECONDS);
	
	driver.get("http://learn-automation.com/");
	
	System.out.println(driver.getTitle());
	
	
	}

}
