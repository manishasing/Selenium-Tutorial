package ConfigurationDemo;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestLoginUsingConfigFile {
	
	// Login by using Config data 
	@Test
	public void Login() throws Exception {
		
		File src=new File("./Configuration/Config.property");
		
		FileInputStream fis=new FileInputStream(src);
		
		//Properties class is use to read config file
		Properties pro=new Properties();
		
		pro.load(fis);
		
		String chromepath=pro.getProperty("ChromeDriver");
		
		String url=pro.getProperty("URL");
		
		System.setProperty("webdriver.chrome.driver",chromepath );
		
		WebDriver driver=new ChromeDriver() ;
		
		driver.manage().window().maximize();
		
		driver.get(url);
		
		driver.findElement(By.id("loginform-username")).sendKeys("dhwani");
		
		driver.findElement(By.id("loginform-password")).sendKeys("123456");

		driver.findElement(By.id("login-button")).click();

		
				
	}

}
