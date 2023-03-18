/*
Realizar una clase llamada Cadena que tenga como atributos una frase (de tipo de
String) y su longitud. En el main se creará el objeto y se le pedirá al usuario que ingrese
una frase que puede ser una palabra o varias palabras separadas por un espacio en
blanco y a través de los métodos set, se guardará la frase y la longitud de manera
automática según la longitud de la frase ingresada. Deberá además implementar los
siguientes métodos:
a) Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la
frase ingresada.
b) Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla. Por
ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".
c) Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario y
contabilizar cuántas veces se repite el carácter en la frase, por ejemplo:
d) Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.
e) Método compararLongitud(String frase), deberá comparar la longitud de la frase que
compone la clase con otra nueva frase ingresada por el usuario.
f) Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena
con una nueva frase ingresada por el usuario y mostrar la frase resultante.
g) Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se
encuentren en la frase, por algún otro carácter seleccionado por el usuario y mostrar
la frase resultante.
h) Método contiene(String letra), deberá comprobar si la frase contiene una letra que
ingresa el usuario y devuelve verdadero si la contiene y falso si no.
 */
package Entidad;

/**
 *
 * @author Sebastian
 */
public class Cadena {

    //atributos
    private String frase;
    private int longitud;

    //constructor
    public Cadena() {

    }

    //getter & setter
    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    //metodos
    public void mostrarVocales() {
        //deberá contabilizar la cantidad de vocales que tiene la frase ingresada.
        String letra;
        int cont = 0;
        for (int i = 0; i < longitud; i++) {
            letra = frase.substring(i, i + 1);
            if (letra.equalsIgnoreCase("a") || letra.equalsIgnoreCase("e") || letra.equalsIgnoreCase("i") || letra.equalsIgnoreCase("o") || letra.equalsIgnoreCase("u")) {
                cont++;
            }
        }
        System.out.println("La palabra tiene " + cont + " vocales.");
    }

    public void invertirFrase() {
        //deberá invertir la frase ingresada y mostrarla por pantalla. Por ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".
        for (int i = longitud; i > 0; i--) {
            System.out.print(frase.substring(i - 1, i));
        }
        System.out.println("");
    }

    public void vecesRepetido(String letra) {
        //recibirá un carácter ingresado por el usuario y contabilizar cuántas veces se repite el carácter en la frase, por ejemplo: 
        //Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.
        int cont = 0;
        for (int i = 0; i < longitud; i++) {
            if (frase.substring(i, i + 1).equalsIgnoreCase(letra)) {
                cont++;
            }
        }
        System.out.println("El caracter '" + letra + "' se repite " + cont + " veces.");
    }

    public void compararLongitud(String frase) {
        //deberá comparar la longitud de la frase que compone la clase con otra nueva frase ingresada por el usuario.
        if (frase.length() == this.frase.length()) {
            System.out.println("Las cadenas tienen la misma longitud.");
        } else {
            System.out.println("Las cadenas tienen distinta longitud.");
        }
    }

    public void unirFrases(String frase) {
        //deberá unir la frase contenida en la clase Cadena con una nueva frase ingresada por el usuario y mostrar la frase resultante.
        String concat = this.frase.concat(" " + frase);
        System.out.println(concat);

    }

    public void reemplazar(String letra) {
        //deberá reemplazar todas las letras “a” que se encuentren en la frase, por algún otro carácter seleccionado por el usuario y mostrar la frase resultante.
        String replace = frase.replace('a', letra.charAt(0));
        System.out.println(replace);
    }

    public boolean contiene(String letra) {
        //deberá comprobar si la frase contiene una letra que ingresa el usuario y devuelve verdadero si la contiene y falso si no.
        for (int i = 0; i < longitud; i++) {
            if (frase.substring(i, i + 1).equalsIgnoreCase(letra)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Cadena{" + "frase=" + frase + ", longitud=" + longitud + '}';
    }

}
