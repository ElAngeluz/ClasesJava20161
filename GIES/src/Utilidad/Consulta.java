/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilidad;
import Entidades.Persona;
import Entidades.Sensor;
import general.Principal;
import java.util.ArrayList;

/**
 *
 * @author Johanna Parrales
 */
public class Consulta {
    //Metodo para consultar informacion de PERSONA
    public static void consultarPersona(){
        Utilidad.limpiarPantalla(); //Realiza una limpieza de pantalla
        for(Persona a:Principal.personas)
            a.imprimirInfoPersona();
        Utilidad.leerTextoPorTecaldo("Presione ENTER para continuar");
    }
    
    //Metodo para consultar informacion de SENSOR
    public static void consultarSensor(){
        Utilidad.limpiarPantalla(); //Realiza una limpieza de pantalla
        for(Sensor b:Principal.sensores)
            b.imprimirInfoSensor();
        Utilidad.leerTextoPorTecaldo("Presione ENTER para continuar");
    }
    
    //Metodo que realiza una busqueda en el ArrayList para encontrar un registro segun el ID ingresado por el usuario
    public static ArrayList registrosPorIdSensor(ArrayList registros, String id){
        ArrayList resultado = new ArrayList();
        for(int i=0;i<registros.size();i++){
            Sensor p = (Sensor)registros.get(i);
                if(p.getId().contains(id)){
                    resultado.add(p);
                }
        }
        return resultado;
    }    
    
    //Metodo que realiza una busqueda en el ArrayList, retorna 1 o -1 segun el ID ingresdo por el usuario
    public static int indicePorIdSensor(ArrayList registros, String id){
        for(int i=0;i<registros.size();i++){
            Sensor p = (Sensor)registros.get(i);
                if(p.getId().equals(id)){
                    return i;
                }
        }
        return -1;
    } 
    
    //Metodo que realiza una busqueda en el ArrayList para encontrar un registro segun el ID ingresado por el usuario
    public static ArrayList registrosPorIdPersona(ArrayList registros, String id){
        ArrayList resultado = new ArrayList();
        for(int i=0;i<registros.size();i++){
            Persona p = (Persona)registros.get(i);
                if(p.getId().contains(id)){
                    resultado.add(p);
                }
        }
        return resultado;
    }    
    
    //Metodo que realiza una busqueda en el ArrayList, retorna 1 o -1 segun el ID ingresdo por el usuario
    public static int indicePorIdPersona(ArrayList registros, String id){
        for(int i=0;i<registros.size();i++){
            Persona p = (Persona)registros.get(i);
                if(p.getId().equals(id)){
                    return i;
                }
        }
        return -1;
    } 
    
} //Fin de la clase Consulta
