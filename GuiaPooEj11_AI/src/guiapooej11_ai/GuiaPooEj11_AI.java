/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiapooej11_ai;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

/**
 *
 * @author Sebastian
 */
public class GuiaPooEj11_AI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese el dia:");
        int dia = leer.nextInt();
        System.out.println("Ingrese el mes:");
        int mes = leer.nextInt();
        System.out.println("Ingrese el año:");
        int año = leer.nextInt();
        LocalDate fecha = LocalDate.of(año, mes, dia);
        System.out.println(fecha.toString());
        LocalDate fechaActual = LocalDate.now();
        Period periodo = Period.between(fecha, fechaActual);
        int diferencia = periodo.getYears();
        System.out.println("Hay "+diferencia+" años entre la fecha ingresada y la fecha actual.");
    }
}
