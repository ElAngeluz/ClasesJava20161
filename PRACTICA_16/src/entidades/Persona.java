/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package entidades;

import java.io.Serializable;

/**
 *
 * @author vr
 */
public class Persona implements Serializable{
    private String cedula;
    private String nombres;
    private String apellidos;
    private int edad;

    public Persona(String cedula, String nombres, String apellidos, int edad) {
        this.cedula = cedula;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.edad = edad;
    }

    public Persona() {
    }

    
    
    
    /**
     * @return the cedula
     */
    public String getCedula() {
        return cedula;
    }

    /**
     * @param cedula the cedula to set
     */
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    /**
     * @return the nombres
     */
    public String getNombres() {
        return nombres;
    }

    /**
     * @param nombres the nombres to set
     */
    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    /**
     * @return the apellidos
     */
    public String getApellidos() {
        return apellidos;
    }

    /**
     * @param apellidos the apellidos to set
     */
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    /**
     * @return the edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public void imprimirInfo(){
        System.out.println("--- DATOS PERSONALES ---");
        System.out.println("cédula:"+cedula);
        System.out.println("nombres:"+nombres);
        System.out.println("apellidos:"+apellidos);
        System.out.println("edad:"+edad);    
    }
    
    
}
