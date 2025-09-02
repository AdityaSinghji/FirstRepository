package Dropdown;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class FbDropdownDescending {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/r.php?entry_point=login");
		WebElement ele = driver.findElement(By.id("month"));
		Select s= new Select(ele);
		List<WebElement> options= s.getOptions();
		ArrayList<String> ar= new ArrayList<String>();
		for(WebElement w: options)
		{
			String txt = w.getText();
			ar.add(txt);
		}
		
		Collections.sort(ar,Collections.reverseOrder());
		
		for(String a: ar)
		{
			System.out.println(a);
			Thread.sleep(500);
		}
	}

}
