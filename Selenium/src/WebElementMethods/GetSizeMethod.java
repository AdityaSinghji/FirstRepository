package WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetSizeMethod {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.flipkart.com");
		WebElement ele= driver.findElement(By.xpath("//a[@title='Login']"));
		
		Dimension size = ele.getSize();
		System.out.println("Height of the element is "+ size.getHeight());
		System.out.println("Width of the element is "+ size.getWidth());
		driver.quit();
	}

}
