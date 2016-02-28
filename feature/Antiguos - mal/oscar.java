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

    @Given("^User press the \"([^\"]*)\" button$")
    public void user_press_the_something_button(String strArg1) throws Throwable {
        throw new PendingException();
    }

    @When("^the new page loads$")
    public void the_new_page_loads() throws Throwable {
        throw new PendingException();
    }

    @Then("^he should see an alert to join a league$")
    public void he_should_see_an_alert_to_join_a_league() throws Throwable {
        throw new PendingException();
    }

    @Then("^he should see his username and points$")
    public void he_should_see_his_username_and_points() throws Throwable {
        throw new PendingException();
    }

    @Then("^he should see an alert to wait for the season's start$")
    public void he_should_see_an_alert_to_wait_for_the_seasons_start() throws Throwable {
        throw new PendingException();
    }

    @Then("^he should see his username, points and final rank on his league$")
    public void he_should_see_his_username_points_and_final_rank_on_his_league() throws Throwable {
        throw new PendingException();
    }

    @Then("^he should redirected to the loging page$")
    public void he_should_redirected_to_the_loging_page() throws Throwable {
        throw new PendingException();
    }

    @And("^he is not on a league$")
    public void he_is_not_on_a_league() throws Throwable {
        throw new PendingException();
    }

    @And("^he is on a private league$")
    public void he_is_on_a_private_league() throws Throwable {
        throw new PendingException();
    }

}