package Term;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Adding_Term_Schedule 
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
		
		driver.findElement(By.xpath("//div[1]/div/div/div/div/nb-layout-column/ngx-terms-schedule/div/div/nb-card/nb-card-body/table/tbody/tr[7]/td[1]")).click();
		Thread.sleep(100);
		driver.findElement(By.xpath("//div/button")).click();
		Thread.sleep(100);
		driver.findElement(By.id("termName")).sendKeys("Term Auto Schedule");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='Start Date']")).sendKeys("Jan 6, 2024");
		Thread.sleep(600);
		driver.findElement(By.name("End Date")).sendKeys("Apr 24,2024");
		Thread.sleep(200);
		driver.findElement(By.xpath("//div/button[2]")).click();
		Thread.sleep(100);
	}

}
