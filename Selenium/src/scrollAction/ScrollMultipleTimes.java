package scrollAction;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollMultipleTimes
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.selenium.dev");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		for(int i=0;i<=8;i++)
		{
			Thread.sleep(1000);
			js.executeScript("window.scrollBy(0,200)");
		}
		
		for(int i=0;i<=8;i++)
		{
			Thread.sleep(1000);
			js.executeScript("window.scrollBy(0,-200)");
		}
	}

}
