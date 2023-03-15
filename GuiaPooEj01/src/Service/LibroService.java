/*
Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título, Autor,
Número de páginas, y un constructor con todos los atributos pasados por parámetro y un
constructor vacío. Crear un método para cargar un libro pidiendo los datos al usuario y
luego informar mediante otro método el número de ISBN, el título, el autor del libro y el
numero de páginas.
 */
package Service;

import Entidad.Libro;
import java.util.Scanner;

/**
 *
 * @author Sebastian
 */
public class LibroService {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    /**
     * Crear un nuevo objeto Libro
     *
     * @return libro
     */
    public Libro crearLibro() {
        Libro book = new Libro();
        System.out.println("Ingrese codigo ISBN:");
        book.setIsbn(leer.nextInt());
        System.out.println("Ingrese Titulo:");
        book.setTitulo(leer.next());
        System.out.println("Ingrese Autor:");
        book.setAutor(leer.next());
        System.out.println("Ingrese numero total de paginas:");
        book.setPaginas(leer.nextInt());
        return book;
    }

    /**
     * Mostrar libro por pantalla.
     *
     * @param book
     */
    public void mostrarLibro(Libro book) {
        System.out.println("N° ISBN: " + book.getIsbn() + "\nTitulo: " + book.getTitulo() + "\nAutor: " + book.getAutor() + "\nN° paginas: " + book.getPaginas());
    }
}
