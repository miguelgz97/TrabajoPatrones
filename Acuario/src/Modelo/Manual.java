
package Modelo;


public class Manual implements GlobalComportamiento{
    
    boolean i, f;
    float temperatura;
    private SistemaFiltracion sFiltracion;
    private SistemaClimatizacion sClima;
    private SistemaIluminacion sIluminacion;
    
    public Manual(SistemaFiltracion sf, SistemaClimatizacion sc, SistemaIluminacion si, boolean i, boolean f, float temperatura){
        this.i = i;
        this.f = f;
        this.temperatura = temperatura;
        this.sFiltracion = sf;
        this.sClima = sc;
        this.sIluminacion = si;
    }
    
    public void programar(){
        //SISTEMA ILUMINACION
        if(i){//ON
            this.sIluminacion.encender();
        }else{//OFF
            this.sIluminacion.apagar();
        }
        //SISTEMA FILTRACION
        if(f){//ON
            this.sFiltracion.encender();
        }else{//OFF
            this.sFiltracion.apagar();
        }
        //Cambiamos la temperatura
        this.sClima.setTemperatura(temperatura);
        
        
        
        //PRUEBA FUNCIONAMIENTO 
        if(this.sIluminacion.getEstado()){
            System.out.println("ESTADO SISTEMA DE ILUMINACION: ENCENDIDO");
        }else{
            System.out.println("ESTADO SISTEMA DE ILUMINACION: APAGADO");
        }
        if(this.sFiltracion.getEstado()){
            System.out.println("ESTADO SISTEMA DE FILTRACION: ENCENDIDO");
        }else{
            System.out.println("ESTADO SISTEMA DE FILTRACION: APAGADO");
        }
        System.out.println("Sistema de climatización TEMPERATURA = " +  this.sClima.getTemperatura());
    }
}
