package albares.basic;

import albares.utils.JWTUtils;
import static albares.utils.JWTUtils.checkJWTandReturnID;
import static albares.utils.Parameters.players;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import java.util.Map;


@Path("/play")
public class PlayGame {

    @POST
    @Path("/{token}/{num}")
    @Produces(MediaType.APPLICATION_JSON) // Devuelve texto plano (el token)
    @Consumes(MediaType.APPLICATION_JSON)
    public Player tryNumber(@PathParam("token") String token, @PathParam("num") int playerNum) {

        Player player = players.get(checkJWTandReturnID(token));
        
        boolean validPlayer = Turn.checkTurn(token);
        
        if (validPlayer) {
            if(RandomNumber.checkNumber(playerNum)){
                player.setScore(player.getScore()+1);
            }
            return player;
        } else {
            player.setScore(player.getScore()-1);
            return player;
        }
    }

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public Integer getPlayerTurn() {

        
            return Turn.getTurn();
        }
    }

 
    

