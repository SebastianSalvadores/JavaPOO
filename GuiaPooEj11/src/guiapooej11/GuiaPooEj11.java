/*
Pongamos de lado un momento el concepto de POO, ahora vamos a trabajar solo con la
clase Date. En este ejercicio deberemos instanciar en el main, una fecha usando la clase
Date, para esto vamos a tener que crear 3 variables, dia, mes y anio que se le pedirán al
usuario para poner el constructor del objeto Date. Una vez creada la fecha de tipo Date,
deberemos mostrarla y mostrar cuantos años hay entre esa fecha y la fecha actual, que
se puede conseguir instanciando un objeto Date con constructor vacío.
Ejemplo fecha: Date fecha = new Date(anio, mes, dia);
Ejemplo fecha actual: Date fechaActual = new Date();
 */
package guiapooej11;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Sebastian
 */
public class GuiaPooEj11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese el dia:");
        int dia = leer.nextInt();
        System.out.println("Ingrese el mes:");
        int mes = leer.nextInt() - 1;
        System.out.println("Ingrese el año:");
        int año = leer.nextInt() - 1900;
        Date fecha = new Date(año, mes, dia);
        System.out.println(fecha.toString());
        Date fechaActual = new Date();
        int diferencia = Math.abs(fecha.getYear() - fechaActual.getYear());

        if (fecha.getMonth() > fechaActual.getMonth() || fecha.getMonth() == fechaActual.getMonth() && fecha.getDate() > fechaActual.getDate())
            diferencia--;
        System.out.println("Hay "+diferencia+" años entre la fecha ingresada y la fecha actual.");
    }
    
}
