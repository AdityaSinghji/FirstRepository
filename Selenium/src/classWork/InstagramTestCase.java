package classWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InstagramTestCase
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/?flo=true");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@aria-label=\"Phone number, username, or email\"]")).sendKeys("ad.ityasingh2331");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@aria-label=\"Password\"]")).sendKeys("Aditya@1");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='Log in']")).click();
		Thread.sleep(8000);
		driver.findElement(By.xpath("//span[@aria-describedby=\"_r_3_\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder=\"Search\"]")).sendKeys("Narendra Modi");
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//div[@class=\"x9f619 x1ja2u2z x78zum5 x1n2onr6 x1iyjqo2 xs83m0k xeuugli x1qughib x6s0dn4 x1a02dak x1q0g3np xdl72j9\"])[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@ class=\"_ap3a _aaco _aacw _aad6 _aade\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[@href=\"#\" and @ tabindex=\"0\"])[5]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[.='Log out'])[1]")).click();
		//driver.quit();

		

	}

}
