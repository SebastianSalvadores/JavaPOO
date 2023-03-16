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
package Servicio;

import Entidad.Cuenta;
import java.util.Scanner;

/**
 *
 * @author Sebastian
 */
public class CuentaServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    /**
     * Dar de alta una cuenta bancaria. Deberá ingresar por teclado el numero de
     * cuenta, el DNI del cliente y su saldo inicial.
     *
     * @return Cuenta
     */
    public Cuenta crearCuenta() {

        System.out.println("Ingrese N° de cuenta");
        int numCuenta = leer.nextInt();
        System.out.println("Ingrese DNI");
        long dni = leer.nextLong();
        System.out.println("Ingrese saldo inicial:");
        int saldo = leer.nextInt();

        Cuenta nuevaCuenta = new Cuenta(numCuenta, dni, saldo);
        return nuevaCuenta;
    }

    /**
     * Ingresar dinero a la cuenta.
     *
     * @param cta
     * @param ingreso
     */
    public void ingresar(Cuenta cta, double ingreso) {
        double saldoTotal = cta.getSaldo();
        saldoTotal += ingreso;
        cta.setSaldo((int) saldoTotal);
    }

    /**
     * Retirar dinero de la cuenta (sin restricciones).
     *
     * @param cta
     * @param retiro
     */
    public void retirar(Cuenta cta, double retiro) {
        double saldoTotal = cta.getSaldo();
        if (saldoTotal < retiro) {
            saldoTotal = 0;
        } else {
            saldoTotal -= retiro;
        }
        cta.setSaldo((int) saldoTotal);
    }

    /**
     * Retirar dinero de la cuenta de forma rápida. No se puede retirar más del
     * 20% de su saldo actual.
     *
     * @param cta
     */
    public void extraccionRapida(Cuenta cta) {
        int saldoTotal = cta.getSaldo();
        int retiro;
        do {
            System.out.println("Ingrese saldo a retirar de forma Rapida (no debe ser superior a " + ((int) (saldoTotal * 0.2)) + ")");
            retiro = leer.nextInt();
            System.out.println("El valor de retiro ingresado es: " + retiro);

        } while (retiro > (int) (saldoTotal * 0.2));
        saldoTotal -= retiro;
        cta.setSaldo(saldoTotal);
    }

    /**
     * Consultar saldo actual.
     *
     * @param cta
     */
    public void consultarSaldo(Cuenta cta) {
        System.out.println("El saldo actual es $" + cta.getSaldo());
    }

    /**
     * Consultar todos los datos de la cuenta.
     *
     * @param cta
     */
    public void consultarDatos(Cuenta cta) {
        System.out.println("N° de Cuenta: " + cta.getNumeroCuenta());
        System.out.println("DNI: " + cta.getDNI());
        System.out.println("Saldo: $" + cta.getSaldo());
    }
}
