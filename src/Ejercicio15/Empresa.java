package Ejercicio15;

public abstract class Empresa extends Contacto {
    String nombreCompleto, telefonoFijo, website, CUIT;
    public Empresa(String nombreCompleto, String telefonoFijo, String website, String CUIT) {
        super(nombreCompleto);
        this.telefonoFijo = telefonoFijo;
        this.website = website;
        this.CUIT = CUIT;
    }

    public static class guardarEmpresa extends Empresa{
        public guardarEmpresa(String nombreCompleto, String telefonoFijo, String website, String CUIT){
            super(nombreCompleto, telefonoFijo, website, CUIT);
        }
    }

    public String getTelefonoFijo() {
        return telefonoFijo;
    }

    public void setTelefonoFijo(String telefonoFijo) {
        this.telefonoFijo = telefonoFijo;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getCUIT() {
        return CUIT;
    }

    public void setCUIT(String CUIT) {
        this.CUIT = CUIT;
    }



    public void mostrarContactos(){
        System.out.println("Nombre y apellido: "+getNombreCompleto());
        System.out.println("CUIT: "+getCUIT());
        System.out.println("Sitio web: "+getWebsite());
        System.out.println("Teléfono: "+getTelefonoFijo());
    }
}
