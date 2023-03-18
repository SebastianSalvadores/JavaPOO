/*
Implemente la clase Persona. Una persona tiene un nombre y una fecha de nacimiento
(Tipo Date), constructor vacío, constructor parametrizado, get y set. Y los siguientes
métodos:

 Agregar un método de creación del objeto que respete la siguiente firma:
crearPersona(). Este método rellena el objeto mediante un Scanner y le pregunta al
usuario el nombre y la fecha de nacimiento de la persona a crear, recordemos que la
fecha de nacimiento debe guardarse en un Date y los guarda en el objeto.

 Escribir un método calcularEdad() a partir de la fecha de nacimiento ingresada. Tener
en cuenta que para conocer la edad de la persona también se debe conocer la fecha
actual.

 Agregar a la clase el método menorQue(int edad) que recibe como parámetro otra
edad y retorna true en caso de que el receptor tenga menor edad que la persona que
se recibe como parámetro, o false en caso contrario.

 Metodo mostrarPersona(): este método muestra la persona creada en el método
anterior.
 */
package guiapooej12;

import Entidad.Persona;
import Servicio.PersonaServicio;

/**
 *
 * @author Sebastian
 */
public class GuiaPooEj12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PersonaServicio ps = new PersonaServicio();
        System.out.println("Ingrese datos de la primera persona: ");
        Persona persona1 = ps.crearPersona();
        int edad1 = ps.calcularEdad(persona1);
        System.out.println(edad1+" años");
        System.out.println("Ingrese datos de la segunda persona: ");
        Persona persona2 = ps.crearPersona();
        int edad2 = ps.calcularEdad(persona2);
        System.out.println(edad2+" años");
        if(persona1.menorQue(edad2))
            System.out.println(persona1.getNombre()+" es menor que "+persona2.getNombre());
        else
            System.out.println(persona1.getNombre()+" es mayor que "+persona2.getNombre());
        ps.mostrarPersona(persona1);
        ps.mostrarPersona(persona2);
    }
    
}
