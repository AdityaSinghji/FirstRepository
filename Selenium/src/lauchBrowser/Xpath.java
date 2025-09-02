package lauchBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath
{

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		WebElement search=driver.findElement(By.xpath("//input[@ class='Pke_EE']"));
		search.sendKeys("Mobiles");
		WebElement searchbutton =driver.findElement(By.xpath("//button[@type='submit']"));
		searchbutton.click();
		WebElement firstoption =driver.findElement(By.xpath("//div[@ class='_75nlfW']"));
		firstoption.click();

	}

}
