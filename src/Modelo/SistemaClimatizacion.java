
package Modelo;


public class SistemaClimatizacion extends SistemaAuxiliar{
    
    private boolean ventiladorYesNo;
    private String termometro;
    
    public SistemaClimatizacion(String tipo, float potencia, boolean estado, boolean averia, boolean ventilador, String termometro) {
        super(tipo, potencia, estado, averia);
        this.ventiladorYesNo = ventilador;
        this.termometro = termometro;
    }
    
}
