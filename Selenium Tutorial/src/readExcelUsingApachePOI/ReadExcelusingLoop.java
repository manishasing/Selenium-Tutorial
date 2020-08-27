package readExcelUsingApachePOI;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadExcelusingLoop {
	
	@Test
	public void readExcelFile() throws Exception {
		
		File src=new File("C:\\Manisha TestData\\loginExcel.xlsx");
		
		FileInputStream fis=new FileInputStream(src);
		
		//complete workbook load
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		
		XSSFSheet sheet1=wb.getSheetAt(0);
		
		int row_count=sheet1.getLastRowNum();
		
		System.out.println("Total rows is :"+row_count);
		
		for(int i=1;i<row_count+1;i++) {
			
			String data0=sheet1.getRow(i).getCell(0).getStringCellValue();
			System.out.println("data from excel is :"+data0);

		}

		wb.close();
		
		
		
		
		
	}

}
