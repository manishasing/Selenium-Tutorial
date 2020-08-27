package validation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class VerifyPageTitle {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Setup\\Selenium Driver\\Chrome Driver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://stgrishta.dhwaniris.in/index.php/site/index");
		
		//Actual Title
		String pageTitle=driver.getTitle();
		System.out.println("Title is:"+pageTitle);
		
//		String expectedTitle ="Login";
		
//		For Exact match
//		Assert.assertEquals(pageTitle, expectedTitle);
		
//		For Partial match or contains some matched text
		Assert.assertTrue(pageTitle.contains("Log"));
		
		//Shows when it matched through assert 
		System.out.println("Testcase passed");
		
		
//		Verify Title from pageSource
		
		String pageSource=driver.getPageSource();
		
		Assert.assertTrue(pageSource.contains("Login"));
		
		System.out.println("Title verified from page sourceS");
		
	}

}
