/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SQLConnection;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author BARATHI
 */
public class SQLConnection {
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
    
}
