package mir.classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.ArrayList;
import java.util.List;

public class CallingMethod {

//List
    static WebDriver driver;

    static void openBrowser(String browser)
    {


        if(browser.equalsIgnoreCase("chrome"))
        {
              driver = new ChromeDriver();
        }
        else if(browser.equalsIgnoreCase("firefox"))
        {
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("Edge")) {

            driver = new EdgeDriver();

        }
    }

    public static void main(String[] args) {

        openBrowser("Edge");
        driver.get("https://google.com");
        String title = driver.getTitle();
        System.out.println(title);

     //Collection

        //WebdDriver driver = new FireFox();

        //Interface can hold implementation class object

        CalInterface sum3;

        sum3 = new Calculator();
        sum3 = new CalculatorTwo();



     // WebDriver driver = new ChromeDriver();//





    }









}
