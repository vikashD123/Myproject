package DataAndExcel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadingEx {
	
	@Test(enabled=false)
	public void verifyData() throws Exception {
		
		File src=new File("./Excel/Data.xlsx");
		
		FileInputStream fis=new FileInputStream(src);
		
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		
		XSSFSheet sheet=wb.getSheet("wordpress");
		
		String value1=sheet.getRow(0).getCell(0).getStringCellValue();
		
		System.out.println(value1);
		
		String value2=sheet.getRow(0).getCell(1).getStringCellValue();
		
		System.out.println(value2);
		
		wb.close();
		
		
	}
	@Test
	public void writingdata() throws IOException {
		
		File src=new File("./Excel/Data.xlsx");
		
		FileInputStream fis=new FileInputStream(src);
		
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		
		XSSFSheet sheet=wb.getSheet("wordpess");
		
		sheet.getRow(2).createCell(2).setCellValue("Lucky");
		
		sheet.getRow(3).createCell(2).setCellValue("Munna");
		
		FileOutputStream fout=new FileOutputStream(src);
		
		wb.write(fout);
		
		
		
		
		
	}

}
