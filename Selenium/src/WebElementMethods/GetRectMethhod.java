package WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetRectMethhod {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.flipkart.com");
		WebElement ele= driver.findElement(By.xpath("//a[@title='Login']"));
		Rectangle r = ele.getRect();
		System.out.println("Height of the element is "+r.getHeight());
		System.out.println("Width of the element is "+r.getWidth());
		System.out.println("X-axis of the element is "+r.getX());
		System.out.println("Y-axis of the element is "+r.getY());

		driver.quit();
	}

}
