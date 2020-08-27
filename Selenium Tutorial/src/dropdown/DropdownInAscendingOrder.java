package dropdown;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class DropdownInAscendingOrder {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Setup\\Selenium Driver\\Chrome Driver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://stgcrm.ipsfoundation.org/site/login");
		driver.findElement(By.xpath("//input[@id='loginform-username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@id='loginform-password']")).sendKeys("CRM@1234");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.linkText("Farmer")).click();
		
		
		/* Incomplete task*/
		
/*
		WebElement village=driver.findElement(By.xpath("//select[@name='BeneficiarySearch[village_id]']"));
		
		Select vill=new Select(village);
		
		//storing all village in another list
		List actualList=new ArrayList();
		
		//getting all village list 
		List<WebElement> allvillList=vill.getOptions();
		allvillList.remove(0);
		//getting size of village
		int villageSize=allvillList.size();
		System.out.println("Village size is:"+villageSize);
		
		for(WebElement ele:allvillList) {
			
			String villagename=ele.getText();
			actualList.add(villagename);
			
			
//			System.out.println("Village name from dropdown are:"+villagename);
		}
//		System.out.println(actualList);


		List temp=new ArrayList();
		temp.addAll(actualList);
		
//		System.out.println(temp);
		
		//Sort the list in Ascending order by default
//		Collections.sort(temp);
		
//		FOr Descending
//		Collections.sort(temp,Collections.reverseOrder()); 
		
	Assert.assertTrue(actualList.equals(temp)); 
	System.out.print("Passed");
		*/
		
		
		ArrayList<String> obtainedList = new ArrayList<>(); 
		List<WebElement> elementList= driver.findElements(By.xpath("//select[@name='BeneficiarySearch[village_id]']"));
		for(WebElement we:elementList){
		   obtainedList.add(we.getText());
		}
		
		System.out.println("org:"+obtainedList);
		System.out.println("org size:"+obtainedList.size());
		
		ArrayList<String> sortedList = new ArrayList<>();   
		for(String s:obtainedList){
		sortedList.add(s);
		}
		
		System.out.println("sort:"+sortedList);
		System.out.println("sort size:"+sortedList.size());
		
		Collections.sort(sortedList);
		Assert.assertTrue(sortedList.equals(obtainedList));
		
		
	

	}

}
