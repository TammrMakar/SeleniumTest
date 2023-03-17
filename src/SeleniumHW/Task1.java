package SeleniumHW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
    public static void main(String[] args) throws InterruptedException {

       System.setProperty("webdriver.chrome.driver","Drivers/chromedriver");
        WebDriver webDriver=new ChromeDriver();

        webDriver.navigate().to("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");

        webDriver.findElement(By.id("customer.firstName")).sendKeys("Tammr");
        webDriver.findElement(By.id("customer.lastName")).sendKeys("Makar");
        webDriver.findElement(By.name("customer.address.street")).sendKeys("0000 xxxx xx");
        webDriver.findElement(By.name("customer.address.street")).sendKeys("Ginesville");
        webDriver.findElement(By.id("customer.address.street")).sendKeys("VA");
        webDriver.findElement(By.id("customer.address.street")).sendKeys("20155");
        webDriver.findElement(By.id("customer.phoneNumber")).sendKeys("5714699999");
        webDriver.findElement(By.id("customer.ssn")).sendKeys("222-33-4444");
        webDriver.findElement(By.id("customer.username")).sendKeys("Tammr");
        webDriver.findElement(By.id("customer.password")).sendKeys("ayhaga");
        webDriver.findElement(By.id("repeatedPassword")).sendKeys("ayhaga");
        webDriver.findElement(By.className("button")).click();

      Thread.sleep(3000);

       webDriver.close();

    }

}
