package WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetLocationMethod
{

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.flipkart.com");
		WebElement ele= driver.findElement(By.xpath("//a[@title='Login']"));
		Point loc= ele.getLocation();
		System.out.println(loc);
		driver.quit();
		int x= loc.getX();
		int y= loc.getY();
		System.out.println(x+" is the x-axis position and "+ y+" is the y-axis location");
		driver.quit();
	}

}
