package mouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropAction {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Thread.sleep(1000);

		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui/dragDrop/dragToCorrect?sublist=2");
		Thread.sleep(3000);
		Actions act = new Actions(driver);

		WebElement mobele1= driver.findElement(By.xpath("//div[text()='Mobile Charger']"));
		WebElement mobdes1 = driver.findElement(By.xpath("(//section[@ class=\"w-[50%] flex flex-col gap-4 shadow-md rounded-md\"]/div)[1]"));
		Thread.sleep(1000);

		WebElement lapele1= driver.findElement(By.xpath("//div[text()='Laptop Charger']"));
		WebElement lapdes1= driver.findElement(By.xpath("(//section[@ class=\"w-[50%] flex flex-col gap-4 shadow-md rounded-md\"]/div)[2]"));
		Thread.sleep(1000);

		WebElement mobele2= driver.findElement(By.xpath("//div[text()='Mobile Cover']"));
		WebElement mobdes2 = driver.findElement(By.xpath("(//section[@ class=\"w-[50%] flex flex-col gap-4 shadow-md rounded-md\"]/div)[1]"));
		Thread.sleep(1000);

		WebElement lapele2= driver.findElement(By.xpath("//div[text()='Laptop Cover']"));
		WebElement lapdes2= driver.findElement(By.xpath("(//section[@ class=\"w-[50%] flex flex-col gap-4 shadow-md rounded-md\"]/div)[2]"));
		Thread.sleep(2000);
		
		act.dragAndDrop(mobele1, mobdes1).perform();
		Thread.sleep(2000);
		act.dragAndDrop(lapele1, lapdes1).perform();
		Thread.sleep(2000);
		act.dragAndDrop(mobele2, mobdes2).perform();
		Thread.sleep(2000);
		act.dragAndDrop(lapele2, lapdes2).perform();
		Thread.sleep(2000);
		
		driver.quit();
		
	}

}
