package library;

import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Utility {

	public static void captureScreennshot(WebDriver driver,String screenshotName){
		try {
			TakesScreenshot ts=(TakesScreenshot)driver;
			
			File source=ts.getScreenshotAs(OutputType.FILE);
			
			FileUtils.copyFile(source, new File("./CapturedScreenshotsImages/"+screenshotName+".png"));
					
			System.out.println("Screenshot taken successfully");
		} catch (Exception e) {
			
			// "e.getMessage()" helps to print the exception
			System.out.println("Exception while taking a screenshot"+e.getMessage());
		}
	}
}
