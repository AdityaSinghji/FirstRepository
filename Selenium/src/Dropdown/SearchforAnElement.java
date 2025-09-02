package Dropdown;

import java.util.ArrayList;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class SearchforAnElement {

	public static void main(String[] args)
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
		
		System.out.println(ar);
		
		if(ar.contains("Aug"))
		{
			System.out.println("August is present");
		}
		
		else
			System.out.println("Not present");
	}

}
