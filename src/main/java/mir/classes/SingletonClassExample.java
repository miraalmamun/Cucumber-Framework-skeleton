package mir.classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SingletonClassExample {

       public static WebDriver driver;
       private  SingletonClassExample()
       {

       }

       public static WebDriver getDriver()
       {
           if(driver == null)
           {
               driver = new ChromeDriver();
           }

           return driver;
       }

       public static void quiteBrowser()
       {
           if(driver != null)
           {
               driver.quit();
           }
       }



}
