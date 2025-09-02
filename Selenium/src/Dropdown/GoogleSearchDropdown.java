package Dropdown;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class GoogleSearchDropdown {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//div[@jscontroller=\"HCSvae\"]//promo-button-text)[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//textarea[@ jsname=\"yZiJbe\"]")).sendKeys("Selenium");
		List<WebElement> lw = driver.findElements(By.xpath("//span[text()='selenium']"));
		Thread.sleep(1000);
		ArrayList<String> ar= new ArrayList<String>();
		
		for(int i=1;i<=lw.size();i++) 
		{
			System.out.println(driver.findElement(By.xpath("(//span[text()='selenium'])[i]")).getText());
			Thread.sleep(500);
		}
		
		driver.quit();
	}

}
