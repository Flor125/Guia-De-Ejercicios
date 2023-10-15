package Clases;

public class Rectangulo {
    public String color;
    public float altura, base, area, perimetro;

    public Rectangulo(String color, float altura, float base, float area, float perimetro){
        this.color = color;
        this.altura = altura;
        this.base = base;
        this.area = area;
        this.perimetro = perimetro;
    }
    public void setColor(String color){this.color = color;}
    public String getColor() {return color;}
    public void setAltura(float altura){this.altura = altura;}
    public void setAncho(float ancho){this.base = ancho;}

    public void calcularArea(){
        area = altura * base;
        System.out.println("El area es " + area);
    }

    public void calcularPerimetro(){
        perimetro = (2*base) + (2*altura);
        System.out.println("El perimetro es: " + perimetro);
    }
}

