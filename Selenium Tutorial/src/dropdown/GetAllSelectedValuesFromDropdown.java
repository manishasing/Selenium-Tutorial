package dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetAllSelectedValuesFromDropdown {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Setup\\Selenium Driver\\Chrome Driver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		
	/*Incomplete Task */
		
		
		driver.get("https://stgrishta.dhwaniris.in/index.php/users/login");
		driver.findElement(By.xpath("//input[@id='users-user_name']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@id='loginform-password']")).sendKeys("admin@rishta");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.linkText("User")).click();
		driver.findElement(By.linkText("Users")).click();
		driver.findElement(By.xpath("//a[@href='/index.php/users/update?id=88']")).click();

		
		driver.manage().window().maximize();
		
	
		WebElement village_dropdown=driver.findElement(By.xpath("//select[@id='w1']"));
		
		Select vill_dd = new Select(village_dropdown);
		
		List<WebElement>allselected_villList=vill_dd.getAllSelectedOptions();
		System.out.println("Selected village name is:"+allselected_villList);

		
		for(WebElement selectedValues:allselected_villList) {
			System.out.println("Selected village name is:"+selectedValues.getText());
		}
////		System.out.println("All selected village is:"+allselected_villList);		 
//		
//		driver.quit();
		

		
		

	}

}
