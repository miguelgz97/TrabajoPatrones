
package Vista;
import Controlador.Controlador;
import java.util.ArrayList;
import poo.io.IO;


public class Pantalla {
    
    private Controlador ctrl;
    
    private static int MODO_AUTOMATICO = 1;
    private static int MODO_MANUAL = 2;
    
    public Pantalla(Controlador ctrl){
       this.ctrl = ctrl;
    }
       
    public void menuPrincipal(){
            
        int entrada1;

        do{
            System.out.println("-Seleccione la opcion que desee:\n"
                                 + "   1.Ver estado del sistema.\n"
                                 + "   2.Añadir elemento al acuario.\n"
                                 + "   3.Cambiar sistema a modo manual.\n"
                                 + "   4.Cambiar sistema a modo automático.\n"
                                 + "   0.Salir");

            entrada1 = (int)IO.readNumber();        
            
            if(entrada1 == 1){//1.Presentar estado del sistema.
                this.verEstadoSistema();
                
            }else if (entrada1 == 2){//2.Añadir elemento al acuario
                this.añadirElemento();
                
            }else if(entrada1 == 3){//3.Cambiar a modo manual
                this.modoSistemaManual();
            }else if(entrada1 == 4){//4.Cambiar a modo automatico
                this.modoSistemaAutomatico();
            }
            
        }while(entrada1 != 0);
    }
     
     
    private void verEstadoSistema(){
        String estado = this.ctrl.verEstado();
        System.out.println(estado);
    }
    private void añadirElemento(){
        int elemento;
      
        System.out.println("     -Seleccione el tipo de elemento que desea añadir:\n"
                                   + "\t1.Pez.\n"
                                   + "\t2.Coral.\n"
                                   + "\t3.Planta.\n"
                                   + "\t0.Volver a menu principal.");
            elemento = (int)IO.readNumber();
                
            if(elemento == 1){//PEZ.
                ctrl.añadirElemento("pez");
                    
            }else if (elemento == 2){//CORAL               
                ctrl.añadirElemento("coral");
                   
            }else if (elemento == 3){//PLANTA
                 ctrl.añadirElemento("planta");
                 
            }else if (elemento == 0){//VOLVER
                this.menuPrincipal();
            }else{//ENTRADA ERRONEA
                System.out.println("Entrada erronea.");
                this.añadirElemento();
            }
    }


    private void modoSistemaManual(){
        int modo, si,sf;
        float t;
        do{
        System.out.println("Sistema de Iluminación:\n"
                                   + "\t0.Off.\n"
                                   + "\t1.On.\n");
        si = (int)IO.readNumber();
        }while (si != 0 && si != 1);
        
        do{
        System.out.println("Sistema de Filtración:\n"
                                   + "\t0.Off.\n"
                                   + "\t1.On.\n");
        sf = (int)IO.readNumber();
        }while (sf != 0 && sf != 1);
        
        System.out.println("Sistema de climatización:\n\t-Introducir temperatura acuario:\n");
        t = (float)IO.readNumber();
        
        //convertimos las variables introducidas por teclado en booleanas
        boolean i, f;
        if(si == 1){
            i = true;
        }else{
            i = false;
        }
        if(sf == 1){
            f = true;
        }else{
            f = false;
        }
        ctrl.modoManual(i, f, t);
    }
    
    private void modoSistemaAutomatico(){
        int modo;
      
        System.out.println("     -Seleccione el modo de sistema automático que desea activar:\n"
                                   + "\t1.Periodo Estival.\n"
                                   + "\t2.Periodo Invernal.\n"
                                   + "\t3.Limpieza.\n"
                                   + "\t0.Volver a menu principal.");
            modo = (int)IO.readNumber();
            
            if(modo == 1 || modo == 2 || modo == 3 ){//INVERNAL
                ctrl.modoAutomatico(modo);
            }else if(modo == 0){
                this.menuPrincipal();
            }else{//ENTRADA ERRONEA
                System.out.println("Entrada erronea.");
                modoSistemaAutomatico();
            }
    }
}
