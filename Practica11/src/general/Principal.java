/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package general;

import java.util.Scanner;

/**
 *
 * @author Angeluz
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int tam = 0,num = 0,suma=0,prom=0;
        int A[],B[];
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese n:");
        tam = sc.nextInt();
        A=new int[tam];
        B=new int[tam];
        
        
        for (int i = 0; i < A.length; i++) {
            do{
                System.out.print("Ingrese el "+(i+1)+"# valor:");
                num = sc.nextInt();
                if(num<=5 || num>=20)
                    System.out.println("El número debe ser mayor a 5 y menor a 20");
            }while(num<=5 || num>=20);    
            A[i]=num;            
        }
        System.out.println("\n-------------------------");
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i]+" ");
        }
        
        System.out.println("\n-------------------------");
        for (int i = 0; i < A.length; i++) {
            if(i%2==0){
                B[i]=A[i]*3;
            }else{
                B[i]=A[i]*2;
            }
            suma = suma+B[i];
            System.out.print(B[i]+" ");
        }
        System.out.println("\n-------------------------");        
        
        for (int i = B.length-1; i >= 0; i--) {
            System.out.print(B[i]+" ");
        }
        System.out.println("\n-------------------------");        
        System.out.println("La suma total es:"+suma);
        System.out.println("El promedio es:"+(suma/tam));
    }
    
}
