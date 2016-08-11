/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilidad;

/**
 *
 * @author Johanna Parrales
 */
public class Menu {
    //Metodo para mostrar el MENU PRINCIPAL
    public static void imprimirMenuPrincipal(){
        System.out.println("███████████████████");
        System.out.println("███████████████████");
        System.out.println("         MENU PRINCIPAL");
        System.out.println("██ 1.- Ingreso");
        System.out.println("██ 2.- Consulta");
        System.out.println("██ 3.- Editar");
        System.out.println("██ 4.- Eliminiar");
        System.out.println("██ 0.- Salir\n");
        System.out.println("███████████████████");
        System.out.println("███████████████████");
    }
    
    //Metodo para mostrar el MENU INGRESO
    public static void imprimirMenuIngreso(){
        System.out.println("███████████████████");
        System.out.println("███████████████████");
        System.out.println("           INGRESO");
        System.out.println("██ 1.- Persona");
        System.out.println("██ 2.- Sensor\n");
        System.out.println("███████████████████");
        System.out.println("███████████████████");
    }
    
    //Metodo para mostrar el MENU CONSULTA
    public static void imprimirMenuConsulta(){
        System.out.println("███████████████████");
        System.out.println("███████████████████");
        System.out.println("           CONSULTA");
        System.out.println("██ 1.- Persona");
        System.out.println("██ 2.- Sensor\n");
        System.out.println("███████████████████");
        System.out.println("███████████████████");
    }
    
    //Metodo para mostrar el MENU EDITAR
     public static void imprimirMenuEditar(){
        System.out.println("███████████████████");
        System.out.println("███████████████████");
        System.out.println("           EDITAR");
        System.out.println("██ 1.- Persona");
        System.out.println("██ 2.- Sensor\n");
        System.out.println("███████████████████");
        System.out.println("███████████████████");
    }
    
    //Metodo para mostrar el MENU ELIMINAR
    public static void imprimirMenuEliminar(){
        System.out.println("███████████████████");
        System.out.println("███████████████████");
        System.out.println("           ELIMINAR");
        System.out.println("██ 1.- Persona");
        System.out.println("██ 2.- Sensor\n");
        System.out.println("███████████████████");
        System.out.println("███████████████████");
    }
    
    //Metodo que muestra mensaje de Bienvenida a la aplicacion
    public static void incioAplicacion(){
        System.out.println("                         █ ");
        System.out.println("█████                 █                              █████");
        System.out.println("█       █  █ ███  ███  ███   ██  ██  ███ ███  █    ███      ███");
        System.out.println("███    █  █ █  █ █   █ █  █   █  █  █  ██  █  █  █   █   █     █");
        System.out.println("█       ███ █  █  ███  ███ █ █     █  ███ █  █  █   ███  ███");
        System.out.println("\n\n\n");
        System.out.println("              █");
        System.out.println("              █             █████");
        System.out.println("           ███   ███        █    ███   █    █ ███");
        System.out.println("          █    █  ██         █    █   █   █  █ █    █");
        System.out.println("           ███   ███   ███      ███ █   █    ███ █");  
        System.out.println("\n\n\n");
        System.out.println("        █ █   █████                              █ █");
        System.out.println("               █         ████  ████     ███");
        System.out.println("               █   ██     █    ███       █");
        System.out.println("               █████  ████  ████ ███");
        System.out.println("\n\n\n       (GESTION DE LA INFORMACION DE EMPLEADOS Y SENSORES)");
            
    }
    
    //Metodo que muestra mensaje de Salida de la aplicacion
    public static void finAplicacion(String mensaje){
        System.out.println("███████████████████████████");
        System.out.println("███████████████████████████");
        System.out.println(mensaje);
        System.out.println("███████████████████████████");
        System.out.println("███████████████████████████");
    }
} //Fin de la clase Menu
