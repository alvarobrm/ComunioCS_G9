package com.example.pdred.practicaps_final.Clases;

import com.example.pdred.practicaps_final.Clases.Equipo;
import com.example.pdred.practicaps_final.Clases.Jugador;
import com.example.pdred.practicaps_final.Clases.Usuario;


import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;

import org.junit.runner.RunWith;

import java.util.ArrayList;

public class randomteam {
    public ArrayList<Jugador> crearJugadoresLibres (){
        Jugador j1 = new Jugador(1, "Jugador 1", "POR", 100, 12, "Nadie");
        Jugador j2 = new Jugador(1, "Jugador 2", "POR", 100, 12, "Nadie");
        Jugador j3 = new Jugador(1, "Jugador 3", "DEF", 100, 12, "Nadie");
        Jugador j4 = new Jugador(1, "Jugador 4", "DEF", 100, 12, "Nadie");
        Jugador j5 = new Jugador(1, "Jugador 5", "DEF", 100, 12, "Nadie");
        Jugador j6 = new Jugador(1, "Jugador 6", "DEF", 100, 12, "Nadie");
        Jugador j7 = new Jugador(1, "Jugador 7", "DEF", 100, 12, "Nadie");
        Jugador j8 = new Jugador(1, "Jugador 8", "MED", 100, 12, "Nadie");
        Jugador j9 = new Jugador(1, "Jugador 9", "MED", 100, 12, "Nadie");
        Jugador j10 = new Jugador(1, "Jugador 10", "MED", 100, 12, "Nadie");
        Jugador j11 = new Jugador(1, "Jugador 11", "MED", 100, 12, "Nadie");
        Jugador j12 = new Jugador(1, "Jugador 12", "DEL", 100, 12, "Nadie");
        Jugador j13 = new Jugador(1, "Jugador 13", "DEL", 100, 12, "Nadie");
        Jugador j14 = new Jugador(1, "Jugador 14", "DEL", 100, 12, "Nadie");
        Jugador j15 = new Jugador(1, "Jugador 15", "DEL", 100, 12, "Nadie");
        ArrayList <Jugador> jugadoresLibres = new ArrayList<>();
        jugadoresLibres.add(j1);
        jugadoresLibres.add(j2);
        jugadoresLibres.add(j3);
        jugadoresLibres.add(j4);
        jugadoresLibres.add(j5);
        jugadoresLibres.add(j6);
        jugadoresLibres.add(j7);
        jugadoresLibres.add(j8);
        jugadoresLibres.add(j9);
        jugadoresLibres.add(j10);
        jugadoresLibres.add(j11);
        jugadoresLibres.add(j12);
        jugadoresLibres.add(j13);
        jugadoresLibres.add(j14);
        jugadoresLibres.add(j15);
        return jugadoresLibres;
    }


    @Then("^his team is randomly generated with the players in the free agent list$")
    public void his_team_is_randomly_generated_with_the_players_in_the_free_agent_list() throws Throwable {
        ArrayList<Jugador> players = crearJugadoresLibres();
        Equipo eq = new Equipo("Real Madrid", 300, 0, Equipo.generarEquipoAleatorio(players));
        Usuario newUser = new Usuario("New Player", "New Champions",0, 100, eq);
        assert(players.contains(newUser.getEquipo().getListaJugadores().get(0)));
        assert(players.contains(newUser.getEquipo().getListaJugadores().get(1)));
        assert(players.contains(newUser.getEquipo().getListaJugadores().get(2)));
        assert(players.contains(newUser.getEquipo().getListaJugadores().get(3)));
        assert(players.contains(newUser.getEquipo().getListaJugadores().get(4)));
        assert(players.contains(newUser.getEquipo().getListaJugadores().get(5)));
        assert(players.contains(newUser.getEquipo().getListaJugadores().get(6)));
    }



    @And("^there are only forwards in the free agent list$")
    public void there_are_only_forwards_in_the_free_agent_list() throws Throwable {
        Jugador j1 = new Jugador(1, "Jugador 1", "DEL", 100, 12, "Nadie");
        Jugador j2 = new Jugador(1, "Jugador 2", "DEL", 100, 12, "Nadie");
        Jugador j3 = new Jugador(1, "Jugador 3", "DEL", 100, 12, "Nadie");
        Jugador j4 = new Jugador(1, "Jugador 4", "DEL", 100, 12, "Nadie");
        Jugador j5 = new Jugador(1, "Jugador 5", "DEL", 100, 12, "Nadie");
        Jugador j6 = new Jugador(1, "Jugador 6", "DEL", 100, 12, "Nadie");
        ArrayList <Jugador> jugadoresLibres = new ArrayList<>();
        jugadoresLibres.add(j1);
        jugadoresLibres.add(j2);
        jugadoresLibres.add(j3);
        jugadoresLibres.add(j4);
        jugadoresLibres.add(j5);
        jugadoresLibres.add(j6);
		
        Equipo eq = new Equipo("Real Madrid", 300, 0, Equipo.generarEquipoAleatorio(jugadoresLibres));
        Usuario newUser = new Usuario("New Player", "New Champions",0, 100, eq);
        for (int i=0; i<= newUser.getEquipo().getListaJugadores().size(); i++){
            assert newUser.getEquipo().getListaJugadores().get(i).getPosicion().equals("DEL");
        }
        assert newUser.getEquipo().getListaJugadores().size()== 3;

    }

