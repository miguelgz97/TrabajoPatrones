
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
        this.setEstado(true);
    }
    
    protected void apagar(){
        this.setEstado(false);
    }
    
    public void setEstado(boolean estado){
        this.estadoOnOff = estado;
    }
    public boolean getEstado(){
        return this.estadoOnOff;
    }
}
