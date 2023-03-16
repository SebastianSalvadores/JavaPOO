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
package guiapooej07;

import Entidad.Persona;
import Servicio.PersonaServicio;

/**
 *
 * @author Sebastian
 */
public class GuiaPooEj07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] contPeso = new int[3];
        int[] contEdad = new int[2];
        PersonaServicio ps = new PersonaServicio();

        Persona p1 = ps.crearPersona();
        Persona p2 = ps.crearPersona();
        Persona p3 = ps.crearPersona();
        Persona p4 = ps.crearPersona();

        pesoIdeal(p1, contPeso, contEdad);
        pesoIdeal(p2, contPeso, contEdad);
        pesoIdeal(p3, contPeso, contEdad);
        pesoIdeal(p4, contPeso, contEdad);

        System.out.println("");
        System.out.println(((double) contPeso[0] / 4 * 100) + "% están por debajo de su peso ideal, " + ((double) contPeso[1] / 4 * 100) + "% están en su peso ideal y el " + ((double) contPeso[2] / 4 * 100) + "% están en sobrepeso");
        System.out.println(((double) contEdad[0] / 4 * 100) + "% son mayores de edad y el " + ((double) contEdad[1] / 4 * 100) + "% son menores de edad.");

    }

    public static void pesoIdeal(Persona pers, int[] cont1, int[] cont2) {
        PersonaServicio ps = new PersonaServicio();
        boolean mayorEdad = ps.esMayorDeEdad(pers);
        System.out.println("");
        if (mayorEdad) {
            System.out.print(pers.getNombre() + " es mayor de edad");
            cont2[0] += 1;
        } else {
            System.out.print(pers.getNombre() + " es menor de edad");
            cont2[1] += 1;
        }
        int pesoIdeal = ps.calcularIMC(pers);
        switch (pesoIdeal) {
            case -1:
                System.out.print(" y está por debajo de su peso ideal.");
                cont1[0] += 1;
                break;
            case 0:
                System.out.print(" y está en su peso ideal.");
                cont1[1] += 1;
                break;
            case 1:
                System.out.print(" y está en sobrepeso.");
                cont1[2] += 1;
        }

    }

}
