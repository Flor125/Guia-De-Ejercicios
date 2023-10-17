package Ejercicio16;

import java.util.List;

public abstract class EquipoFutbol {
    private String nombre, pais;
    private Personas.Tecnico tecnico;
    private Personas.Jugador jugador;
    private Personas.Arquero arquero;
    private List<Personas.Mediocampista> mediocampistas;
    private List<Personas.Delantero> delanteros;
    private List<Personas.Defensor> defensores;

    public EquipoFutbol(String nombre, String pais, Personas.Tecnico tecnico, Personas.Arquero arquero, List<Personas.Mediocampista> mediocampistas, List<Personas.Delantero> delanteros, List<Personas.Defensor> defensores) {
        this.nombre = nombre;
        this.pais = pais;
        this.tecnico = tecnico;
        this.arquero = arquero;
        this.mediocampistas = mediocampistas;
        this.delanteros = delanteros;
        this.defensores = defensores;
    }


    public String getNombre() {
        return nombre;
    }

    public String getPais() {
        return pais;
    }

    public Personas.Tecnico getTecnico() {
        return tecnico;
    }

    public Personas.Arquero getArquero() {
        return arquero;
    }

    public List<Personas.Mediocampista> getMediocampistas() {
        return mediocampistas;
    }

    public List<Personas.Delantero> getDelanteros() {
        return delanteros;
    }

    public List<Personas.Defensor> getDefensores() {
        return defensores;
    }

    public static void mostrarEquipo(EquipoFutbol equipo2) {
        System.out.println("Nombre: "+equipo2.getNombre());
        System.out.println("Pais: "+equipo2.getPais());
        Personas.Arquero arquero = equipo2.getArquero();
        String arqueroInfo = arquero.toString();
        System.out.println(arqueroInfo);

        Personas.Defensor defensor = (Personas.Defensor) equipo2.getDefensores();
        String defensorInfo = defensor.toString();
        System.out.println(defensorInfo);

        Personas.Delantero delantero = (Personas.Delantero) equipo2.getDelanteros();
        String delanteroInfo = delantero.toString();
        System.out.println(delanteroInfo);

        Personas.Mediocampista mediocampista = (Personas.Mediocampista) equipo2.getMediocampistas();
        String mediocampistaInfo = mediocampista.toString();
        System.out.println(mediocampistaInfo);

        Personas.Tecnico tecnico = equipo2.getTecnico();
        String tecnicoInfo = tecnico.toString();
        System.out.println(tecnicoInfo);
    }
}
