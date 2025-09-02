package testNgAssertion;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class AssertionNotEqualsMethod {

	public static void main(String[] args)
	{
		String exp = "Facebook";
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://facebook.com");
		String act = driver.getTitle();
		Assert.assertNotEquals(act, exp);
		driver.quit();
	}

}
