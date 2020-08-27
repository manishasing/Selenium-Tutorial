package Alert;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HandleAlert {

	@Test
	public void handleAlert() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Setup\\Selenium Driver\\Chrome Driver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://ksrtc.in/oprs-web/ticket/waitlist.do?h=1&lange=EN");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@type='button' and @id='searchBtn']")).click();
		
		Thread.sleep(2000);

		
/* 1.Indirect Method to switch on alert and click on ok button
		//Command will switch to alert window
		Alert alt=driver.switchTo().alert();
		
		//Click on "OK" button
		alt.accept();
		
*/

// Capturing a text from Alert
		
		String actual_msg =driver.switchTo().alert().getText();
		System.out.println(" Alert msg is:"+actual_msg);

// Validating the actual text
/* 1. Method for validation 
		assertTrue(actual_msg.contentEquals("Please enter valid ticket number to continue."));
		System.out.println("Test case pass and Alert msg captured correctly");

 */

/* 2 Method for validation */
		
		String expected_msg="Please enter valid ticket number to continueh.";
		Assert.assertEquals(actual_msg, expected_msg);
		
/* 2. Direct Method to switch on alert and click on ok button*/

		driver.switchTo().alert().accept();
		
/*  Click on "Cancel" button from alert
		driver.switchTo().alert().dismiss();
*/
		
		
	}
}
