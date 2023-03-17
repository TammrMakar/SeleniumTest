package Class7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class TableSimple {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver");
        //create an instance of WebDriver
        WebDriver driver = new ChromeDriver();
        //max the window
        driver.manage().window().maximize();

        driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
       //task1
        //get the whole table accessed and print it on the console

        WebElement table=driver.findElement(By.xpath("//table[@id='customers']"));
        String table_data=table.getText();
        System.out.println(table_data);

        // task2: row level access
//        get the rows of the table and print them
//        print the row that contains Company google
        List<WebElement> Rows = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr"));
//         print the rows
        for(WebElement row:Rows){
//            extract text from each row
            String row_text = row.getText();
            if (row_text.contains("Google")){
            System.out.println(row_text);
        }

        }

        //task3:column level access
        List<WebElement> columns=driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/td"));
        for (WebElement column:columns){
            System.out.println(column.getText());
        }
        //task4: just print the first column of every row
        List<WebElement>first_column=driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/td[1]"));
        for (WebElement first_col: columns){
            System.out.println(first_col.getText());
        }
    }
}

