/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package general;

/**
 *
 * @author vr
 */
public class Elevador {
    public final int PISO_MIN=0;
    public final int PISO_MAX=10;
    public int pisoDeseado;
    public int pisoActual;
    
    public void mover(){
        while(pisoDeseado!=pisoActual){
            if(pisoActual<pisoDeseado){
               subir(); 
            }else{
               bajar();
            }
        
        }    
    }
    
    public void subir(){        
        pisoActual++;
        System.out.println("Subiendo....");
        System.out.println("Piso actual es: "+pisoActual);
    }
    
    public void bajar(){
        pisoActual--;
        System.out.println("Bajando....");
        System.out.println("Piso actual es: "+pisoActual);
    }
    
    
}
