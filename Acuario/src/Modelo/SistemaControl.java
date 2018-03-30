
package Modelo;

import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;
import javafx.beans.InvalidationListener;


public class SistemaControl extends Observable{
    
    //Programa
    GlobalComportamiento programaActual;
    
  
    private SistemaIluminacion si;
    private SistemaFiltracion sf;
    private SistemaClimatizacion scl;
    
    private static final int ESTIVAL = 1;
    private static final int INVERNAL = 2;
    private static final int LIMPIEZA = 3;
    //parametros inicializados por defecto
    private static final String TIPO_ILUMINACION = "Lámpara LED";
    private static final float POTENCIA_ILUMINACION = 6000;
    private static final int LUMENES = 17500;
    private static final String TIPO_FILTRACION = "Mecánica";
    private static final float POTENCIA_FILTRACION = 270;
    private static final int LH_FILTRACION = 1000;
    private static final String TIPO_CLIMATIZACION = "Inkbird ITC-1000 2 Rele";
    private static final float POTENCIA_CLIMATIZACION = 220;
    private static final boolean VENTILADOR = true;
    private static final String TERMOMETRO = "Termometro vidrio Hang On 6 Blau Aquaristic";
    
    
   
    public SistemaControl(){
        this.si = new SistemaIluminacion(TIPO_ILUMINACION,POTENCIA_ILUMINACION,false,false,LUMENES);
        this.sf = new SistemaFiltracion(TIPO_FILTRACION,POTENCIA_FILTRACION,false,false,LH_FILTRACION);
        this.scl = new SistemaClimatizacion(TIPO_CLIMATIZACION,POTENCIA_CLIMATIZACION,false,false,VENTILADOR,TERMOMETRO);
        
    }
    

    //dependiendo del parametro que entre en la funcion se seleccionara un programa automatico para el acuario:
    public void programaAutomatico(int programa){
        switch (programa) {
            case ESTIVAL: 
                if(!(this.programaActual instanceof EstivalAuto)){        
                    this.programaActual = new EstivalAuto(sf,scl,si);
                }
            break;
            case INVERNAL: 
                if(!(this.programaActual instanceof InvernalAuto)){        
                    this.programaActual = new InvernalAuto(sf,scl,si);                   
                }
            break;
            case LIMPIEZA: 
                if(!(this.programaActual instanceof LimpiezaAuto)){        
                    this.programaActual = new LimpiezaAuto(sf,scl,si);
                }
            break;
            default: System.out.println("Programa no existente\n");
        }
        //Programamos Sistema
        this.programaActual.programar();
        //Notificamos de cambios a obsevadores
        this.setChanged();
        this.notifyObservers();
    }
    
    public void programaManual(boolean i, boolean f, float t){
        System.out.println("SISTEMA DE CONTROL");//------------------------------
        this.programaActual = new Manual(sf,scl,si,i,f,t);
        this.programaActual.programar();
        //Notificamos cambios a observadores
        this.setChanged();
        this.notifyObservers();
    }
    
    public float getTemperatura(){
        return this.scl.getTemperatura();
    }
    
    public String getNombreProg(){
        String programa = "" ;
        if (this.programaActual instanceof EstivalAuto){
            programa = "Estival";
        }else if (this.programaActual instanceof InvernalAuto){
            programa = "Invernal";
        }else if (this.programaActual instanceof LimpiezaAuto){
            programa = "Limpieza";
        }else if (this.programaActual instanceof Manual){
            programa = "Manual";
        }
        return programa;
    }
    
}
