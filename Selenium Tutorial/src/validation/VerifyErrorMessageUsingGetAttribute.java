package validation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VerifyErrorMessageUsingGetAttribute {

	@Test
	public void ErrorMgVerification() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Setup\\Selenium Driver\\Chrome Driver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		/* Incomplete Task */
		
		/* Verifying Error msg using getAttribute() Method */
		
		driver.get("https://accounts.google.com/signin/v2/identifier?flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		
		driver.findElement(By.xpath("//div[@class='VfPpkd-RLmnJb']")).click();
		
		Thread.sleep(2000);
		
		String actual_error =driver.findElement(By.xpath("//div[@class='o6cuMc']")).getAttribute("innerHTML");

		/* Or Another way for [line 28]
		WebElement ele=driver.findElement(By.xpath("//div[@class='o6cuMc']"));
			
		String actual_error=ele.getAttribute("innerHTML");
		*/
		
		//Actual Error
		System.out.println("Actual Error msg is:"+actual_error);
		
		//Expected Error
		String Expected_error="Enter an email or phone number";
		
//	   1-Method to verify	
		
		Assert.assertEquals(actual_error, Expected_error);
		
		System.out.print("Error msg verrified successfully !!");
		
//		2-Method to verify	

		Assert.assertTrue(actual_error.contains("Enter an email or phone"));
		
		System.out.println("Passed");

	}

}
