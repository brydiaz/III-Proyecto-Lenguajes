/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

import java.util.ArrayList;
import org.jpl7.Query;
import java.util.Map;
import org.jpl7.Term;

/**
 *
 * @author bryan
 */
public class Prolog {

    public Prolog() {
    }
    
    public ArrayList getWeapons(){
        Query connect = new Query("consult('dataBase.pl')");
        ArrayList weapons = new ArrayList();
        if (connect.hasSolution()){
            Query weaponConsult = new Query("weapon(X).");
            while(weaponConsult.hasMoreSolutions()){
                Map<String, Term> k = weaponConsult.nextSolution();
                Weapon newWeapon = new Weapon(k.get("X").toString());
                weapons.add(newWeapon);
            }
            
        }
        return weapons;
    }
    
    public ArrayList getCharacters(){
        Query connect = new Query("consult('dataBase.pl')");
        ArrayList characters = new ArrayList();
        if (connect.hasSolution()){
            Query charactersConsult = new Query("character(ID,NAME, weapon(W1), weapon(W2),weapon(W3)).");
            while(charactersConsult.hasMoreSolutions()){
                Map<String, Term> k = charactersConsult.nextSolution();
                String id= k.get("ID").toString();
                int idToAdd = Integer.parseInt(id);
                String name = k.get("NAME").toString();
                Weapon w1 = new  Weapon(k.get("W1").toString());
                Weapon w2 = new  Weapon(k.get("W2").toString());
                Weapon w3 = new  Weapon(k.get("W3").toString());
                Character newCharacter = new Character(idToAdd, name, w1, w2, w3);
                characters.add(newCharacter);
            }
            
        }
        return characters;
    }
    
    public Character getGuilty(){
        Query connect = new Query("consult('dataBase.pl')");
        Character finalGuilty = null;
        if (connect.hasSolution()){
            Query guiltyProcess = new Query("generateGuilty().");
            if(guiltyProcess.hasSolution()){
                Query guilty = new Query("guilty(ID,NAME,weapon(W1),weapon(W2),weapon(W3))");
                if(guilty.hasSolution()){
                    Map<String, Term> k = guilty.nextSolution();
                    String id= k.get("ID").toString();
                    int idToAdd = Integer.parseInt(id);
                    String name = k.get("NAME").toString();
                    Weapon w1 = new  Weapon(k.get("W1").toString());
                    Weapon w2 = new  Weapon(k.get("W2").toString());
                    Weapon w3 = new  Weapon(k.get("W3").toString());
                    finalGuilty = new Character(idToAdd, name, w1, w2, w3);
                    finalGuilty.setUp(true);
                }
            }
           
    }
        return finalGuilty;
    }
    
    public int make2IntialSuspects(){
        int hit = 1;
        Query connect = new Query("consult('dataBase.pl')");
        ArrayList suspects = new ArrayList();
        if (connect.hasSolution()){
            Query suspectsConsult = new Query("turn2Arround().");
            if(suspectsConsult.hasSolution()){
                hit = 0;
            }
        }
            
        return hit;
    }
    
    public ArrayList getSuspects(){
        Query connect = new Query("consult('dataBase.pl')");
        ArrayList suspects = new ArrayList();
        if (connect.hasSolution()){
            Query suspectsConsult = new Query("faceUp(ID,NAME, weapon(W1), weapon(W2),weapon(W3)).");
            while(suspectsConsult.hasMoreSolutions()){
                Map<String, Term> k = suspectsConsult.nextSolution();
                String id= k.get("ID").toString();
                int idToAdd = Integer.parseInt(id);
                String name = k.get("NAME").toString();
                Weapon w1 = new  Weapon(k.get("W1").toString());
                Weapon w2 = new  Weapon(k.get("W2").toString());
                Weapon w3 = new  Weapon(k.get("W3").toString());
                Character newCharacter = new Character(idToAdd, name, w1, w2, w3);
                suspects.add(newCharacter);
            }
            
        }
        return suspects;
    }
    
    public ArrayList addSuspect(String name){
        int hit = 1;
        Query connect = new Query("consult('dataBase.pl')");
        if (connect.hasSolution()){
            Query addSus = new Query("addToSuspects("+name+").");
            if(addSus.hasSolution()){
                hit = 0;
            }
        }
        return this.getSuspects();
    }
    
    public ArrayList askWeapon(String weapon){
        int hit = 1;
        Query connect = new Query("consult('dataBase.pl')");
        if (connect.hasSolution()){
            
            Query addSus = new Query("askWeapon("+weapon+").");
            if(addSus.hasSolution()){
                while(addSus.hasMoreSolutions()){
                    addSus.nextSolution();
                }
            }
        }
        return this.getSuspects();
    }
    
    public ArrayList<Character> actCharacters(ArrayList<Character> characters,ArrayList<Character> guilty){
        for(int i = 0; i<guilty.size();i++){
            int id = guilty.get(i).getId();
            for(int j = 0; j<characters.size();j++){
                if(id == characters.get(j).getId()){
                    characters.get(j).setUp(true);
                }
            }
        }
        return characters;
    }
   
    
}
