/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author Sebastian
 */
public class Persona {

    //atributos
    private String nombre;
    private int edad;
    private int id;

    public Persona(String nombre, int edad, int id) {
        //Constructor por parametros
        this.nombre = nombre;
        this.edad = edad;
        this.id = id;
    }

    public Persona() {
        //Constructor por defecto
    }

    //getters & setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", edad=" + edad + ", id=" + id + '}';
    }
    
    
}
