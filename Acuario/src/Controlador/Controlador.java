
package Controlador;
import Modelo.Acuario;
import Modelo.SistemaControl;
import Vista.Main;
import java.util.ArrayList;


public class Controlador {
    
    Acuario acuario;
    SistemaControl sc;
    
    public Controlador(Acuario acuario, SistemaControl sc){
        this.acuario = acuario;
        this.sc = sc;
        
    }
    
    //public  verEstado(){
        
    //}
    
    public void añadirElemento(String elemento){
        acuario.añadirSerVivo(elemento);
    }
    
    public void modoManual(boolean si, boolean sf, float temperatura){
        System.out.println("CONTRL voy a SC");//------------------------------
        this.sc.programaManual(si, sf, temperatura);
    }
    public void modoAutomatico(int modo){
        System.out.println("CONTRL voy a SC");//------------------------------
        this.sc.programaAutomatico(modo);
    }
    
}
