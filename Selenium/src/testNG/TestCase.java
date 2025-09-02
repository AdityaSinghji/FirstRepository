package testNG;

import org.testng.annotations.Test;

public class TestCase extends GenericLaunchBro
{
	@Test
	
	public void fetchUrl()
	{
		System.out.println(driver.getCurrentUrl());
	}
	
	@Test
	public void fetchTitle()
	{
		System.out.println(driver.getTitle());
	}
	
	@Test
	public void fetchPageSource()
	{
		System.out.println(driver.getPageSource());
	}
}
