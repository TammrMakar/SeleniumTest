package Class1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonWebsite {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver");

       WebDriver driver=new ChromeDriver();

       driver.get("https://www.amazon.com");
       Thread.sleep(3000);
       driver.navigate().to("https://www.amazon.com");
       Thread.sleep(5000);
      String URL=driver.getCurrentUrl();
        System.out.println(URL);

        String title=driver.getTitle();
        System.out.println("The title of the page is "+title);

        driver.close();
    }

}
