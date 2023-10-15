package Clases;

public class Mascotas {
    public String nombreMascota, razaMascota, sexoMascota, fechaNacMascota;
    private String duenioMascota;
    protected int edadMascota = 0;

    public Mascotas(String nombre, String raza, String sexo, String fechaNac, String duenio, int edad){
        this.nombreMascota = nombre;
        this.razaMascota = raza;
        this.sexoMascota = sexo;
        this.fechaNacMascota = fechaNac;
        this.duenioMascota = duenio;
        this.edadMascota = edad;
    }

    public class Perros extends Mascotas{
        public Perros(String nombre, String raza, String sexo, String fechaNac, String duenio, int edad) {
            super(nombre, raza, sexo, fechaNac, duenio, edad);
        }
    }
    public class Gatos extends Mascotas {
        public Gatos(String nombre, String raza, String sexo, String fechaNac, String duenio, int edad) {
            super(nombre, raza, sexo, fechaNac, duenio, edad);
        }

        }

        public class Roedores extends Mascotas {
            public Roedores(String nombre, String raza, String sexo, String fechaNac, String duenio, int edad) {
                super(nombre, raza, sexo, fechaNac, duenio, edad);
            }

        }

        public class Anfibios extends Mascotas {
            public Anfibios(String nombre, String raza, String sexo, String fechaNac, String duenio, int edad) {
                super(nombre, raza, sexo, fechaNac, duenio, edad);
            }
        }

        public class Cardumen extends Mascotas {
            public Cardumen(String nombre, String raza, String sexo, String fechaNac, String duenio, int edad) {
                super(nombre, raza, sexo, fechaNac, duenio, edad);
            }
        }

        public void setNombreMascota(String nombreMascota) { this.nombreMascota = nombreMascota;}
        public void setrazaMascota(String razaMascota) {this.razaMascota = razaMascota;}
        public void setsexoMascota(String sexoMascota) {this.sexoMascota = sexoMascota;}
        public void setfechaNacMascota(String fechaNacMascota) {this.fechaNacMascota = fechaNacMascota;}
        public void setduenioMascota(String duenioMascota) {this.duenioMascota = duenioMascota;}
        public void setedadMascota(int edadMascota) {this.edadMascota = edadMascota;}
        public String getNombreMascota() {return nombreMascota;}
        public String getRazaMascota() {return razaMascota;}
        public String getSexoMascota() {return sexoMascota;}
        public String getFechaNacMascota() {return fechaNacMascota;}
        public String getDuenioMascota() {return duenioMascota;}
        public int getEdadMascota() {return edadMascota;}

    }





