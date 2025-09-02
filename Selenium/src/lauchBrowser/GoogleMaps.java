package lauchBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleMaps
{

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.com/maps");
		driver.findElement(By.id("searchboxinput")).sendKeys("Qspiders kolkata");
		driver.findElement(By.xpath("//button[@ id=\"searchbox-searchbutton\" ]")).click();
		driver.findElement(By.xpath("//a[@ class=\"hfpxzc\" and @aria-label=\"QSpiders | JSpiders | PySpiders Kolkata\" ]")).click();
	}

}
