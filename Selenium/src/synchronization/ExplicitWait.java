package synchronization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://facebook.com");
		WebDriverWait wait= new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.titleContains("Facebook"));
		driver.findElement(By.id("email")).sendKeys("Admin");
		driver.quit();
	}

}
