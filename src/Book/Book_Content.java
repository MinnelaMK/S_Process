package Book;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;


public class Book_Content 
{
	 
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	@BeforeTest
	
	public void test()throws InterruptedException
	
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
		
									/*** Book Content Selected***/
		
		driver.findElement(By.xpath("//a[@title='Book Content']")).click();
	
				Thread.sleep(2000);
//				String tit = driver.getTitle();
//				System.out.println(tit);
//				Thread.sleep(1000);
//				
		
		driver.quit();
	}
	
}
