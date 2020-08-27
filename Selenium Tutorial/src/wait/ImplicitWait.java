package wait;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ImplicitWait {
	
//	implicitlyWait()=> It waits for a particular webelement  if it is not immediately present for given time and It is a smart/global wait because once you specifying in your script it will applicable for each and every webelement 
//	implicit waits()=> only checks for element presents whereas explicit wait()=> it have 1000 conditions i.e. can wait for window,alert,frame,text ,title etc.
	@Test
	public void implicitlyWait() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Setup\\Selenium Driver\\Chrome Driver\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.MINUTES);
		
		driver.get("https://stgmgrant.dhwaniris.in/site/login");
		
		System.out.println(driver.getTitle());
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.id("loginform-username")).sendKeys("dhwani");
		
		driver.findElement(By.id("loginform-password")).sendKeys("123456");

	}
}
