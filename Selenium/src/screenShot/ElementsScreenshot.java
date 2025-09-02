package screenShot;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ElementsScreenshot
{

	public static void main(String[] args) throws IOException
	{
		Date d = new Date();
		String d1= d.toString().replace(":", "_");
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com");
		WebElement ele = driver.findElement(By.xpath("//input[@ placeholder=\"Search for Products, Brands and More\"]"));
		File temp = ele.getScreenshotAs(OutputType.FILE);
		File perm = new File("./DefectsFound/"+d1+"D1.png");
		
		FileHandler.copy(temp, perm);
		
		driver.quit();
	}

}
