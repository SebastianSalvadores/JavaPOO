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
package Entidad;

/**
 *
 * @author Sebastian
 */
public class Matematica {
    private double numero1;
    private double numero2;

    public Matematica() {
    }

    public Matematica(double numero1, double numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public double getNumero1() {
        return numero1;
    }

    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }

    public double getNumero2() {
        return numero2;
    }

    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }
    
    //metodos
    /**
     * Metodo estatico para retornar cuál de los dos atributos tiene el mayor valor. Si num1 es mayor a num2 devuelve 1, si es menor -1, y si son iguales retorna 0.
     * @param num1
     * @param num2
     * @return 
     */
    public static int devolverMayor(double num1, double num2){
        if (num1 == num2)
            return 0;
        else if (num1 > num2)
            return 1;
        else
            return -1;
    }
    
    public static double calcularPotencia(double num1, double num2){
        num1 = Math.round(num1);
        num2 = Math.round(num2);
        
        return Math.pow(num1, num2);
    }
    
    public static double calculaRaiz(double num){
        num = Math.abs(num);
        
        return Math.sqrt(num);
    }
}
