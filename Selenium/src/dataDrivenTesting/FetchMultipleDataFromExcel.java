package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class FetchMultipleDataFromExcel
{

	public static void main(String[] args) throws IOException, InterruptedException
	{
		FileInputStream fis = new FileInputStream("./Excel/DataDriven.xlsx");
		XSSFWorkbook book = new XSSFWorkbook(fis);
		XSSFSheet sheet = book.getSheet("Flipkart Links");
		int lastRow= sheet.getLastRowNum();
		
		for(int i=0;i<=lastRow;i++)
		{
			XSSFRow row= sheet.getRow(i);
			XSSFCell cell= row.getCell(0);
			String value= cell.getStringCellValue();
			System.out.println((i+1)+"."+value);
			Thread.sleep(100);
		}
		
		book.close();
		fis.close();
	}

}
