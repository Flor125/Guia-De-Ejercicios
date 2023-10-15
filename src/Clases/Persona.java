package Clases;

public class Persona {
    public String nombre;
    public String genero;
    public int edad;

    public Persona(String nombres, String generos, int edades) {
        this.nombre = nombres;
        this.edad = edades;
        this.genero = generos;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }


    public void decirNombre() {
        System.out.println("Nombre de la persona : " + nombre);
    }

    public void decirEdad() {
        System.out.println("Edad de la persona : " + edad);
    }

    public void decirGenero() {
        System.out.println("Genero de la persona : " + genero);
    }


}

