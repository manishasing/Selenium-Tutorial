package mouseEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MouseHover {
	
	@Test
	public void mouseHoverDemo() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Setup\\Selenium Driver\\Chrome Driver\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://stgmgrant.dhwaniris.in/site/login");
		
		driver.findElement(By.id("loginform-username")).sendKeys("dhwani");
		driver.findElement(By.id("loginform-password")).sendKeys("123456");
		driver.findElement(By.id("login-button")).click();
		driver.findElement(By.xpath("//a[text()='Project']")).click();
		
		Thread.sleep(2000);
		
		WebElement ele=driver.findElement(By.xpath("//h5[text()='Demo test']"));
		
		//creating object of Actions class
		Actions action=new Actions(driver);
		
		//perform hover
		 action.moveToElement(ele).perform();
		 
		 Thread.sleep(2000);
		 
		 driver.findElement(By.xpath("//i[@class='glyphicon glyphicon-trash'][1]")).click();
		 
		 driver.switchTo().alert().accept();
		 		 
		 
		 
		 			
	}
	
}
