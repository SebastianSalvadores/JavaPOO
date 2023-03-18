/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilidad;

/**
 *
 * @author Sebastian
 */
public class Utilidades {
    public static void inicializarArreglo(double[] vector){
        for (int i = 0; i < vector.length; i++) {
            vector[i] = Math.random()*100;
        }
    }
    
    public static void imprimirArreglo(double[] vector){
        for (int i = 0; i < vector.length; i++) {
            System.out.print("[");
            System.out.printf("%.1f",vector[i]);
            System.out.print("]");
        }
        System.out.println("");
    }
}
