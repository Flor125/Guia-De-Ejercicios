package Clases;
public class MiFecha {
    int dia;
    static int mes;
    static int anno;
    String mes_txt;
    static boolean es_bisiesto;

    public MiFecha(int dia, int mes, int anno){
        this.dia = dia;
        MiFecha.mes = mes;
        MiFecha.anno = anno;
        this.mes_txt = nombreMes();
        es_bisiesto = calcularBisiesto();
    }

    public void setDia(int dia){
        this.dia = dia;
    }
    public int getDia(){
        return dia;
    }

    public void setMes(int mes){
        this.mes = mes;
        this.mes_txt = nombreMes();
    }
    public int getMes(){
        return mes;
    }
    public String getMes_txt(){
        return mes_txt;
    }
    public static String nombreMes(){
        String[] nombresMeses = {
                "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio",
                "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"
        };
        return nombresMeses [mes - 1];
    }

    public void setAnno(int anno){
        this.anno = anno;
        this.es_bisiesto = calcularBisiesto();
    }
    public int getAnno(){
        return anno;
    }

    public boolean isEs_bisiesto(){
        return es_bisiesto;
    }

    public static boolean calcularBisiesto(){
        if((anno % 4 == 0 && anno % 100 != 0) || (anno %400 == 0)){
            return true;
        }else{
            return false;
        }
    }
    public static String mostrarFecha(){
        if(es_bisiesto){
            return "Bisiesto";
        }else{
         return  "No Bisiesto";
        }
    }


}
