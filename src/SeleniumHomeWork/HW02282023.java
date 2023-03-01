package SeleniumHomeWork.HomeWork02282023;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW02282023 {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver");

        WebDriver driver=new ChromeDriver();

        driver.get("http://practice.syntaxtechs.net/basic-first-form-demo.php");
        driver.findElement(By.id("user-message")).sendKeys("How are you");
        driver.findElement(By.xpath("//button[@type='button']")).click();
        driver.findElement(By.id("sum1")).sendKeys("300");
        driver.findElement(By.id("sum2")).sendKeys("200");
        driver.findElement(By.xpath("//button[text()='Get Total']")).click();
        WebElement totalText=driver.findElement(By.xpath("//span[@id='displayvalue']"));
        String getTotal=totalText.getText();
        System.out.println("Get total is " + totalText.getText());


    }
}
