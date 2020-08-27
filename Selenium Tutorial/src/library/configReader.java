package library;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class configReader {
	
	Properties pro;
	
	//constructor used to initialize data
	public configReader() {
		
		try {
			
			File src=new File("./Configuration/Config.property");
			
			FileInputStream fis=new FileInputStream(src);
			
			//Properties class is use to read config file
			pro=new Properties();
			
			pro.load(fis);
			
		} catch (Exception e) {
			
			System.out.println("Exception is"+e.getMessage());
		} 
		
	}
	
	public String getChromePath() {
		
		String path=pro.getProperty("ChromeDriver");
		
		return path;
	}
	
	public String getUrl() {
				
		return pro.getProperty("URL");
		
		
	}

}
