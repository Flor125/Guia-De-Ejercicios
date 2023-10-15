package Ejercicio17;

public class Vendedor {
    String nombre, apellido; int edad;

    public Vendedor(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void imprimir(){
        System.out.println("Nombre: "+getNombre());
        System.out.println("Apellido: "+getApellido());
        System.out.println("Edad: "+getEdad());
    }
    public String verificarEdad() {
        try {
            if (getEdad() < 18) {
                throw new IllegalArgumentException("El vendedor debe ser mayor de 18 años");
            } else if (getEdad() > 70) {
                throw new IllegalArgumentException("La edad no puede ser mayor de 70 años");
            } else {
                return "Edad Correcta: " + getEdad() +"\n Se imprimirá los datos ingresados";
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            System.out.println("Hasta luego!");
            System.exit(0);
        }
        return "Edad válida: " + getEdad();
    }

}
