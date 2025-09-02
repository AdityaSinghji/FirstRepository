package lauchBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebook0407 
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("file:///C:/Users/as454/OneDrive/Desktop/Selenium%20Files/Facebook1.html");
		WebElement link = driver.findElement(By.tagName("a"));
		WebElement usndummy= driver.findElement(By.id("i1"));
		usndummy.sendKeys("Admin");
		
		driver.findElement(By.id("i2")).sendKeys("Admin@1234");
		
		Thread.sleep(2000);
		link.click();
		
		driver.findElement(By.id("email")).sendKeys("Admin");
		driver.findElement(By.id("pass")).sendKeys("Admin@1234");
		driver.findElement(By.name("login")).click();
		
		
		
		
		
	}

}
