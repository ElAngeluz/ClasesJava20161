/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller;
import java.util.Scanner;

/**
 *
 * @author Angeluz
 */
public class principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese el tamano del arreglo: ");        
        int arregloA[] = new int[sc.nextInt()];
        int valida = 0; //controlador de indice
        int num = 0; //numero que almacena el valor ingresado por el usuario
        while(valida < arregloA.length)
        {
            System.out.println("Ingrese numero (recuerde debe ser mayor a 5 y menor a 20) "+ (valida+1) + " : ");
            num = sc.nextInt();
            if (num> 5 && num <20) {
                arregloA[valida] = num;
                valida++;
            }else
                System.out.println("El numero no esta en el rango solicitado. Ingrese nuevo numero");
        }        
        int arregloB[] = new int[arregloA.length];
        valida = 0;
        while(valida < arregloA.length)
        {
            if (valida == 0) {
                arregloB[valida] = arregloA[valida]*3;
            }
            else if(valida%2==0){
                arregloB[valida] = arregloA[valida]*3;
            }
            else{
                arregloB[valida] = arregloA[valida]*2;
            }
            valida++;
        }
        int total=0;
        System.out.println("\n\n\nNumeros inversos del segundo arreglo: \n");
        for (int i = 1; i <= arregloB.length; i++) {            
            total += arregloB[i-1];           
            System.out.println("Indice "+(arregloB.length - i + 1) + " : " + arregloB[arregloB.length - i]);
        }
        
        System.out.println("Suma total de los numeros: " + total + "\n Promdio de numeros ingresados: " + total/(arregloB.length));
    }
    
}
