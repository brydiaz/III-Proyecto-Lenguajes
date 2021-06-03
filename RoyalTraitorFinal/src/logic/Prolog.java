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
    Query connect ;

    public Prolog() {
        this.connect  = new Query("consult('dataBase.pl')");
        connect.hasSolution();
    }
    
    public ArrayList getWeapons(){
        
        ArrayList weapons = new ArrayList();
      
            Query weaponConsult = new Query("weapon(X).");
            while(weaponConsult.hasMoreSolutions()){
                Map<String, Term> k = weaponConsult.nextSolution();
                Weapon newWeapon = new Weapon(k.get("X").toString());
                weapons.add(newWeapon);
            }
            
        
        return weapons;
    }
    
    public ArrayList getCharacters(){

        ArrayList characters = new ArrayList();

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
        return characters;
    }
    
    public Character getGuilty(){
       
        Character finalGuilty = null;
 
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
        return finalGuilty;
    }
    
    public int make2IntialSuspects(){
        System.out.println("holi");
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
   ;
        ArrayList suspects = new ArrayList();

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
        return suspects;
    }
    
    public ArrayList addSuspect(String name){
        int hit = 1;
   
        ArrayList x = new ArrayList();
            Query addSus = new Query("addToSuspects("+name+").");
            if(addSus.hasSolution()){
                hit = 0;
            
        }
        return this.getSuspects();
    }
    
    public ArrayList askWeapon(String weapon){
        int hit = 1;
        ArrayList x = new ArrayList();
    
    
            System.out.println(weapon);
            Query addSus = new Query("askWeapon("+weapon+").");
            if(addSus.hasSolution()){
               x.add(this.getSuspects());
               x.add(0);
            }else{
                x.add(this.getSuspects());
                x.add(1);
            } 
        
        return x;
    }
    
    public ArrayList<Character> actCharacters(ArrayList<Character> characters,ArrayList<Character> guilty){
        ArrayList<Character> finalC = new ArrayList<Character>();
        for(int i = 0; i<guilty.size();i++){
            int id = guilty.get(i).getId();
            for(int j = 0; j<characters.size();j++){
                if(id == characters.get(j).getId()){
                    characters.get(j).setUp(true);
                    
                }
                
            }
        }
        for(int i = 0; i<characters.size();i++){
            finalC.add(characters.get(i));
        }
       
        return finalC;
    }
    public ArrayList<Character> actCharacters2(ArrayList<Character> characters,ArrayList<Character> guilty){
        ArrayList<Character> finalC = new ArrayList<Character>();
        for(int i = 0; i<guilty.size();i++){
            int id = guilty.get(i).getId();
            for(int j = 0; j<characters.size();j++){
                if(id == characters.get(j).getId()){
                    characters.get(j).setUp(false);
                    
                }
                
            }
        }
        for(int i = 0; i<characters.size();i++){
            finalC.add(characters.get(i));
        }
       
        return finalC;
    }
    
    
    
}
