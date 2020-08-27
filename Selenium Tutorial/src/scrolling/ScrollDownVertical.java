package scrolling;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ScrollDownVertical {
	
	@Test
	public void verticalDownScrolling() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Setup\\Selenium Driver\\Chrome Driver\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.MINUTES);
		
		driver.get("https://jqueryui.com/draggable/");
		
		Thread.sleep(5000);
		
		//0 shows horizontal and 400 shows verticla i.e. it does not scroll horizontally due to 0
		((JavascriptExecutor)driver).executeScript("scroll(0,400)");
	}

}
