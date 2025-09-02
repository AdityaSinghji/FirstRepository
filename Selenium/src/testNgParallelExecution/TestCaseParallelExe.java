package testNgParallelExecution;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TestCaseParallelExe extends ParallelExe
{
	@Test
	public void test()
	{
		driver.findElement(By.id("email")).sendKeys("Admin");
		driver.findElement(By.id("pass")).sendKeys("Admin@123");
	}
}
