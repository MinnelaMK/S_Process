package Subject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Create_Subject 
{
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	
	public static void main(String[] args)throws InterruptedException
	{
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
		
		driver.findElement(By.xpath("//div[1]/div/div/div/div/nb-layout-column/ngx-subjects/div/div/nb-card/nb-card-header/div")).click();

		Thread.sleep(500);
		driver.findElement(By.id("subjectName")).sendKeys("Test Subject Automate");
		Thread.sleep(500);
		
		driver.findElement(By.xpath("//div/mat-grid-tile[5]/div")).click();
		driver.findElement(By.xpath("//nb-dialog-container/form/nb-card/nb-card-footer/div/button[2]")).click();
		Thread.sleep(500); 
		
		/*WebElement M = driver.findElement(By.tagName("img"));
		String K = M.getAttribute("alt");
		System.out.println("Where the Sebject Creation " + K);
		*/
		
		
		driver.close();
	}

}
