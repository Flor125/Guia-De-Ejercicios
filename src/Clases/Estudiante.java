package Clases;

public class Estudiante {
    private String nombre;
    private int edad;
    private double[] calificaciones; // Un arreglo para almacenar las calificaciones

    public Estudiante(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        this.calificaciones = new double[5]; // Se asume un máximo de 5 calificaciones
    }

    public void estudiar() {
        System.out.println(nombre + " está estudiando.");
    }

    public void hacerTarea() {
        System.out.println(nombre + " está haciendo su tarea.");
    }

    public void tomarExamen() {
        System.out.println(nombre + " está tomando un examen.");
    }

    public void registrarCalificacion(int indice, double calificacion) {
        if (indice >= 0 && indice < calificaciones.length) {
            calificaciones[indice] = calificacion;
        } else {
            System.out.println("Índice de calificación no válido.");
        }
    }

    public void mostrarCalificaciones() {
        System.out.println("Calificaciones de " + nombre + ":");
        for (int i = 0; i < calificaciones.length; i++) {
            System.out.println("Materia " + (i + 1) + ": " + calificaciones[i]);
        }
    }
}
