
package albares.test;

import albares.basic.Turn;
import albares.utils.JWTUtils;



public class Test {
    public static void main(String[] args) {
        
//        char[] possibleCharacters = (new String("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789~`!@#$%^&*()-_=+[{]}\\|;:\'\",<.>/?")).toCharArray();
//        String randomStr = RandomStringUtils.random( 200, 0, possibleCharacters.length-1, false, false, possibleCharacters, new SecureRandom() );
//        System.out.println( new Date(System.currentTimeMillis()+60000) );
//        System.out.println( new Date() );
//        System.out.println(JWTUtils.generateToken(1));
        System.out.println(Turn.getTurn());
    }
}