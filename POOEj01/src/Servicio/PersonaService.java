/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Persona;
import java.util.Scanner;

/**
 *
 * @author Sebastian
 */
public class PersonaService {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    /**
     * Crear un objeto persona.
     * 
     * @return personaCompleta
     */
    public Persona crearPersona() {
        Persona personaCompleta = new Persona();

        System.out.println("Ingrese el nombre de la persona");
        personaCompleta.setNombre(leer.next());

        System.out.println("Ingrese edad de la persona");
        personaCompleta.setEdad(leer.nextInt());

        System.out.println("Ingrese ID de la persona");
        personaCompleta.setId(leer.nextInt());

        return personaCompleta;
    }
    /**
     * Mostrar persona en pantalla.
     * 
     * @param persona 
     */
    public void mostrarPersona(Persona persona) {
        System.out.println(persona.getNombre() + " " + persona.getEdad() + " " + persona.getId());
    }
}
