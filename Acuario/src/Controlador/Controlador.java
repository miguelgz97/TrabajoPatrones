
package Controlador;
import Modelo.Acuario;
import Vista.Main;
import java.util.ArrayList;


public class Controlador {
    
    Acuario acuario;
    
    public Controlador(Acuario acuario){
        this.acuario = acuario;
     
        
    }
    
    
    public void añadirElemento(String elemento){
        acuario.añadirSerVivo(elemento);
    }
    
    
    //public  verEstado(){
        
    //}
    
    
    
    
}
