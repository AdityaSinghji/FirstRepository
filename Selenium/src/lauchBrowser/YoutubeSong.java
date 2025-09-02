package lauchBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class YoutubeSong {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.get("https://www.youtube.com");
		driver.findElement(By.xpath("//input[@ class=\"ytSearchboxComponentInput yt-searchbox-input title\"]")).sendKeys("ahe nila saila indresh upadhyay");
		driver.findElement(By.xpath("//button[@ class=\"ytSearchboxComponentSearchButton\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//yt-formatted-string[text()= 'Ahe Nila Saila - Bhakt Salbeg - Pujya Shri Indresh Ji Maharaj @BhaktiPath']")).click();		
	}

}
