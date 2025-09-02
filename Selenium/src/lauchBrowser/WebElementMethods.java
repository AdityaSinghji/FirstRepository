package lauchBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebElementMethods 
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("https://www.facebook.com/");
		WebElement e =driver.findElement(By.id("email"));
		e.sendKeys("Admin");
		Thread.sleep(1000);
		e.clear();
		System.out.println(e.isDisplayed());
		System.out.println(e.isEnabled());	
	}

}
