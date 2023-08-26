package mir.testingcode;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class CodeTest {


    @Test
    public void browserAndClick()
    {
        WebDriver driver = new ChromeDriver();
        driver.get("https://example.com");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        WebElement element = wait.until((ExpectedCondition<WebElement>) webDriver ->
                webDriver.findElement(By.id("myElementId")));
        // Perform actions on the element
        element.click();
        driver.quit();
    }
}
