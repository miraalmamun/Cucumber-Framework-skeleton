package mir.stepsDefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.testng.Assert.assertEquals;

public class LoginStepDefinitions {
    WebDriver driver = new ChromeDriver();
    String baseURL = "http://yourwebsite.com/login";

    @Given("I am on the login page")
    public void i_am_on_the_login_page() {
        driver.get(baseURL);
    }

    @When("You enter username {string} and password {string}")
    public void i_enter_username_and_password2(String username, String password) {
        WebElement usernameField = driver.findElement(By.id("username")); // assuming the input has id="username"
        WebElement passwordField = driver.findElement(By.id("password")); // assuming the input has id="password"

        usernameField.sendKeys(username);
        passwordField.sendKeys(password);

        WebElement loginButton = driver.findElement(By.id("loginButton")); // assuming the button has id="loginButton"
        loginButton.click();
    }

    @Then("I should see the message {string}")
    public void i_should_see_the_message(String expectedMessage) {
        // Here, I'm assuming the message is displayed in an element with id="message". You'd replace this with the appropriate selector for your UI.
        WebElement messageElement = driver.findElement(By.id("message"));
        String actualMessage = messageElement.getText();
        
        assertEquals(expectedMessage, actualMessage);
    }
}
