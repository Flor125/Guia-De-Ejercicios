package Clases;
import java.util.ArrayList;
import java.util.List;

public abstract class Cliente {
    public String nombreCliente, apellidoCliente;
    private Long dniCliente, telefonoCliente;
    private List<Vehiculo> vehiculosAlquilados;

    public Cliente(String nombre, String apellido, Long dni, Long telefono){
        this.nombreCliente = nombre;
        this.apellidoCliente = apellido;
        this.dniCliente = dni;
        this.telefonoCliente = telefono;
        this.vehiculosAlquilados = new ArrayList<>();
    }
    public void agregarVehiculoAlquilado(Vehiculo vehiculo) {
        vehiculosAlquilados.add(vehiculo);
    }

    public List<Vehiculo> getVehiculosAlquilados(){return vehiculosAlquilados;}

    public static class RegistroCliente extends Cliente{
        public RegistroCliente(String nombre, String apellido, Long dni, Long telefono){
            super(nombre, apellido, dni, telefono);
        }
    }

    public void setNombreCliente(String nombreCliente){
        this.nombreCliente = nombreCliente;
    }
    public String getNombreCliente(){return nombreCliente;}
    public void setApellidoCliente(String apellidoCliente){
        this.apellidoCliente = apellidoCliente;
    }
    public String getApellidoCliente(){return apellidoCliente;}
    public void setDniCliente(Long dniCliente){this.dniCliente=dniCliente;}
    public Long getDniCliente(){return dniCliente;}
    public void setTelefonoCliente(Long telefonoCliente){this.telefonoCliente = telefonoCliente;}
    public Long getTelefonoCliente(){return telefonoCliente;}
}

