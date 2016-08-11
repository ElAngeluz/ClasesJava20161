/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IME;
import Entidades.Persona;
import Entidades.Sensor;
import general.Principal;
import Utilidad.Utilidad;
import Utilidad.Validacion;
import java.util.ArrayList;
/**
 *
 * @author Johanna Parrales
 */
public class Ingreso {
    
    //Metodo para el ingreso de informacion PERSONA
    public static void ingresoPersona(ArrayList personas){
        String id = ""; //Variable almacena ID
        String nombre = ""; //Variable almacena nombre
        String apellido = ""; //Variable almacena apellido
        int edad = 0; //Variable almacena edad
        int flag = 0; //Variable que almacena los valores retornados de los metodos de validacion de tipo de dato
        int temp = 0 ; //Variable temporal toma un valor entre 1 y 3
        Utilidad.limpiarPantalla();//Realiza una limpieza de pantalla 
        System.out.println("███████████████████");
        System.out.println("███████████████████");
        System.out.println("       INGRESO PERSONA");
            do{ //Inicio ciclo DoWhile
                id = Utilidad.leerTextoPorTecaldo("██ Ingrese ID: ");
                flag = Validacion.validarTipoStringNumeroString(id); 
                if (flag==3){
                    temp = 2;
                    Utilidad.mensajeError(temp);//Muestra un mensaje de acuerdo al parametro temp
                }
            }while(Validacion.idPersonaDuplicado(personas, id) || flag != 2); //Fin de ciclo DoWhile
            do{ //Inicio ciclo DoWhile
                nombre = Utilidad.leerTextoPorTecaldo("██ Ingrese Nombre: ");
                flag = Validacion.validarTipoStringNumeroString(nombre); 
               if (flag==2){
                   temp = 3;
                   Utilidad.mensajeError(temp); //Muestra un mensaje de acuerdo al parametro temp 
                }
            }while(flag != 3); //Fin de ciclo DoWhile
            do{ //Inicio ciclo DoWhile
                apellido = Utilidad.leerTextoPorTecaldo("██ Ingrese Apellido: ");
                flag = Validacion.validarTipoStringNumeroString(apellido); 
                if (flag==2){
                     temp = 3;
                     Utilidad.mensajeError(temp); //Muestra un mensaje de acuerdo al parametro temp
                }
            }while(flag != 3); //Fin de ciclo DoWhile
            do{ //Inicio ciclo DoWhile
                edad = Utilidad.leerEnteroPorTeclado("██ Ingrese Edad: ");
                flag = Validacion.validarTipoEntero(edad);
                if (flag==1){
                    Utilidad.mensajeError(flag); //Muestra un mensaje de acuerdo al parametro flag 
                }
            }while(flag != 0); //Fin de ciclo DoWhile
        System.out.println("\n███████████████████");
        System.out.println("███████████████████");
        
        Persona a = new Persona(id, nombre, apellido, edad); //Creacion de objeto tipo persona
        
            if (Principal.personas.add(a)){
                System.out.println("La informacion se ha ingresado correctamente");
                Utilidad.leerTextoPorTecaldo("Presione ENTER para continuar");
            }
            else{
                System.out.println("La informacion no se ha podido ingresar");
                Utilidad.leerTextoPorTecaldo("Presione ENTER para continuar");
            }
        
    } // Fin de metodo ingresoPersona
    
