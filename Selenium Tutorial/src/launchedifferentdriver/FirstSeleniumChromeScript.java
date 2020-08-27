package launchedifferentdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSeleniumChromeScript {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Setup\\Selenium Driver\\Chrome Driver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://stgmgrant.dhwaniris.in/site/login");
		
//		System.out.println(driver.getPageSource()); // get code source
		System.out.println(driver.getCurrentUrl()); // get current url
		
		String title =driver.getTitle(); // get actual title of page
		System.out.println(title);
		
		//validating actual title with expected title
		if(title.equals("LTFS - Login")) {
			System.out.println("Correct");
		}else {
			System.out.println("InCorrect Title");

		}
//		driver.findElement(By.xpath("//*[@id=\"loginform-username\"]")).sendKeys("dhwani");
		driver.findElement(By.cssSelector("input#loginform-username")).sendKeys("dhwani");

		
//		driver.quit(); // quit the browser

	}

}
