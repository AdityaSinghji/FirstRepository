package WebElementMethods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetElementsMethod
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com");
		List<WebElement> eles = driver.findElements(By.xpath("//a"));
		int count = eles.size();
		System.out.println("There are "+ count +" links present in the flipkart page");
		
		Thread.sleep(3000);
		
		for(int i=count-1;i>=0;i--)
		{
			WebElement ele = eles.get(i);
			System.out.println(i+1+". "+ele.getText());
		}
		
		driver.quit();
		
	}

}
