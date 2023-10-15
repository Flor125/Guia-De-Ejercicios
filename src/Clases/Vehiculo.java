package Clases;


public abstract class Vehiculo {
    public String marca, colour; private String patente;
    private boolean disponible;
    private Cliente clienteActual;
    public Vehiculo(String marca, String colour, String patente) {
        this.marca = marca;
        this.colour = colour;
        this.patente = patente;
        this.disponible = true;
    }
    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public Cliente getClienteActual() {
        return clienteActual;
    }

    public void setClienteActual(Cliente clienteActual) {
        this.clienteActual = clienteActual;
    }
    public void setPatente(String patente){this.patente = patente;}
    public String getPatente(){return patente;}

    public static class Motos extends Vehiculo{
        public Motos(String marca, String colour, String patente) {
            super(marca, colour, patente);
        }
        String cilindro;
        public void setCilindro(String cilindro){this.cilindro = cilindro;}
        public String getCilindro(){return cilindro;}
        public void mostrarCilindro(){
            System.out.println("Cilindro: "+cilindro);
        }
    }
    public static class Autos extends Vehiculo{
        public Autos(String marca, String colour, String patente){
            super(marca, colour, patente);
        }
        String cantAsientos;
        public void setCantAsientos(String cantAsientos){this.cantAsientos = cantAsientos;}
        public String getCantAsientos(){return cantAsientos;}
        public void mostrarAsientos(){
            System.out.println("Cantidad de asientos: "+cantAsientos);
        }
    }
    public static class Camiones extends Vehiculo{
        public Camiones(String marca,String colour, String patente){
            super(marca, colour, patente);
        }
        public void setCapCarga(String capCarga){this.capCarga = capCarga;}
        public String getCapCarga(){return capCarga;}
        String capCarga;
        public void mostrarCapCarga(){
            System.out.println("Capacidad de carga: "+capCarga);
        }
    }
    public void setMarca(String marca){this.marca = marca;}
    public String getMarca(){return marca;}

    public void setColour(String colour){this.colour = colour;}
    public String getColour(){return colour;}
}