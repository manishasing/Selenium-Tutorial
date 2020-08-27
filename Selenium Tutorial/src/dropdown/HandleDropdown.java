package dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleDropdown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Setup\\Selenium Driver\\Chrome Driver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		WebElement month_dropdown=driver.findElement(By.id("month"));
		
		Select month_dd = new Select(month_dropdown);
	
/*
		It will select April from index
		month_dd.selectByIndex(4);
		
		It will select April from Value
		month_dd.selectByValue("4");
		
*/
	
//		It will select April from Visible Text (Recommended to always use this for dropdown)
		month_dd.selectByVisibleText("Apr");
		
		driver.quit();
		
		
		
		

	}

}
