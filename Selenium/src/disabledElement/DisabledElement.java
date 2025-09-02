package disabledElement;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DisabledElement {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("file:///C:/Users/as454/OneDrive/Desktop/disabled.html");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("document.getElementById('1').value='Admin'");//To enter the input
		Thread.sleep(1000);
		js.executeScript("document.getElementById('1').value=''");//To remove the input
		Thread.sleep(2000);
		
		WebElement ele = driver.findElement(By.xpath("//input[@ type='text']"));
		js.executeScript("arguments[0].value='Zero'", ele);
		
		Thread.sleep(2000);

		driver.quit();
		
		
	}

}
