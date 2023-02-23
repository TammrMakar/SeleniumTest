package Class2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebOrderTask2 {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");

        driver.manage().window().maximize();

        driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");

        driver.findElement(By.name("ctl00$MainContent$password")).sendKeys("test");

        driver.findElement(By.className("button")).click();

        // verify that the title is correct "web Orders"
        String title = driver.getTitle();
        System.out.println(title);
        if (title.equalsIgnoreCase("web Orders")){
            System.out.println("the title is correct ");
    }else {
            System.out.println("the title is incorrect");
        }
        //logout
        driver.findElement(By.linkText("Logout")).click();
         Thread.sleep(5000);
        driver.quit();
    }
}
