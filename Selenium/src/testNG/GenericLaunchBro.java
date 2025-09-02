package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class GenericLaunchBro
{
	WebDriver driver;
	@BeforeMethod
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://facebook.com");
	}
	
	@AfterMethod
	public void tearDown() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.close();
	}

}
