
package Modelo;


public class SistemaFiltracion extends SistemaAuxiliar{
    
    private int litrosHora;
    
    public SistemaFiltracion(String tipo, float potencia, boolean estado, boolean averia, int LH) {
        super(tipo, potencia, estado, averia);
        this.litrosHora = LH;
    }
    
    
    
}
