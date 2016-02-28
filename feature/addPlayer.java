package com.example.pdred.practicaps_final.Clases;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;

import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
public class MyStepDefinitions {

    @Given("^a forward in my team $")
    public void a_forward_in_my_team() throws Throwable {

    }

    @Given("^a midfield player in my team $")
    public void a_midfield_player_in_my_team() throws Throwable {
        throw new PendingException();
    }

    @Given("^a defender in my team $")
    public void a_defender_in_my_team() throws Throwable {
        throw new PendingException();
    }

    @Given("^a goalkeeper in my team $")
    public void a_goalkeeper_in_my_team() throws Throwable {
        throw new PendingException();
    }

    @Given("^two goalkeepers in my team $")
    public void two_goalkeepers_in_my_team() throws Throwable {
        throw new PendingException();
    }

    @When("^I click on the button to insert the forward into my first team$")
    public void i_click_on_the_button_to_insert_the_forward_into_my_first_team() throws Throwable {
        throw new PendingException();
    }

    @When("^I click on the button to insert the midfield player into my first team$")
    public void i_click_on_the_button_to_insert_the_midfield_player_into_my_first_team() throws Throwable {
        throw new PendingException();
    }

    @When("^I click on the button to insert the defender into my first team$")
    public void i_click_on_the_button_to_insert_the_defender_into_my_first_team() throws Throwable {
        throw new PendingException();
    }

    @When("^I click on the button to insert the goalkeeper into my first team$")
    public void i_click_on_the_button_to_insert_the_goalkeeper_into_my_first_team() throws Throwable {
        throw new PendingException();
    }

    @When("^I click on the button to insert the other into my first team$")
    public void i_click_on_the_button_to_insert_the_other_into_my_first_team() throws Throwable {
        throw new PendingException();
    }

    @Then("^the forward should be inserted in my first team$")
    public void the_forward_should_be_inserted_in_my_first_team() throws Throwable {
        Alineacion al = new Alineacion();
        Jugador j1 = new Jugador(1, "Jugador 1", "DEL", 100, 12, "Nadie");
        Jugador j2= new Jugador(1, "Jugador 12", "DEL", 100, 12, "Nadie");
        al.Delantero1 = j1;
        al.addJugador(j2);
        assert al.Delantero2 == j2;
    }

    @Then("^the midfield player should be inserted in my first team$")
    public void the_midfield_player_should_be_inserted_in_my_first_team() throws Throwable {
        Alineacion al = new Alineacion();
        Jugador j1 = new Jugador(1, "Jugador 1", "MED", 100, 12, "Nadie");
        Jugador j2= new Jugador(1, "Jugador 12", "MED", 100, 12, "Nadie");
        al.Medio1 = j1;
        al.addJugador(j2);
        assert al.Medio2 == j2;
    }

    @Then("^the defender should be inserted in my first team$")
    public void the_defender_should_be_inserted_in_my_first_team() throws Throwable {
        Alineacion al = new Alineacion();
        Jugador j1 = new Jugador(1, "Jugador 1", "DEF", 100, 12, "Nadie");
        Jugador j2= new Jugador(1, "Jugador 12", "DEF", 100, 12, "Nadie");
        al.Defensa1 = j1;
        al.addJugador(j2);
        assert al.Defensa2 == j2;
    }

    @Then("^the goalkeeper should be inserted in my first team$")
    public void the_goalkeeper_should_be_inserted_in_my_first_team() throws Throwable {
        Alineacion al = new Alineacion();
        Jugador j1 = new Jugador(1, "Jugador 1", "POR", 100, 12, "Nadie");
        al.addJugador(j1);
        assert al.Portero == j1;
    }

    @Then("^the app should show me an error message$")
    public void the_app_should_show_me_an_error_message() throws Throwable {
        Alineacion al = new Alineacion();
        Jugador j1 = new Jugador(1, "Jugador 1", "POR", 100, 12, "Nadie");
        Jugador j2= new Jugador(1, "Jugador 2", "POR", 100, 12, "Nadie");
        al.Portero=j1;
        al.addJugador(j2);
        assert al.Portero == j1;
        
    }

    
}