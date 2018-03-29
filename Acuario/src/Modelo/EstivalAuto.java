
package Modelo;


import java.util.Calendar;
import java.util.Date;
import java.util.Timer;


public class EstivalAuto implements GlobalComportamiento {
    //Ref a instancias de sistemas:
    private final SistemaFiltracion sFiltracion;
    private final SistemaClimatizacion sClima;
    private final SistemaIluminacion sIluminacion;
    //Atributos concretos del programa:
    private static final float TEMPERATURA = 18;
    private static final int SI_HORA_INIT = 8;
    private static final int SI_MINUTO_INIT = 0;
    private static final int SI_SEGUNDO_INIT = 0;
    private static final int SI_HORA_FIN = 21;
    private static final int SI_MINUTO_FIN = 0;
    private static final int SI_SEGUNDO_FIN = 0;
    
    private static final int SF_HORA_INIT = 8;
    private static final int SF_MINUTO_INIT = 0;
    private static final int SF_SEGUNDO_INIT = 0;
    private static final int SF_HORA_FIN = 21;
    private static final int SF_MINUTO_FIN = 0;
    private static final int SF_SEGUNDO_FIN = 0;
    
    
    public EstivalAuto(SistemaFiltracion sf, SistemaClimatizacion sc, SistemaIluminacion si) {
        this.sFiltracion = sf;
        this.sClima = sc;
        this.sIluminacion = si;
    }

    
    
    
    //Programar para que a las horas x e y se encienda y apague filtracion e iluminacion
    public void programar(){
        
        
        
        
        sClima.setTemperatura(TEMPERATURA);
        //TRAZA-----------------------------------------------------------------
        //SISTEMA CLIMATIZACION TEMPERATURA
        System.out.println("ESTIVAL: Temperatura acuario: " + this.sClima.getTemperatura() + "º");
        //SISTEMA FILTRADO
        System.out.println("Sistema Filtrado: \n\t Hora Inicio-> " + SF_HORA_INIT + ":"+ SF_MINUTO_INIT+ ":"+ SF_SEGUNDO_INIT);
        System.out.println("\n\t Hora Fin-> " + SF_HORA_FIN + ":"+ SF_MINUTO_FIN + ":"+ SF_SEGUNDO_FIN + "\n");
        //SISTEMA ILUMINACION
        System.out.println("Sistema Iluminacion: \n\t Hora Inicio-> " + SI_HORA_INIT + ":"+ SI_MINUTO_INIT+ ":"+ SI_SEGUNDO_INIT);
        System.out.println("\n\t Hora Fin-> " + SI_HORA_FIN + ":"+ SI_MINUTO_FIN + ":"+ SI_SEGUNDO_FIN + "\n");
        
        
        System.out.println("Estado acuario-> " + SI_HORA_FIN + ":"+ SI_MINUTO_FIN + ":"+ SI_SEGUNDO_FIN + "\n");
        
        /*Date horaDespertar = new Date(System.currentTimeMillis());
        
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
        */
        
    }  
        
    
    
   
    public float getTemperatura() {
        return TEMPERATURA;
    }


}
