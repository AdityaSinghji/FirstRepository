package screenShot;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class TakingScreenshot
{

	public static void main(String[] args) throws IOException
	{
		Date d = new Date();
		String d1= d.toString().replace(":", "_");
		
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		TakesScreenshot ts = (TakesScreenshot) driver;
		
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File perm = new File("./DefectsFound/"+d1+"D1.png");
		
		FileHandler.copy(temp, perm);
				
				
	}

}
