package Clases;

public class Libro {
    public String titulo;
    public String autor;
    public String editorial;

    public Libro(String titulo, String autor, String editorial){

        this.titulo = titulo;
        this.autor = autor;
        this.editorial = editorial;
    }
    public void datosLibro(){
        System.out.println("DATOS DEL LIBRO: ");
        System.out.println("Titulo: "+titulo);
        System.out.println("Autor: "+autor);
        System.out.println("Editorial: "+editorial);
        System.out.println(" - ");
    }
    public void leer(){
        System.out.println("El libro "+titulo+" se lee");
    }

    public void prestar(){
        System.out.println("El libro "+titulo+" fue prestado");
    }
    public void devolver(){
        System.out.println("El libro "+titulo+" fue devuelto");
    }
}
