package launchedifferentdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class FirstSeleniumFIrefoxdriver {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver","C:\\Selenium Setup\\Firefox Driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver(); //launch fifrefox driver
		driver.get("https://www.facebook.com/"); // enter url
		
		driver.findElement(By.xpath("//*[@id=\"u_0_m\"]")).sendKeys("qwerty");
		driver.findElement(By.xpath("//*[@id=\"u_0_6\"]")).click();
		
		Select day =new Select(driver.findElement(By.xpath("//*[@id=\"day\"]")));
			day.selectByIndex(14);
		Select month = new Select (driver.findElement(By.xpath("//*[@id=\"month\"]")));
			month.selectByVisibleText("Apr");
		Select year = new Select(driver.findElement(By.xpath("//*[@id=\"year\"]")));
			year.selectByValue("1994");
		driver.findElement(By.xpath("//*[@id=\"u_0_13\"]")).click();
		
		driver.findElement(By.linkText("Forgotten account?")).click();
		driver.navigate().back(); // navigating to back page
		driver.quit();

		
		
		
	}
  
}
