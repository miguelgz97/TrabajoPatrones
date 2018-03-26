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

 private int temperatura =27;
 private int filtracion= 120;

    public InvernalAuto() {
        getTemperatura();
        getFiltracion();
    }

    public int getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(int temperatura) {
        this.temperatura = temperatura;
    }
 
    public int getFiltracion() {
        return filtracion;
    }

    public void setFiltracion(int filtracion) {
        this.filtracion = filtracion;
    }
}
