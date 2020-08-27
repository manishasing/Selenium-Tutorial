package ConfigurationDemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.testng.annotations.Test;

public class ReadConfigfileTest {
	
	//Show how to read config.property file
	@Test
	public void testConfig() throws Exception {
		
		File src=new File("./Configuration/Config.property");
		
		FileInputStream fis=new FileInputStream(src);
		
		//Properties class is use to read config file
		Properties pro=new Properties();
		
		pro.load(fis);
		
		String chromepath=pro.getProperty("ChromeDriver");
		
		System.out.println("chrome path is "+chromepath);
		
		
		
		
		
	}

}
