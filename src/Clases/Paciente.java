package Clases;

public class Paciente {
    String dni,nombre,apellido,sexo,peso,altura;
    int edad;
    public Paciente(String dniPaciente, String nombrePaciente, int edadPaciente, String apellidoPaciente, String sexoPaciente, String pesoPaciente, String alturaPaciente) {
        this.dni = dniPaciente;
        this.nombre = nombrePaciente;
        this.edad = edadPaciente;
        this.apellido = apellidoPaciente;
        this.sexo = sexoPaciente;
        this.peso = pesoPaciente;
        this.altura = alturaPaciente;

    }

    public void setDni(String pDni){
        this.dni = pDni;
    }
    public String getDni(){
        return dni;
    }
    public void setNombre(String pNombre){
        this.nombre = pNombre;
    }
    public String getNombre(){
        return nombre;
    }
    public void setApellido(String pApellido){
        this.apellido = pApellido;
    }
    public String getApellido(){
        return apellido;
    }
    public void setEdad(int pEdad){
        this.edad = pEdad;
    }
    public int getEdad(){
        return edad;
    }
    public void setPeso(String pPeso){
        this.peso = pPeso;
    }
    public String getPeso(){
        return peso;
    }
    public void setAltura(String pAltura){
        this.altura = pAltura;
    }
    public String getAltura(){
        return altura;
    }
    public void setSexo(String pSexo){
        this.sexo = pSexo;
    }
    public String getSexo(){
        return sexo;
    }

}
