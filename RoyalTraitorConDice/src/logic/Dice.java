/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;
import java.util.Random;

/**
 *
 * @author jaaq5
 */
public class Dice {
    
    private String typeFace;
    //private String eyeFace;
    
    public Dice(String typeFace) {
        this.typeFace = typeFace;
        //this.eyeFace = eyeFace;
        
    }
    
    public String getTypeFace() {
        return typeFace;
    }
    
    /*
    public String getEyeFace() {
        return eyeFace;
    }
    */
    
    public void setTypeFace(String typeFace) {
        this.typeFace = typeFace;
    }
    
    /*
    public void setEyeFace(String eyeFace) {
        this.eyeFace = eyeFace;
    }
    */
    
    public void setRandomFace(){
        Random random = new Random(); 
        int randomNumber = random.nextInt(2);
       
        if (randomNumber == 0) {
            this.typeFace = "eye";
        } else {
            this.typeFace = "paw";
        }

    }
}
