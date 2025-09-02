package Dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookApplication {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/r.php?entry_point=login");
		WebElement ele = driver.findElement(By.id("month"));
		Select s= new Select(ele);
		List<WebElement> options= s.getOptions();
		int count= options.size();
		Thread.sleep(1000);
		for(int i=count-1;i>=0;i--)
		{
			System.out.println(options.get(i).getText());
			Thread.sleep(500);
		}
		
	}

}
