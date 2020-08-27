package pomWithPagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import library.BrowserFactory;

public class CheckvalidUserTest {

	@Test
	public void validUser() {
		
		//This will launch browser and url
		WebDriver driverr=BrowserFactory.startBrowser("chrome", "https://democityfinance.dhwaniris.in/login");
		
		//Created page object using page factory
		LoginPage login_page=PageFactory.initElements(driverr, LoginPage.class);
		
		//Call the method
		login_page.cityfinance_login("manisha.singh+7@dhwaniris.com", "Manisha@12");
	}
}
