package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/* This class will store all the locators and methods
 * This is a page with parameterized i.e. passing value dynamic*/

public class PoMUsingNormalApproachWithParameterized {
	
	WebDriver driver;
	
	By email=By.xpath("//input[@formcontrolname='email']");
	
	
	By password=By.xpath("//input[@formcontrolname='password']");
	By loginButton=By.xpath("//button[@type='submit' and text()='Login']");
//	By SignUp=By.xpath("//a[text()='Sign Up Here']");
	By signUp=By.linkText("Sign Up Here");
	By forgotPassword=By.partialLinkText("Forgot");
	By activateAccount=By.xpath("//a[text()='Activate Account']");
	

	//Creating a constructor
	public PoMUsingNormalApproachWithParameterized(WebDriver driver) {
		
		//initializing webdriver
		this.driver=driver;	
		
	}
	
	/*1.Method one from line 34-48
	
	public void typeEmail(String emailId) {
		
		driver.findElement(email).sendKeys(emailId);
	}
	
	public void typePassword(String pwd) {
		
		driver.findElement(password).sendKeys(pwd);
	}
	
	public void clickLoginButton() {
		
		driver.findElement(loginButton).click();
		
	}
	
*/
	//2.Method 2 for line 34-48
	
	public void login(String emailId,String pwd) {
		
		driver.findElement(email).sendKeys(emailId);
		driver.findElement(password).sendKeys(pwd);
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
