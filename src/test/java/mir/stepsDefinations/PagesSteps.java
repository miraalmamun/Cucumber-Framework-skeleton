package mir.stepsDefinations;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import mir.context.TestContext;
import mir.managers.PageObjectManager;
import mir.pages.HomePage;
import mir.pages.LoginPage;

public class PagesSteps {


    public TestContext context;
    public HomePage homePage;
    public LoginPage loginPage;

    public PagesSteps(TestContext context) {
        System.out.println("PagesSteps constructor=======================START");
        System.out.println("PagesSteps constructor");
        this.context=context;
        this.homePage = this.context.getPageObjectManager().getHomePage();
        this.loginPage = this.context.getPageObjectManager().getLoginPage();
        System.out.println("PagesSteps constructor=======================END");
    }



    @Given("I am logged in zoho.com")
    public void i_am_logged_in_zoho_com() {
        System.out.println("I am logged in zoho.com");
    }
    @Given("I click on {string} in top menu")
    public void i_click_on_in_top_menu(String string) {
        System.out.println("============================="+string);
    }
    @When("I go to create lead page")
    public void i_go_to_create_lead_page() {
        System.out.println("I go to create lead page");
    }
    @When("enter and submit lead details")
    public void enter_and_submit_lead_details(DataTable dataTable) {
    System.out.println("=======enter and submit lead details:   ====  "+dataTable.entries());

    }
    @Then("Lead Description Page should load")
    public void lead_description_page_should_load() {
        System.out.println("Lead Description Page should load");
    }
    @Then("I verify lead details")
    public void i_verify_lead_details() {
        System.out.println("I verify lead details");
    }

    @Then("Lead {string} should {string} inside the grid")
    public void lead_should_inside_the_grid(String name, String str) {
        System.out.println("================+++++=======Lead:" +name+" : "+str);
    }

    @When("I select the lead {string}")
    public void i_select_the_lead(String string) {
        System.out.println("I select the lead {string}"+string);
    }
    @When("I click on delete button")
    public void i_click_on_delete_button() {
        System.out.println("I click on delete button");
    }

    @When("I am")
    public void iAm(DataTable table) {
        System.out.println(table);
    }

    @And("enter and submit lead details {string}, {string}, {string}, {string}")
    public void enterAndSubmitLeadDetails(String str1, String str2, String str3, String str4) {

        System.out.println("*******************Details******* : "+str1+" : "+str2+" : "+str3+" : "+str4);
    }
}
