package elementHighlighter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import library.Helper;

public class HighlightElement {
	
	@Test
	public void highlight() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Setup\\Selenium Driver\\Chrome Driver\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		WebElement username=driver.findElement(By.id("email"));
		Helper.highlightWebElemets(driver, username);
		username.sendKeys("mannu@gmail.com");
		
		
		WebElement pwd=driver.findElement(By.id("pass"));
		Helper.highlightWebElemets(driver, pwd);
		pwd.sendKeys("1234546");
		

		WebElement login=driver.findElement(By.id("loginbutton"));
		Helper.highlightWebElemets(driver, login);
		login.click();
		

		
	}

}
