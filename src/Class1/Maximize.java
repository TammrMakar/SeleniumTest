package Class1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Maximize {
    public static void main(String[] args) {
//     connect to the webdriver
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver");
//    create an instance of webdriver
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com");

        // maximize the window
        driver.manage().window().maximize();
        // full screen
        driver.manage().window().fullscreen();
        //close
        driver.close();
    }
}
