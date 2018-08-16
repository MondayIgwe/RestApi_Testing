package stepdefs;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import steps.endUser;

public class loginStep {

    @Steps
    endUser obj;


    @Given("^I navigate the url$")
    public void i_navigate_the_url() throws Throwable {
        obj.openUrl();

    }

    @When("^I click the login button$")
    public void i_click_the_login_button() throws Throwable {
        obj.Login();

    }
    @Then("^I am redirected to the student portal$")
    public void i_am_redirected_to_the_student_portal() throws Throwable {

    }
}
