/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package albares.basic;

/**
 *
 * @author garzi
 */
public class RandomNumber {
    
    private static int random = (int) Math.floor(Math.random()*5+1);
   
    public RandomNumber(){
        
    }
    
    public static boolean checkNumber(int number){
        if(number==random){
            random=(int) Math.floor(Math.random()*5+1);
            return true;
        }
        else return false;
    }
    
}
