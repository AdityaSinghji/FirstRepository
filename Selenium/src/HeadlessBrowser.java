import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessBrowser 
{

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--headless");//for Chrome
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver= new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		System.out.println("Test");
		Thread.sleep(2000);
		driver.quit();
	}

}
