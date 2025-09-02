package testNgParallelExecution;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class ParallelExe
{
	public WebDriver driver;
	@Parameters("browser")
	@BeforeMethod
	public void setUp(String browser)
	{
		switch(browser)
		{
		case "Chrome":	System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
						driver = new ChromeDriver();
						
		case "FireFox":	System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
						driver = new FirefoxDriver();
		}
		
		driver.get("https://facebook.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	
	@AfterMethod
	public void tearDown() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.close();
	}
}
