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
package Servicio;

import Entidad.Persona;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 *
 * @author Sebastian
 */
public class PersonaServicio {
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Persona crearPersona(){
        Persona person = new Persona();
        System.out.println("Ingrese el nombre: ");
        String nombre = leer.next();
        System.out.println("Ingresar fecha de nacimiento.");
        System.out.println("Ingrese dia: ");
        int dia = leer.nextInt();
        System.out.println("Ingrese mes: ");
        int mes = leer.nextInt() - 1;
        System.out.println("Ingrese año: ");
        int anio = leer.nextInt() - 1900;
        Date fechaNacimiento = new Date(anio, mes, dia);
        person.setNombre(nombre);
        person.setNacimiento(fechaNacimiento);
        return person;
    }
    
    public int calcularEdad(Persona person){
        Date fechaActual = new Date();
        Date fechaNacimiento = person.getNacimiento();
        int edad = fechaActual.getYear() - fechaNacimiento.getYear();
        if (fechaActual.getMonth() < fechaNacimiento.getMonth() || fechaActual.getMonth() == fechaNacimiento.getMonth() && fechaActual.getDate() < fechaNacimiento.getDate())
            edad--;
        return edad;
    }
    
    public void mostrarPersona(Persona person){
        GregorianCalendar calendario = new GregorianCalendar();
        calendario.setTime(person.getNacimiento());
        System.out.println("Nombre: "+person.getNombre()+
                "\nFecha de nacimiento: "+calendario.get(Calendar.DATE)+"/"+(calendario.get(Calendar.MONTH) + 1 )+"/"+calendario.get(Calendar.YEAR));
    }
    
}
