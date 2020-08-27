package mouseEvent;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DragAndDrop {
	
	@Test
	public void dragAndDropDemo() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Setup\\Selenium Driver\\Chrome Driver\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://dhtmlx.com/docs/products/dhtmlxTree/");
		
		Actions act=new Actions(driver);
		
		WebElement source=driver.findElement(By.xpath("//span[text()='Learning DHTMLX Suite UI']"));
		
		WebElement destination=driver.findElement(By.xpath("//li[text()='Zend Framework in Action']"));
		
/*		1.Method using click and hold method and then release it line 32-38

		act.clickAndHold(source)
		.moveToElement(destination)
		.pause(Duration.ofSeconds(1))
		.release()
		.build()
		.perform();
		act.pause(Duration.ofSeconds(1));
*/
		
//		2.Method using locator only
		Thread.sleep(2000);
		act.dragAndDrop(source, destination).perform();
		
		


		
	}

}
