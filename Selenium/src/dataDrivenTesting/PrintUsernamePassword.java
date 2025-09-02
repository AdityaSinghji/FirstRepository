package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class PrintUsernamePassword
{

	public static void main(String[] args) throws IOException, InterruptedException
	{
		FileInputStream fis = new FileInputStream("./Excel/TestData.xlsx");
		XSSFWorkbook book = new XSSFWorkbook(fis);
		XSSFSheet sheet = book.getSheet("Sheet1");
		
		int lastRow= sheet.getLastRowNum();
		
		for(int i=0;i<=lastRow;i++)
		{
			XSSFRow row= sheet.getRow(i);
			XSSFCell cell1= row.getCell(0);
			XSSFCell cell2= row.getCell(1);
			String usn= cell1.getStringCellValue();
			String pass= cell2.getStringCellValue();
			System.out.println((i+1)+"."+usn+"----------->"+pass);
			Thread.sleep(100);
		}
	}

}
