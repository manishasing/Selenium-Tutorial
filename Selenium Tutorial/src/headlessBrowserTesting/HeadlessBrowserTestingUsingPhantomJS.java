package headlessBrowserTesting;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.testng.annotations.Test;

import library.Utility;

public class HeadlessBrowserTestingUsingPhantomJS {
	
	//incomplete
	
	@Test
	public void verifyFacebookTitle() {
		
		File src=new File("C:\\Selenium Setup\\PhantomJs\\phantomjs-2.1.1-windows\\bin\\phantomjs.exe");
		
		System.setProperty("phantomjs.binary.path", src.getAbsolutePath());
		
		WebDriver driver=new PhantomJSDriver();
		
		driver.get("https://www.facebook.com/");
		
		System.out.println(driver.getTitle());
		
		Utility.captureScreennshot(driver, "PhantomJsExample");		
		
	}

}
