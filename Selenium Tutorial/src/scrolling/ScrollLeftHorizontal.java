package scrolling;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ScrollLeftHorizontal {

	//Execution left and url missing
	@Test
	public void scrollHorizontalLeft() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Setup\\Selenium Driver\\Chrome Driver\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.MINUTES);
		
		driver.get("");
		
		Thread.sleep(5000);
		
		//Scrolling Right
		((JavascriptExecutor)driver).executeScript("scroll(400,0)");
		
		Thread.sleep(2000);

		//Scrolling Left
		((JavascriptExecutor)driver).executeScript("scroll(-400,0)");
	}
}
