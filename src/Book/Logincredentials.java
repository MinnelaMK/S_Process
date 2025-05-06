package Book;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Logincredentials 
{
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args)throws InterruptedException
	{
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://tabdev.schoolcom.in/sprocess/#/auth/login");
		driver.findElement(By.name("email")).sendKeys("superadmin@schoolcom.in");
		Thread.sleep(1000);
		
		driver.findElement(By.name("password")).sendKeys("mysj97ez");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//div[1]/div/div/div/div/nb-layout-column/nb-card/nb-card-body/nb-auth-block/app-login/div/form/div[3]/nb-select/button")).click();
		driver.findElement(By.id("nb-option-0")).click();
		
		//Select drpRole = new Select(driver.findElement(By.name("Role")));
		//drpRole.selectByVisibleText("Super Admin");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[1]/div/div/div/div/nb-layout-column/nb-card/nb-card-body/nb-auth-block/app-login/div/form/div[5]/button")).click();
		
		System.out.println(driver.getTitle()+ " Test Successfuly ");
		Thread.sleep(5000);
		
		driver.quit();
		

	}

}
