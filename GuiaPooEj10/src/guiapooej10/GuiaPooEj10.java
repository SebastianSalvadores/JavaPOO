/*
Realizar un programa en Java donde se creen dos arreglos: el primero será un arreglo A
de 50 números reales, y el segundo B, un arreglo de 20 números, también reales. El
programa deberá inicializar el arreglo A con números aleatorios y mostrarlo por pantalla.
Luego, el arreglo A se debe ordenar de menor a mayor y copiar los primeros 10 números
ordenados al arreglo B de 20 elementos, y rellenar los 10 últimos elementos con el valor
0.5. Mostrar los dos arreglos resultantes: el ordenado de 50 elementos y el combinado de
20.
 */
package guiapooej10;

import Utilidad.Utilidades;
import java.util.Arrays;

/**
 *
 * @author Sebastian
 */
public class GuiaPooEj10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double[] A = new double[50];
        double[] B = new double [20];
        Utilidades.inicializarArreglo(A);
        System.out.println("Arreglo A de 50 numeros reales aleatorios: ");
        Utilidades.imprimirArreglo(A);
        System.out.println("");
        Arrays.sort(A);
        B = Arrays.copyOf(A, 20);
        Arrays.fill(B, 10, 20, 0.5);
        System.out.println("Arreglo A ordenado de menor a mayor: ");
        Utilidades.imprimirArreglo(A);
        System.out.println("");
        System.out.println("Arreglo B combinado de 20 numeros: ");
        Utilidades.imprimirArreglo(B);
    }
    
}
