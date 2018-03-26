
package Modelo;

import java.util.ArrayList;
import java.util.Observer;
import javafx.beans.InvalidationListener;
import javafx.beans.Observable;

public class SistemaControl implements Observable{
    
    private final ArrayList<Observer> observadores;
    private SistemaIluminacion si;
    private SistemaFiltracion sf;
    private SistemaClimatizacion scl;
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
   
    public SistemaControl(Observer acuario){
        this.observadores = new ArrayList();
        //Registramos al acuario como observador
        this.registrarObservador(acuario);
        this.si = new SistemaIluminacion(TIPO_ILUMINACION,POTENCIA_ILUMINACION,false,false,LUMENES);
        this.sf = new SistemaFiltracion(TIPO_FILTRACION,POTENCIA_FILTRACION,false,false,LH_FILTRACION);
        this.scl = new SistemaClimatizacion(TIPO_CLIMATIZACION,POTENCIA_CLIMATIZACION,false,false,VENTILADOR,TERMOMETRO);
    }
    
    //PATRON OBSERVADOR
    public void registrarObservador(Observer o){
        observadores.add(o);
    }
    public void borrarObservador(Observer o){
        int i = observadores.indexOf(o);
        if(i >= 0){
            observadores.remove(i);
        }            
    }
    public void notificarObservadores(){
        for (int i = 0 ; i < observadores.size() ; i++){
            Observer observador = (Observer) observadores.get(i); 
           
            //observador.update(o, i);
        }
    }
    public void cambiosRealizados(){
        this.notificarObservadores();
    }
    
    
    @Override
    public void addListener(InvalidationListener listener) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void removeListener(InvalidationListener listener) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
