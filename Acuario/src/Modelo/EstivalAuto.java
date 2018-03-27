
package Modelo;


import java.util.Calendar;
import java.util.Date;
import java.util.Timer;


public class EstivalAuto implements GlobalComportamiento {
    //Ref a instancias de sistemas:
    private SistemaFiltracion sFiltracion;
    private SistemaClimatizacion sClima;
    private SistemaIluminacion sIluminacion;
    //Atributos concretos del programa:
    private static final float TEMPERATURA = 18;//sClima.setTemperatura(TEMPERATURA)*****
  
    //private time INIT_ILUMINACION = new time();
    //private static final DATE FIN_ILUMINACION = ;
    //private static final Date INIT_FILTRADO = ;
    //private static final DATE FIN_FILTRADO = ;
    
    public EstivalAuto(SistemaFiltracion sf, SistemaClimatizacion sc, SistemaIluminacion si) {
        this.sFiltracion = sf;
        this.sClima = sc;
        this.sIluminacion = si;
    }

    
    
    
    //Programar para que a las horas x e y se encienda y apague filtracion e iluminacion
    public void programar(){
        Date horaDespertar = new Date(System.currentTimeMillis());
        
        Calendar c = Calendar.getInstance();
        c.setTime(horaDespertar);
        System.out.println(c.get(Calendar.DAY_OF_WEEK));
        
        c.set(Calendar.HOUR_OF_DAY, 8);
        c.set(Calendar.MINUTE, 0);
        c.set(Calendar.SECOND, 0);
        
        horaDespertar = c.getTime();
        System.out.println(horaDespertar);
        System.out.println(c.get(Calendar.DAY_OF_WEEK));
        // El despertador suena cada 24h (una vez al dia)
        int tiempoRepeticion = 86400000; 
        
        // Programamos el despertador para que "suene" a las 8am todos los dias 
        Timer temporizador = new Timer();
        temporizador.schedule(new Temporizador(), horaDespertar, tiempoRepeticion);
    
        
    }  
        
    
    
   
    public float getTemperatura() {
        return TEMPERATURA;
    }


}
