
package Controlador;
import Modelo.Acuario;
import Modelo.SistemaControl;

public class Controlador {
    
    Acuario acuario;
    SistemaControl sc;
    
    public Controlador(Acuario acuario, SistemaControl sc){
        this.acuario = acuario;
        this.sc = sc;
        
    }
    
    public String verEstado(){
        String elementos = this.acuario.toString();
        String estadoSistema = this.sc.toString();
        String estadoGlobal = estadoSistema + elementos;
        return estadoGlobal;
    }
    
    public void añadirElemento(String elemento){
        acuario.añadirSerVivo(elemento);
    }
    
    public void modoManual(boolean si, boolean sf, float temperatura){
        this.sc.programaManual(si, sf, temperatura);
    }
    public void modoAutomatico(int modo){
        this.sc.programaAutomatico(modo);
    }
    
}
