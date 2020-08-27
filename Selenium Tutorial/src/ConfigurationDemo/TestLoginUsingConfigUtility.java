package ConfigurationDemo;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import library.configReader;

public class TestLoginUsingConfigUtility {
	
	configReader configreader;
	WebDriver driver;

	@BeforeTest
	public void setUp() {
		
		configreader=new configReader();
		
		System.setProperty("webdriver.chrome.driver", configreader.getChromePath());
		
		driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get(configreader.getUrl());
	}
	
	// Login by using Config data utility
	@Test
	public void Login() throws Exception {
		
		driver.findElement(By.id("loginform-username")).sendKeys("dhwani");
		
		driver.findElement(By.id("loginform-password")).sendKeys("123456");

		driver.findElement(By.id("login-button")).click();

		
				
	}

}
