package Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DriverManager {
    public static WebDriver driver;
    public static void getDriver() throws InterruptedException {
        if (driver==null)
        {
            System.setProperty("webdriver.chrome.driver","C:\\chormedriver.old\\chromedriver.exe");
            driver= new ChromeDriver();
            driver.manage().window().maximize();
            Thread.sleep(300);
            driver.get("https://admin-demo.nopcommerce.com/login");

        }

    }

    public static void quitDriver()
    {
        if (driver!=null)
        {
            driver.quit();
            driver=null;
        }
    }

}
