package pageObjectModel;

import org.testng.annotations.Test;

public class TestCase extends BrowserLaunch
{
	@Test
	public void test()
	{
		POMClass p = new POMClass(driver);
		
		p.enterUsn();
		p.enterPsw();
		p.clickLogin();
	}
	
	
	
}
