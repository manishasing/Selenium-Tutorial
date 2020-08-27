package dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintAllDropdownValues {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Setup\\Selenium Driver\\Chrome Driver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		WebElement month_dropdown=driver.findElement(By.id("month"));
		
		Select month_dd = new Select(month_dropdown);
	
		//getting all values from dropdown by getoptions method
		List<WebElement> month_list=month_dd.getOptions();
		
		//getting size of month list
		int total_month=month_list.size();
		
		System.out.println("Total month count is:"+total_month);
		
		for(WebElement ele:month_list) {
			
			String month_name=ele.getText();
			
			System.out.println("Month name is ======>"+month_name);
		}
		
		
		

		
		
		
		

	}

}