    //Metodo para el ingreso de informacion SENSOR
    public static void ingresoSensor(ArrayList sensores){
        String id = ""; //Variable almacena ID
        String nombre = ""; //Variable almacena nombre
        String fabricante = ""; //Variable almacena fabricante
        String modelo = ""; //Variable almacena modelo 
        String ubicacion = ""; //Variable almacena ubicacion
        float vActual = 0; //Variable almacena valor actual
        String tipo = ""; //Variable almacena tipo (Movimiento y otros)
        float vAlarma = 0; //Variable almacena valor alarma
        String descripcion = ""; //Variable almacena descripcion
        int estado = 0; //Variable almacena estado (On/Off)
        int flag = 0; //Variable que almacena los valores retornados de los metodos de validacion de tipo de dato
        int temp = 0 ; //Variable temporal toma un valor entre 1 y 3
        Utilidad.limpiarPantalla();//Realiza una limpieza de pantalla 
        System.out.println("███████████████████");
        System.out.println("███████████████████");
        System.out.println("       INGRESO SENSOR");
        do{ //Inicio ciclo DoWhile
            id = Utilidad.leerTextoPorTecaldo("██ Ingrese ID: ");
            flag = Validacion.validarTipoStringNumeroString(id); 
                if (flag==3){
                    temp = 2;
                    Utilidad.mensajeError(temp);//Muestra un mensaje de acuerdo al parametro temp
                }
        }while(Validacion.idSensorDuplicado(sensores, id) || flag != 2);
        do{ //Inicio ciclo DoWhile
            nombre = Utilidad.leerTextoPorTecaldo("██ Ingrese Nombre: ");
            flag = Validacion.validarTipoStringNumeroString(nombre); 
               if (flag==2){
                   temp = 3;
                   Utilidad.mensajeError(temp); //Muestra un mensaje de acuerdo al parametro temp 
                }
        }while(flag != 3); //Fin de ciclo DoWhile
        do{ //Inicio ciclo DoWhile
            fabricante = Utilidad.leerTextoPorTecaldo("██ Ingrese Fabricante: ");
            flag = Validacion.validarTipoStringNumeroString(fabricante); 
               if (flag==2){
                   temp = 3;
                   Utilidad.mensajeError(temp); //Muestra un mensaje de acuerdo al parametro temp 
                }
        }while(flag != 3); //Fin de ciclo DoWhile
        
        modelo = Utilidad.leerTextoPorTecaldo("██ Ingrese Modelo: ");
        ubicacion = Utilidad.leerTextoPorTecaldo("██ Ingrese Ubicacion: ");
        vActual = Utilidad.leerEnteroPorTeclado("██ Ingrese Valor Actual: ");
           
        do{ //Inicio ciclo DoWhile
            tipo = Utilidad.leerTextoPorTecaldo("██ Ingrese Tipo: ");
            flag = Validacion.validarTipoStringNumeroString(tipo); 
               if (flag==2){
                   temp = 3;
                   Utilidad.mensajeError(temp); //Muestra un mensaje de acuerdo al parametro temp 
                }
        }while(flag != 3); //Fin de ciclo DoWhile
        
        vAlarma = Utilidad.leerEnteroPorTeclado("██ Ingrese Valor Alarma: ");
        
        do{ //Inicio ciclo DoWhile
            descripcion = Utilidad.leerTextoPorTecaldo("██ Ingrese Descripcion: ");
            flag = Validacion.validarTipoStringNumeroString(descripcion); 
               if (flag==2){
                   temp = 3;
                   Utilidad.mensajeError(temp); //Muestra un mensaje de acuerdo al parametro temp 
                }
        }while(flag != 3); //Fin de ciclo DoWhile
        do{ //Inicio ciclo DoWhile
            estado = Utilidad.leerEnteroPorTeclado("██ Ingrese Estado (1 ON - 0 OFF): ");
            flag = Validacion.validarTipoEntero(estado);
                if (flag==1){
                    Utilidad.mensajeError(flag); //Muestra un mensaje de acuerdo al parametro flag 
                }
        }while(flag != 0); //Fin de ciclo DoWhile
        System.out.println("\n███████████████████");
        System.out.println("███████████████████");
        //Creacion de objeto tipo Sensor
        Sensor b = new Sensor(id, nombre, fabricante, modelo, ubicacion, vActual, tipo, vAlarma, descripcion, estado);
        
            if (Principal.sensores.add(b)){
                System.out.println("La informacion se ha ingresado correctamente");
                Utilidad.leerTextoPorTecaldo("Presione ENTER para continuar");
            }
            else{
                System.out.println("La informacion no se ha podido ingresar");
                Utilidad.leerTextoPorTecaldo("Presione ENTER para continuar");
            }
        
    } // Fin de metodo ingresoSensor
} // Fin de la clase Ingreso
