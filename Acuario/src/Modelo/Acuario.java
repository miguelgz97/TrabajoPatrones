
package Modelo;



public class Acuario {
  
    private static Acuario instanciaUnica;
    private float litros;
    private float ancho;
    private float fondo;
    private final FactoriaEcosistema factEco;
    
    private Acuario(){
        this.factEco = new FactoriaEcosistema();
    }
    
    //*PATRON SINGLETON
    public static Acuario getInstancia(){
        if ( instanciaUnica == null){
            System.out.println("PATRON SINGLETON: Creamos unica instancia de Acuario.\n");
            instanciaUnica = new Acuario();
        }
        //Devolvemos unica instancia
        return instanciaUnica;
    }
    
    //FACTORIA SIMPLE
    public void añadirSerVivo(String ser){
        ElementoEcosistema ele;
        ele = this.factEco.añadirElemento(ser);
    
    }

}
