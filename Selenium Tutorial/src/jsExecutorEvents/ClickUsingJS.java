package jsExecutorEvents;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ClickUsingJS {
	
	@Test
	public void Click() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Setup\\Selenium Driver\\Chrome Driver\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://login.yahoo.com/");
		
		driver.findElement(By.name("username")).sendKeys("fef@g.com");
		
		Thread.sleep(2000);
				
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		/*1. Method one by writing xpath in console ( https://prnt.sc/tt2u66) line -30
		
		js.executeScript("document.getElementById('persistent').click()"); */
		
//		2. Method by writing xpath or location line-33-35
		
		WebElement ele=driver.findElement(By.xpath("//*[contains(text(),'Stay signed')]"));
		
		js.executeScript("arguments[0].click()",ele);
		
		
	}

}
