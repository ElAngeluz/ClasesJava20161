/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica10;

/**
 *
 * @author Angeluz
 */
public class Practica10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int notas[] = new int[5];
        notas[0] = 11;
        notas[1]=12;
        notas[2]=13;
        notas[3]=14;
        notas[4]=15;
        
        for (int i = 1; i <= notas.length; i++) {
            //presentacion ascendente
            System.out.println("Notas " + i + " : " + notas[i-1]);
        }
        System.out.println("\n");
        for (int i = 1; i <= notas.length; i++) {
            //presentacion descendente
            System.out.println("Notas "+(notas.length - i + 1) + " : " + notas[notas.length - i]);
        }
        System.out.println("\n");
        //presentacion de indice par
        for (int i =1; i <= notas.length; i++) {
            if (i%2==0) {
                System.out.println("Notas " + i + " : " + notas[i-1]);
            }
        }   
    }
    
}
