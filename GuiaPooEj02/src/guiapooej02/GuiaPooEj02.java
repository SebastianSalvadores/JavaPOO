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
package guiapooej02;

import Entidad.Circunferencia;
import Servicio.CircunferenciaService;

/**
 *
 * @author Sebastian
 */
public class GuiaPooEj02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CircunferenciaService cs = new CircunferenciaService();
        Circunferencia c1 = cs.crearCircunferencia();
//        double a, p;
//        double radio = c1.getRadio();
//        a = area(radio);
//        p = perimetro(radio);
        System.out.println("El area es "+c1.getArea()+" y el perimetro "+c1.getPerimetro());
        System.out.println(c1);

    }

//    public static double area(double radio) {
//        double area = 3.14 * Math.pow(radio, 2);
//        return area;
//
//    }
//
//    public static double perimetro(double radio) {
//        double perimetro = 2 * 3.14 * radio;
//        return perimetro;
//    }

}
