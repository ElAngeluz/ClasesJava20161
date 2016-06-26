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
        int num1=70;
        int num2=60;
        byte num3;
        num3=(byte)(num1+num2);
        System.out.println("El resultado es "+num3);
        
        Persona p5,p3,p4;
        p5=p3=p4=new Persona();
        Persona p2;
        p2 = new Persona();
        
        p2.cedula="0999999991";
        p2.nombres="Jorge";
        p2.apellidos="Peralta";
        p2.edad=20;
    }
}
