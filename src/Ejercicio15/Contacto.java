package Ejercicio15;

public abstract class Contacto {
    String nombreCompleto;

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public Contacto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

}
