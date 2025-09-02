package classWork;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScrollAndScreenshot
{

	public static void main(String[] args) throws InterruptedException, IOException
	{
		Date d= new Date();
		String d1= d.toString().replace(":", "_");
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,4800)");
		Thread.sleep(500);

		WebElement ele = driver.findElement(By.xpath("//span[@ class=\"a-button a-spacing-mini a-spacing-top-mini a-button-span2 a-button-primary\"]"));
		Thread.sleep(2000);
		
		if(ele.isDisplayed())
		{
			File temp = ele.getScreenshotAs(OutputType.FILE);
			File perm = new File("./DefectsFound/"+d1+"D1.png");
			FileHandler.copy(temp, perm);
		}
		
		Thread.sleep(3000);
		
		driver.quit();
	}

}
