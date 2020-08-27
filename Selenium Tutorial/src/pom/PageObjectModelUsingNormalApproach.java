package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/* This class will store all the locators and methods
 * This is a page without parameterized */

public class PageObjectModelUsingNormalApproach {
	
	WebDriver driver;
	
	By email=By.xpath("//input[@formcontrolname='email']");
	By password=By.xpath("//input[@formcontrolname='password']");
	By loginButton=By.xpath("//button[@type='submit' and text()='Login']");
//	By SignUp=By.xpath("//a[text()='Sign Up Here']");
	By signUp=By.linkText("Sign Up Here");
	By forgotPassword=By.partialLinkText("Forgot");
	By activateAccount=By.xpath("//a[text()='Activate Account']");
	

	//Creating a constructor
	public PageObjectModelUsingNormalApproach(WebDriver driver) {
		
		//initializing webdriver
		this.driver=driver;	
		
	}
	
	public void typeEmail() {
		
		driver.findElement(email).sendKeys("manisha.singh+7@dhwaniris.com");
	}
	
	public void typePassword() {
		
		driver.findElement(password).sendKeys("Manisha@12");
	}
	
	public void clickLoginButton() {
		
		driver.findElement(loginButton).click();
		
	}
	
	public void clickSignupLink() {
		
		driver.findElement(signUp).click();
		
	}
	
	public void clickforgotPasswordLink() {
		
		driver.findElement(forgotPassword).click();
	}
	
	public void clickActivateAccountLink() {
		
		driver.findElement(activateAccount).click();
		
	}
}