    @And("^there are only defenders in the free agent list$")
    public void there_are_only_defenders_in_the_free_agent_list() throws Throwable {
        Jugador j1 = new Jugador(1, "Jugador 1", "DEF", 100, 12, "Nadie");
        Jugador j2 = new Jugador(1, "Jugador 2", "DEF", 100, 12, "Nadie");
        Jugador j3 = new Jugador(1, "Jugador 3", "DEF", 100, 12, "Nadie");
        Jugador j4 = new Jugador(1, "Jugador 4", "DEF", 100, 12, "Nadie");
        Jugador j5 = new Jugador(1, "Jugador 5", "DEF", 100, 12, "Nadie");
        Jugador j6 = new Jugador(1, "Jugador 6", "DEF", 100, 12, "Nadie");
        ArrayList <Jugador> jugadoresLibres = new ArrayList<>();
        jugadoresLibres.add(j1);
        jugadoresLibres.add(j2);
        jugadoresLibres.add(j3);
        jugadoresLibres.add(j4);
        jugadoresLibres.add(j5);
        jugadoresLibres.add(j6);
        Equipo eq = new Equipo("Real Madrid", 300, 0, Equipo.generarEquipoAleatorio(jugadoresLibres));
        Usuario newUser = new Usuario("New Player", "New Champions",0, 100, eq);
        for (int i=0; i<= newUser.getEquipo().getListaJugadores().size(); i++){
            assert newUser.getEquipo().getListaJugadores().get(i).getPosicion().equals("DEF");
        }
        assert newUser.getEquipo().getListaJugadores().size()== 4;
    }

    @And("^there are only midfield players in the free agent list$")
    public void there_are_only_midfield_players_in_the_free_agent_list() throws Throwable {
        Jugador j1 = new Jugador(1, "Jugador 1", "MED", 100, 12, "Nadie");
        Jugador j2 = new Jugador(1, "Jugador 2", "MED", 100, 12, "Nadie");
        Jugador j3 = new Jugador(1, "Jugador 3", "MED", 100, 12, "Nadie");
        Jugador j4 = new Jugador(1, "Jugador 4", "MED", 100, 12, "Nadie");
        Jugador j5 = new Jugador(1, "Jugador 5", "MED", 100, 12, "Nadie");
        Jugador j6 = new Jugador(1, "Jugador 6", "MED", 100, 12, "Nadie");
        ArrayList <Jugador> jugadoresLibres = new ArrayList<>();
        jugadoresLibres.add(j1);
        jugadoresLibres.add(j2);
        jugadoresLibres.add(j3);
        jugadoresLibres.add(j4);
        jugadoresLibres.add(j5);
        jugadoresLibres.add(j6);
        Equipo eq = new Equipo("Real Madrid", 300, 0, Equipo.generarEquipoAleatorio(jugadoresLibres));
        Usuario newUser = new Usuario("New Player", "New Champions",0, 100, eq);
        for (int i=0; i<= newUser.getEquipo().getListaJugadores().size(); i++){
            assert newUser.getEquipo().getListaJugadores().get(i).getPosicion().equals("MED");
        }
        assert newUser.getEquipo().getListaJugadores().size()== 4;
    }

    @And("^there are only goalkeepers in the free agent list$")
    public void there_are_only_goalkeepers_in_the_free_agent_list() throws Throwable {
        Jugador j1 = new Jugador(1, "Jugador 1", "POR", 100, 12, "Nadie");
        Jugador j2 = new Jugador(1, "Jugador 2", "POR", 100, 12, "Nadie");
        Jugador j3 = new Jugador(1, "Jugador 3", "POR", 100, 12, "Nadie");
        Jugador j4 = new Jugador(1, "Jugador 4", "POR", 100, 12, "Nadie");
        Jugador j5 = new Jugador(1, "Jugador 5", "POR", 100, 12, "Nadie");
        Jugador j6 = new Jugador(1, "Jugador 6", "POR", 100, 12, "Nadie");
        ArrayList <Jugador> jugadoresLibres = new ArrayList<>();
        jugadoresLibres.add(j1);
        jugadoresLibres.add(j2);
        jugadoresLibres.add(j3);
        jugadoresLibres.add(j4);
        jugadoresLibres.add(j5);
        jugadoresLibres.add(j6);
        Equipo eq = new Equipo("Real Madrid", 300, 0, Equipo.generarEquipoAleatorio(jugadoresLibres));
        Usuario newUser = new Usuario("New Player", "New Champions",0, 100, eq);
        for (int i=0; i<= newUser.getEquipo().getListaJugadores().size(); i++){
            assert newUser.getEquipo().getListaJugadores().get(i).getPosicion().equals("POR");
        }
        assert newUser.getEquipo().getListaJugadores().size()== 1;
    }

}