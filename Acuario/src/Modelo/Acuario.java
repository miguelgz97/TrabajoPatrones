
package Modelo;

import Controlador.Controlador;
import java.util.Observable;
import java.util.Observer;


public class Acuario implements Observer {
  
    private static Acuario instanciaUnica;
    private SistemaControl sc;
    
    private Acuario(){
        this.sc = new SistemaControl(Acuario.instanciaUnica);
      
    }
    //*PATRON SINGLETON
    public static Acuario getInstancia(){
        if ( instanciaUnica == null){
            System.out.println("PATRON SINGLETON: Creamos unica instancia de Acuario.\n");
            instanciaUnica = new Acuario();
        }
        //Devolvemos unica instancia
        return instanciaUnica;
    }
    
    
    public void añadirSerVivo(String ser){
        switch(ser){
            case "pez":
            //Añadir pez  
                
                System.out.println("TRAZA: PEZ\n");//------------------------------
                
            break;
            case "coral":
                System.out.println("TRAZA: CORAL\n");//------------------------------
                
            break;
            
            case "planta":
                System.out.println("TRAZA: PLANTA\n");//------------------------------
                
            break;
            
            default:
                System.out.println("Error en filtro vida\n");
            break;
            
        }
    }

    @Override
    public void update(Observable o, Object o1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
