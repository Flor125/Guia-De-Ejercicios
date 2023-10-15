package Ejercicio16;

import java.util.List;

public abstract class EquipoFutbol {
    private String nombre, pais;
    private Persona.Tecnico tecnico;
    private Persona.Jugador jugador;
    private Persona.Arquero arquero;
    private List<Persona.Mediocampista> mediocampistas;
    private List<Persona.Delantero> delanteros;
    private List<Persona.Defensor> defensores;

    public EquipoFutbol(String nombre, String pais, Persona.Tecnico tecnico, Persona.Jugador jugador, Persona.Arquero arquero, List<Persona.Mediocampista> mediocampistas, List<Persona.Delantero> delanteros, List<Persona.Defensor> defensores) {
        this.nombre = nombre;
        this.pais = pais;
        this.tecnico = tecnico;
        this.jugador = jugador;
        this.arquero = arquero;
        this.mediocampistas = mediocampistas;
        this.delanteros = delanteros;
        this.defensores = defensores;
    }

    public void mostrarEquipo() {

    }
}
