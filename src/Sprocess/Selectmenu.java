package Sprocess;

import java.awt.event.ActionEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Selectmenu 
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
		driver.findElement(By.id("nb-option-0")).click();
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//div[1]/div/div/div/div/nb-layout-column/nb-card/nb-card-body/nb-auth-block/app-login/div/form/div[5]/button")).click();
		
		//driver.findElement(By.xpath("//div[1]/div/nb-layout-header/nav/ngx-header/div[1]/div[1]/a[1]/")).click();
		
//		Actions action = new Actions(driver);
//		
//		action.sendKeys(Keys.TAB);
//		action.build().perform();
//		action.sendKeys(Keys.TAB);
//		action.build().perform();
//		action.sendKeys(Keys.TAB);
//		action.build().perform();
//		action.sendKeys(Keys.TAB);
//		action.build().perform();
//		action.sendKeys(Keys.TAB);
//		action.build().perform();
//		
		
		
		//System.out.println(action);
		
		//Thread.sleep(5000);
		
		//driver.quit();
		
		

	}

}
