package mir.stepsDefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.annotations.DataProvider;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StepDefinitions {

    private int number1;
    private int number2;
    private int result;

    @Given("User has entered numbers")
    public void user_has_entered_numbers() {
        // This step will be filled via DataProvider
    }

    @When("I add them")
    public void i_add_them() {
        result = number1 + number2;
    }

    @Then("The result should be {int}")
    public void the_result_should_be(int expectedResult) {
        if (result != expectedResult) {
            throw new AssertionError("Expected result: " + expectedResult + ", Actual result: " + result);
        }
    }
}

// Note: Move the DataRow class to a separate file with the package declaration 'mir.stepsDefinations'
