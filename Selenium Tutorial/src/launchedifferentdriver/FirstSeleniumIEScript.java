package launchedifferentdriver;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class FirstSeleniumIEScript {

	public static void main(String[] args) {
		
		File file = new File("C:\\Selenium Setup\\IEDriverServer.exe");
		System.setProperty("webdriver.ie.driver", file.getAbsolutePath());
		WebDriver driver = new InternetExplorerDriver(); //launch IE browser
		driver.get("https://stgmgrant.dhwaniris.in/site/login");
		
		//Dynamic css locator 
		driver.findElement(By.cssSelector("input#loginform-username")).sendKeys("dhwani");
	}

}
