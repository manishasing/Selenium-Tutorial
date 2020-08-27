package checkbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleDynamicCheckbox {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Setup\\Selenium Driver\\Chrome Driver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://stgcrm.ipsfoundation.org/site/login");
		driver.findElement(By.xpath("//input[@id='loginform-username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@id='loginform-password']")).sendKeys("CRM@1234");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.linkText("Farmer")).click();
		driver.findElement(By.partialLinkText("CREATE FARMER")).click();
		
		List<WebElement> checkbox=driver.findElements(By.xpath("//input[@name='Beneficiary[farmer_type][]' and @type='checkbox']"));
			
		for(int i=0;i<checkbox.size();i++) {
				
				WebElement local_checkbox= checkbox.get(i);
				
				String checkbox_value=local_checkbox.getAttribute("value");
				
				System.out.println("Values from Checkboxes area ============>"+checkbox_value);
				
				if(checkbox_value.equalsIgnoreCase("2")) {
					local_checkbox.click();
					break;
				}
		
				
			}
	}

}
