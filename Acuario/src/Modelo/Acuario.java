
package Modelo;



public class Acuario {
  
    private static Acuario instanciaUnica;
    
    
    private Acuario(){
        
      
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
    
    
    public void añadirSerVivo(String ser){
        switch(ser){
            case "pez":
            //Añadir pez  
                
                System.out.println("TRAZA: PEZ\n");//------------------------------
                
            break;
            case "coral":
                System.out.println("TRAZA: CORAL\n");//------------------------------
                
            break;
            
            case "planta":
                System.out.println("TRAZA: PLANTA\n");//------------------------------
                
            break;
            
            default:
                System.out.println("Error en filtro vida\n");
            break;
            
        }
    }

}
