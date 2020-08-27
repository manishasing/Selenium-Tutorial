package elementHighlighter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import library.Helper;

public class Utilityyyy {
	
	
	public static WebDriver reuseCOde(String browser,String path,String url,String Email,String pass,boolean enterpwd) {
		
		System.setProperty(browser, path);
		
		WebDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get(url);
		
		WebElement username=driver.findElement(By.id("email"));
		Helper.highlightWebElemets(driver, username);
		username.sendKeys(Email);
		if (enterpwd) {
			WebElement pwd=driver.findElement(By.id("pass"));
			Helper.highlightWebElemets(driver, pwd);
			pwd.sendKeys(pass);
		}
		
		return driver;
	}

}
