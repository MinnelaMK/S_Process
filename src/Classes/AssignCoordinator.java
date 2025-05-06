package Classes;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignCoordinator 
{

	public static void main(String[] Assigning /*Coordinator to the*/ ) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://tabdev.schoolcom.in/sprocess/#/auth/login");
		driver.findElement(By.name("email")).sendKeys("superadmin@schoolcom.in");
		driver.findElement(By.name("password")).sendKeys("mysj97ez");
		driver.findElement(By.xpath("//div[1]/div/div/div/div/nb-layout-column/nb-card/nb-card-body/nb-auth-block/app-login/div/form/div[3]/nb-select/button")).click();
		driver.findElement(By.id("nb-option-0")).click();
		
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[1]/div/div/div/div/nb-layout-column/nb-card/nb-card-body/nb-auth-block/app-login/div/form/div[5]/button")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@title='Classes']")).click();
		Thread.sleep(1000);
		
		
		driver.findElement(By.xpath("//div[1]/div/div/div/div/nb-layout-column/ngx-classes/div/div/nb-card/nb-card-body/table/tbody/tr[15]/td[2]/div/div/span[2]/nb-icon")).click();
		Thread.sleep(1000);
		
		//driver.findElement(By.xpath("//nb-dialog-container/form/nb-card/nb-card-body/nb-select/button/nb-icon/svg")).click();
		
		driver.findElement(By.name("teachers")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.id("nb-option-6")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div/button[2]")).click();  // **** Click on Assign
		
		
		//driver.findElement(By.xpath("//nb-dialog-container/form/nb-card/nb-card-header/button")).click(); // **** Click on Cancel
		
		
		Thread.sleep(1000);
		driver.close();
	}

}
