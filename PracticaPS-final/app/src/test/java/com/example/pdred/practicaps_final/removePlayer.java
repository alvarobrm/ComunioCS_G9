package com.example.pdred.practicaps_final.Clases;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;

import org.junit.runner.RunWith;

public class removePlayer {

    @Given("^a forward in my team $")
    public void a_forward_in_my_team() throws Throwable {
        Jugador dc = new Jugador(1, "Jugardor Prueba", "DEL", 4000, 1, "Nada");
        Alineacion al = new Alineacion();
        al.addJugador(dc);
        assert (al.Delantero1 == dc);
    }

    @Given("^a midfield player in my team $")
    public void a_midfield_player_in_my_team() throws Throwable {
        Jugador mc = new Jugador(1, "Jugardor Prueba", "MED", 4000, 1, "Nada");
        Alineacion al = new Alineacion();
        al.addJugador(mc);
        assert (al.Delantero1 == mc);
    }

    @Given("^a defender in my team $")
    public void a_defender_in_my_team() throws Throwable {
        Jugador df = new Jugador(1, "Jugardor Prueba", "DEF", 4000, 1, "Nada");
        Alineacion al = new Alineacion();
        al.addJugador(df);
        assert (al.Delantero1 == df);
    }

    @Given("^a goalkeeper in my team $")
    public void a_goalkeeper_in_my_team() throws Throwable {
        Jugador por= new Jugador(1, "Jugardor Prueba", "POR", 4000, 1, "Nada");
        Alineacion al = new Alineacion();
        al.addJugador(por);
        assert (al.Delantero1 == por);
    }

    

    @Then("^the forward should be removed away $")
    public void the_forward_should_be_removed_away() throws Throwable {
        Jugador dc = new Jugador(1, "Jugardor Prueba", "DEL", 4000, 1, "Nada");
        Alineacion al = new Alineacion();
        al.addJugador(dc);
        al.removeJugador(dc);
        assert (al.Delantero1 != dc);
        
    }

    @Then("^the midfield player should be removed away$")
    public void the_midfield_player_should_be_removed_away() throws Throwable {
        Jugador mc = new Jugador(1, "Jugardor Prueba", "MED", 4000, 1, "Nada");
        Alineacion al = new Alineacion();
        al.addJugador(mc);
        al.removeJugador(mc);
        assert (al.Medio1 != mc);
    }

    @Then("^the defender should be removed away$")
    public void the_defender_should_be_removed_away() throws Throwable {
        Jugador df = new Jugador(1, "Jugardor Prueba", "DEF", 4000, 1, "Nada");
        Alineacion al = new Alineacion();
        al.addJugador(df);
        al.removeJugador(df);
        assert (al.Defensa1 != df);
    }

    @Then("^the goalkeeper should be removed away$")
    public void the_goalkeeper_should_be_removed_away() throws Throwable {
        Jugador por = new Jugador(1, "Jugardor Prueba", "POR", 4000, 1, "Nada");
        Alineacion al = new Alineacion();
        al.addJugador(por);
        al.removeJugador(por);
        assert (al.Delantero1 != por);
    }
}