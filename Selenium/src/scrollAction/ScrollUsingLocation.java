package scrollAction;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollUsingLocation
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.selenium.dev");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		WebElement ele= driver.findElement(By.xpath("//h2[text()='Donate to Selenium']"));
		Point loc= ele.getLocation();
		int x= loc.getX();
		int y= loc.getY();
		
		js.executeScript("window.scrollBy("+x+","+y+")");
		
		Thread.sleep(3000);
		
		driver.quit();
	}

}
