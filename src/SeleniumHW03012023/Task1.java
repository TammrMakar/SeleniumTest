package SeleniumHW03012023;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");

        WebDriver driver=new ChromeDriver();
        driver.get("http://practice.syntaxtechs.net/basic-checkbox-demo.php");
        driver.manage().window().maximize();

        WebElement checbox=driver.findElement(By.cssSelector("input[type='checkbox']"));
        boolean isSelectedBox= checbox.isSelected();
        System.out.println("the radio check box is selected "+isSelectedBox);
        if (!isSelectedBox){
            checbox.click();
        }
        isSelectedBox= checbox.isSelected();
        System.out.println("the status of selection is "+isSelectedBox);


    }
}
