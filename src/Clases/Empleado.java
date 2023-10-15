package Clases;

public class Empleado {
    private String apellido;
    private int dni;
    private double sueldo;
    private String categoria; // Agregar categoría como un atributo

    public Empleado(String apellido, double sueldo, int dni) {
        this.apellido = apellido;
        this.sueldo = sueldo;
        this.dni = dni;
        calcularCategoria(); // Calcular la categoría en función del sueldo
    }


    private void setApellido(String apellido) {this.apellido = apellido;}
    private void setSueldo(double sueldo) {this.sueldo = sueldo;}
    private void setDni(int dni) {this.dni = dni;}

    public String getApellido() {return apellido;}
    public String getCategoria() {return categoria;}
    public int getDni() {return dni;}

    private void calcularCategoria() {
        if (sueldo <= 180000) {
            categoria = "A";
        } else if (sueldo <= 300000) {
            categoria = "B";
        } else if (sueldo <= 500000) {
            categoria = "C";
        } else {
            categoria = "Sin categoría";
        }
    }

    public static Empleado RegistroEmpleado(String apellido, double sueldo, int dni){
        Empleado empleado = new Empleado(apellido, sueldo, dni);
        empleado.setApellido(apellido);
        empleado.setDni(dni);
        empleado.setSueldo(sueldo);
        return empleado;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Empleado empleado = (Empleado) obj;
        return dni == empleado.dni;
    }

    @Override
    public String toString() {
        return String.format("%-12d%-12s%-12.2f", dni, categoria, sueldo);
    }


}