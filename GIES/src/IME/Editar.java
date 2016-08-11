/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IME;
import Entidades.Persona;
import Entidades.Sensor;
import Utilidad.Utilidad;
import Utilidad.Validacion;
import java.util.ArrayList;
/**
 *
 * @author Johanna Parrales
 */
public class Editar {
    //Metodo para editar registro PERSONA
    public static void editarPersona(ArrayList personas){
        String id = ""; //Variable almacena ID
        String nombre = ""; //Variable almacena nombre
        String apellido = ""; //Variable almacena apellido
        int edad = 0; //Variable almacena edad
        int flag = 0; //Variable que almacena los valores retornados de los metodos de validacion de tipo de dato
        int temp = 0 ; //Variable temporal toma un valor entre 1 y 3
        do{ //Inicio ciclo DoWhile
                id = Utilidad.leerTextoPorTecaldo("██ Ingrese ID: ");
                flag = Validacion.validarTipoStringNumeroString(id); 
                if (flag==3){
                    temp = 2;
                    Utilidad.mensajeError(temp);//Muestra un mensaje de acuerdo al parametro temp
                }
        }while(flag != 2); //Fin de ciclo DoWhile
        for (int i = 0; i < personas.size(); i++) {
              Persona p = (Persona)personas.get(i);
            if (p.getId().equals(id)){
                Utilidad.limpiarPantalla(); //Realiza una limpieza de pantalla 
                System.out.println("███████████████████");
                System.out.println("███████████████████");
                System.out.println("        EDITAR PERSONA");
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
         
                p.setId(id); 
                p.setNombres(nombre);
                p.setApellidos(apellido);
                p.setEdad(edad);
                System.out.println("La informacion se ha modificado correctamente");
                Utilidad.leerTextoPorTecaldo("Presione ENTER para continuar");
        
            }else{
                System.out.println("El ID ingresado no se ha encontrado o no existe"); 
                Utilidad.leerTextoPorTecaldo("Presione ENTER para continuar");
            }
        } //Fin de ciclo For
        
    } //Fin del metodo editarPersona
    
    //Metodo para editar registro SENSOR
    public static void editarSensor(ArrayList sensores){
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
        do{ //Inicio ciclo DoWhile
            id = Utilidad.leerTextoPorTecaldo("██ Ingrese ID: ");
            flag = Validacion.validarTipoStringNumeroString(id); 
                if (flag==3){
                    temp = 2;
                    Utilidad.mensajeError(temp);//Muestra un mensaje de acuerdo al parametro temp
                }
        }while(flag != 2);
        for (int i = 0; i < sensores.size(); i++) {
              Sensor p = (Sensor)sensores.get(i);
            if (p.getId().equals(id)){
                Utilidad.limpiarPantalla(); //Realiza una limpieza de pantalla 
                System.out.println("███████████████████");
                System.out.println("███████████████████");
                System.out.println("        EDITAR SENSOR");
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
         
                //Cambiando datos haciendo uso de los SETTERS
                p.setId(id); 
                p.setNombre(nombre);
                p.setFabricante(fabricante);
                p.setModelo(modelo);
                p.setUbicacion(ubicacion);
                p.setValorActual(vActual);
                p.setTipo(tipo);
                p.setValorAlarma(vAlarma);
                p.setDescripcion(descripcion);
                p.setEstado(estado);
                        
                System.out.println("La informacion se ha modificado correctamente");
                Utilidad.leerTextoPorTecaldo("Presione ENTER para continuar");
        
            }else{
                System.out.println("El ID ingresado no se ha encontrado o no existe"); 
                Utilidad.leerTextoPorTecaldo("Presione ENTER para continuar");
            } 
        } //Fin de ciclo For
    } //Fin del metodo editarSensor
} //Fin de la clase Editar
