package mir.runner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;

@CucumberOptions(
        features = {"src/test/resources/mir/"},
        glue = {"mir.stepsDefinations"},
        plugin = {"mir.listeners.CustomEventListener",
                "pretty",
                "json:target/cucumber-reports/Cucumber.json",  // This will generate a JSON report at the specified location
                "junit:target/cucumber-reports/Cucumber.xml"}, //This will use jenkins and generate report
        tags = "@SetCookies"

)

public class TestRunner extends AbstractTestNGCucumberTests {

    //For parallel running
    @Override
    @DataProvider(parallel = false) //DataProvider annotations
    public Object[][] scenarios() {

        return super.scenarios();
    }

}
