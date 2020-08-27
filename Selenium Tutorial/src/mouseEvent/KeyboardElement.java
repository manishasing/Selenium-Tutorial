package mouseEvent;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class KeyboardElement {
	
	@Test
	public void keyBoardDemo() {

	System.setProperty("webdriver.chrome.driver", "C:\\Selenium Setup\\Selenium Driver\\Chrome Driver\\chromedriver.exe");
	
	WebDriver driver =new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("https://www.facebook.com/");
	
	Actions act=new Actions(driver);
	
	driver.findElement(By.name("firstname")).sendKeys("Manisha");
	
	act.sendKeys(Keys.TAB)
	.pause(Duration.ofSeconds(1))
	.sendKeys("Singh")
	.sendKeys(Keys.TAB)
	.pause(Duration.ofSeconds(1))
	.sendKeys("singhmanisha14apr@gmail.com")
	.sendKeys(Keys.TAB)
	.pause(Duration.ofSeconds(1))
	.sendKeys("123456hgrfy")
	.pause(Duration.ofSeconds(1))
	.sendKeys(Keys.ENTER)
	.build().perform();
		
	}
	
	
	
}
