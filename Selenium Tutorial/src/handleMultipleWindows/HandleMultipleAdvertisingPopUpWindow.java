package handleMultipleWindows;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HandleMultipleAdvertisingPopUpWindow {
	
	@Test
	public void multipleTab() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Setup\\Selenium Driver\\Chrome Driver\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.MINUTES);
		
		driver.get("https://www.naukri.com/");
		
		String parent=driver.getWindowHandle();
		
		System.out.println("Parent window id is :"+parent);
		
//		//Hover 
//		WebElement ele=driver.findElement(By.xpath("//div[text()='Jobs']"));
//
//		//creating object of Actions class
//		Actions action=new Actions(driver);
//		
//		//perform hover
//		 action.moveToElement(ele).perform();
//		 
//		 driver.findElement(By.xpath("//a[@title='Search Jobs' and @href='https://www.naukri.com/browse-jobs']")).click();
//		 
//		 Thread.sleep(2000);
		 
		 Set<String> allWindows=driver.getWindowHandles();
		 
		 int count=allWindows.size();
		 
		 System.out.println("Total windos :"+count);
		 
		 for(String child:allWindows) {
			 
			 if(!parent.equalsIgnoreCase(child)) {
				 
				 driver.switchTo().window(child);
				 
				 System.out.println("Chils window title is"+driver.getTitle());
				 
				 Thread.sleep(3000);
				 
				 driver.close();
			 }
		 }
		
		 driver.switchTo().window(parent);
		 System.out.println("Parent Title is:"+driver.getTitle());
		
		
	}

}
