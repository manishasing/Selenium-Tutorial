package baseClass;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class LoginPage extends BaseClass{
	
	@Test(description="This TC performs login functionality with valid credentials")
	public void logInToApplication(){
		
		driver.findElement(By.id("loginform-username")).sendKeys("dhwani");
		
		driver.findElement(By.id("loginform-password")).sendKeys("123456");
		
		driver.findElement(By.id("login-button")).click();	
		
		Reporter.log("=====Clicked on Login Button======", true);
		
	}
	
	@Test
	public void projectClick(){
		
		driver.findElement(By.xpath("//a[text()='Project']")).click();
		
		Reporter.log("=====Clicked on Page Link======", true);
		
	}
	
	
	
	
}
