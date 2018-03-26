/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Miguel
 */
public class InvernalAuto implements GlobalComportamiento {

    private static final int TEMPERATURA = 23;
    private static final int TIEMPO_FILTRADO = 3;

    public InvernalAuto() {
    }

    public int getTemperatura() {
        return TEMPERATURA;
    }

 
    public int getTiempoFiltrado() {
        return TIEMPO_FILTRADO;
    }
}
