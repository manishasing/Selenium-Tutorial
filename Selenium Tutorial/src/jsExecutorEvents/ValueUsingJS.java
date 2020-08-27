package jsExecutorEvents;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ValueUsingJS {
	
	@Test
	public void value() {

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Setup\\Selenium Driver\\Chrome Driver\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://login.yahoo.com/");
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
/*		1.Method using locator with one argument line 27-29
		
		WebElement email=driver.findElement(By.name("username"));
		
		js.executeScript("arguments[0].value='manisha@gmail.com'",email);  */
		
		
//	    2.Method using locator with multiple arguments line 34-36
	    
		WebElement emaill=driver.findElement(By.name("username"));

		js.executeScript("arguments[0].value=arguments[1]",emaill,"manisha@gmail.com");  

		
		
	}
}
