package Subject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Editsubject 
{
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException
	{
		// TODO Auto-generated method stub
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
		
		/*** Clicked on Subject Dashboard ***/
		driver.findElement(By.xpath("//div/div/div/nb-sidebar/div/div/nb-menu/ul/li[3]/a")).click();
		Thread.sleep(2000);
		
		String tit = driver.getTitle();
		System.out.println(tit);
		Thread.sleep(1000); 
		
		/*** Selecting Edit ***/
		driver.findElement(By.xpath("//div[1]/div/div/div/div/nb-layout-column/ngx-subjects/div/div/nb-card/nb-card-body/table/tbody/tr[12]/td[3]/app-action-buttons/button")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//nb-context-menu/nb-menu/ul/li[1]/a/span")).click();
		
		/***text Box Cleared Here ***/
		driver.findElement(By.id("subjectName")).clear(); 
		
		/*** Edited and Changed Subject Name as Auto Edit Hindi ***/
		driver.findElement(By.id("subjectName")).sendKeys("Auto Edit Hindi");
		Thread.sleep(500);
		driver.findElement(By.xpath("//div/mat-grid-tile[1]/div")).click();
		Thread.sleep(500);
		
		driver.findElement(By.xpath("//nb-dialog-container/form/nb-card/nb-card-footer/div/button[2]")).click();
		Thread.sleep(500);
		
		driver.close();
		
		
	}

}
