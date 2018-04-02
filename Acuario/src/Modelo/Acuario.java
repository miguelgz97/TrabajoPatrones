
package Modelo;

import java.util.ArrayList;



public class Acuario {
  
    private ArrayList <ElementoEcosistema>  seresVivos; 
    private static Acuario instanciaUnica;
    private float litros;
    private float ancho;
    private float fondo;
   
    private final FactoriaEcosistema factEco;
    
    private Acuario(){
        this.factEco = new FactoriaEcosistema();
        this.seresVivos = new ArrayList<>();
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
        this.seresVivos.add(ele);
        System.out.println(ele.getNombre());
        
    }

    @Override
    public String toString(){
        String salida;
        if(this.seresVivos.isEmpty()){
            salida = "\nNo hay ningun ser vivo en el acuario.\n";
        }else{
            salida = "\nSeres vivos del acuario:\t"; 
            for(int i = 0 ; i < this.seresVivos.size() ; i++){
                salida = salida + "\n\t -" + this.seresVivos.get(i).getNombre();
            }
        salida = salida + "\n";
        }
       
       return salida;
    }
}
