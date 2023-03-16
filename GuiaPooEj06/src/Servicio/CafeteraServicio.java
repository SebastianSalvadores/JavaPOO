/*
Programa Nespresso. Desarrolle una clase Cafetera con los atributos capacidadMaxima
(la cantidad máxima de café que puede contener la cafetera) y cantidadActual (la
cantidad actual de café que hay en la cafetera). Implemente, al menos, los siguientes
métodos:
 Constructor predeterminado o vacío
 Constructor con la capacidad máxima y la cantidad actual
 Métodos getters y setters.
 Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad
máxima.
 Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el
tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la
cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El
método le informará al usuario si se llenó o no la taza, y de no haberse llenado en
cuanto quedó la taza.
 Método vaciarCafetera(): pone la cantidad de café actual en cero.
 Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo
recibe y se añade a la cafetera la cantidad de café indicada.
 */
package Servicio;

import Entidad.Cafetera;

/**
 *
 * @author Sebastian
 */
public class CafeteraServicio {

    public void llenarCafetera(Cafetera nespresso) {
        if (nespresso.getCantidadActual() == nespresso.getCapacidadMaxima()) {
            System.out.println("La cafetera ya se encuentra llena.");
        } else {
            nespresso.setCantidadActual(nespresso.getCapacidadMaxima());
            System.out.println("La cafetera fue llenada a su capacidad maxima.");
        }
    }

    public void servirTaza(Cafetera nespresso, int taza) {
        int cafetera = nespresso.getCantidadActual();
        if (cafetera == 0) {
            System.out.println("La cafetera está vacía.");
        } else if (cafetera - taza < 0) {
            System.out.println("La taza no pudo ser llenada. En la taza quedó " + cafetera + "ml de café.");
            nespresso.setCantidadActual(0);
        } else {
            System.out.println("La taza fue llenada con " + taza + "ml de café.");
            nespresso.setCantidadActual(cafetera - taza);
        }
    }

    public void vaciarCafetera(Cafetera nespresso) {
        if (nespresso.getCantidadActual() == 0) {
            System.out.println("La cafetera ya se encuentra vacía.");
        } else {
            nespresso.setCantidadActual(0);
            System.out.println("La cafetera fue vaciada.");
        }
    }

    public void agregarCafe(Cafetera nespresso, int cafe) {
        int cafetera = nespresso.getCantidadActual();
        if (cafetera + cafe > nespresso.getCapacidadMaxima()) {
            nespresso.setCantidadActual(nespresso.getCapacidadMaxima());
            System.out.println("La cafetera alcanzó su capacidad máxima.");
        } else {
            nespresso.setCantidadActual(cafetera + cafe);
            System.out.println("La cafetera fue cargada con " + cafe + "ml de café.");
        }
    }

    public void mostrarCantidad(Cafetera nespresso) {
        System.out.println("La cantidad actual de café en la cafetera es: " + nespresso.getCantidadActual() + "ml");
    }
}
