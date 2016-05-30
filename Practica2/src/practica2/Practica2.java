/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica2;

/**
 *
 * @author Angeluz
 */
public class Practica2 {

    /**
     * @param args the command line arguments
     */
    //@SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        int sum=0;        
        // TODO code application logic here        
        for (int i = 0; i < args.length; i++) {
            //System.out.println("hola: " +args[i]);
            sum = sum + Integer.parseInt(args[i]);
        }
        System.out.println(sum);
    }
    
}
