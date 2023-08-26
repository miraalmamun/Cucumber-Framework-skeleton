package mir.stepsDefinations;

import io.cucumber.java.Before;

public class Hooks {

    @Before("@SetCookies")
    public void setCookies() {
        System.out.println("Set Cookies before execute Scenarios");
    }

    // You can add other @Before, @After, @BeforeStep, @AfterStep hooks here as needed
}
