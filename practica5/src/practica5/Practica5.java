/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica5;

/**
 *
 * @author Angeluz
 */
public class Practica5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String Cadena = "Pedro es uno de los mejores estudiantes y el mas sexy del salon";
        System.out.println("uso de contains: "+ Cadena.contains("es"));
        System.out.println("uso de equals: " + Cadena.equals(Cadena.toUpperCase()));
        System.out.println("uso de equalsignorecase: "+ Cadena.equalsIgnoreCase(Cadena.toUpperCase()));
        System.out.println("uso de length: "+ Cadena.length());
        
    }
    
}
