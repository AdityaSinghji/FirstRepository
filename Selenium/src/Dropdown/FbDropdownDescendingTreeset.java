package Dropdown;

import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class FbDropdownDescendingTreeset {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/r.php?entry_point=login");
		WebElement ele = driver.findElement(By.id("month"));
		Select s= new Select(ele);
		List<WebElement> options= s.getOptions();
		TreeSet<String> tr = new TreeSet<String>(Collections.reverseOrder());
		
		for(WebElement wb: options)
		{
			String txt = wb.getText();
			tr.add(txt);
		}
		
		for(String str: tr)
		{
			System.out.println(str);
			Thread.sleep(500);
		}
	}

}
