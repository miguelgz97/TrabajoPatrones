
package Modelo;


public class LimpiezaAuto implements GlobalComportamiento {

     //Ref a instancias de sistemas:
    private final SistemaFiltracion sFiltracion;
    private final SistemaClimatizacion sClima;
    private final SistemaIluminacion sIluminacion;
    //Atributos concretos del programa:
    private static final float TEMPERATURA = 20;
    private static final int SI_HORA_INIT = 8;
    private static final int SI_MINUTO_INIT = 15;
    private static final int SI_SEGUNDO_INIT = 0;
    private static final int SI_HORA_FIN = 21;
    private static final int SI_MINUTO_FIN = 0;
    private static final int SI_SEGUNDO_FIN = 0;
    
    private static final int SF_HORA_INIT = 9;
    private static final int SF_MINUTO_INIT = 30;
    private static final int SF_SEGUNDO_INIT = 0;
    private static final int SF_HORA_FIN = 7;
    private static final int SF_MINUTO_FIN = 0;
    private static final int SF_SEGUNDO_FIN = 0;

    public LimpiezaAuto(SistemaFiltracion sf, SistemaClimatizacion sc, SistemaIluminacion si) {
        this.sFiltracion = sf;
        this.sClima = sc;
        this.sIluminacion = si;
    }

    public float getTemperatura() {
        return TEMPERATURA;
    }
    
    public void programar(){
        sClima.setTemperatura(TEMPERATURA);
        
        //TRAZA-----------------------------------------------------------------
        //SISTEMA CLIMATIZACION TEMPERATURA
        System.out.println("LIMPIEZA: Temperatura acuario: " + this.sClima.getTemperatura() + "º");
        //SISTEMA FILTRADO
        System.out.println("Sistema Filtrado: \n\t Hora Inicio-> " + SF_HORA_INIT + ":"+ SF_MINUTO_INIT+ ":"+ SF_SEGUNDO_INIT);
        System.out.println("\n\t Hora Fin-> " + SF_HORA_FIN + ":"+ SF_MINUTO_FIN + ":"+ SF_SEGUNDO_FIN + "\n");
        //SISTEMA ILUMINACION
        System.out.println("Sistema Iluminacion: \n\t Hora Inicio-> " + SI_HORA_INIT + ":"+ SI_MINUTO_INIT+ ":"+ SI_SEGUNDO_INIT);
        System.out.println("\n\t Hora Fin-> " + SI_HORA_FIN + ":"+ SI_MINUTO_FIN + ":"+ SI_SEGUNDO_FIN + "\n");
          
    }
    
    
    public String toString(){
        String salida =  "Modo Limpieza \n\t-Hora inicio sistema Iluminacion: " + String.valueOf(SI_HORA_INIT) + ":" + String.valueOf(SI_MINUTO_INIT) + "\n\t-Hora inicio sistema Filtración: " + String.valueOf(SF_HORA_INIT)+":"+String.valueOf(SF_MINUTO_INIT) + "\n";    
        
        return salida;
    }
}
