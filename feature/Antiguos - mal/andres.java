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

    @Given("^(.+) in (.+) with (.+) in the league market$")
    public void in_with_in_the_league_market(String user, String league, String player) throws Throwable {
        throw new PendingException();
    }

    @When("^market button is pressed$")
    public void market_button_is_pressed() throws Throwable {
        throw new PendingException();
    }

    @Then("^(.+) must be shown in the List$")
    public void must_be_shown_in_the_list(String player) throws Throwable {
        throw new PendingException();
    }

    @And("^ (.+) price must be (.+)$")
    public void price_must_be(String player, String cost) throws Throwable {
        throw new PendingException();
    }

}