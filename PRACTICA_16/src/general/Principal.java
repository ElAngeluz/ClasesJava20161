/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package general;

import archivo.*;
import entidades.Persona;
import java.util.ArrayList;
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
        Archivo.crear();
        //INGRESO
        Persona p = new Persona("0999999991","Jorge","Fernandez",20);
        if(Archivo.insertar_registro(p)){
            System.out.println("Se ingresó correctamente el registro");
        }else{
            System.out.println("Ocurrió un error en el ingreso");
        }
        
        //CONSULTA
        try{
            ArrayList<Persona> personas = Archivo.obtener_registros();
            for (Persona tmp:personas) {
                tmp.imprimirInfo();
            }
        }catch(Exception e){
            System.out.println("Ocurrió un error en la lectura");
        }    
        
        //EDICIÓN / ELIMINACIÓN
        try{
            ArrayList<Persona> personas = Archivo.obtener_registros();
            personas.get(0).setEdad(100);
            if(Archivo.actualizar_registros(personas)){
                System.out.println("Se actualizó correctamente los registros");
            }else{
                System.out.println("Ocurrió un error en la edición");
            }
        }catch(Exception e){
            System.out.println("Ocurrió un error en la lectura");
        }  
        System.out.println("------------------------------------");
        try{
            ArrayList<Persona> personas = Archivo.obtener_registros();
            for (Persona tmp:personas) {
                tmp.imprimirInfo();
            }
        }catch(Exception e){
            System.out.println("Ocurrió un error en la lectura");
        }   
        
        
    }   
    
}
