package popups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopup 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demoapps.qspiders.com/ui/fileUpload?sublist=0");
		WebElement element = driver.findElement(By.id("resume"));
		element.sendKeys("C:\\Users\\as454\\OneDrive\\Desktop\\TotalCollectrTestCases.pdf");
	}

}
