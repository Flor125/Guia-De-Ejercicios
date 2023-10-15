package Clases;
//Crear una clase llamada "Perro" con atributos como nombre, edad, raza, etc. y métodos
//como ladrar, caminar, comer, etc.
public class Perro {
    public String nombre, raza, alimento;
    public int edad;

    public Perro (String nombre, String raza, String alimento, int edad){
        this.nombre = nombre;
        this.raza = raza;
        this.alimento = alimento;
        this.edad = edad;
    }

    public void setNombre(String nombre){ this.nombre = nombre; }
    public String getNombre(){ return nombre; }
    public void setRaza(String raza){ this.raza = raza;}
    public String getRaza() {return raza; }
    public void setAlimento(String alimento){ this.alimento = alimento ;}
    public String getAlimento() {return alimento;}
    public void setEdad(int edad){ this.edad = edad;}
    public int getEdad() {return edad;}
    public void ladrar(){
    System.out.println(nombre + " le gusta ladrar a los gatos.");
}
    public  void caminar(){
    System.out.println(nombre + " no le gusta caminar");
}
    public void comer(){
    System.out.println(nombre + " le encanta la carne.");
}

}
