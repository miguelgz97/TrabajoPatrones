
package Modelo;


public class SistemaClimatizacion extends SistemaAuxiliar{
    
    private boolean ventiladorYesNo;
    private String termometro;
    private float temperatura;
    
    public SistemaClimatizacion(String tipo, float potencia, boolean estado, boolean averia, boolean ventilador, String termometro) {
        super(tipo, potencia, estado, averia);
        this.ventiladorYesNo = ventilador;
        this.termometro = termometro;
    }
    
    public void setTemperatura(float temperatura){
        this.temperatura = temperatura;
    }
}
