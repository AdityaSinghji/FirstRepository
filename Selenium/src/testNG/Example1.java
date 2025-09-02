package testNG;

import org.testng.annotations.Test;

public class Example1
{
	@Test()
	public void functional()
	{
		System.out.println("Functional");
	}
	
	@Test(dependsOnMethods = "functional")
	public void sanity()
	{
		System.out.println("Sanity");
	}
	
	@Test()
	public void regression()
	{
		System.out.println("Regression");
	}
	
}
