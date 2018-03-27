
package Modelo;


public class LimpiezaAuto implements GlobalComportamiento {

    private SistemaFiltracion sFiltracion;
    private SistemaClimatizacion sClima;
    private SistemaIluminacion sIluminacion;
    //Atributos concretos del programa:
    private static final float TEMPERATURA = 18;
  
    //private time INIT_ILUMINACION = new time();
    //private static final DATE FIN_ILUMINACION = ;
    //private static final Date INIT_FILTRADO = ;
    //private static final DATE FIN_FILTRADO = ;

    public LimpiezaAuto(SistemaFiltracion sf, SistemaClimatizacion sc, SistemaIluminacion si) {
        this.sFiltracion = sf;
        this.sClima = sc;
        this.sIluminacion = si;
    }

    public float getTemperatura() {
        return TEMPERATURA;
    }
}
