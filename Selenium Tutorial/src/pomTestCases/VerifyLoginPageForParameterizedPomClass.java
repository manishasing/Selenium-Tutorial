package pomTestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pom.PoMUsingNormalApproachWithParameterized;


public class VerifyLoginPageForParameterizedPomClass {
	
	@Test
	public void verifyValidLogin() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Setup\\Selenium Driver\\Chrome Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://democityfinance.dhwaniris.in/login");
		
		//creating an object of class
		PoMUsingNormalApproachWithParameterized loginn =new PoMUsingNormalApproachWithParameterized(driver);
/*  Method 1 for this "PoMUsingNormalApproachWithParameterized" class
		login.typeEmail("manisha.singh+7@dhwaniris.com");
		login.typePassword("Manisha@12");
		login.clickLoginButton();
*/
		//Method 2 
		 loginn.login("manisha.singh+7@dhwaniris.com", "Manisha@12");
	}


}
