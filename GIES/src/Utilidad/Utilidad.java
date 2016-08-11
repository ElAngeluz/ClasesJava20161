/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilidad;

import java.util.Scanner;

/**
 *
 * @author Johanna Parrales
 */
public class Utilidad {
    //Mètodo para el ingreso de datos ENTEROS por teclado
    public static int leerEnteroPorTeclado(String mensaje){
        Scanner sc = new Scanner(System.in);
        System.out.print(mensaje);
        int n=0;
        try{
            n=sc.nextInt();
        }catch(Exception e){
            return -1; //valor retornado
        }
            return n; //valor retornado
    }
    
    //Metodo para el ingreso de datos de COMA FLOTANTE por teclado
    public static float leerDecimalPorTeclado(String mensaje){
        Scanner sc = new Scanner(System.in);
        System.out.print(mensaje);
        float n=0;
        try{
            n = sc.nextFloat();
        }catch(Exception e){
            return -1; //valor retornado
        }
            return n; //valor retornado
    }
    
    //Metodo para el ingreso de datos de TIPO STRING por teclado
    public static String leerTextoPorTecaldo(String mensaje){
        Scanner sc = new Scanner(System.in);
        System.out.print(mensaje);
        String t = sc.nextLine();
        return t; //valor retornado
    }
    
    //Metodo para realizar una LIMPIEZA DE PANTALLA
    public static void limpiarPantalla(){
        for (int i = 0; i < 50; i++) {
            System.out.println("");
        }
    }
    
    /*Metodo que muestras mensajes de acuerdo al parametro flag
     (ste metodo esta relacionado a los metodos de la clase Validacion:
      validarTipoEntero && validarTipoStringNumeroString, 
      ya que aqui se toma una decision de acuerdo a los valores retornados
      por dichos metodos)*/
    public static void mensajeError(int flag){
        switch(flag){
            case 0:
                //Se muestra al ingresar opciones de menu
                System.out.println("La opcion ingresada no es correcta");
                Utilidad.leerTextoPorTecaldo("Presione ENTER para continuar"); 
                break;
            case 1:
                //Se muestra al ingresar letras en vez numeros en las opciones de menu
                System.out.println("Ingrese solo numeros");
                Utilidad.leerTextoPorTecaldo("Presione ENTER para continuar");
                break;
            case 2:
                //Se muestra al ingresar letras en vez numeros en el ingreso de datos tipo String
                System.out.println("Ingrese solo numeros");
                Utilidad.leerTextoPorTecaldo("Presione ENTER para continuar");
                break;
            case 3:
                //Se muestra al ingresar numeros en vez letras en el ingreso de datos tipo String
                System.out.println("Ingrese solo letras");
                Utilidad.leerTextoPorTecaldo("Presione ENTER para continuar");
                break;
        }
    } // Fin del metodo mensajeError
} //Fin de la clase Utilidad
