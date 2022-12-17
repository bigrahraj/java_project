/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empmgmt.dbutil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author hp
 */
public class DBConnection {
    private static Connection conn;
    
    static{
                try{
                    Class.forName("oracle.jdbc.OracleDriver");
                    conn=DriverManager.getConnection("jdbc:oracle:thin:@//Ayush:1521/xe", "myprojbatch", "mystudents");
                    JOptionPane.showMessageDialog(null, "Connected successfully to DB");                  
                }
                catch(ClassNotFoundException ex){
                   JOptionPane.showMessageDialog(null,"Error in Driver Loading "+ex.getMessage());
                   ex.printStackTrace();
                }
                catch(SQLException ex){
                    JOptionPane.showMessageDialog(null,"Error in Opening the connection to DB"+ex.getMessage());
                   ex.printStackTrace();
                }
    } 
    public static Connection getConnection(){
        return conn;
    }
    public static void closeConnection(){
        try{
                conn.close();
                JOptionPane.showMessageDialog(null,"Disconnected Succesfully from the DB"); 
        }
        catch(SQLException ex){
                    JOptionPane.showMessageDialog(null,"Error in Closing the connection to DB"+ex.getMessage());
                   ex.printStackTrace();
                }
    }
}
