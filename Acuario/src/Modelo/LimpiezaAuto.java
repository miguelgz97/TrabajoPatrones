
package Modelo;


public class LimpiezaAuto implements GlobalComportamiento {

    private static final int TEMPERATURA = 18;
    private static final int TIEMPO_FILTRADO = 15;

    public LimpiezaAuto() {

    }

    public int getTemperatura() {
        return TEMPERATURA;
    }

    public int getTiempoFiltrado() {
        return TIEMPO_FILTRADO;
    }


}
