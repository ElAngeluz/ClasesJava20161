/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package General;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Angeluz
 */
public class Principal {
    
    static BufferedReader inp = new BufferedReader (new InputStreamReader(System.in));
    static String Flag="";
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        leerNumeroEntero();
        leerNumeroFraccionario();
        leerTexto();
    }
    
    static void leerNumeroEntero()
    {
        do{
            Flag="";
            imprimirMensaje("un numero entero");
            try {
                int T;
                T = Integer.parseInt(inp.readLine());
            } catch (NumberFormatException e){
                System.out.println("El texto Ingresado no es un totalmente un numero");
                Flag=error();
            } catch (Exception e) {
            }
        }while(Flag.equals("y"));    
    }
    
    static void leerNumeroFraccionario(){
        do{
            Flag="";
            imprimirMensaje("un numero fraccionario");
            try {
                Float T;
                T = Float.parseFloat (inp.readLine());
            } catch (NumberFormatException e){
                System.out.println("El texto Ingresado no es un totalmente un numero");
                Flag=error();
            } catch (Exception e) {
            }
        }while(Flag.equals("y")); 
    }
    
    static void leerTexto(){
        do{
            Flag="";
            imprimirMensaje("un texto");
            try {
                String T;
                T = inp.readLine();
                if (T.isEmpty()) {
                    System.out.println("el texto ingresado esta vacio");
                    Flag = error();                   
                }
            } catch (Exception e) {
                System.out.println("error fatal");
                Flag=error();
            }
        }while(Flag.equals("y")); 
    }
    static String error(){
        try {
            System.out.println("Dersea ingresar otro valor. (y-n)");
            return inp.readLine();
        } catch (IOException e) {
            return null;
        }
    }    
    static void imprimirMensaje(String cadena){
        System.out.println("Ingrese "+cadena+" :");
    }
}
