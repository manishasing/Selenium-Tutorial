package readExcelUsingApachePOI;

import org.testng.annotations.Test;

import library.ExceldataConfig;

public class ReadExcelusingexcelConfigUtility {
	
	@Test
	public void readExcelFile() throws Exception {
		
		ExceldataConfig excel=new ExceldataConfig("C:\\Manisha TestData\\loginExcel.xlsx\\");
		
		System.out.println(excel.getData(1, 0, 1));
		
	}

}
