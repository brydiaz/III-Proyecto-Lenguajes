/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package royaltraitor;

import java.util.ArrayList;
import logic.Prolog;
import logic.Weapon;
import logic.Character;
import view.MainView;
import org.jpl7.Query;
import org.jpl7.Term;
import view.MainView;

/**
 *
 * @author bryan
 */
public class Game {
    public boolean gameOn = true;
    public boolean winner = false;
    public Prolog dataBase = new Prolog();
    public ArrayList<Weapon> weapons = dataBase.getWeapons(); //SE OBTIENEN LAS ARMAS
    public ArrayList<logic.Character> characters1 = dataBase.getCharacters(); //SE OBTIENEN LAS ARMAS
    public ArrayList<logic.Character> characters ;
    public ArrayList<logic.Character> charactersToShow = dataBase.getCharacters();
    public logic.Character guilty = dataBase.getGuilty();//SE OBTIENE EL CULPABLE
    public ArrayList<logic.Character> suspects;
    public int x = dataBase.make2IntialSuspects();

    public Game() {
        //SE GENERAN DOS POSIBLES SOSPECHOZOS
        this.suspects = dataBase.getSuspects(); //SE OBTIENEN LOS SOSPECHOSOS
        //suspects = dataBase.askWeapon("wand");//PREGUNTARA A LA BASES SI EL CULPABLE TIENE ESA ARMA, SI NO LA TIENE REVISAR SI UN SOSPECHOSLO LA TIENE Y LO ELIMINA
        this.characters = dataBase.actCharacters(this.characters1, this.suspects);
    }
    
    public void gameOn() throws InterruptedException{
        
        ArrayList road = new ArrayList();
        for(int i=0;i<16;i++){
            road.add(0);
        }
        int posX = 0;
        road.set(posX,1);
        posX += 1;
    
        for(int i = 0; i<suspects.size();i++){
            int id = suspects.get(i).getId();
            for(int j = 0; j<charactersToShow.size();j++){
                if(id == charactersToShow.get(j).getId()){
                    charactersToShow.remove(j);
                    
                }
                
            }
        }
        System.out.println(charactersToShow.size());

        MainView screen = new MainView(this,road);
        screen.resizeBackground();


       
        screen.initialDraws(characters, road);
        System.out.println(guilty.getName());
        //while(!winner && (int)road.get(road.size()-1)!=1){
            //System.out.println("");
            
        //}
        System.out.println("Ganaste");
       
    }
    
}
