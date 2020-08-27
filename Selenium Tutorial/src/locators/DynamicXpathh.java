package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicXpathh {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Setup\\Selenium Driver\\Chrome Driver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://stgmgrant.dhwaniris.in/site/login");
		
/*
		
		//1-Relative Xpath using Single Attribute
		driver.findElement(By.xpath("//input[@id='loginform-username']")).sendKeys("dhwani");
		driver.findElement(By.xpath("//input[@name='LoginForm[password]']")).sendKeys("123456");
		driver.findElement(By.xpath("//img[@alt='LTFS']")).click();
		driver.findElement(By.xpath("//img[@src='/images/login-image.png']")).click();
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		
*/
		
		//2-Relative xpath using multiple Attribute
		driver.findElement(By.xpath("//input[@class='form-control'][@name='LoginForm[username]']")).sendKeys("dhwani");
//		driver.findElement(By.xpath("//input[@type='password' and @class='form-control' and @id='loginform-password']")).sendKeys("123456");
		driver.findElement(By.xpath("//input[starts-with(@id,'loginform' ) and @name='LoginForm[password]']")).sendKeys("123456");
		driver.findElement(By.xpath("//button[contains(@type,'submit')]")).click();
//		driver.findElement(By.xpath("//button[contains(text(),'Login')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Dashboard')]")).click();
		driver.findElement(By.xpath("//a[text()='Project']//preceding::a[2]")).click();
		
		driver.get("https://stgonlineassessment.dhwaniris.in/index.php/student-details/create");		
//		driver.findElement(By.xpath("//label[text()='Student Name']//following::input[1]")).sendKeys("abc");
		
		driver.findElement(By.xpath("//label[text()='Student Name']//following::input[1]")).sendKeys("abc");


	}

}
