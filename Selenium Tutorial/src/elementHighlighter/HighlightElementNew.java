package elementHighlighter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import library.Helper;

public class HighlightElementNew {
	@Test
	public void highlight() {
		
		WebDriver driver=Utilityyyy.reuseCOde("webdriver.chrome.driver", "C:\\Selenium Setup\\Selenium Driver\\Chrome Driver\\chromedriver.exe", "https://www.facebook.com/","manisha@gmail.com", "12345678",false);

		WebElement login=driver.findElement(By.name("login"));
//		Helper.highlightWebElemets(driver, login);
		login.click();
		

		
	}
	

}
