package Mk;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Murali_Site
{
    static
    {
        System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
    }
    WebDriver driver;
    public static void main(String[] args)throws InterruptedException
    {
        WebDriver driver = new ChromeDriver();

        driver.get("https://minnelamuralikrisihnapersonal.blogspot.com");

        String title = driver.getTitle();

        System.out.println("The title of the web page is " + title);

        Thread.sleep(500);

        driver.quit();

    }
}
