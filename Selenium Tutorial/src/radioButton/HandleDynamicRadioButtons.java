package radioButton;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleDynamicRadioButtons {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Setup\\Selenium Driver\\Chrome Driver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		// Handling a radio button dynamically which has same property like same name,id ,values etc
		List<WebElement> radio = driver.findElements(By.xpath("//input[@name='sex' and @type='radio']"));
		
//			for(WebElement ele:radio) {
			for(int i=0;i<radio.size();i++) {
				
				WebElement local_radio=radio.get(i);
				
				String value=local_radio.getAttribute("value");
				
				System.out.println("VAlues from radio buttons are ===========>"+value);
				
				if(value.equalsIgnoreCase("-1")) {
					
					local_radio.click();
					
				}else if(value.equalsIgnoreCase("1")) {
					local_radio.click();
				}
				

			}
	
	}
		
	}

