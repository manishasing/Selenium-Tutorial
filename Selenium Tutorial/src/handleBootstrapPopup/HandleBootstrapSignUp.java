package handleBootstrapPopup;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HandleBootstrapSignUp {
	
	@Test
	public void signUp() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Setup\\Selenium Driver\\Chrome Driver\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
						
		driver.get("https://www.goibibo.com/");
		
		driver.findElement(By.xpath("//a[@id='get_sign_up']")).click();
		
		WebElement frame=driver.findElement(By.id("authiframe"));
		
		driver.switchTo().frame(frame);
		
		Thread.sleep(5000);
		
		driver.findElement(By.id("authMobile")).sendKeys("2563214589");
		
		driver.findElement(By.id("mobileSubmitBtn")).click();
		
		
	}

}
