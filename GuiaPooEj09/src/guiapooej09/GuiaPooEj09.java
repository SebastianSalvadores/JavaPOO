/*
Realizar una clase llamada Matemática que tenga como atributos dos números reales con
los cuales se realizarán diferentes operaciones matemáticas. La clase deber tener un
constructor vacío, parametrizado y get y set. En el main se creará el objeto y se usará el
Math.random para generar los dos números y se guardaran en el objeto con su
respectivos set. Deberá además implementar los siguientes métodos:

a) Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor valor
b) Método calcularPotencia() para calcular la potencia del mayor valor de la clase
elevado al menor número. Previamente se deben redondear ambos valores.
c) Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores.
Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.
 */
package guiapooej09;

import Entidad.Matematica;

/**
 *
 * @author Sebastian
 */
public class GuiaPooEj09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Matematica matematica = new Matematica();
        matematica.setNumero1(Math.random()*100);
        matematica.setNumero2(Math.random()*100);
        System.out.println("Numero 1: "+matematica.getNumero1()+"\nNumero 2: "+matematica.getNumero2());
        if(Matematica.devolverMayor(matematica.getNumero1(), matematica.getNumero2()) == 1){
            System.out.println("El mayor numero es: "+matematica.getNumero1());
            System.out.println("La potencia del mayor elevado al menor es: "+Matematica.calcularPotencia(matematica.getNumero1(), matematica.getNumero2()));
            System.out.println("La raiz cuadrada del mayor es: "+Matematica.calculaRaiz(matematica.getNumero1()));
        }else{
            System.out.println("El mayor numero es: "+matematica.getNumero2());
            System.out.println("La potencia del mayor elevado al menor es: "+Matematica.calcularPotencia(matematica.getNumero2(), matematica.getNumero1()));
            System.out.println("La raiz cuadrada del mayor es: "+Matematica.calculaRaiz(matematica.getNumero2()));
        }
    }
    
}
