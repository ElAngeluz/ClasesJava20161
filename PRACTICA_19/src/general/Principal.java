/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package general;

import formulario.FrmPrincipal;

/**
 *
 * @author CISCO
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic 
        
        if (archivo.Archivo.crear()) {
            FrmPrincipal frm = new FrmPrincipal();
            frm.setVisible(true);
        }
        
    }
    
}
