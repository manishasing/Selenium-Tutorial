package launchedifferentdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicCSSLocator {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Setup\\Selenium Driver\\Chrome Driver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://stgmgrant.dhwaniris.in/site/login");
		
//		1- Css using ID
		
		driver.findElement(By.cssSelector("input#loginform-username")).sendKeys("dhwani");
		
//		2-Css using id and Classname
		
//		driver.findElement(By.cssSelector("input.form-control#loginform-password")).sendKeys("123456");
		
//		3- Css using Classname and single attribute
		
//		driver.findElement(By.cssSelector("input.form-control[name='LoginForm[password]']")).sendKeys("123456");
		
//     4-Css using multiple attribute
		
//		driver.findElement(By.cssSelector("input[class='form-control'][name='LoginForm[password]']")).sendKeys("123456");
		
//		5-Css using contains 
		
//		driver.findElement(By.cssSelector("input[class*='control'][id*=loginform-username]")).sendKeys("123456");
		
//												OR
		
//		driver.findElement(By.cssSelector("input[id*='login'][id*='password']")).sendKeys("1234656");
		
//		6-Css using Starts-with
		
//		driver.findElement(By.cssSelector("input[id^='loginform'][name='LoginForm[password]']")).sendKeys("123456");
		
//		7-Css using Ends-with
		
		driver.findElement(By.cssSelector("input[name$='[password]']")).sendKeys("123456");
	}

}
