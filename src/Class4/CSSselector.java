package Class4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSselector {
    public static void main(String[] args) throws InterruptedException {



        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver");

        WebDriver driver=new ChromeDriver();
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
        driver.manage().window().maximize();

        driver.get("https://www.facebook.com/");

        // click on the button create new account using CSS selector
       WebElement createNewBtn= driver.findElement(By.cssSelector("a[data-testid ='open-registration-form-button']"));
       //click on the button
       createNewBtn.click();

       //put a sleep statement so that the browser can open up the window which contains the element

       Thread.sleep(2000);


       //fill in the first name
        WebElement firstname=driver.findElement(By.cssSelector("input[name='firstname']"));
        firstname.sendKeys("Tamer");




    }
}
