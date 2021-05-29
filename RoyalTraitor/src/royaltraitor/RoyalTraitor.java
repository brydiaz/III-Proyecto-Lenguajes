/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package royaltraitor;

import org.jpl7.Query;

/**
 *
 * @author bryan
 */
public class RoyalTraitor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String t1 = "consult('dataBase.pl')";
        Query con = new Query(t1);
        System.out.println(t1+" "+(con.hasSolution() ?"Correcto":"Fallo"));
    }
    
}
