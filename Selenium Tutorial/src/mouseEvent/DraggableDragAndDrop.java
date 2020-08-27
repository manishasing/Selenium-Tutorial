package mouseEvent;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DraggableDragAndDrop {
	
	@Test
	public void draggable() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Setup\\Selenium Driver\\Chrome Driver\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://jqueryui.com/draggable/");
		
		WebElement frame=driver.findElement(By.xpath("//iframe[@src='/resources/demos/draggable/default.html']"));
		
		driver.switchTo().frame(frame);
		
		Thread.sleep(3000);
		
		Actions act=new Actions(driver);
		
		WebElement source=driver.findElement(By.xpath("//div[@id='draggable']"));
		
		act.dragAndDropBy(source, 300, 150).perform();
		


		
	}

}
