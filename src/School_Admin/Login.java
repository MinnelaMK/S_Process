package School_Admin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class Login 
{
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	@BeforeTest
	
	public static void main(String[] args) throws InterruptedException
	{
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://tabdev.schoolcom.in/sprocess/#/auth/login");
		driver.findElement(By.name("email")).sendKeys("achuthaacademy@gmail.com");
		Thread.sleep(1000);
		
		driver.findElement(By.name("password")).sendKeys("ed264ms7");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//div/form/div[3]/nb-select/button")).click();
		driver.findElement(By.id("nb-option-1")).click();
		
		//Select drpRole = new Select(driver.findElement(By.name("Role")));
		//drpRole.selectByVisibleText("Super Admin");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[5]/button")).click();
		
		System.out.println(driver.getTitle()+ " Test Successfuly ");
		Thread.sleep(2000);
		

	}


}
