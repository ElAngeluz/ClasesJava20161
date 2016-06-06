/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package general;

import java.util.Scanner;

/**
 *
 * @author vr
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int op = 0;
        System.out.println("SIMULACIÓN ELEVADOR");
        do{
            do{
                imprimirMenu();
                System.out.print("Ingrese la opción deseada: ");
                op = sc.nextInt();
                if(op<1 || op>2){
                    System.out.println("La opción ingresada es incorrecta, ingrese solo 1 o 2. ");
                }
            }while(op<1 || op>2);    

            if(op==1){
                Elevador e = new Elevador();

                System.out.println("PISO ACTUAL: "+e.pisoActual);
                System.out.print("Ingrese el piso deseado: ");
                int piso = sc.nextInt();
                System.out.println("El piso deseado es "+piso);
                e.pisoDeseado = piso;
                e.mover();
            }    
        }while(op!=2);    
    }
    
    public static void imprimirMenu(){
        System.out.println("---- MENÚ PRINCIPAL ----");
        System.out.println("1.- SIMULAR");
        System.out.println("2.- SALIR");    
    }
}
