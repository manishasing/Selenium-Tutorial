package pomTestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pom.PageObjectModelUsingNormalApproach;

public class VerifyLoginPage {
	
	@Test
	public void verifyValidLogin() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Setup\\Selenium Driver\\Chrome Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://democityfinance.dhwaniris.in/login");
		
		//creating an object of class
		PageObjectModelUsingNormalApproach login =new PageObjectModelUsingNormalApproach(driver);
		
		login.typeEmail();
		login.typePassword();
		login.clickLoginButton();
	}

}
