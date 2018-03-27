
package Modelo;

import java.util.Calendar;
import java.util.TimerTask;

public class Temporizador extends TimerTask{
   
    @Override
    public void run() {
        
        Calendar diaActual = Calendar.getInstance();
        
        switch (diaActual.get(Calendar.DAY_OF_WEEK)) {
            case 1:
            case 2: 
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                System.out.println("Apago/enciendo");
                break;
        }
    }

}