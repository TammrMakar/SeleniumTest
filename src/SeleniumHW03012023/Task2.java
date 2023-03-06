package SeleniumHomeWork03012023;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {
    public static void main(String[] args) throws InterruptedException {



        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");

        WebDriver driver=new ChromeDriver();
        driver.get("http://practice.syntaxtechs.net/basic-checkbox-demo.php");
        driver.manage().window().maximize();
        WebElement option1= driver.findElement(By.cssSelector("input[value='Option-1']"));
        option1.click();
        Thread.sleep(3000);
        boolean isSelectedoption= option1.isSelected();
        WebElement option3= driver.findElement(By.cssSelector("input[value='Option-3']"));
        boolean isEnabledoptin= option3.isEnabled();
        if (isEnabledoptin&&isSelectedoption) {
            option3.click();
        }
            isEnabledoptin=option3.isEnabled();
            System.out.println(isEnabledoptin);
            System.out.println(isSelectedoption);

            driver.close();
        }
    }

