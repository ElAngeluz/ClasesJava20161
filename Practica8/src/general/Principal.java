/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package general;

/**
 *
 * @author Angeluz
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona p   = new Persona();        
        p.setCedula("0999999991");   //p.cedula = "0999999991";      
        p.setNombres("Pedro");
        p.setApellidos("Fernandez");
        p.setEdad(20);
        
        Persona p2 = new Persona("0999999991","Pedro","Fernandez",20);
        
        System.out.println("cedula:"+p.getCedula());
        System.out.println("nombres:"+p.getNombres());
        System.out.println("apellidos:"+p.getApellidos());
        System.out.println("edad:"+p.getEdad());
    }
    
}
