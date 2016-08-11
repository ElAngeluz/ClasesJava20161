/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IME;
import Entidades.Persona;
import Entidades.Sensor;
import Utilidad.Consulta;
import Utilidad.Utilidad;
import Utilidad.Validacion;
import java.util.ArrayList;
/**
 *
 * @author Johanna Parrales
 */
public class Eliminar {
    //Metodo para eliminar registro PERSONA
    public static void emilinarPersona(ArrayList personas){
        String ids = ""; //Variable almacena ID
        int flag = 0; //Variable que almacena los valores retornados de los metodos de validacion de tipo de dato
        int temp = 0 ; //Variable temporal toma un valor entre 1 y 3
        ArrayList temporal = null;
        do{
            do{ //Inicio ciclo DoWhile
                ids = Utilidad.leerTextoPorTecaldo("██ Ingrese ID o (o)CERO para volver al Menu Principal: ");
                flag = Validacion.validarTipoStringNumeroString(ids); 
                if (flag==3){
                    temp = 2;
                    Utilidad.mensajeError(temp); //Muestra un mensaje de acuerdo al parametro temp
                }
            }while(flag != 2); //Fin de ciclo DoWhile
            if(ids.equals("0"))return;
                temporal = Consulta.registrosPorIdPersona(personas, ids);        
            if(temporal.size() == 0)
                System.out.println("NO EXISTE LA PERSONA CON EL ID INDICADO");
            else if(temporal.size()>1)
                System.out.println("LA CONSULTA RETORNO MUCHOS REGISTROS Y SOLO SE PUEDE ELIMINAR UN ID A LA VEZ");
            
        }while(temporal.size() != 1);
                Utilidad.limpiarPantalla();//Realiza una limpieza de pantalla 
                System.out.println("███████████████████");
                System.out.println("███████████████████");
                System.out.println("       ELIMINAR PERSONA");
               // System.out.println(temporal);
                System.out.println("\n███████████████████");
                System.out.println("███████████████████");
                System.out.println("Eliminando...");
                System.out.println("La informacion se ha eliminada correctamente");
                Persona p = (Persona)temporal.get(0);
                personas.remove(Consulta.indicePorIdPersona(personas,p.getId()));
                Utilidad.leerTextoPorTecaldo("Presione ENTER para continuar");
         
    }
    
    
    //Metodo para eliminar registro SENSOR
    public static void emilinarSensor(ArrayList sensores){
       String ids = "";
        int flag = 0; //Variable que almacena los valores retornados de los metodos de validacion de tipo de dato
        int temp = 0 ; //Variable temporal toma un valor entre 1 y 3
        ArrayList temporal = null;
        do{
            do{ //Inicio ciclo DoWhile
            ids = Utilidad.leerTextoPorTecaldo("██ Ingrese ID o (o)CERO para volver al Menu Principal: ");
            flag = Validacion.validarTipoStringNumeroString(ids); 
                if (flag==3){
                    temp = 2;
                    Utilidad.mensajeError(temp);//Muestra un mensaje de acuerdo al parametro temp
                }
            }while(flag != 2);
            if(ids.equals("0"))return;
                temporal = Consulta.registrosPorIdSensor(sensores, ids);        
            if(temporal.size()==0)
                System.out.println("NO EXISTE EL SENSOR CON EL ID INDICADO");
            else if(temporal.size()>1)
                System.out.println("LA CONSULTA RETORNO MUCHOS REGISTROS Y SOLO SE PUEDE ELIMINAR UN ID A LA VEZ");
            
        }while(temporal.size()!=1);
                Utilidad.limpiarPantalla();//Realiza una limpieza de pantalla 
                System.out.println("███████████████████");
                System.out.println("███████████████████");
                System.out.println("       ELIMINAR SENSOR");
                //System.out.println(temporal);
                System.out.println("\n███████████████████");
                System.out.println("███████████████████");
                System.out.println("Eliminando...");
                System.out.println("La informacion se ha eliminada correctamente");
            Sensor p = (Sensor)temporal.get(0);
            sensores.remove(Consulta.indicePorIdSensor(sensores,p.getId()));
            Utilidad.leerTextoPorTecaldo("Presione ENTER para continuar");
    }
}
