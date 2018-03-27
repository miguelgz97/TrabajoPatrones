
package Modelo;


public class InvernalAuto implements GlobalComportamiento {
    //Ref a instancias de sistemas:
    private SistemaFiltracion sFiltracion;
    private SistemaClimatizacion sClima;
    private SistemaIluminacion sIluminacion;
    //Atributos concretos del programa:
    private static final float TEMPERATURA = 23;
  
    //private time INIT_ILUMINACION = new time();
    //private static final DATE FIN_ILUMINACION = ;
    //private static final Date INIT_FILTRADO = ;
    //private static final DATE FIN_FILTRADO = ;
    
    private static final int TIEMPO_FILTRADO = 3;

    public InvernalAuto(SistemaFiltracion sf, SistemaClimatizacion sc, SistemaIluminacion si) {
        this.sFiltracion = sf;
        this.sClima = sc;
        this.sIluminacion = si;
        
    }

    public float getTemperatura() {
        return TEMPERATURA;
    }

 
    public float getTiempoFiltrado() {
        return TIEMPO_FILTRADO;
    }
}
