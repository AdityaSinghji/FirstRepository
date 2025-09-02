package popups;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitleOfMultipleTabsAndCloseParent
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui/browser?sublist=0");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[text()='view more'])[1]")).click();
		Set<String> wins = driver.getWindowHandles();
		String parent = driver.getWindowHandle();
		
		for(String win: wins)
		{
			System.out.println(driver.switchTo().window(win).getTitle());
			
			Thread.sleep(1000);
			
			if(win.equals(parent))
				driver.close();
		}
	}

}
