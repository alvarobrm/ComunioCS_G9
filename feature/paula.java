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

    @Given("^an username an password correct$")
    public void an_username_an_password_correct() throws Throwable {
        throw new PendingException();
    }

    @Given("^a correct username $")
    public void a_correct_username() throws Throwable {
        throw new PendingException();
    }

    @Given("^an incorrect username $")
    public void an_incorrect_username() throws Throwable {
        throw new PendingException();
    }

    @When("^I try to log in to comunio$")
    public void i_try_to_log_in_to_comunio() throws Throwable {
        throw new PendingException();
    }

    @Then("^I should log in$")
    public void i_should_log_in() throws Throwable {
        throw new PendingException();
    }

    @Then("^I have to put the username and password again$")
    public void i_have_to_put_the_username_and_password_again() throws Throwable {
        throw new PendingException();
    }

    @And("^an incorrect password$")
    public void an_incorrect_password() throws Throwable {
        throw new PendingException();
    }

    @And("^a correct password$")
    public void a_correct_password() throws Throwable {
        throw new PendingException();
    }

}