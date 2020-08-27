package headlessBrowserTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HeadlessBrowserTestingUsingHTMLUnitDriver {
	
	//This method will pass because Facebook exist in facebook title
	@Test
	public void VerifyFacebookTitle() {
		
		WebDriver driver = new HtmlUnitDriver();
		
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("abc@g.com");
		driver.findElement(By.id("pass")).sendKeys("123456");
		driver.findElement(By.id("loginbutton")).click();
		
		System.out.println("Successfully values sends");
		
		String facebook_title=driver.getTitle();
		
		Assert.assertTrue(facebook_title.contains("Facebook"));
				
	}
	
	
	//This method will fail because selenium does not exist in facebook title
	@Test
	public void VerifyInvalidFacebookTitle() {
		
		WebDriver driver = new HtmlUnitDriver();
		
		String facebook_title=driver.getTitle();
		
		Assert.assertTrue(facebook_title.contains("Selenium"));
				
	}
	

}
