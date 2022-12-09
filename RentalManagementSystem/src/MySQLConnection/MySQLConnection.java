/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MySQLConnection;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author BARATHI
 */
public class MySQLConnection {
    Connection con=null;
    public static Connection dbconnector()
    {
        try
        {
            Class.forName("org.sqlite.JDBC");
            Connection con=DriverManager.getConnection("jdbc:sqlite:C:\\Users\\tejas\\OneDrive\\Desktop\\DB\\rent.db");
            //System.out("Connection Sucessfull");
            return con;
            
        }
        catch(Exception e)
                {
                    return null;
                }
        
    }

    public ResultSet selectDatabase(String sql) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void updateDatabase(String sql) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void insertDatabase(String sql) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
