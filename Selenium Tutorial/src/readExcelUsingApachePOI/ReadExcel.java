package readExcelUsingApachePOI;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadExcel {
	
	@Test
	public void readExcelFile() throws Exception {
		
		File src=new File("C:\\Manisha TestData\\loginExcel.xlsx");
		
		FileInputStream fis=new FileInputStream(src);
		
		//complete workbook load
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		
		XSSFSheet sheet1=wb.getSheetAt(0);
		
//		String data0=sheet1.getRow(1).getCell(1).getStringCellValue();
		String data0=sheet1.getRow(2).getCell(0).getStringCellValue();
		String data1=sheet1.getRow(2).getCell(1).getStringCellValue();

		System.out.println("data from excel is :"+data0);

		System.out.println("data from excel is :"+data1);

		wb.close();
		
		
		
		
		
	}

}
