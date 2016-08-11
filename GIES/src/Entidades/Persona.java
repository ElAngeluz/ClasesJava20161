/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.io.Serializable;

/**
 *
 * @author Johanna Parrales
 */
public class Persona implements Serializable{
    private String id;
    private String nombres;
    private String apellidos;
    private int edad;
    
    //Constructor de Clase PERSONA
    public Persona(String id, String nombres, String apellidos, int edad){
        this.id = id;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.edad = edad;
    }

    //Metodos GETTERS y SETTERS de la Clase PERSONA
    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public String getId(){
        return id;
    }
    
    public void setId(String id){
        this.id = id;
    }
    
    public void imprimirInfoPersona(){
        System.out.println("███████████████████");
        System.out.println("███████████████████");
        System.out.println("     INFORMACION PERSONA");
        System.out.println("██ ID: "+id);
        System.out.println("██ Nombres: "+nombres);
        System.out.println("██ Apellidos: "+apellidos);
        System.out.println("██ Edad: "+edad);
        System.out.println("\n███████████████████");
        System.out.println("███████████████████\n");
    }
} //Fin de la clase Persona