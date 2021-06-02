/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package royaltraitor;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Map;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import logic.Prolog;
import logic.Weapon;
import logic.Character;
import logic.Dice;
import org.jpl7.Query;
import org.jpl7.Term;
import view.MainView;

/**
 *
 * @author bryan
 */
public class RoyalTraitor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        // TODO code application logic here
        Prolog dataBase = new Prolog();
        ArrayList<Weapon> weapons = dataBase.getWeapons(); //SE OBTIENEN LAS ARMAS
        ArrayList<Character> characters = dataBase.getCharacters(); //SE OBTIENEN LAS ARMAS
        Character guilty = dataBase.getGuilty();//SE OBTIENE EL CULPABLE
        dataBase.make2IntialSuspects();//SE GENERAN DOS POSIBLES SOSPECHOZOS
        ArrayList<Character> suspects = dataBase.getSuspects(); //SE OBTIENEN LOS SOSPECHOSOS
        //suspects = dataBase.askWeapon("wand");//PREGUNTARA A LA BASES SI EL CULPABLE TIENE ESA ARMA, SI NO LA TIENE REVISAR SI UN SOSPECHOSLO LA TIENE Y LO ELIMINA
        characters = dataBase.actCharacters(characters, suspects);
        MainView screen = new MainView();
        //Para actualizar el tamano donde van los dados
        screen.resizeBackground();
        //Prueba dice
        Dice dice1 = new Dice("paw");
        Dice dice2 = new Dice("clue");
        Dice dice3 = new Dice("paw");
        dice1.setRandomFace();
        dice2.setRandomFace();
        dice3.setRandomFace();
        //System.out.println(dice1.getTypeFace());
        screen.setDicesFace(dice1.getTypeFace(),dice2.getTypeFace(), dice3.getTypeFace());
        screen.updateDicesIcons(dice1.getTypeFace(),dice2.getTypeFace(), dice3.getTypeFace());


        
        ArrayList road = new ArrayList();
        for(int i=0;i<15;i++){
            road.add(0);
        }
        
        int k = 0;
        for (int i=0;i<15;i++){
            if(k== 0){
               road.set(k, 1);
            }else{
                road.set(k-1, 0);
                road.set(k, 1);
            }
            
            k++;
            screen.initialDraws(characters, road);
            //screen.resizeBackground();
            Thread.sleep(2000);
        }
        
        
        
    } 
    
    
}
