/*
Realizar una clase llamada Cuenta (bancaria) que debe tener como mínimo los atributos:
numeroCuenta (entero), el DNI del cliente (entero largo) y el saldo actual (entero).
Las operaciones asociadas a dicha clase son:
a) Constructor por defecto y constructor con DNI, saldo, número de cuenta e interés.
b) Agregar los métodos getters y setters correspondientes
c) Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario.
d) Método ingresar(double ingreso): el método recibe una cantidad de dinero a ingresar
y se la sumara a saldo actual.
e) Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y se
la restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se
pondrá el saldo actual en 0.
f) Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar que el
usuario no saque más del 20%.
g) Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.
h) Método consultarDatos(): permitirá mostrar todos los datos de la cuenta
 */
package guiapooej05;

import Entidad.Cuenta;
import Servicio.CuentaServicio;
import java.util.Scanner;

/**
 *
 * @author Sebastian
 */
public class GuiaPooEj05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        CuentaServicio cs = new CuentaServicio();
        Cuenta cuenta1 = cs.crearCuenta();
        int menu = 0;
        do {
            System.out.println("Menu"
                    + "\n1. Ingresar dinero a la cuenta"
                    + "\n2. Retirar dinero de la cuenta"
                    + "\n3. Extracción rápida"
                    + "\n4. Consultar saldo"
                    + "\n5. Consultar datos de la cuenta"
                    + "\n6. Salir");
            menu = leer.nextInt();
            switch (menu) {
                case 1:
                    System.out.println("Ingrese cantidad de dinero a ingresar a la cuenta:");
                    cs.ingresar(cuenta1, leer.nextDouble());
                    break;
                case 2:
                    System.out.println("Ingrese cantidad de dinero a retirar:");
                    cs.retirar(cuenta1, leer.nextDouble());
                    break;
                case 3:
                    cs.extraccionRapida(cuenta1);
                    break;
                case 4:
                    cs.consultarSaldo(cuenta1);
                    break;
                case 5:
                    cs.consultarDatos(cuenta1);
                    break;
                case 6:
                    System.out.println("Saliendo del programa");
                    break;
                default:
                    System.out.println("Elegir una opción de 1 a 6.");
            }

        } while (menu != 6);

    }

}
