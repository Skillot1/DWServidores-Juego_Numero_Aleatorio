
package albares.utils;


import albares.basic.Player;
import albares.basic.RandomNumber;
import albares.basic.Turn;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.logging.Logger;


public final class Parameters {

    public Parameters() {
        
    }
    
    public static final Map<Integer, Player> players = new HashMap(); //Mapa de jugadores id-Player
    public static final AtomicInteger idCounter = new AtomicInteger(0); //contador para la id de los jugadores
    public static final String PROJECT_NAME = "Pablo"; //Nombre del proyecto
    public static final long EXPIRATION_MILLIS = 60 * 45 /* SECONDS */ *1000L; // Expiración del token. Actualmente 45 minutos 
//    public static Turn turn = new Turn();
//    public static randomNumber random = new RandomNumber();
    public static final Logger logger = Logger.getLogger("basicProject.pablo");
    
    
      
    
}


