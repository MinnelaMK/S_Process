package Term;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Delete_Term 
{
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] Mk)throws InterruptedException
	
	{

		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
									/*** Page Opened  ***/
		driver.get("http://tabdev.schoolcom.in/sprocess/#/auth/login");
		
									/*** Login Started ***/
		driver.findElement(By.name("email")).sendKeys("superadmin@schoolcom.in");
		driver.findElement(By.name("password")).sendKeys("mysj97ez");
		driver.findElement(By.xpath("//div[1]/div/div/div/div/nb-layout-column/nb-card/nb-card-body/nb-auth-block/app-login/div/form/div[3]/nb-select/button")).click();
		driver.findElement(By.id("nb-option-0")).click();
		driver.findElement(By.xpath("//div[1]/div/div/div/div/nb-layout-column/nb-card/nb-card-body/nb-auth-block/app-login/div/form/div[5]/button")).click();
				Thread.sleep(1000);
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
									/*** Term Selected***/
		
		driver.findElement(By.xpath("//a[@title='Term']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//tr[7]/td[2]/app-action-buttons/button")).click();
		Thread.sleep(1000);
		
		
		driver.findElement(By.xpath("//nb-context-menu/nb-menu/ul/li[2]/a")).click();
		Thread.sleep(100);
		driver.findElement(By.xpath("//div/button[2]")).click();
		Thread.sleep(100);
		driver.quit();
	}


}
