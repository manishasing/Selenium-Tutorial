package handleMultipleWindows;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class HandleMultipleTab {
	
	@Test
	public void multipleTab() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Setup\\Selenium Driver\\Chrome Driver\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.MINUTES);
		
		driver.get("https://www.air.irctc.co.in/");
		
		String parent=driver.getWindowHandle();
		
		System.out.println("Parent window id is :"+parent);
		
		 driver.findElement(By.xpath("//a[text()='Tour Packages']")).click();
		 
		 Thread.sleep(2000);
		 
		 Set<String> allWindows=driver.getWindowHandles();
		 
		 int count=allWindows.size();
		 
		 System.out.println("Total windos :"+count);
		 
		 for(String child:allWindows) {
			 
			 if(!parent.equalsIgnoreCase(child)) {
				 
				 driver.switchTo().window(child);
				 driver.findElement(By.xpath("//a[text()='Login']")).click();
				 
				 Thread.sleep(3000);
			 }
		 }
		 
		 driver.switchTo().window(parent);
		
		 System.out.println("Parent Window title is :"+driver.getTitle());
		
		
	}

}
