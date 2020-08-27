package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Setup\\Selenium Driver\\Chrome Driver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://stgmgrant.dhwaniris.in/site/login");
		
		// 1-id
		WebElement uname= driver.findElement(By.id("loginform-username"));
		uname.sendKeys("dhwani");
		
		// 2-name
		By pwd = By.name("LoginForm[password]");
		driver.findElement(pwd).sendKeys("123456");
		
		//or, 
		driver.findElement(By.name("LoginForm[password]")).sendKeys("123456");
		
		// 3-className (many times class name wont be unique)
		driver.findElement(By.className("form-control")).click();
		
		//4-xpath
		driver.findElement(By.xpath("//*[@id=\"loginform-username\"]")).click();
		
		//5.Css
		driver.findElement(By.cssSelector("#loginform-password")).click();
		
		//6. LinkText
		driver.get("http://13.127.112.242/projects/haryana_school_mis_demo/backend/web/site/faq");
		driver.findElement(By.linkText("Instructions")).click();
		System.out.println("Link clicked successfully");
		
		//7.Partial Link
		driver.findElement(By.partialLinkText("General")).click();
		driver.findElement(By.partialLinkText("Hom")).click();
		System.out.println("Partial Link clicked successfully");
		
		//8.Tagname
		
		System.out.println(driver.findElements(By.tagName("img")).size());
		driver.findElement(By.tagName("img")).click();
		System.out.println("images clicked");

	}

}
