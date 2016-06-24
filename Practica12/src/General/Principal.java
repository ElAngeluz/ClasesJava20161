/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package General;

import java.util.ArrayList;

/**
 *
 * @author Estudiante
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Persona> personas = new ArrayList<Persona>();
        Persona p1 = new Persona("000258","Pedro","Rivera",12);
        Persona p2 = new Persona("0002","Pablo","Rivera",12);
        Persona p3 = new Persona("00028","Jocelyn","Lucero",12);
        Persona p4 = new Persona("000255","Paulette","Montalvan",12);
        
        personas.add(p4);
        personas.add(p1);
        personas.add(p2);
        personas.add(p3);
        
        System.out.println("El tamaño es: " + personas.size());
        
        for (int i = 0; i < personas.size(); i++) {
            System.out.println("--------------");
            System.out.println("la cedulas es: "+ personas.get(i).getCedula());
            System.out.println("el apellido es: "+ personas.get(i).getApellidos());            
        }
        
        personas.get(personas.size()-1).setEdad(100);
        personas.get(personas.size()-1).imprimirInfo();
        
    }
    
}

menu  principal 
1.- Empleados
2 sensores
integrantes
salir
opcion: 