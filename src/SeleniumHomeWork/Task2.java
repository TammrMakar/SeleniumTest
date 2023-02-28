package SeleniumHomeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver");
        WebDriver driver=new ChromeDriver();

        driver.get("https://www.facebook.com");
        driver.manage().window().maximize();
        driver.findElement(By.linkText("Create new account")).click();
        Thread.sleep(3000);
        driver.findElement(By.name("firstname")).sendKeys("Tammr");
        driver.findElement(By.name("lastname")).sendKeys("makar");
        driver.findElement(By.name("reg_email__")).sendKeys("tamer@yahoo.com");
        driver.findElement(By.name("reg_email_confirmation__")).sendKeys("tamer@yahoo.com");
        driver.findElement(By.id("password_step_input")).sendKeys("123456789");
        driver.findElement(By.id("month")).sendKeys("june");
        driver.findElement(By.id("day")).sendKeys("25");
        driver.findElement(By.id("year")).sendKeys("1984");
        driver.findElement(By.xpath("//input[@value='2']")).click();
        driver.findElement(By.name("websubmit")).click();
        driver.findElement(By.className("_8idr img")).click();
        Thread.sleep(5000);
        driver.quit();

    }
}
