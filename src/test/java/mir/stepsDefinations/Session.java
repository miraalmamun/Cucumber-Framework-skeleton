package mir.stepsDefinations;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.ParameterType;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import mir.context.TestContext;
import mir.pages.HomePage;
import mir.pages.LoginPage;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class Session {

    public TestContext context;
    public HomePage homePage;
    public LoginPage loginPage;

    public Session(TestContext context) {
        System.out.println("Session(Steps) class constructor===========START");
        this.context = context;
        this.homePage = this.context.getPageObjectManager().getHomePage();
        this.loginPage = this.context.getPageObjectManager().getLoginPage();
        System.out.println("Session(Steps) class constructor===========END");
    }


    @Given("User open {string} with url {string}")
    public void userOpenWithUrl(String string, String string2) {

        System.out.println(string + "       " + string2);
    }

    @And("User logged in with")
    public void userLoggedInWith(DataTable table) {
        System.out.println(table);
    }

    @Given("I logged in with the following roles: {roles}")
    public void i_logged_in_with_roles(String roles) {

        System.out.println("User logged in with the following : " + Arrays.stream(roles.split(",")).toList());
        Arrays.stream(roles.split(",")).toList().forEach(System.out::println);
        System.out.println("===========");

    }

    @ParameterType(".*")
    public String roles(String value) {
        return value;
    }

    @Given("User logged in with the following roles:")
    public void user_logged_in_with_roles(List<String> roles) {
        System.out.println("User logged in with the following roles: " + roles);
        String s = roles.get(0);
        System.out.println("=====================>>>" + s);
       // System.out.println("roles.asList() = " + roles.asList());
    }

    @Given("You logged in with the following roles: {string}")
    public void you_logged_in_with_roles(String roles) {

        System.out.println(roles);

    }

    @And("the user has preferences: {preferences}")
    public void user_preferences(List<String> preferences) {

        System.out.println("preferences = " + preferences);
    }

    @ParameterType(value = ".*")
    public List<String> preferences(String preferences) {
        return Arrays.asList(preferences.split(", "));
    }



//    @And("the user has preferences: {string}, {string}, {string}")
//    public void theUserHasPreferences(String arg0, String arg1, String arg2) {
//    }
}
