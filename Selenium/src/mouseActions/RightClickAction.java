package mouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickAction {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com");
		WebElement ele = driver.findElement(By.xpath("//span[text()='Mobiles & Tablets']"));
		Actions act = new Actions(driver);
		Thread.sleep(2000);
		act.contextClick(ele).perform();
		
		driver.quit();
	}

}
