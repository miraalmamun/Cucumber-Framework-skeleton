package mir.stepsDefinations;

import io.cucumber.java.ParameterType;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

import java.util.Arrays;
import java.util.List;

public class MyTypes {

    @Given("I am logged in as: {}")
    public void iAmLoggedInAsMirMi(String str) {

        System.out.println(Arrays.stream(str.split(",")).toList());
        System.out.println("Arrays.stream(str.split(\",\")).toList().size() = " + Arrays.stream(str.split(",")).toList().size());
    }

    @When("I am {int} years old")
    public void iAmYearsOld(int age) {
        System.out.println(age);
    }

    @When("I am {string}")
    public void iAmMir(String str) {
        System.out.println("str = " + str);
    }

    @When("This is example of list: {fruits}")
    public void thisIsExampleOfListAppleOrangeBanana(List<String> fruits) {

        System.out.println(fruits);
    }

    @ParameterType(value = ".*")
    public List<String> fruits(String fruits) {
        return Arrays.stream(fruits.split(",")).toList();
    }
}
