package Book;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Assign_Publisher 
{
	static WebDriver driver;
	
	@BeforeTest
	
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
		
									/*** Book Content Selected***/
		
		driver.findElement(By.xpath("//a[@title='Book Content']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//table/tbody/tr[15]/td[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div/div/nb-card/nb-card-body/table/tbody/tr[1]/td[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div/div/nb-card/nb-card-header/div/button")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div/nb-select/button")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("nb-option-6")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div/button[2]")).click();
		driver.navigate().back();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//div/div/nb-card/nb-card-body/table/tbody/tr[2]/td[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div/div/nb-card/nb-card-header/div/button")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div/nb-select/button")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("nb-option-18")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div/button[2]")).click();
		driver.navigate().back();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//div/div/nb-card/nb-card-body/table/tbody/tr[3]/td[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div/div/nb-card/nb-card-header/div/button")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div/nb-select/button")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("nb-option-25")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div/button[2]")).click();
		driver.navigate().back();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//div/div/nb-card/nb-card-body/table/tbody/tr[4]/td[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div/div/nb-card/nb-card-header/div/button")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div/nb-select/button")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("nb-option-32")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div/button[2]")).click();
		driver.navigate().back();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//div/div/nb-card/nb-card-body/table/tbody/tr[5]/td[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div/div/nb-card/nb-card-header/div/button")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div/nb-select/button")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("nb-option-39")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div/button[2]")).click();
		driver.navigate().back();
		Thread.sleep(1000);
		

		driver.quit();
		
		
	}
	

}
