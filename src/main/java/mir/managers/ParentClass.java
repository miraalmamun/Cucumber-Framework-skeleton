package mir.managers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class ParentClass {
    static WebDriver driver = new ChromeDriver();





    public static void main(String[] args) {

         //Interface
        //Function Interface
        //lambda Expression
        //Stream






        driver.get("http://the-internet.herokuapp.com/");
        var a = driver.findElements(By.tagName("a"));

        for (WebElement aa:a)
        {
            System.out.println(aa.getText());
        }
    }


}
