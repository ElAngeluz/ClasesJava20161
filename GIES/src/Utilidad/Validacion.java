/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilidad;

import Entidades.Persona;
import Entidades.Sensor;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author JohannaParrales
 */
public class Validacion {
    /*Metodo para validar duplicado de ID Persona
      retorna un valor logico false o true*/
    public static boolean idPersonaDuplicado(ArrayList personas, String id){
        for (int i = 0; i < personas.size(); i++) {
            Persona p = (Persona)personas.get(i);
            if (p.getId().equals(id)){
                System.out.println("El ID ya ha sido ingresado ");
                return true; //valor retornado
            }
        }
        return false; //valor retornado
    }
    
    /*Metodo para validar duplicado de ID Sensor
      retorna un valor logico false o true*/
    public static boolean idSensorDuplicado(ArrayList sensores, String id){
        for (int i = 0; i < sensores.size(); i++) {
            Sensor p = (Sensor)sensores.get(i);
            if (p.getId().equals(id)){
                System.out.println("El ID ya ha sido ingresado.");
                return true; //valor retornado
            }
        }
        return false; //valor retornado
    }
    
    /*Metodo que valida un dato tipo entero ingresado por teclado,
      retorna un valor entre 0 y 1*/
     public static int validarTipoEntero(int op){
        int valor;
        if (op>=0)
            valor = 0; //entero positivo
        else 
            valor = 1; //entero negativo
        
        return valor; //valor retornado       
    }
     
    /*Metodo que valida un dato tipo String ingresado por teclado
      retorna un valor entre 2 y 3*/
    public static int validarTipoStringNumeroString(String id_letras){
        int algunDigito = 0;
        int algunaLetra = 0;
        int valor = 0;
            //ciclo para recorrer un parametro String 
            for (int i = 0; i < id_letras.length(); i++) { 
                if (Character.isDigit(id_letras.charAt(i)))
                    //es un digito
                    algunDigito ++;
                else 
                    algunaLetra ++;
                    //no es un digito

            }

            if (algunDigito == id_letras.length()){
                valor = 2; //solo digitos 
            } 
            if(algunaLetra == id_letras.length()){
                valor = 3; //solo letras
            }
            return valor; //valor retornado
    }     

    public static int validarTipoEntero(Date edad) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
} //Fin de la clase Validacion
