package Clases;

public class Vehiculo2 {
    public String marca;
    public String modelo;
    public int año;

    public Vehiculo2(String marca, String modelo, int año){
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
    }
    public void datosVehiculo(){
        System.out.println("DATOS DEL VEHICULO: ");
        System.out.println("Marca: "+marca);
        System.out.println("Modelo: "+modelo);
        System.out.println("Año: "+año);
        System.out.println(" - ");
    }

    public void acelerar(){
        System.out.println("El vehiculo "+marca+" aceleró");
    }
    public void frear(){
        System.out.println("El vehiculo "+marca+" freó");
    }
    public void encender(){
        System.out.println("El vehiculo "+marca+" encendió");
    }
}

