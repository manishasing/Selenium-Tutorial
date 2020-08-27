package handleUntrustedCertificate;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

public class HandleSecureCertificate {
	
	//Not running correct but it does not give any error msg and test case paas
	@Test
	public void CertificateHandle() throws InterruptedException {
		
		DesiredCapabilities cap=new DesiredCapabilities();
		
		cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Setup\\Selenium Driver\\Chrome Driver\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver(cap);
		
		driver.manage().window().maximize();
		
		driver.get("https://www.cacert.org/");
		
		Thread.sleep(5000);
		
	}

}
