package Frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HandleFrame {

	/* Execution is pending due to slow net */
	@Test
	public void testFrames() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Setup\\Selenium Driver\\Chrome Driver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("file:///C:/Selenium%20Notes/myframe.html");
		
//		To switch any frame by using id (do the same by using name)
		driver.switchTo().frame("cityf");
		
		driver.findElement(By.xpath("//a[@href='/login']")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//a[@href='/register']")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.id("name")).sendKeys("MANISHA SINGH ONE");
		
		// Switch to parent page/window
		driver.switchTo().defaultContent();
		
		driver.findElement(By.linkText("Click here for selenium tutorial")).click();
		
	}
	
}
