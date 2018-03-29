
package Vista;

import Controlador.Controlador;
import Modelo.Acuario;
import Modelo.SistemaControl;

public class Main {

    public static void main(String[] args) {
        
        //LLamamos al metodo que implementa el patron singleton para inicializar la unica instancia de acuario.
        Acuario acuario = Acuario.getInstancia();
        SistemaControl sc = new SistemaControl(acuario);
        Controlador ctrl = new Controlador(acuario,sc);//crear obj controlador asociado al modelo
        Pantalla p = new Pantalla(ctrl);
        p.menuPrincipal();
        
    }
}
