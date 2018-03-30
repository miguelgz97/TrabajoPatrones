
package Modelo;

import java.util.Observable;
import java.util.Observer;
import javax.security.auth.Subject;
import javax.swing.JOptionPane;

public class GestGatewayRemoto  implements Observer{
    
    //private SistemaControl sc;
    private String programa;
    private float temperatura;
    
    public GestGatewayRemoto(){
        //this.sc = sistemaControl;
    }
  
    public void display(){
        System.out.println("GestGatewayRemoto: \n\t Programa actual: " +  this.programa + " \n\t Temperatura actual: " +  this.temperatura +  "º");
    }
    
    
    @Override
    public void update(Observable o, Object o1) {
        this.programa = ((SistemaControl)o).getNombreProg();
        this.temperatura = ((SistemaControl)o).getTemperatura();
        
        JOptionPane.showMessageDialog(null,"\n\t Programa actual: " +  this.programa + " \n\t Temperatura actual: " +  this.temperatura +  "º","CAMBIOS GestGatewayRemoto:" , JOptionPane.INFORMATION_MESSAGE);
       
    }
    
  
    
    
}
