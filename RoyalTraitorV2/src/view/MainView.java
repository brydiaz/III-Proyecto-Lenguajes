/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.Component;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRootPane;
import royaltraitor.RoyalTraitor;
import logic.Character;

/**
 *
 * @author bryan
 */
public class MainView extends javax.swing.JFrame {
    boolean f = true;
    public MainView() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    //@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jbackground = new javax.swing.JLabel();
        jButtonDice1 = new javax.swing.JButton();
        jLabelClickDices = new javax.swing.JLabel();
        jButtonDice2 = new javax.swing.JButton();
        jButtonDice3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaDiceInfo = new javax.swing.JTextArea();
        jTextFieldThiefName = new javax.swing.JTextField();
        jLabelThiefName = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jbackground.setPreferredSize(new java.awt.Dimension(792, 504));

        jLabelClickDices.setText("Click the buttons to set the dices!");

        jButtonDice3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDice3ActionPerformed(evt);
            }
        });

        jTextAreaDiceInfo.setColumns(20);
        jTextAreaDiceInfo.setRows(5);
        jTextAreaDiceInfo.setText("2 eyes -> show clue\n2 paws -> show two cards\n                \nOther case -> thief moves");
        jScrollPane1.setViewportView(jTextAreaDiceInfo);

        jTextFieldThiefName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldThiefNameActionPerformed(evt);
            }
        });

        jLabelThiefName.setText("Did you find the thief?  Write its name");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbackground, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButtonDice1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButtonDice2, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(jButtonDice3, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabelClickDices, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelThiefName))
                        .addGap(0, 23, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(jTextFieldThiefName, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabelClickDices)
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonDice1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonDice2, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonDice3, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(jTextFieldThiefName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelThiefName))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jbackground, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldThiefNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldThiefNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldThiefNameActionPerformed

    private void jButtonDice3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDice3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonDice3ActionPerformed

    /**
     * @param args the command line arguments
     */
    
    public void initialDraws(ArrayList<Character> characters,ArrayList road){
 
        int iC = 0;
        this.setVisible(true);
        this.setLocationRelativeTo(null);
       
        
        this.jbackground.removeAll();

        ImageIcon backgroundImage = new ImageIcon(RoyalTraitor.class.getResource("/view/resources/Mapa.png"));
        this.jbackground.setIcon(backgroundImage);
        this.jbackground.setSize(792,504);
       
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
            this.jbackground.add(p);
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
            this.jbackground.add(p);
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
            this.jbackground.add(p);
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
            this.jbackground.add(p);
            iC++;
        }
        
        posX = 120;
        posY = 145;
        for(int i = 0; i<road.size();i++){
            String nameC = "question";
            
            if (road.get(i).equals(1)){
                nameC = "thiefH";
            }
            
            else if (i == 1||i == 5||i == 10||i == 14){
        
                if (road.get(i).equals(1)){
                nameC = "thiefV";
                }else{
                    nameC = "mud2";
                }
                posY = posY+45;
                posX = posX-45;
            }else{
                    nameC = "mud";
                }
            

            JLabel p = new JLabel();
            p.setSize(45,45);
            ImageIcon pI = new ImageIcon(RoyalTraitor.class.getResource("/view/resources/characters/"+nameC+".png"));
            p.setIcon(pI);
            p.setLocation(posX, posY);
            posX = posX+45;
            
            this.jbackground.add(p);
            

            }
 
        this.jbackground.repaint();
    
    }
   
    public void resizeBackground(){
        this.jbackground.setSize(1100,504);
    }

    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonDice1;
    private javax.swing.JButton jButtonDice2;
    private javax.swing.JButton jButtonDice3;
    private javax.swing.JLabel jLabelClickDices;
    private javax.swing.JLabel jLabelThiefName;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaDiceInfo;
    private javax.swing.JTextField jTextFieldThiefName;
    private javax.swing.JLabel jbackground;
    // End of variables declaration//GEN-END:variables
}
