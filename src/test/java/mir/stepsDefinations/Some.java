package mir.stepsDefinations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Some {

    @Given("there are {int} cucumbers")
    public void there_are_cucumbers(Integer int1) {
        System.out.println(int1);
    }

    @When("I eat {int} cucumbers")
    public void i_eat_cucumbers(Integer int1) {
        System.out.println(int1);
    }

    @Then("I should have {int} cucumbers")
    public void i_should_have_cucumbers(Integer int1) {
        System.out.println(int1);
    }

    //And user enters user name <Username>
    //And user enters password <Password>
    @And("user enters {string} username")
    public void name(String str) {
        System.out.println(str);
    }

    @And("user enters {string} password")
    public void password(String str) {
        System.out.println(str);
        helperMethod();
    }

    private void helperMethod() {
        System.out.println("I am a helper method!!");
    }

}
