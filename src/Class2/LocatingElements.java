package Class2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingElements {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver");

        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com");

        // send the username

        driver.findElement(By.id("email")).sendKeys("tamer");
    // send the password
        driver.findElement(By.name("pass")).sendKeys("abracadabra");
        //  click on the button create new account
        driver.findElement(By.linkText("Create new account")).click();

        //click on forgotten password
        driver.findElement(By.partialLinkText("password?")).click();


         driver.quit();
    }
}
