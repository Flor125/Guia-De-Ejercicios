package Ejercicio15;
import java.util.ArrayList;
import java.util.List;


public abstract class Persona extends Contacto{
    String email, telefonoCelular; int DNI;
    private List<Persona> guardarPersonas;
    public Persona(String nombreCompleto, String email, String telefonoCelular, int DNI) {
        super(nombreCompleto);
        this.email = email;
        this.telefonoCelular = telefonoCelular;
        this.DNI = DNI;
        this.guardarPersonas = new ArrayList<>();
    }

    public static class guardarPersonas extends Persona{
        public guardarPersonas(String nombreCompleto, String email, String telefonoCelular, int DNI){
            super(nombreCompleto, email, telefonoCelular, DNI);
        }
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefonoCelular() {
        return telefonoCelular;
    }

    public void setTelefonoCelular(String telefonoCelular) {
        this.telefonoCelular = telefonoCelular;
    }

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public void mostrarContactos(){
        System.out.println("Nombre y apellido: "+ getNombreCompleto());
        System.out.println("DNI: "+getDNI());
        System.out.println("Correo electrónico: "+getEmail());
        System.out.println("Telefono: "+getTelefonoCelular());
    }



}
