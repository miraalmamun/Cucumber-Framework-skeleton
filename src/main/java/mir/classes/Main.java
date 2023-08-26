package mir.classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public  class Main {

    //Singleton class

      WebDriver driver ;


    public  void openBrowser(String browserName)
    {
         if(browserName.equalsIgnoreCase("chrome"))
         {
            //Main main = new Main();
             this.driver = new ChromeDriver();
         }
    }







    public static void main(String[] args) {

       //Interface reference variable can hold implementation class object



       // driver = new FirefoxDriver();
       // driver = new EdgeDriver();
        //----

        //driver.get("https://google.com");





        //parallel 100 test cases 30 on chrome, 30 IE, 30 Firefox, 10 Edge












        //List Set.........



         //ChromiumDriver




     // RemoteWebdriver



        //WebDriver








        Properties properties = new Properties();
        try (FileInputStream fileInputStream = new FileInputStream("project.properties")) {
            properties.load(fileInputStream);
        } catch (IOException e) {
            e.printStackTrace();
            return;
        }

        // Access the properties
        String property1 = properties.getProperty("property1");
        String property2 = properties.getProperty("property2");

        // Use the properties as needed
        System.out.println("property1: " + property1);
        System.out.println("property2: " + property2);
    }
}
