/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MySQLConnection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import java.sql.PreparedStatement;

/**
 *
 * @author sunilrudrakumar
 */
public class MySQLConnection {
    
    Connection con;
            
    Statement st = null;
    ResultSet rs = null;

    public MySQLConnection() {
        try {
            this.con = DriverManager.getConnection("jdbc:mysql://localhost:3306/rent","root","12345678");
        } catch (SQLException ex) {
            Logger.getLogger(MySQLConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void updateDatabase(String sqlQuery) {
         
        try {
            PreparedStatement add = con.prepareStatement(sqlQuery);
            add.executeUpdate(sqlQuery);
        } catch (SQLException ex) {
            Logger.getLogger(MySQLConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void insertDatabase(String sqlQuery) {
         
        try {
            PreparedStatement add = con.prepareStatement(sqlQuery);
            add.execute(sqlQuery);
            
        } catch (SQLException ex) {
            Logger.getLogger(MySQLConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public ResultSet selectDatabase(String sqlQuery) {
         
        try {
           st = con.createStatement();
           rs = st.executeQuery(sqlQuery);
//           
        } catch (SQLException ex) {
            Logger.getLogger(MySQLConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
        
    }
    
//    private void requestBtn(){
//         try {
//        String sql="UPDATE customers SET customername = '"+txtName.getText()+"',laptopaproove = 'Requested' ,productid = '"+txtProductID.getText()+"',rentdate = '"+txtRentDate.getText()+"',returndate = '"+txtReturnDate.getText()+"' WHERE customerid = '"+txtCustomerId.getText()+"' ";
//        PreparedStatement add = con.prepareStatement(sql);
////
//            add.executeUpdate(sql);
//      
//        JOptionPane.showMessageDialog(this,"Record Updated Successfully");
//         
//      }catch (SQLException ex) { }
//        
//    }
    
    
}
