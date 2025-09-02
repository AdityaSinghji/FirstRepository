package testNgAssertion;

import static org.testng.Assert.assertFalse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssertFalseMethod {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://facebook.com");
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.id("email"));
		assertFalse(ele.isDisplayed(), "Sorry, The Element is present!!!");
		
		driver.quit();
	}

}
