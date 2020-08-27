package mouseEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DoubleClick {
	
	@Test
	public void doubleClickDemo() throws InterruptedException {

	System.setProperty("webdriver.chrome.driver", "C:\\Selenium Setup\\Selenium Driver\\Chrome Driver\\chromedriver.exe");
	
	WebDriver driver =new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("http://demo.guru99.com/test/simple_context_menu.html");
	
	Actions act=new Actions(driver);
	
	act.doubleClick(driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"))).perform();
	
	Thread.sleep(2000);
	
	System.out.println(driver.switchTo().alert().getText());
	
	driver.switchTo().alert().accept();
	
	} 

}
