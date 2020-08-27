package dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleBootstrapDropdown {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Setup\\Selenium Driver\\Chrome Driver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
/*		Example to Handle bootstrap Dropdown  (line 20-42) */
		
 
		driver.get("https://www.w3schools.com/bootstrap/bootstrap_dropdowns.asp");
		
		driver.findElement(By.id("menu1")).click();
		
		List<WebElement> DropdownList=driver.findElements(By.xpath("//ul[@class='dropdown-menu test' and @aria-labelledby='menu1']//li/a"));
	
		
		for(WebElement ele:DropdownList) {
			
			String innerHTML=ele.getAttribute("innerHTML");
			
			System.out.println("List from dropdown are:"+innerHTML);
		}
		
/*     	Another way of for loop
		for(int i=0;i<DropdownList.size();i++) {
			
			WebElement element=DropdownList.get(i);
			
			String innerHTML=element.getAttribute("innerHTML");
			System.out.println("List from dropdown are:"+innerHTML);
				
		}
	*/
		
	/* Handling bootstrap dropdown (Line 47-65) */	
		
		driver.get("https://stgrishta.dhwaniris.in/index.php/users/login");
		driver.findElement(By.xpath("//input[@id='users-user_name']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@id='loginform-password']")).sendKeys("admin@rishta");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.linkText("User")).click();
		
		List<WebElement> userList=driver.findElements(By.xpath("//ul[@id='w6']//li/a"));
		
		for(WebElement element:userList) {
			
			String innerHTML=element.getAttribute("innerHTML");
			
			if(innerHTML.contentEquals("User Level")) {
				element.click();
			}
			
			
			System.out.println("UserList is:"+innerHTML);
		}
		
	
	
	}

}
