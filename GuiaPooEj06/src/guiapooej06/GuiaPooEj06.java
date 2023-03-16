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
package guiapooej06;

import Entidad.Cafetera;
import Servicio.CafeteraServicio;
import java.util.Scanner;

/**
 *
 * @author Sebastian
 */
public class GuiaPooEj06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        CafeteraServicio cs = new CafeteraServicio();
        Cafetera coffee = new Cafetera();
        int menu;
        do {
            System.out.println("CAFETERA NESPRESSO 500ml"
                    + "\n1. Llenar cafetera"
                    + "\n2. Servir taza"
                    + "\n3. Vaciar cafetera"
                    + "\n4. Agregar café"
                    + "\n5. Mostrar cantidad de café"
                    + "\n6. Salir");
            menu = leer.nextInt();
            switch (menu) {
                case 1:
                    cs.llenarCafetera(coffee);
                    leer.next();
                    break;
                case 2:
                    System.out.println("Ingrese capacidad de la taza:");
                    int taza = leer.nextInt();
                    cs.servirTaza(coffee, taza);
                    leer.next();
                    break;
                case 3:
                    cs.vaciarCafetera(coffee);
                    leer.next();
                    break;
                case 4:
                    System.out.println("Ingrese cantidad de café a agregar a la cafetera:");
                    int cant = leer.nextInt();
                    cs.agregarCafe(coffee, cant);
                    leer.next();
                    break;
                case 5:
                    cs.mostrarCantidad(coffee);
                    leer.next();
                    break;
                case 6:
                    System.out.println("Saliendo del programa.");
                    break;
                default:
                    System.out.println("Error. Ingrese una opción del 1 al 6.");
            }

        } while (menu != 6);
    }

}
