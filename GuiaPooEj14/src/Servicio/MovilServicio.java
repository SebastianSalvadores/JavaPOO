/*
Una tienda que vende teléfonos móviles quiere tener registro de cada producto que
posee en un sistema computacional. Para ello, crearemos un programa donde se pueda
almacenar cada producto con su información. Crear una entidad Movil con los atributos
marca, precio, modelo, memoriaRam, almacenamiento y codigo. El atributo código será
un arreglo numérico de dimensión 7 (siete) donde cada subíndice alojará un número
correspondiente al código. A continuación, se implementarán los siguientes métodos:
 Un constructor por defecto.
 Un constructor con todos los atributos como parámetro.
 Métodos getters y setters de cada atributo.
 Método cargarCelular(): se solicita al usuario que ingrese los datos necesarios para
instanciar un objeto Celular y poder cargarlo en nuestro programa.
 Método ingresarCodigo(): este método permitirá ingresar el código completo de siete
números de un celular. Para ello, puede utilizarse un bucle repetitivo
 */
package Servicio;

import Entidad.Movil;
import java.util.Scanner;

/**
 *
 * @author Sebastian
 */
public class MovilServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Movil cargarCelular() {
        System.out.println("Ingrese marca del celular:");
        String marca = leer.next();
        System.out.println("Ingrese precio:");
        double precio = leer.nextDouble();
        System.out.println("Ingrese el modelo:");
        String modelo = leer.next();
        System.out.println("Ingrese memoria RAM:");
        int ram = leer.nextInt();
        System.out.println("Ingrese capacidad de almacenamiento:");
        int espacio = leer.nextInt();
        String cod;
        do {
            System.out.println("Ingrese el codigo de 7 digitos del producto:");
            cod = leer.next();
            if (cod.length() != 7) {
                System.out.println("El codigo ingresado no posee 7 digitos.");
            }
        } while (cod.length() != 7);
        int codigo[] = new int[7];
        ingresarCodigo(codigo, cod);
        Movil celular = new Movil(marca, precio, modelo, ram, espacio, codigo);
        return celular;
    }

    public void ingresarCodigo(int[] codigo, String cod) {
        for (int i = 0; i < codigo.length; i++) {
            codigo[i] = Integer.parseInt(cod.substring(i, i + 1));
        }
    }

    public void mostrarCelular(Movil celular) {
        System.out.println("");
        System.out.println("Marca: " + celular.getMarca()
                + "\nModelo: " + celular.getModelo()
                + "\nPrecio: $" + celular.getPrecio()
                + "\nMemoria RAM: " + celular.getMemoriaRam() + "GB"
                + "\nAlmacenamiento: " + celular.getAlmacenamiento() + "GB");
        System.out.print("Codigo: ");
        for (int i = 0; i < celular.getCodigo().length; i++) {
            System.out.print(celular.getCodigo()[i]);
        }
        System.out.println("");
    }
}
