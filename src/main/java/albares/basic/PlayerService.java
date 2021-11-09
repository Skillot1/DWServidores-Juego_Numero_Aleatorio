package albares.basic;

import albares.utils.JWTUtils;
import albares.utils.Parameters;
import static albares.utils.Parameters.idCounter;
import static albares.utils.Parameters.players;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import java.util.Map;
import jakarta.ws.rs.POST;


@Path("/gamer")
public class PlayerService {

    //Aunque le pasemos un JSON por parámetros, a los métodos GET no se les debe pasar nada en el body. Por eso, sería
    //aconsejable que estos métodos GET fueran de otro tipo(POST - PUT -PATCH).
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Map getPlayers() { 
        return Parameters.players; //devolvemos colecciones para poder devolver solo los valores sin las IDs
    }
    
    @POST
    @Produces(MediaType.TEXT_PLAIN) // Devuelve texto plano (el token)
    @Consumes(MediaType.APPLICATION_JSON)
    public String createPlayer(Player newPlayer){   
        players.put(idCounter.incrementAndGet(),newPlayer);
        return JWTUtils.generateToken(idCounter.get()); 
    }  

}
