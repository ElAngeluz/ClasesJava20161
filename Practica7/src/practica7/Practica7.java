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
public class Practica7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona persona= new Persona(), persona2 = new Persona();
        
        persona.cedula = "0123456789";
        persona.apellidos = "Rivera V.";
        persona.edad = 22;
        persona.nombres = "Pedro Abel";
        
        persona2.apellidos = "Vera R.";
        persona2.cedula = "0123456789";
        persona2.edad = 30;
        persona2.nombres = "Pablo Fernando";
        
        persona2.ImprimirInfoPersonas();
        imprimirPersona(persona);
        
    }
    
    public static boolean esMayorDeEdad(int edad)
    {
        if (edad>=18)
            return true;
        else
            return false;
    }
    
    public static void imprimirPersona(Persona p)
    {       
        System.out.println("\n INFO Personal ");
        System.out.println("cedula: "+p.cedula);
        System.out.println("Nombres: "+p.nombres);
        System.out.println("Apellidos: "+p.apellidos);
        System.out.println("Edad: "+ p.edad);   
        
        if (esMayorDeEdad(p.edad)) 
            System.out.println(p.nombres + p.apellidos + " Es mayor de edad");
        else
            System.out.println(p.nombres + p.apellidos + " Es menor de edad");
    }
}
