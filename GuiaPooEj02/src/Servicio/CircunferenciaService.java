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
package Servicio;

import Entidad.Circunferencia;
import java.util.Scanner;

/**
 *
 * @author Sebastian
 */
public class CircunferenciaService {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public Circunferencia crearCircunferencia(){
        System.out.println("Ingrese radio de la Circunferencia:");
        double radio = leer.nextDouble();
        Circunferencia cir = new Circunferencia(radio);
        return cir;
    }
    
    
}
