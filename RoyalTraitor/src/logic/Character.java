/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

/**
 *
 * @author bryan
 */
public class Character {
    private int id;
    private String name;
    private Weapon w1;
    private Weapon w2;
    private Weapon w3;

    public Character(int id, String name, Weapon w1, Weapon w2, Weapon w3) {
        this.id = id;
        this.name = name;
        this.w1 = w1;
        this.w2 = w2;
        this.w3 = w3;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Weapon getW1() {
        return w1;
    }

    public void setW1(Weapon w1) {
        this.w1 = w1;
    }

    public Weapon getW2() {
        return w2;
    }

    public void setW2(Weapon w2) {
        this.w2 = w2;
    }

    public Weapon getW3() {
        return w3;
    }

    public void setW3(Weapon w3) {
        this.w3 = w3;
    }
    
    
}
