/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package general;
//import java.util.Scanner;

import Utilidad.Menu;
import Utilidad.Utilidad;
import Utilidad.Consulta;
import Utilidad.Validacion;
import IME.Editar;
import IME.Ingreso;
import IME.Eliminar;
import Entidades.Persona;
import Entidades.Sensor;
import Formularios.frmPrincipal;
import java.util.ArrayList;


/**
 *
 * @author Johanna Parrales
 */
public class Principal {
    //ArrayList Globales, registro Personas y Sensores 
    public static ArrayList<Persona> personas = new ArrayList<Persona>();
    public static ArrayList<Sensor> sensores = new ArrayList<Sensor>();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        comenzar();
    }  //Fin del metodo Main
    
    public static void comenzar(){
        int op = 0; //Variable opcion GENERAL
        int flag = 0; //Variable que almacena los valores retornados de los metodos de validacion de tipo de dato
        Menu.incioAplicacion(); //Muestra mensaje de Bienvenida a la aplicacion
        Utilidad.leerTextoPorTecaldo("\nPresione ENTER para continuar");
        do{ //Inicio ciclo DoWhile
            Utilidad.limpiarPantalla(); //Realiza una limpieza de pantalla 
            Menu.imprimirMenuPrincipal(); //Muestra MENU PRINCIPAL contenido en la Clase Menu
            op = Utilidad.leerEnteroPorTeclado("Ingrese opciòn deseada: ");
            flag = Validacion.validarTipoEntero(op); //Validar si op es >= 0
            switch(op){ //Validacion de OPCION mediante estructura SWITCH
                    //Ingreso de PERSONAS o SENSORES
                case 1:
                        Utilidad.limpiarPantalla(); //Realiza una limpieza de pantalla
                        Menu.imprimirMenuIngreso(); //Muestra MENU INGRESO
                        op = Utilidad.leerEnteroPorTeclado("Ingrese opciòn deseada: ");
                        flag = Validacion.validarTipoEntero(op); //Validar si op es >= 0
                            //Validacion op = 1 Personas, op = 2 Sensores
                            if(op==1){
                                Ingreso.ingresoPersona(personas);
                                break;
                            }
                            else if(op==2){
                                Ingreso.ingresoSensor(sensores);
                                break;
                            }
                            Utilidad.mensajeError(flag); //Muestra un mensaje de acuerdo al parametro flag
                            break;
                        
                    //Consulta de PERSONAS o SENSORES
                case 2:
                        Utilidad.limpiarPantalla(); //Realiza una limpieza de pantalla
                        Menu.imprimirMenuConsulta(); //Muestra MENU CONSULTA
                        op = Utilidad.leerEnteroPorTeclado("Ingrese opciòn deseada: ");
                        flag = Validacion.validarTipoEntero(op); //Validar si op es >= 0
                            //Validacion op = 1 Personas, op = 2 Sensores
                            if(op==1){
                                Consulta.consultarPersona();
                                break;
                            }
                            else if(op==2){
                                Consulta.consultarSensor();
                                break;
                            }
                            Utilidad.mensajeError(flag); //Muestra un mensaje de acuerdo al parametro flag
                                break;
                            
                    //Edicion de PERSONAS o SENSORES            
                case 3:
                         Utilidad.limpiarPantalla(); //Realiza una limpieza de pantalla
                        Menu.imprimirMenuEditar(); //Muestra MENU EDITAR
                        op = Utilidad.leerEnteroPorTeclado("Ingrese opciòn deseada: ");
                        flag = Validacion.validarTipoEntero(op); //Validar si op es >= 0
                            //Validacion op = 1 Personas, op = 2 Sensores
                            if(op==1){
                                Editar.editarPersona(personas);
                                break;
                            }
                            else if(op==2){
                                Editar.editarSensor(sensores);
                                break;
                            }
                            Utilidad.mensajeError(flag); //Muestra un mensaje de acuerdo al parametro flag   
                            break;
                            
                    //Eliminacion de PERSONAS o SENSORES
                case 4:
                        Utilidad.limpiarPantalla(); //Realiza una limpieza de pantalla
                        Menu.imprimirMenuEliminar(); //Muestra MENU ELIMINAR
                        op = Utilidad.leerEnteroPorTeclado("Ingrese opciòn deseada: ");
                        flag = Validacion.validarTipoEntero(op); //Validar si op es >= 0
                            //Validacion op = 1 Personas, op = 2 Sensores
                            if(op==1){
                                Eliminar.emilinarPersona(personas);
                                break;
                            }
                            else if(op==2){
                                Eliminar.emilinarSensor(sensores);
                                break;
                            }
                            Utilidad.mensajeError(flag); //Muestra un mensaje de acuerdo al parametro flag  
                            break;
                    
                case 0:
                    Utilidad.limpiarPantalla(); //Realiza una limpieza de pantalla
                    Menu.finAplicacion("Gracias por utilizar la aplicacion de GIES"); //Muestra mensaje de Salida de la aplicacion
                    break;
                    //Valida que la OPCION GENERAL no este fuera del rango permitido
                default:
                    Utilidad.mensajeError(flag); //Muestra un mensaje de acuerdo al parametro flag
            } //Fin de estructura Switch
        }while(op!=0); //Fin de ciclo DoWhile
    }
} //Fin de la clase Principal
