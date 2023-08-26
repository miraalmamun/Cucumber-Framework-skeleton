package mir.stepsDefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login {

    @Given("You am on the login page")
    public void i_am_on_the_login_page2() {
    }

    @When("I enter username {string} and password {string}")
    public void i_enter_username_and_password(String username, String password) {

        System.out.println("username = " + username);
        System.out.println("password = " + password);
    }

    @Then("You should see the message {string}")
    public void i_should_see_the_message2(String string) {
    }
}
