package Classes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditClassname 
{
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://tabdev.schoolcom.in/sprocess/#/auth/login");
		driver.findElement(By.name("email")).sendKeys("superadmin@schoolcom.in");
		driver.findElement(By.name("password")).sendKeys("mysj97ez");
		driver.findElement(By.xpath("//div[1]/div/div/div/div/nb-layout-column/nb-card/nb-card-body/nb-auth-block/app-login/div/form/div[3]/nb-select/button")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("nb-option-0")).click();
		driver.findElement(By.xpath("//div[1]/div/div/div/div/nb-layout-column/nb-card/nb-card-body/nb-auth-block/app-login/div/form/div[5]/button")).click();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[@title='Classes']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[1]/div/div/div/div/nb-layout-column/ngx-classes/div/div/nb-card/nb-card-header/div")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("className")).sendKeys("Class Automation Test");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//nb-dialog-container/form/nb-card/nb-card-footer/div/button[2]")).click();
		Thread.sleep(2000);

		//  *****   Class Edit Method Starts  *****
		
		driver.findElement(By.xpath("//div/div/div/div/div/nb-layout-column/ngx-classes/div/div/nb-card/nb-card-body/table/tbody/tr[2]/td[6]/app-action-buttons/button")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//nb-context-menu/nb-menu/ul/li[1]/a")).click();
		Thread.sleep(500);
		driver.findElement(By.id("ClassName")).clear();
		Thread.sleep(2000);
		driver.findElement(By.id("ClassName")).sendKeys("Class Edit As Test");
		driver.findElement(By.xpath("//nb-dialog-container/form/nb-card/nb-card-footer/div/button[2]")).click();
		
		driver.close();

	}

}
