/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Rectangulo;
import java.util.Scanner;

/**
 *
 * @author Sebastian
 */
public class RectanguloService {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Rectangulo crearRectangulo() {
        System.out.println("Ingrese base del rectangulo: ");
        int base = leer.nextInt();
        System.out.println("Ingrese altura del rectangulo: ");
        int altura = leer.nextInt();
        Rectangulo obj = new Rectangulo(base, altura);
        return obj;
    }

}
