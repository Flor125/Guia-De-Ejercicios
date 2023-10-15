package Clases;

public class Clientes {
    public String nombreCliente, apellidoCliente, codigoCliente, direccionCliente, emailCliente;
    private String razonsocialCliente, dniCliente, telefonoCliente;
    protected int edadCliente = 0;

    public Clientes(String nombre, String apellido, String codigo, String direccion, String correo, String razonsocial, String dni, String telefono, int edad){
        this.nombreCliente = nombre;
        this.apellidoCliente = apellido;
        this.codigoCliente = codigo;
        this.direccionCliente = direccion;
        this.emailCliente = correo;
        this.razonsocialCliente = razonsocial;
        this.dniCliente = dni;
        this.telefonoCliente = telefono;
        this.edadCliente = edad;
    }

    public class ClienteVIP extends Clientes{
        public ClienteVIP(String nombre, String apellido, String codigo, String direccion, String correo, String razonsocial, String dni, String telefono, int edad){
            super(nombre, apellido, codigo, direccion, correo, razonsocial, dni, telefono, edad);
        }

    }
    public class ClienteRegular extends Clientes{
        public ClienteRegular(String nombre, String apellido, String codigo, String direccion, String correo, String razonsocial, String dni, String telefono, int edad){
            super(nombre, apellido, codigo, direccion, correo, razonsocial, dni, telefono, edad);
        }
    }
    public class ClienteIrregular extends Clientes{
        public ClienteIrregular(String nombre, String apellido, String codigo, String direccion, String correo, String razonsocial, String dni, String telefono, int edad){
            super(nombre, apellido, codigo, direccion, correo, razonsocial, dni, telefono, edad);
        }
    }
    public class MalosClientes extends Clientes{
        public MalosClientes(String nombre, String apellido, String codigo, String direccion, String correo, String razonsocial, String dni, String telefono, int edad){
            super(nombre, apellido, codigo, direccion, correo, razonsocial, dni, telefono, edad);
        }
    }

    public void setNombreCliente(String nombreCliente){this.nombreCliente = nombreCliente;}
    public void setApellidoCliente(String setApellidoCliente){this.apellidoCliente = apellidoCliente;}
    public void setCodigoCliente(String codigoCliente){this.codigoCliente = codigoCliente;}
    public void setDireccionCliente(String direccionCliente){this.direccionCliente = direccionCliente;}
    public void setEmailCliente(String emailCliente){this.emailCliente = emailCliente;}
    public void setRazonsocialCliente(String razonsocialCliente){this.razonsocialCliente = razonsocialCliente;}
    public void setDniCliente(String dniCliente){this.dniCliente = dniCliente;}
    public void setTelefonoCliente(String telefonoCliente){this.telefonoCliente = telefonoCliente;}
    public void setEdadCliente(int edadCliente){this.edadCliente = edadCliente;}

    public String getNombreCliente(){return nombreCliente;}
    public String getApellidoCliente(){return apellidoCliente;}
    public String getCodigoCliente(){return codigoCliente;}
    public String getDireccionCliente(){return direccionCliente;}
    public String getEmailCliente(){return emailCliente;}
    public String getRazonsocialCliente(){return razonsocialCliente;}
    public String getDniCliente(){return dniCliente;}
    public String getTelefonoCliente(){return telefonoCliente;}
    public int getEdadCliente(){return edadCliente;}



}
