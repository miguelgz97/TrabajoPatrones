
package Modelo;


public class EstivalAuto implements GlobalComportamiento {
    private static final int TEMPERATURA = 18;
    private static final int TIEMPO_FILTRADO = 3;

    public EstivalAuto() {
        //vacio
    }

    public int getTemperatura() {
        return TEMPERATURA;
    }

    public int getTiempoFiltrado(){
        return TIEMPO_FILTRADO;
    }

}
