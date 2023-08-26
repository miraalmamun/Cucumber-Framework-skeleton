package mir.classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverSingleton {
    private static WebDriver driver;

    private WebDriverSingleton() {
        // Private constructor to prevent instantiation from outside
    }

    public static WebDriver getDriver() {
        if (driver == null) {
            // Create a new instance of WebDriver (e.g., ChromeDriver, FirefoxDriver, etc.)
            driver = new ChromeDriver();
        }
        return driver;
    }

    public static void quitDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}
