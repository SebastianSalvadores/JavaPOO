/*
Realizar una clase llamada Persona que tenga los siguientes atributos: nombre, edad,
sexo ('H' hombre, 'M' mujer, 'O' otro), peso y altura. Si el alumno desea añadir algún otro
atributo, puede hacerlo. Los métodos que se implementarán son:
 Un constructor por defecto.
 Un constructor con todos los atributos como parámetro.
 Métodos getters y setters de cada atributo.
 Metodo crearPersona(): el método crear persona, le pide los valores de los atributos
al usuario y después se le asignan a sus respectivos atributos para llenar el objeto
Persona. Además, comprueba que el sexo introducido sea correcto, es decir, H, M o
O. Si no es correcto se deberá mostrar un mensaje
 Método calcularIMC(): calculara si la persona está en su peso ideal (peso en
kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor que 20,
significa que la persona está por debajo de su peso ideal y la función devuelve un -1.
Si la fórmula da por resultado un número entre 20 y 25 (incluidos), significa que la
persona está en su peso ideal y la función devuelve un 0. Finalmente, si el resultado
de la fórmula es un valor mayor que 25 significa que la persona tiene sobrepeso, y la
función devuelve un 1.
 Método esMayorDeEdad(): indica si la persona es mayor de edad. La función
devuelve un booleano.
A continuación, en la clase main hacer lo siguiente:
Crear 4 objetos de tipo Persona con distintos valores, a continuación, llamaremos todos
los métodos para cada objeto, deberá comprobar si la persona está en su peso ideal,
tiene sobrepeso o está por debajo de su peso ideal e indicar para cada objeto si la
persona es mayor de edad.
Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad en
distintas variables, para después en el main, calcular un porcentaje de esas 4 personas
cuantas están por debajo de su peso, cuantas en su peso ideal y cuantos, por encima, y
también calcularemos un porcentaje de cuantos son mayores de edad y cuantos menores
 */
package Servicio;

import Entidad.Persona;
import java.util.Scanner;

/**
 *
 * @author Sebastian
 */
public class PersonaServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Persona crearPersona() {
        Persona pers = new Persona();
        System.out.println("Ingrese nombre: ");
        pers.setNombre(leer.next());
        System.out.println("Ingrese edad: ");
        pers.setEdad(leer.nextInt());
        String sexo;
        do {
            System.out.println("Ingrese sexo ('H' hombre, 'M' mujer, 'O' otro): ");
            sexo = leer.next();
            if (!sexo.equalsIgnoreCase("H") && !sexo.equalsIgnoreCase("M") && !sexo.equalsIgnoreCase("O")) {
                System.out.println("Sexo incorrecto.");
            }
        } while (!sexo.equalsIgnoreCase("H") && !sexo.equalsIgnoreCase("M") && !sexo.equalsIgnoreCase("O"));
        pers.setSexo(sexo);
        System.out.println("Ingrese peso: ");
        pers.setPeso(leer.nextDouble());
        System.out.println("Ingrese altura: ");
        pers.setAltura(leer.nextDouble());
        return pers;
    }

    public int calcularIMC(Persona pers) {

        double formula;
        double peso = pers.getPeso();
        double altura = pers.getAltura();
        formula = peso / (Math.pow(altura, 2));
        if (formula < 20) {
            return -1;
        } else if (formula >= 20 && formula <= 25) {
            return 0;
        } else {
            return 1;
        }

    }

    public boolean esMayorDeEdad(Persona pers) {
        int edad = pers.getEdad();
        if (edad >= 18) {
            return true;
        } else {
            return false;
        }
    }

}
