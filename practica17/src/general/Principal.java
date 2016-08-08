/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package general;

import javax.swing.JFrame;

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
    VentanaPrincipal v = new VentanaPrincipal();
    v.setSize(300, 250);
    v.setVisible(true);
    v.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
