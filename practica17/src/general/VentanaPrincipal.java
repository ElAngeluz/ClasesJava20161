/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package general;
import java.awt.FlowLayout;
import javax.swing.*;
/**
 *
 * @author Estudiante
 */
public class VentanaPrincipal extends JFrame{
    JLabel lnombres;
    JLabel lapellidos;
    
    public VentanaPrincipal(){
        super("Practica 17");
        setLayout(new FlowLayout());
        
        lnombres = new JLabel("nombres");
        add(lnombres);
    }
    
}
