package scrollAction;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollAction
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.selenium.dev");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,1000)");//scroll
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,-1000)");//go back to the initial point
		
		Thread.sleep(2000);
		driver.quit();
	}

}
