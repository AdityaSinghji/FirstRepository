package testNgAssertion;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

public class SoftAssertClass {

	public static void main(String[] args) throws InterruptedException
	{
		String str = "facebook";
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://facebook.com");
		Thread.sleep(2000);
		SoftAssert s = new SoftAssert();
		s.assertEquals(driver.getTitle(), str);
		
		System.out.println(driver.getCurrentUrl());
		driver.quit();
		s.assertAll();
	}

}
