package Subject;

import java.io.IOException;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class Add_Subject  
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static WebDriver driver;

//	@BeforeClass
//public void Open()
//{
//		Reporter.log("Open", true);
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		
//}
//
//
//@AfterClass
//	
//	public void close()
//	{
//		Reporter.log("close",true);
//		driver.close();
//		
//	}
//	
	
@BeforeMethod
	
	public void Before() 
	{
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://tabdev.schoolcom.in/sprocess/#/auth/login");
		driver.findElement(By.name("email")).sendKeys("superadmin@schoolcom.in");
		driver.findElement(By.name("password")).sendKeys("mysj97ez");
		driver.findElement(By.xpath("//div[1]/div/div/div/div/nb-layout-column/nb-card/nb-card-body/nb-auth-block/app-login/div/form/div[3]/nb-select/button")).click();
		driver.findElement(By.id("nb-option-0")).click();
		driver.findElement(By.xpath("//div[1]/div/div/div/div/nb-layout-column/nb-card/nb-card-body/nb-auth-block/app-login/div/form/div[5]/button")).click();
		

	}
	
	@AfterMethod
	
	public void After()throws InterruptedException
	{
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//div/div/div/nb-sidebar/div/div/nb-menu/ul/li[3]/a")).click();
		Thread.sleep(2000);
		String tit = driver.getTitle();
		System.out.println(tit);
		Thread.sleep(1000);


		driver.findElement(By.xpath("//div[1]/div/div/div/div/nb-layout-column/ngx-subjects/div/div/nb-card/nb-card-header/div")).click();
		
		
	}
	
	
}
