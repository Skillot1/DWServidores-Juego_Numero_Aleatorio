/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package albares.basic;

import albares.utils.JWTUtils;
import static albares.utils.Parameters.players;

public class Turn {
    
    private static Integer turn = 1;
    
    public Turn(){
        
    }
    
    /**
     * 
     * @param token Token del jugador
     * @return booleano que indica si el token pertenece al jugador que tiene el turno
     */
    public static boolean checkTurn( String token){
        
        Integer idToken = (JWTUtils.checkJWTandReturnID(token));
        
        if(idToken.intValue()==turn.intValue()){
            turn++;
            if(turn>players.size()){
                turn=1;
            }
            return true;
        }
        
        else return false;
    }

    public static Integer getTurn() {
        return turn;
    }

    public static void setTurn(Integer turn) {
        Turn.turn = turn;
    }
    
    
}
