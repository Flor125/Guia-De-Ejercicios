package Ejercicio18;

public class TeamProgrammer {
    private String nombreEquipo;

    public String getNombreEquipo() {
        return nombreEquipo;
    }

    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }

    public String getUniversidad() {
        return universidad;
    }

    public void setUniversidad(String universidad) {
        this.universidad = universidad;
    }

    public String getLenguajeProgramacion() {
        return lenguajeProgramacion;
    }

    public void setLenguajeProgramacion(String lenguajeProgramacion) {
        this.lenguajeProgramacion = lenguajeProgramacion;
    }


    private String universidad;
    private String lenguajeProgramacion;
    private int  programadoresAgregados;
    private final String[] programadores;

    public TeamProgrammer() {
        programadores = new String[3];
        programadoresAgregados = 0;
    }

    public void agregarProgramador(String nombreEquipo) {
        if (programadoresAgregados < 3) {
            if (nombreEquipo.matches("[a-zA-Z ]+$") && nombreEquipo.length() < 20) {
                programadores[programadoresAgregados] = nombreEquipo;
                programadoresAgregados++;
            } else {
                System.out.println("Nombre y apellidos debe ser sólo texto y tener menos de 20 letras");
            }
        } else {
            System.out.println("Equipo completo, no se puede agregar más programadores.");
        }
    }

    public boolean estaCompleto() {
        return programadoresAgregados == 3;
    }


}

