/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.util.ArrayList;
import java.util.Random;
import java.lang.Math;
import javax.lang.model.SourceVersion;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import royaltraitor.RoyalTraitor;
import logic.Character;
import logic.Prolog;
import logic.Weapon;
import royaltraitor.Game;

/**
 *
 * @author bryan
 */
public class MainView extends javax.swing.JFrame {
    public boolean pause = false;
    Game game;
    ArrayList<Character> characters;
    ArrayList road = new ArrayList();
    int posX = 1; 
    Prolog func;
    
    public MainView(Game game, ArrayList road) {
        this.game = game;
        this.road = road;
        this.characters = characters;
       
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
        jLabelClickDices = new javax.swing.JLabel();
        thiefNameText = new javax.swing.JTextField();
        jLabelThiefName = new javax.swing.JLabel();
        setDicesButton = new javax.swing.JButton();
        checkNameButton = new javax.swing.JButton();
        dice1 = new javax.swing.JLabel();
        dice2 = new javax.swing.JLabel();
        dice3 = new javax.swing.JLabel();
        showClue = new javax.swing.JLabel();
        cluetext = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));

        jbackground.setPreferredSize(new java.awt.Dimension(792, 504));

        jLabelClickDices.setText("Click the button to set the dices!");

        thiefNameText.setName("thiefNameText"); // NOI18N
        thiefNameText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                thiefNameTextActionPerformed(evt);
            }
        });

        jLabelThiefName.setText("Did you find the thief?  Write its name");

        setDicesButton.setBackground(new java.awt.Color(44, 165, 192));
        setDicesButton.setText("Click!");
        setDicesButton.setName("setDicesButton"); // NOI18N
        setDicesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setDicesButtonActionPerformed(evt);
            }
        });

        checkNameButton.setText("Check name!");
        checkNameButton.setName("checkName"); // NOI18N
        checkNameButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkNameButtonActionPerformed(evt);
            }
        });

        dice1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dice1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(33, 33, 33), 1, true));
        dice1.setName("dice1"); // NOI18N

        dice2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dice2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(33, 33, 33), 1, true));
        dice2.setName("dice2"); // NOI18N

        dice3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dice3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(33, 33, 33), 1, true));
        dice3.setName("dice3"); // NOI18N

        showClue.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        showClue.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(33, 33, 33), 1, true));
        showClue.setName("showClue"); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jbackground, javax.swing.GroupLayout.PREFERRED_SIZE, 802, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelClickDices)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(setDicesButton)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(10, 10, 10)
                                    .addComponent(thiefNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabelThiefName)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(checkNameButton)
                                    .addGap(38, 38, 38)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(showClue, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(dice1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(dice2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(dice3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(cluetext, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelClickDices)
                    .addComponent(setDicesButton))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dice2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dice3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dice1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(showClue, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cluetext, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelThiefName)
                .addGap(1, 1, 1)
                .addComponent(thiefNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(checkNameButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jbackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void thiefNameTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_thiefNameTextActionPerformed
        // TO add your handling code here:
    }//GEN-LAST:event_thiefNameTextActionPerformed
    
    
    // Boton para buscar si el nombre coincide con el del mae
    private void checkNameButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkNameButtonActionPerformed
        // TODO add your handling code here:
        this.checkWinner();
    }//GEN-LAST:event_checkNameButtonActionPerformed
    
    //Boton setDicesButton
    private void setDicesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setDicesButtonActionPerformed
        // TODO add your handling code here:
        
        this.pause = true;
        road.set(posX-1,0);
        road.set(posX, 1);
        initialDraws(this.game.characters, road);
        posX = posX +1;
        // Generar 3 números random
        Random rand = new Random();
        int limite = 3;
        
        int dadoRandom1 = rand.nextInt(limite);
        int dadoRandom2 = rand.nextInt(limite);
        int dadoRandom3 = rand.nextInt(limite);
        
        // 0 -> ojo
        // 1 -> patita
        // 2 -> sadface
        
        // Cambiar iconos según el random
        
        // DADO 1
        if(dadoRandom1 == 0){
            this.dice1.setText("");
            ImageIcon dado1 = new ImageIcon(RoyalTraitor.class.getResource("/view/resources/others/eye.png"));
            this.dice1.setIcon(dado1);
        }else if(dadoRandom1 == 1){
            this.dice1.setText("");
            ImageIcon dado1 = new ImageIcon(RoyalTraitor.class.getResource("/view/resources/others/paw.png"));
            this.dice1.setIcon(dado1);
        }else if(dadoRandom1 == 2){
            this.dice1.setText("");
            ImageIcon dado1 = new ImageIcon(RoyalTraitor.class.getResource("/view/resources/others/sadface.png"));
            this.dice1.setIcon(dado1);
        }
        
        
        // DADO 2
        if(dadoRandom2 == 0){
            this.dice2.setText("");
            ImageIcon dado2 = new ImageIcon(RoyalTraitor.class.getResource("/view/resources/others/eye.png"));
            this.dice2.setIcon(dado2);
        }else if(dadoRandom2 == 1){
            this.dice2.setText("");
            ImageIcon dado2 = new ImageIcon(RoyalTraitor.class.getResource("/view/resources/others/paw.png"));
            this.dice2.setIcon(dado2);
        }else if(dadoRandom2 == 2){
            this.dice2.setText("");
            ImageIcon dado2 = new ImageIcon(RoyalTraitor.class.getResource("/view/resources/others/sadface.png"));
            this.dice2.setIcon(dado2);
        }
        
        // DADO 3
        if(dadoRandom3 == 0){
            this.dice3.setText("");
            ImageIcon dado3 = new ImageIcon(RoyalTraitor.class.getResource("/view/resources/others/eye.png"));
            this.dice3.setIcon(dado3);
        }else if(dadoRandom3 == 1){
            this.dice3.setText("");
            ImageIcon dado3 = new ImageIcon(RoyalTraitor.class.getResource("/view/resources/others/paw.png"));
            this.dice3.setIcon(dado3);
        }else if(dadoRandom3 == 2){
            this.dice3.setText("");
            ImageIcon dado3 = new ImageIcon(RoyalTraitor.class.getResource("/view/resources/others/sadface.png"));
            this.dice3.setIcon(dado3);
        }
        
        
        
        // Verificar si hay elementos iguales
        if(dadoRandom1 == dadoRandom2 || dadoRandom1 == dadoRandom3 || dadoRandom2 == dadoRandom3){
            
            int suma = dadoRandom1 + dadoRandom2;
            int suma1 = dadoRandom1 + dadoRandom3;
            int suma2 = dadoRandom2 + dadoRandom3;
            
            if(suma == 0 || suma1 == 0){
                int r = (int) Math.floor(Math.random()*this.game.weapons.size());
                Weapon wt = this.game.weapons.get(r);
                this.game.weapons.remove(wt);
                ImageIcon wI = new ImageIcon(RoyalTraitor.class.getResource("/view/resources/weapons/"+wt.getWeaponName()+".png"));
                this.showClue.setIcon(wI);
                ArrayList x = this.game.dataBase.askWeapon(wt.getWeaponName());
                
                
                this.game.suspects = (ArrayList<Character>) x.get(0);
              
                Character c = this.game.dataBase.getGuilty();
                System.out.println(c.getName());
                int have = 0;
                have = (int) x.get(1);
                if(have == 1){
                    this.cluetext.setText("PISTA!: No tiene, actualizamos");
                    for (int i = 0;i<this.game.characters.size();i++){
                        this.game.characters.get(i).setUp(false);
                    }
                    this.game.characters = this.game.dataBase.actCharacters(this.game.characters, this.game.suspects);
;                   initialDraws(this.game.characters, road);

                }else{
                    this.cluetext.setText("PISTA!: Sí tiene, NO actualizamos");

            }
                
            }
            
            else if(suma1 == 2 || suma1 == 2){
               
                //this.showClue.setText("Mostrar 2 usuarios");
            }
            
            else{
                 this.cluetext.setText("Esperando..");
                 ImageIcon pI = new ImageIcon(RoyalTraitor.class.getResource("/view/resources/characters/"+"question.png"));
                 this.showClue.setIcon(pI);
                 initialDraws(this.game.characters, road);
            }
            
            
            /*
            
            // Mostrar pista -> label llamado "showClue"
            if(dadoRandom1 == 0 || dadoRandom2 == 0|| dadoRandom3 == 0){
                
            }else
            
            
             // Mostrar texto de "Show 2 suspects" -> label llamado "showClue"
             if(dadoRandom1 == 1 || dadoRandom2 == 1|| dadoRandom3 == 1){
                this.showClue.setText("Mostrar 2 sospechosos");
            }else
             
             
             
             // Mostrar texto de "The thief keeps walking :(" -> label llamado "showClue"
             if(dadoRandom1 == 2 || dadoRandom2 == 2 || dadoRandom3 == 2){
                this.showClue.setText("The thief keeps walking :(");
            }
            
            */
            
        }
        //this.pause = false;

    }//GEN-LAST:event_setDicesButtonActionPerformed

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
    
    /**
     *
     */
   public void checkWinner(){
   

       if(this.thiefNameText.getText().equals(this.game.guilty.getName())){
           System.out.println("x");
           this.game.winner = true;
           this.thiefNameText.setText("Ganaste");
           
       }else{
       this.thiefNameText.setText("Fallaste");
   }} 
   
    public void resizeBackground(){
        this.jbackground.setSize(1100,504);
    }

    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton checkNameButton;
    private javax.swing.JLabel cluetext;
    private javax.swing.JLabel dice1;
    private javax.swing.JLabel dice2;
    private javax.swing.JLabel dice3;
    private javax.swing.JLabel jLabelClickDices;
    private javax.swing.JLabel jLabelThiefName;
    private javax.swing.JLabel jbackground;
    private javax.swing.JButton setDicesButton;
    private javax.swing.JLabel showClue;
    private javax.swing.JTextField thiefNameText;
    // End of variables declaration//GEN-END:variables

    public SourceVersion getSupportedSourceVersion() {
        return SourceVersion.RELEASE_13;
    }

    
}
