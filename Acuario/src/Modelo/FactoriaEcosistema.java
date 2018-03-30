
package Modelo;


public class FactoriaEcosistema {
    
    public ElementoEcosistema añadirElemento(String tipo){
        ElementoEcosistema ele = null;
        switch (tipo){
            case "pez":
                System.out.println("TRAZA: PEZ\n");//------------------------------
                ele = new Pez();
            break;
            
            case "planta":
                System.out.println("TRAZA: PLANTA\n");//------------------------------
                ele = new Planta();
            break;
            
            case "coral":
                System.out.println("TRAZA: CORAL\n");//------------------------------
                ele = new Coral();
            break;
        }
      
        return ele;
    }
}
