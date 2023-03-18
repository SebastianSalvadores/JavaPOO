/*
 Un profesor particular está dando cursos para grupos de cinco alumnos y necesita un
programa para organizar la información de cada curso. Para ello, crearemos una clase
entidad llamada Curso, cuyos atributos serán: nombreCurso, cantidadHorasPorDia,
cantidadDiasPorSemana, turno (mañana o tarde), precioPorHora y alumnos. Donde
alumnos es un arreglo de tipo String de dimensión 5 (cinco), donde se alojarán los
nombres de cada alumno. A continuación, se implementarán los siguientes métodos:
 Un constructor por defecto.
 Un constructor con todos los atributos como parámetro.
 Métodos getters y setters de cada atributo.
 método cargarAlumnos(): este método le permitirá al usuario ingresar los alumnos
que asisten a las clases. Nosotros nos encargaremos de almacenar esta información
en un arreglo e iterar con un bucle, solicitando en cada repetición que se ingrese el
nombre de cada alumno.
 Método crearCurso(): el método crear curso, le pide los valores de los atributos al
usuario y después se le asignan a sus respectivos atributos para llenar el objeto
Curso. En este método invocaremos al método cargarAlumnos() para asignarle valor
al atributo alumnos
 Método calcularGananciaSemanal(): este método se encarga de calcular la ganancia
en una semana por curso. Para ello, se deben multiplicar la cantidad de horas por
día, el precio por hora, la cantidad de alumnos y la cantidad de días a la semana que
se repite el encuentro.
 */
package Servicio;

import Entidad.Curso;
import java.util.Scanner;

/**
 *
 * @author Sebastian
 */
public class CursoServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public void cargarAlumnos(String alumnos[]) {
        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese nombre del alumno " + (i + 1) + ": ");
            alumnos[i] = leer.next();
        }
    }

    public Curso crearCurso() {
        System.out.println("Ingrese nombre del curso:");
        String curso = leer.next();
        System.out.println("Ingrese cuantas horas por día se impartirá este curso: ");
        int cantHoras = leer.nextInt();
        System.out.println("Ingrese cuantos días a la semana se dictará este curso: ");
        int cantDias = leer.nextInt();
        String turno;
        do {
            System.out.println("Ingrese en que turno (M o T):");
            turno = leer.next().substring(0, 1);
            if (!turno.equalsIgnoreCase("M") && !turno.equalsIgnoreCase("T")) {
                System.out.println("Por favor ingrese un turno valido.");
            }
        } while (!turno.equalsIgnoreCase("M") && !turno.equalsIgnoreCase("T"));
        System.out.println("Ingrese valor del curso por hora: ");
        double valor = leer.nextDouble();
        String alumnos[] = new String[5];
        cargarAlumnos(alumnos);
        Curso course = new Curso(curso, cantHoras, cantDias, turno, valor, alumnos);
        return course;
    }

    public double calcularGananciaSemanal(Curso curso) {
        double ganancia = curso.getCantidadHorasPorDia() * curso.getPrecioPorHora() * 5 * curso.getCantidadDiasPorSemana();
        return ganancia;
    }

    public void mostrarCurso(Curso curso) {
        System.out.print("Curso: " + curso.getNombreCurso()
                + "\nHoras por dia: " + curso.getCantidadHorasPorDia()
                + "\nDias por semana: " + curso.getCantidadDiasPorSemana()
                + "\nTurno: ");
        if (curso.getTurno().equalsIgnoreCase("M")) {
            System.out.print("Mañana");
        } else {
            System.out.print("Tarde");
        }
        System.out.println("\nPrecio por hora: " + curso.getPrecioPorHora());
        System.out.println("");
        System.out.println("Alumnos:");
        for (int i = 0; i < 5; i++) {
            System.out.println(curso.getAlumnos()[i]);
        }
    }

}
