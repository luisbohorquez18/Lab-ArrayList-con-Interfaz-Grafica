/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labpeliculas;

/**
 *
 * @author Dell
 */
public class Peli {
    private String nombre; 
private String director;
private int ano;

//constructor de la clase producto

public Peli(String s, String i, int o) { 
nombre = s; 
director = i; 
ano = o;
                                 } 
//método de la clase object
public String toString(){ 
return ("Nombre: "+nombre+" Director: "+director); 
} 

//métodos de encapsulamiento
public String getNombre() { 
return this.nombre; 
} 

}
