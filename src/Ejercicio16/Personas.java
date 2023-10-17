package Ejercicio16;

public abstract class Personas {
    String nombre, apellido; int edad;

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

    public Personas(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public abstract class Jugador extends Personas {
        boolean esTitular;

        public boolean getEsTitular() {
            return esTitular;
        }

        public void setEsTitular(boolean esTitular) {
            this.esTitular = esTitular;
        }

        Jugador(String nombre, String apellido, int edad, boolean esTitular){
            super(nombre, apellido, edad);
            this.esTitular = esTitular;
        }
    }
    public class Arquero extends Jugador {
        int golesRecibidos;


        public Arquero(String nombre, String apellido, int edad, boolean esTitular, int golesRecibidos) {
            super(nombre, apellido, edad, esTitular);
            this.golesRecibidos = golesRecibidos;
        }


        public int getGolesRecibidos() {
            return golesRecibidos;

        }

        public void setGolesRecibidos(int golesRecibidos) {
            this.golesRecibidos = golesRecibidos;
        }

        public String toString() {
            return "Nombre: " + getNombre() + ",Apellido: " + getApellido() + " Edad = " + getEdad() + ", Goles recibidos " + getGolesRecibidos() + ", Titular:" +getEsTitular();
        }
    }

    public class Delantero extends Jugador {
        int golesAnotados;

        public int getGolesAnotados() {
            return golesAnotados;
        }

        public void setGolesAnotados(int golesAnotados) {
            this.golesAnotados = golesAnotados;
        }

        public Delantero(String nombre, String apellido, int edad, boolean esTitular, int golesAnotados) {
            super(nombre, apellido, edad, esTitular);
            this.golesAnotados = golesAnotados;
        }

        public String toString() {
            return "Nombre -" + nombre + ",Apellido -" + apellido + " Edad = " + edad + ", Goles anotados " + golesAnotados;
        }
    }
    public class Mediocampista extends Jugador{
        int numAsistencias;
        public Mediocampista(String nombre, String apellido, int edad, boolean esTitular, int numAsistencias){
            super(nombre, apellido, edad, esTitular);
            this.numAsistencias = numAsistencias;
        }
        public String toString() {
            return "Nombre -" + nombre + ",Apellido -" + apellido + " Edad = " + edad + ", Numero de asistencias: " + numAsistencias;
        }
    }
    public class Defensor extends Jugador{
        int ataquesAnotados, golesAnotados;
        public Defensor(String nombre, String apellido, int edad, boolean esTitular, int ataquesAnotados, int golesAnotados){
            super(nombre, apellido, edad, esTitular);
            this.ataquesAnotados = ataquesAnotados;
            this.golesAnotados = golesAnotados;
        }
        public String toString(){
            return "Nombre - " + nombre + " ,Apellido -" + apellido + " ,Edad = " + edad + " ,Ataques anotados: " + ataquesAnotados + " ,Goles anotados: "+golesAnotados;
        }
    }
    public abstract class Tecnico extends Personas {
        int anioExp; boolean nacional, extranjero;

        public Tecnico(String nombre, String apellido, int edad, int anioExp, boolean nacional, boolean extranjero){
            super(nombre, apellido, edad);
            this.anioExp = anioExp;
            this.nacional = nacional;
            this.extranjero = extranjero;
        }

        public int getAnioExp() {
            return anioExp;
        }

        public void setAnioExp(int anioExp) {
            this.anioExp = anioExp;
        }

        public boolean getNacional() {
            return nacional;
        }

        public void setNacional(boolean nacional) {
            this.nacional = nacional;
        }

        public boolean getExtranjero() {
            return extranjero;
        }

        public void setExtranjero(boolean extranjero) {
            this.extranjero = extranjero;
        }

        public String toStringNac(){
            return "Nombre - " + nombre + " ,Apellido -" + apellido + " ,Edad = " + edad + " ,Anio experiencia " + anioExp + " Nacional "+nacional;
        }
        public String toStringExt(){
            return "Nombre - " + nombre + " ,Apellido -" + apellido + " ,Edad = " + edad + " ,Anio experiencia " + anioExp + " Extranjero: "+extranjero;
        }
    }

}

