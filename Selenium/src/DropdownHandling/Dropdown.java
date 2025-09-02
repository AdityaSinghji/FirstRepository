package DropdownHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("file:///C:/Users/as454/OneDrive/Desktop/dropdown.html");
		WebElement dd= driver.findElement(By.id("Fruits"));
		Select ss= new Select(dd);
		ss.selectByIndex(0);
		Thread.sleep(1000);
		ss.selectByValue("2");
		Thread.sleep(1000);
		ss.selectByVisibleText("Mango");
		Thread.sleep(1000);
		ss.deselectAll();
		
		driver.quit();
	}

}
