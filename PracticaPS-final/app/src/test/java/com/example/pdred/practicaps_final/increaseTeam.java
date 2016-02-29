package com.example.pdred.practicaps_final.Clases;

import com.example.pdred.practicaps_final.Clases.Equipo;

import com.example.pdred.practicaps_final.Clases.Jugador;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
import java.util.*;
import static org.junit.Assert.assertEquals;

public class increaseTeam {

	public ArrayList<Jugador> initJugadores(){
		ArrayList <Jugador> jugadoresEquipo = new ArrayList<Jugador>();
		jugadoresEquipo.add(j1);
		jugadoresEquipo.add(j2);
		jugadoresEquipo.add(j3);
		jugadoresEquipo.add(j4);
		jugadoresEquipo.add(j5);
		
		return jugadoresEquipo;
		
	}

    Jugador j1 = new Jugador(1, "Jugador 1", "POR", 1000, 12, "Nadie");
    Jugador j2 = new Jugador(1, "Jugador 2", "DC", 1000, 12, "Nadie");
    Jugador j3 = new Jugador(1, "Jugador 3", "DEF", 1000, 12, "Nadie");
    Jugador j4 = new Jugador(1, "Jugador 4", "MED", 1000, 12, "Nadie");
    Jugador j5 = new Jugador(1, "Jugador 5", "MED", 1000, 12, "Nadie");
    Jugador j6 = new Jugador(1, "JugadorPrueba1", "POR", 1000, 12, "Nadie");
    Jugador j7 = new Jugador(1, "JugadorPrueba2", "POR", 3000, 12, "Nadie");
    Jugador j8 = new Jugador(1, "JugadorPrueba3", "POR", 1300, 12, "Nadie");
    Jugador j9 = new Jugador(1, "JugadorPrueba4", "POR", 6000, 12, "Nadie");
    Jugador j10 = new Jugador(1, "JugadorPrueba5", "POR", 10000, 12, "Nadie");
    ArrayList <Jugador> jugadoresEquipo = initJugadores();
	int valor = 0; 
	
    	

    @Given("^A team with a set of players$")
    public void a_team_with_a_set_of_players() throws Throwable {
        Equipo e = new Equipo("EquipoPrueba", 0, 5, jugadoresEquipo);
    	e.actualizarValorSuma();
        valor = e.getValorSuma();
    }

    @When("^i add Player1 with the price 1000$")
    public void i_add_player1_with_the_price_1000() throws Throwable {
        Equipo e = new Equipo("EquipoPrueba", 0, 5, jugadoresEquipo);
        ArrayList<Jugador> newList = e.getListaJugadores();
		newList.add(j6);
				
		e.setListaJugadores(newList);
		e.actualizarValorSuma();
    }

    @When("^i add Player2 with the price 3000$")
    public void i_add_player2_with_the_price_3000() throws Throwable {
        Equipo e = new Equipo("EquipoPrueba", 0, 5, jugadoresEquipo);
        ArrayList<Jugador> newList = e.getListaJugadores();
		newList.add(j7);
		
		e.setListaJugadores(newList);
		e.actualizarValorSuma();
    }

    @When("^i add Player3 with the price 1300$")
    public void i_add_player3_with_the_price_1300() throws Throwable {
        Equipo e = new Equipo("EquipoPrueba", 0, 5, jugadoresEquipo);
        ArrayList<Jugador> newList = e.getListaJugadores();
		newList.add(j8);
				
		e.setListaJugadores(newList);
		e.actualizarValorSuma();
    }

    @When("^i add Player4 with the price 6000$")
    public void i_add_player4_with_the_price_6000() throws Throwable {
        Equipo e = new Equipo("EquipoPrueba", 0, 5, jugadoresEquipo);
        ArrayList<Jugador> newList = e.getListaJugadores();
		newList.add(j9);
				
		e.setListaJugadores(newList);
		e.actualizarValorSuma();
    }

    @When("^i add Player5 with the price 10000$")
    public void i_add_player5_with_the_price_10000() throws Throwable {
        Equipo e = new Equipo("EquipoPrueba", 0, 5, jugadoresEquipo);
        ArrayList<Jugador> newList = e.getListaJugadores();
		newList.add(j10);
			
		e.setListaJugadores(newList);
		e.actualizarValorSuma();
    }

    @Then("^the team's total value increases 1000$")
    public void the_teams_total_value_increases_1000() throws Throwable {
        Equipo e = new Equipo("EquipoPrueba", 0, 5, jugadoresEquipo);
        assertEquals(e.getValorSuma(), (valor + 1000));
    }

    @Then("^the team's total value increases 3000$")
    public void the_teams_total_value_increases_3000() throws Throwable {
        Equipo e = new Equipo("EquipoPrueba", 0, 5, jugadoresEquipo);
        assertEquals(e.getValorSuma(), (valor + 3000));
    }

    @Then("^the team's total value increases 1300$")
    public void the_teams_total_value_increases_1300() throws Throwable {
        Equipo e = new Equipo("EquipoPrueba", 0, 5, jugadoresEquipo);
        assertEquals(e.getValorSuma(), (valor + 1300));
    }

    @Then("^the team's total value increases 6000$")
    public void the_teams_total_value_increases_6000() throws Throwable {
        Equipo e = new Equipo("EquipoPrueba", 0, 5, jugadoresEquipo);
        assertEquals(e.getValorSuma(), (valor + 6000));
    }

    @Then("^the team's total value increases 10000$")
    public void the_teams_total_value_increases_10000() throws Throwable {
        Equipo e = new Equipo("EquipoPrueba", 0, 5, jugadoresEquipo);
        assertEquals(e.getValorSuma(), (valor + 10000));
    }

}