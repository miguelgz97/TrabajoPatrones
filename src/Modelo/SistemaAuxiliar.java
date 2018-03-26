
package Modelo;


public abstract class SistemaAuxiliar {
    protected String tipo;
    protected float potencia;
    protected boolean estadoOnOff;
    protected boolean averiaYesNo;
    
    public SistemaAuxiliar(String tipo, float potencia, boolean estado, boolean averia){
        this.tipo = tipo;
        this.potencia = potencia;
        this.estadoOnOff = estado;
        this.averiaYesNo = averia;
    }
    
    protected void encender(){
        this.estadoOnOff = true;
    }
    
    protected void apagar(){
        this.estadoOnOff = false;
    }
}
