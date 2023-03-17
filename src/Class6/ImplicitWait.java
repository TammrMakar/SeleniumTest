package Class6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ImplicitWait {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver");

        //create an instance of WebDriver
        WebDriver driver = new ChromeDriver();

        //max the window
        driver.manage().window().maximize();

         //implicit wait
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        //goto facebook.com
        driver.get("https://www.facebook.com/");
                driver.findElement(By.linkText("Create new account")).click();
        //send your name
        driver.findElement(By.name("firstname")).sendKeys("abracadabra");


    }
}

