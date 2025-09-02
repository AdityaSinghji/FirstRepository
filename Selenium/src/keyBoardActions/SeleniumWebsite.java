package keyBoardActions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SeleniumWebsite
{

	public static void main(String[] args) throws AWTException, InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Thread.sleep(3000);
		
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		driver.get("https://www.selenium.dev/downloads/");
		Actions act= new Actions(driver);
		Robot r= new Robot();
		Thread.sleep(2000);
		
		List<WebElement> ele = driver.findElements(By.xpath("//a[text()='API Docs']"));
		
		for(WebElement we: ele)
		{	
		act.contextClick(we).perform();
		r.keyPress(KeyEvent.VK_PAGE_DOWN);
		r.keyRelease(KeyEvent.VK_PAGE_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		}
		
		Thread.sleep(2000);
		
		driver.quit();
		
		
	}

}
