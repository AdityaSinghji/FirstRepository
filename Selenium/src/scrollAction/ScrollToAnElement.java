package scrollAction;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollToAnElement
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.selenium.dev");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Thread.sleep(2000);
		
		WebElement ele= driver.findElement(By.xpath("//h2[text()='Donate to Selenium']"));
		js.executeScript("arguments[0].scrollIntoView()", ele);
		
		Thread.sleep(2000);
		driver.quit();
		
	}

}
