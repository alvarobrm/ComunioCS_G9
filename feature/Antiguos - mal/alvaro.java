package my.package.name

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
public class MyStepDefinitions {

    @Given("^an username and the passwords$")
    public void an_username_and_the_passwords() throws Throwable {
        throw new PendingException();
    }

    @Given("^an user name and the passwords$")
    public void an_user_name_and_the_passwords() throws Throwable {
        throw new PendingException();
    }

    @When("^i insert the info and click the button $")
    public void i_insert_the_info_and_click_the_button() throws Throwable {
        throw new PendingException();
    }

    @When("^i click the cancel button $")
    public void i_click_the_cancel_button() throws Throwable {
        throw new PendingException();
    }

    @Then("^I should be registed successfully$")
    public void i_should_be_registed_successfully() throws Throwable {
        throw new PendingException();
    }

    @Then("^the app should show me an error message$")
    public void the_app_should_show_me_an_error_message() throws Throwable {
        throw new PendingException();
    }

    @Then("^nothing happends because no connection$")
    public void nothing_happends_because_no_connection() throws Throwable {
        throw new PendingException();
    }

    @Then("^the app returns me to the main menu$")
    public void the_app_returns_me_to_the_main_menu() throws Throwable {
        throw new PendingException();
    }

    @And("^the user isn´t registed yet$")
    public void the_user_isnt_registed_yet() throws Throwable {
        throw new PendingException();
    }

    @And("^the user is already registed $")
    public void the_user_is_already_registed() throws Throwable {
        throw new PendingException();
    }

    @And("^the two passwods are difetent $")
    public void the_two_passwods_are_difetent() throws Throwable {
        throw new PendingException();
    }

    @And("^the user isn´t register yet$")
    public void the_user_isnt_register_yet() throws Throwable {
        throw new PendingException();
    }

}