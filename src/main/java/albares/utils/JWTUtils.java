
package albares.utils;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.interfaces.DecodedJWT;
import java.util.Date;

public final class JWTUtils {
    private static final Algorithm algorithm = Algorithm.HMAC256(Secrets.JWT_SECRET); //Secreto
    private static final JWTVerifier verifier = JWT.require(algorithm) // Verificador del token
            .withIssuer(Parameters.PROJECT_NAME)
            .build(); 
    
    public JWTUtils() {
    }
    
    public static final String generateToken(int id){
        String token = JWT.create()
                .withIssuer(Parameters.PROJECT_NAME)
                .withClaim("id", id)
                .withExpiresAt(new Date(System.currentTimeMillis()+Parameters.EXPIRATION_MILLIS))
                .withIssuedAt(new Date())
                .sign(algorithm);
        return token;
    }
    
    public static final Integer checkJWTandReturnID(String token){
        try{
            DecodedJWT jwt = verifier.verify(token); // Es la información que iba dentro del token
            
            return jwt.getClaim("id").asInt(); // este método devuelve la ID asociada al token
        }catch (Exception ex) {
            /*Avisa si el token falla*/
            return -1;
        }
    }
    
    
}
