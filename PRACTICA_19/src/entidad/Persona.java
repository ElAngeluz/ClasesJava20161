/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

import java.io.Serializable;

/**
 *
 * @author CISCO
 */
public class Persona implements Serializable{
    private String cedula;
    private String nombres;
    private String apelliods;
    private int edad;

    public Persona() {
    }

    public Persona(String cedula, String nombres, String apelliods, int edad) {
        this.cedula = cedula;
        this.nombres = nombres;
        this.apelliods = apelliods;
        this.edad = edad;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApelliods() {
        return apelliods;
    }

    public void setApelliods(String apelliods) {
        this.apelliods = apelliods;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    

}
