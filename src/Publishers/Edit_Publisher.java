package Publishers;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class Edit_Publisher 
{
		static 
		{
			System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		}
		
		public static void main(String[] Mk) throws InterruptedException
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
				Thread.sleep(2000);
				
				driver.findElement(By.xpath("//div/div/div/nb-sidebar/div/div/nb-menu/ul/li[4]/a")).click();
						Thread.sleep(2000);
						String tit = driver.getTitle();
						System.out.println(tit);
						Thread.sleep(1000);
				
						/*** Click on Menue to Edit the Publisher***/
				driver.findElement(By.xpath("//div/div/div/div/nb-layout-column/ngx-publishers/div/div/nb-card/nb-card-body/nb-card-body/table/tbody/tr[7]/td[2]/app-action-buttons/button")).click();
				Thread.sleep(500);
				
				/***  Select Edit  ***/
				driver.findElement(By.xpath("//nb-context-menu/nb-menu/ul/li[1]/a")).click();
				Thread.sleep(500);
				
				driver.findElement(By.id("publisherName")).clear(); Thread.sleep(500);
				driver.findElement(By.id("publisherName")).sendKeys("Publisher Edit In Auto");
				
				driver.findElement(By.xpath("//div/button[2]")).click();
		
			driver.quit();
			}

}
