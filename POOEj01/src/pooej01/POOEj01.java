/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej01;

import Entidad.Persona;
import Servicio.PersonaService;
import java.util.Scanner;

/**
 *
 * @author Sebastian
 */
public class POOEj01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        Persona persona1 = new Persona(); //Instanciacion usando el constructor por defecto.
        Persona persona2 = new Persona("Sebastian", 28, 001); //Instanciacion usando constructor por parametros.

        persona1.setNombre("Guillermo");

        persona1.setEdad(59);

        System.out.println("Ingrese ID de " + persona1.getNombre());
        persona1.setId(leer.nextInt());

        System.out.println(persona2.getNombre() + " " + persona2.getEdad() + " " + persona2.getId());
        System.out.println(persona1.getNombre() + " " + persona1.getEdad() + " " + persona1.getId());

        PersonaService persServicio = new PersonaService();
        Persona persona3 = persServicio.crearPersona();
        persServicio.mostrarPersona(persona3);
        
        System.out.println(persona1);
        System.out.println(persona2);
        System.out.println(persona3);
        
    }

}
