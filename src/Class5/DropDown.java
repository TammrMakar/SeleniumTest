package Class5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class DropDwon {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver");

        WebDriver driver = new ChromeDriver();

        // go to syntaxProjects.com
        driver.get("http://practice.syntaxtechs.net/basic-select-dropdown-demo.php");


    }
}
