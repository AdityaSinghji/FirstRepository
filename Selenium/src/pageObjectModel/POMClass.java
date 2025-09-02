package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POMClass
{

	//Declaration
	
			@FindBy(id="email")
			private WebElement usn;
			
			@FindBy(id="pass")
			private WebElement psw;
			
			@FindBy(id="login")
			private WebElement loginBtn;
			
	//Initialization
			
			public POMClass(WebDriver driver)
			{
				PageFactory.initElements(driver, this);
			}
			
	//Utilization
			
			public void enterUsn()
			{
				usn.sendKeys("Admin");
			}
			
			public void enterPsw()
			{
				psw.sendKeys("Admin@123");
			}
			
			public void clickLogin()
			{
				loginBtn.click();
			}
}
