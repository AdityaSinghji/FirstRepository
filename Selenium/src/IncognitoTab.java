import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class IncognitoTab {

	public static void main(String[] args) throws InterruptedException
	{
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--incognito");//for chrome
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver= new ChromeDriver(opt);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.quit();
		
		Thread.sleep(2000);
		FirefoxOptions opt1=new FirefoxOptions();
		opt1.addArguments("-private");
		System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
		WebDriver driver1= new FirefoxDriver(opt1);
		//driver1.quit();
		
	}

}
