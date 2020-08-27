package pomWithPagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {
	
	WebDriver driver;
	
	//Constructor
	public LoginPage(WebDriver localdriver) {
		this.driver=localdriver;
	}
		

	//Multiple ways to locate elements in page factory
//	1.Method
	@FindBy(xpath="//input[@formcontrolname='email']") WebElement email;
//	2.Method (Always follow this method)
	@CacheLookup
	@FindBy(how=How.XPATH,using="//input[@formcontrolname='password']") WebElement password;
	
	@CacheLookup
	@FindBy(how=How.XPATH,using="//button[@type='submit' and text()='Login']") WebElement submit_button;
	
	@CacheLookup
	@FindBy(how=How.LINK_TEXT,using="Sign Up Here") WebElement signup_button;
	
	@CacheLookup
	@FindBy(how=How.PARTIAL_LINK_TEXT,using="Forgot") WebElement forgot_password;

	@CacheLookup
	@FindBy(how=How.XPATH,using="//a[text()='Activate Account']") WebElement activate_account;
	
	
	public void cityfinance_login(String emailId,String pass) {
		
		email.sendKeys(emailId);
		password.sendKeys(pass);
		submit_button.click();
		
	}
	
}
