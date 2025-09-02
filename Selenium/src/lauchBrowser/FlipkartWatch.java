package lauchBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FlipkartWatch
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//input[@ type=\"text\"]")).sendKeys("Watches for men");
		driver.findElement(By.xpath("//button[@class=\"_2iLD__\"]")).click();
		driver.findElement(By.xpath("//a[text()='Wrist Watches']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Titan']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()='Strap Material']")).click();
		driver.findElement(By.xpath("//div[text()='Leather']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@ title=\"Gents Classique Sm Analog Watch  - For Men 1823SL07\"]")).click();	
	}

}
