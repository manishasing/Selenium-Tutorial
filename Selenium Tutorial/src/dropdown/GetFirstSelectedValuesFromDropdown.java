package dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetFirstSelectedValuesFromDropdown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Setup\\Selenium Driver\\Chrome Driver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		WebElement month_dropdown=driver.findElement(By.id("month"));
		
		Select month_dd = new Select(month_dropdown);
		
		WebElement selected_values=month_dd.getFirstSelectedOption();
		
		System.out.println("Before Selection, selected values is :"+selected_values.getText());
	
//		It will select April from index
		month_dd.selectByIndex(4);
		
		WebElement selected_values1=month_dd.getFirstSelectedOption();
		
		System.out.println("After Selection, selected values is :"+selected_values1.getText());
		
		driver.quit();
		
		
		
		

	}

}
