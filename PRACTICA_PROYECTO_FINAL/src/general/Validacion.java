/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package general;

import entidades.Persona;
import java.util.ArrayList;

/**
 *
 * @author vr
 */
public class Validacion {
    
    public static int existePersona(ArrayList<Persona> registros, Persona p){
        int i=0;
        for (Persona p2:registros) {
            if(p2.getCedula().equals(p.getCedula())){
                return i;
            }
            i++;
        }
    
        return -1;    
    }
    
}
