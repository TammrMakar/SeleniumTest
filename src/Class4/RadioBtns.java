package Class4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioBtns {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver");

        WebDriver driver=new ChromeDriver();
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
        driver.manage().window().maximize();

        driver.get("http://practice.syntaxtechs.net/basic-radiobutton-demo.php");

        // click on the radio button male
        WebElement maleBtn =driver.findElement(By.cssSelector("input[value='Male']"));
        //check if the radio button is enabled
        boolean isEnabledMale=maleBtn.isEnabled();
        System.out.println("the radio button male is enabled "+ isEnabledMale);

        // check if the radio button is Displayed
        boolean isDisplayedMale=maleBtn.isDisplayed();
        System.out.println("the radio button male is displayed "+isDisplayedMale);

        //check if the radio button is selected
        boolean isSelectedMale=maleBtn.isSelected();
        System.out.println("the radio button male is selected "+isSelectedMale);
        //if the radio button is not selected click on it
        if (!isSelectedMale){
            maleBtn.click();
        }
        //check if the radio button is selected after the click
        isSelectedMale=maleBtn.isSelected();
        System.out.println("the status of selection is "+isSelectedMale);
    }
}
