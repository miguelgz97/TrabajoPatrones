
package Modelo;


public class SistemaIluminacion extends SistemaAuxiliar{
    
    private int lumenes;
    
    public SistemaIluminacion(String tipo, float potencia, boolean estado, boolean averia, int lumenes) {
        super(tipo, potencia, estado, averia);
        this.lumenes = lumenes;
    }
   
}
