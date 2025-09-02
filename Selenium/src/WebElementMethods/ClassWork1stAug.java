package WebElementMethods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassWork1stAug
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("C:/Users/as454/OneDrive/Desktop/checkboxselenium.html");
		
		List<WebElement> eles = driver.findElements(By.xpath("//input"));
		int count = eles.size();
		
		for( int i=0;i<count;i++)
			eles.get(i).click();
		
		
		Thread.sleep(2000);
		
		for(int j=count-1;j>=0;j--)
			eles.get(j).click();
		
		driver.quit();
		
	}

}
