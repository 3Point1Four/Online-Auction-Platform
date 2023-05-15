/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package onlineauction2;

import java.awt.Component;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author dhyan
 */
public class dbConnection {
    public static Connection connect(){
        Connection conn=null;
        
        try
        {
            conn=DriverManager.getConnection("jdbc:mysql://localhost:3307/onlineauction","root","");
            Component rootPane=null;
            System.out.println("Connected");
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,ex);
            System.out.println("not connected");
        }
        return conn;
    }
}
