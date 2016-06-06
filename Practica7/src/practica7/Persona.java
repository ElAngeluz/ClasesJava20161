/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica7;

/**
 *
 * @author Angeluz
 */
public class Persona {
    public String cedula;
    public String nombres;
    public String apellidos;
    public int edad;
    
    public void ImprimirInfoPersonas()
    {
        System.out.println("\n INFO Personal ");
        System.out.println("cedula: "+cedula);
        System.out.println("Nombres: "+nombres);
        System.out.println("Apellidos: "+apellidos);
        System.out.println("Edad: "+ edad);
    }
}
