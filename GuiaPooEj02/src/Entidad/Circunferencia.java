/*
Declarar una clase llamada Circunferencia que tenga como atributo privado el radio de
tipo real. A continuación, se deben crear los siguientes métodos:
a) Método constructor que inicialice el radio pasado como parámetro.
b) Métodos get y set para el atributo radio de la clase Circunferencia.
c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo del
objeto.
d) Método area(): para calcular el área de la circunferencia (Area = pi * radio^2).
e) Método perimetro(): para calcular el perímetro (Perimetro = 2 * pi * radio).
 */
package Entidad;

/**
 *
 * @author Sebastian
 */
public class Circunferencia {

    //atributos
    private double radio;
    private double area;
    private double perimetro;

    //constructor
    public Circunferencia(double radio) {
        this.radio = radio;
        this.area = area(radio);
        this.perimetro = perimetro(radio);
    }
    //get y set

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }



    //metodos
    private double area(double radio) {
        double a = 3.14 * Math.pow(radio, 2);
        return a;

    }

    private double perimetro(double radio) {
        double perim = 2 * 3.14 * radio;
        return perim;
    }

    @Override
    public String toString() {
        return "Circunferencia{" + "radio=" + radio + ", area=" + area + ", perimetro=" + perimetro + '}';
    }

   


}
