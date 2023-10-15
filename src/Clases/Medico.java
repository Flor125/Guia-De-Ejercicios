package Clases;

public class Medico {
    String dni, nombre, apellido,sexo,peso, altura, imc, especialidad, matricula;
    int edad;
    public Medico(String dniMedico, String nombreMedico, int edadMedico, String apellidoMedico, String sexoMedico, String pesoMedico, String alturaMedico, String imcMedico, String especialidadMedico, String matriculaMedico) {
        this.dni = dniMedico;
        this.nombre = nombreMedico;
        this.edad = edadMedico;
        this.apellido = apellidoMedico;
        this.sexo = sexoMedico;
        this.peso = pesoMedico;
        this.altura = alturaMedico;
        this.imc = imcMedico;
        this.especialidad = especialidadMedico;
        this.matricula = matriculaMedico;
    }

    public void setDni(String mDni){
        this.dni = mDni;
    }
    public String getDni(){
        return dni;
    }
    public void setNombre(String mNombre){
        this.nombre = mNombre;
    }
    public String getNombre(){
        return nombre;
    }
    public void setApellido(String mApellido){
        this.apellido = mApellido;
    }
    public String getApellido(){
        return apellido;
    }
    public void setEdad(int mEdad){
        this.edad = mEdad;
    }
    public int getEdad(){
        return edad;
    }
    public void setPeso(String mPeso){
        this.peso = mPeso;
    }
    public String getPeso(){
        return peso;
    }
    public void setAltura(String mAltura){
        this.altura = mAltura;
    }
    public String getAltura(){
        return altura;
    }
    public void setSexo(String mSexo){
        this.sexo = mSexo;
    }
    public String getSexo(){
        return sexo;
    }
    public void setImc(String mImc){
        this.imc = mImc;
    }
    public String getImc(){
        return imc;
    }

    public void setEspecialidad(String mEspecialidad){
        this.especialidad = mEspecialidad;
    }

    public String getEspecialidad(){
        return especialidad;
    }
    public void setMatricula(String mMatricula){
        this.matricula = mMatricula;
    }
    public String getMatricula(){
        return matricula;
    }
}

