package lauchBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CssSelector {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.get("https://www.youtube.com");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input[placeholder='Search']")).sendKeys("ABCD");
	}

}
