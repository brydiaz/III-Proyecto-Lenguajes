/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import royaltraitor.RoyalTraitor;
import logic.Character;

/**
 *
 * @author bryan
 */
public class MainView extends javax.swing.JFrame {

    /**
     * Creates new form MainView
     */
    
    public MainView() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(792, 504));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 792, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 504, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    
    public void initialDraws(ArrayList<Character> characters){
        int iC = 0;
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        JLabel background = new JLabel();
        background.setSize(792, 504);
       
        ImageIcon backgroundImage = new ImageIcon(RoyalTraitor.class.getResource("/view/resources/Mapa.png"));
        background.setIcon(backgroundImage);
        
       
        int posX = 185;//60 inicial
        int posY = 20;//40 inicial
        int charcs = 0;
        for(int i = 0; i<4;i++){
            JLabel p = new JLabel();
            p.setSize(58,72);
            String nameC = "";
            if(characters.get(iC).isUp()){
                nameC = characters.get(iC).getName();
            }else{
                nameC = "question";
            }
            ImageIcon pI = new ImageIcon(RoyalTraitor.class.getResource("/view/resources/characters/"+nameC+".png"));
            p.setIcon(pI);
            p.setLocation(posX, posY);
            posX = posX+120;
            background.add(p);
            iC ++;
        }
        posX = 40;
        posY = 100;
        for(int i = 0; i<4;i++){
            JLabel p = new JLabel();
            p.setSize(58,72);
            String nameC = "";
            if(characters.get(iC).isUp()){
                nameC = characters.get(iC).getName();
            }else{
                nameC = "question";
            }
            ImageIcon pI = new ImageIcon(RoyalTraitor.class.getResource("/view/resources/characters/"+nameC+".png"));
            p.setIcon(pI);
            p.setLocation(posX, posY);
            posY = posY+80;
            background.add(p);
            iC++;
        }
        
        posX = 185;
        posY = 400;
        for(int i = 0; i<4;i++){
            JLabel p = new JLabel();
            p.setSize(58,72);
            String nameC = "";
            if(characters.get(iC).isUp()){
                nameC = characters.get(iC).getName();
            }else{
                nameC = "question";
            }
            ImageIcon pI = new ImageIcon(RoyalTraitor.class.getResource("/view/resources/characters/"+nameC+".png"));
            p.setIcon(pI);
            p.setLocation(posX, posY);
            posX = posX+120;
            background.add(p);
            iC++;
        }
        
        posX = 690;
        posY = 100;
        for(int i = 0; i<4;i++){
            JLabel p = new JLabel();
            p.setSize(58,72);
            String nameC = "";
            if(characters.get(iC).isUp()){
                nameC = characters.get(iC).getName();
            }else{
                nameC = "question";
            }
            ImageIcon pI = new ImageIcon(RoyalTraitor.class.getResource("/view/resources/characters/"+nameC+".png"));
            p.setIcon(pI);
            p.setLocation(posX, posY);
            posY = posY+80;
            background.add(p);
            iC++;
        }
        
        
        this.add(background);
       this.pack();
    
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
