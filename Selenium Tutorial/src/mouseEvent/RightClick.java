package mouseEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class RightClick {
	
	@Test
	public void rightClickDemo() throws InterruptedException {

	System.setProperty("webdriver.chrome.driver", "C:\\Selenium Setup\\Selenium Driver\\Chrome Driver\\chromedriver.exe");
	
	WebDriver driver =new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
	
	Actions act=new Actions(driver);
	
	act.contextClick(driver.findElement(By.xpath("//span[text()='right click me']"))).perform();
	
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//span[text()='Edit']")).click();
	
	Thread.sleep(2000);
	
	System.out.println(driver.switchTo().alert().getText());
	
	driver.switchTo().alert().accept();
	
	} 

}
