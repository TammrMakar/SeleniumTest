package Class4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

 class radioButtons2 {
    public static void main(String[] args) {
        //tell your project where the webdriver is located.
        //for mac users please do not use .exe with chromedriver
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver");

        //create an instance of WebDriver
        WebDriver driver = new ChromeDriver();
        //max the window
        driver.manage().window().maximize();
        //goto syntaxprojects.com
        driver.get("http://practice.syntaxtechs.net/basic-radiobutton-demo.php");
        //find all the age group radio buttons
        //the xpath here is common to all the webElements that have age group
        List<WebElement> radioBtns = driver.findElements(By.xpath("//input[@name='ageGroup']"));
        //iterate over the list to see the desired one
        for (WebElement radioBtn:radioBtns){
            String age=radioBtn.getAttribute("value");
            //if the value of the WebElement is 5-15 click on it
            if (age.equalsIgnoreCase("5 - 15")){
                radioBtn.click();
            }
        }
    }
}
