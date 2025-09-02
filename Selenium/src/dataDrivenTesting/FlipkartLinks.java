package dataDrivenTesting;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartLinks
{

	public static void main(String[] args) throws IOException
	{
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		List<WebElement> eles = driver.findElements(By.xpath("//a"));
		FileInputStream fis= new FileInputStream("./Excel/DataDriven.xlsx");
		
		XSSFWorkbook book = new XSSFWorkbook(fis);
		XSSFSheet sheet = book.createSheet("Flipkart Links");
		
		for(int i=0;i<eles.size();i++)
		{
			WebElement ele = eles.get(i);
			String url = ele.getAttribute("href");
			XSSFRow row = sheet.createRow(i);
			XSSFCell cell = row.createCell(0);
			cell.setCellValue(url);
		}
		
		FileOutputStream fos= new FileOutputStream("./Excel/DataDriven.xlsx");
		book.write(fos);
		book.close();
		fis.close();
		fos.close();
		driver.quit();
		
		
	}

}
