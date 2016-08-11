
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package archivo;

import Entidades.Persona;
import Entidades.Sensor;
import java.io.IOException;
import java.util.ArrayList;
//import utilidades.Validacion;

/**
 *
 * @author VR
 */
public class Archivo{
    private static final String RUTA_ARCHIVO = "personas.txt";
    private static final String RUTA_SENSOR = "Sensores.txt";
    
    public static boolean crear(){
        EscribirArchivo archivo = new EscribirArchivo();
        try{            
            archivo.abrir(RUTA_ARCHIVO);
            archivo.cerrar();
        }catch(IOException e){
            return false;
        }
        return true;
    }
    
    public static boolean crear_Sensor(){
        EscribirArchivo archivo = new EscribirArchivo();
        try{            
            archivo.abrir(RUTA_SENSOR);
            archivo.cerrar();
        }catch(IOException e){
            return false;
        }
        return true;
    }
    
    public static boolean borrar_contenido(){
        try{
            EscribirArchivo archivo = new EscribirArchivo();
            archivo.borrar_contenido(RUTA_ARCHIVO);
            archivo.cerrar();
        }catch(IOException e){
            return false;
        }
        return true;
    }
    
    public static boolean borrar_contenido_sensor(){
        try{
            EscribirArchivo archivo = new EscribirArchivo();
            archivo.borrar_contenido(RUTA_SENSOR);
            archivo.cerrar();
        }catch(IOException e){
            return false;
        }
        return true;
    }
    
    public static ArrayList<Persona> obtener_registros()throws Exception{
        ArrayList<Persona> personas;
        try{
            LeerArchivo archivo = new LeerArchivo();
            archivo.abrir(RUTA_ARCHIVO);
            personas = archivo.obteniendo_objetos();
            archivo.cerrar();
        }catch(Exception e){
            throw e;
        }    
        return personas;        
    }
    
    public static ArrayList<Sensor> obtener_registros_sensor() throws Exception {
        ArrayList<Sensor> sensor;
        try{
            LeerArchivo archivo = new LeerArchivo();
            archivo.abrir(RUTA_ARCHIVO);
            sensor = archivo.obteniendo_objetos();
            archivo.cerrar();
        }catch(Exception e){
            throw e;
        }    
        return sensor;
    }
    
    public static boolean insertar_registro(Persona p){
        EscribirArchivo archivo = new EscribirArchivo();
        try{
            archivo.abrir(RUTA_ARCHIVO);
            archivo.insertar_objeto(p);
            archivo.cerrar(); 
        }catch(Exception e){
            return false;
        }                          
        return true;
    }
    
    public static boolean insertar_registro_sensor(Sensor s){
        EscribirArchivo archivo = new EscribirArchivo();
        try{
            archivo.abrir(RUTA_SENSOR);
            archivo.insertar_objeto(s);
            archivo.cerrar(); 
        }catch(Exception e){
            return false;
        }                          
        return true;
    }
    
    public static boolean actualizar_registros(ArrayList personas){
        borrar_contenido();
        EscribirArchivo archivo = new EscribirArchivo();
        try{            
            archivo.abrir(RUTA_ARCHIVO);
            for(int i=0;i<personas.size();i++)
                archivo.insertar_objeto(personas.get(i));
            archivo.cerrar();
        }catch(Exception e){
            return false;
        }                 
        return true;
    }
    
    public static boolean actualizar_registros_sensor (ArrayList sensores){
        borrar_contenido_sensor();
        EscribirArchivo archivo = new EscribirArchivo();
        try{            
            archivo.abrir(RUTA_SENSOR);
            for(int i=0;i<sensores.size();i++)
                archivo.insertar_objeto(sensores.get(i));
            archivo.cerrar();
        }catch(Exception e){
            return false;
        }                 
        return true;
    }
    
    public static boolean actualizarDatosPersona(Persona p){        
        ArrayList<Persona> registros = null;
        
        try{
            registros = Archivo.obtener_registros();
            for(int i=0;i<registros.size();i++){
                Persona tmp = registros.get(i); 
                if(tmp.getId().equals(p.getId())){                
                    p.setId(tmp.getId());
                    p.setNombres(tmp.getNombres());
                    p.setApellidos(tmp.getApellidos());
                    p.setEdad(tmp.getEdad());
                    return true;
                }
            }
        }catch(Exception e){
            return false;
        }    
        return false;
    } 
}