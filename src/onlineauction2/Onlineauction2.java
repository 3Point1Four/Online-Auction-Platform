/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package onlineauction2;

import java.sql.Connection;
import javax.swing.JFrame;

/**
 *
 * @author dhyan
 */
public class Onlineauction2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Connection conn=null;
        conn=dbConnection.connect();
        admin_user log=new admin_user();
        log.setVisible(true);
        log.pack();
        log.setLocationRelativeTo(null);
        log.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
