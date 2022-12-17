/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trandpl.dbutil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author ashut
 */
public class DBConnection {
    private static Connection conn;
    
    static{
        try
        {
            Class.forName("oracle.jdbc.OracleDriver");
            conn=DriverManager.getConnection("jdbc:oracle:thin:@//AshutoshAnshu:1521/xe","tnp","Ashutosh");
            JOptionPane.showMessageDialog(null,"Connected Successfully to DB");
        }
        catch(ClassNotFoundException ex){
            JOptionPane.showMessageDialog(null,"Error in driver loading"+ex.getMessage());
            ex.printStackTrace();
        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Error in opening the conn to DB"+ex.getMessage());
            ex.printStackTrace();
        }
    }
    public static Connection getConnection(){
        return conn;
    }
    public static void closeConnection(){
        try{
            conn.close();
            JOptionPane.showMessageDialog(null,"Disconnected Successfully from the DB");
        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Error in closing the conn to DB"+ex.getMessage());
            ex.printStackTrace();
        }
    }
    
}
