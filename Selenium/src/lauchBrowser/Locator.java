package lauchBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("file:///C:/Users/as454/OneDrive/Desktop/dummypage.html");
		WebElement link = driver.findElement(By.tagName("a"));
		Thread.sleep(2000);
		link.click();	
		driver.quit();		
	}

}
