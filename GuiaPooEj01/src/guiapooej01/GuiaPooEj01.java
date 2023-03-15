/*
Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título, Autor,
Número de páginas, y un constructor con todos los atributos pasados por parámetro y un
constructor vacío. Crear un método para cargar un libro pidiendo los datos al usuario y
luego informar mediante otro método el número de ISBN, el título, el autor del libro y el
numero de páginas.
 */
package guiapooej01;

import Entidad.Libro;
import Service.LibroService;

/**
 *
 * @author Sebastian
 */
public class GuiaPooEj01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LibroService ls = new LibroService();
        Libro l1 = ls.crearLibro();
        ls.mostrarLibro(l1);
    }

}

