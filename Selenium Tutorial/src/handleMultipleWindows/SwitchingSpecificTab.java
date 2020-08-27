package handleMultipleWindows;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SwitchingSpecificTab {
	
	@Test
	public void multipleTab() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Setup\\Selenium Driver\\Chrome Driver\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.MINUTES);
		
		driver.get("https://www.naukri.com/");
		
		String parent=driver.getWindowHandle();
		
		System.out.println("Parent window id is :"+parent);
		 
		 Set<String> allWindows=driver.getWindowHandles();
		 
		 ArrayList<String> tabs=new ArrayList(allWindows);
		 
		driver.switchTo().window(tabs.get(2));
		
		driver.close();
		
		driver.switchTo().window(tabs.get(1));
		
		driver.close();

		driver.switchTo().window(tabs.get(0));
		
		System.out.println("Title of parent window is:"+driver.getTitle());
		

		
		
	}

}
