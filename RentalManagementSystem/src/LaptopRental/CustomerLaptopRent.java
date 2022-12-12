/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package LaptopRental;

import MySQLConnection.MySQLConnection;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import Customers.CustomerLanding;
import HomeLanding.HomeLanding;
import java.time.format.DateTimeFormatter;
import javax.swing.JFrame;

/**
 *
 * @author sunilrudrakumar
 */
public class CustomerLaptopRent extends javax.swing.JFrame {

    /**
     * Creates new form CustomerLaptopRent
     */
    MySQLConnection c = new MySQLConnection();
    public CustomerLaptopRent() {
        initComponents();
        Display(); 
         txtCustomerId.setEditable(false);
        txtProductID.setEditable(false);
        txtPrice.setEditable(false);
        txtModel.setEditable(false);
        txtBrand.setEditable(false);
             this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        
    }
     public CustomerLaptopRent(String s) {
        initComponents();
        showData(s);
        txtCustomerId.setEditable(false);
        txtProductID.setEditable(false);
        txtPrice.setEditable(false);
        txtModel.setEditable(false);
        txtBrand.setEditable(false);
        Display();  
             this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtCustomerId = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtPrice = new javax.swing.JTextField();
        txtModel = new javax.swing.JTextField();
        txtBrand = new javax.swing.JTextField();
        txtRentDate = new javax.swing.JTextField();
        txtReturnDate = new javax.swing.JTextField();
        txtProductID = new javax.swing.JTextField();
        btnBack = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblLaptopList = new javax.swing.JTable();
        btnRequest = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        btnLogout = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1300, 800));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(217, 161, 200));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Customer ID");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 76, 102, 31));
        jPanel1.add(txtCustomerId, new org.netbeans.lib.awtextra.AbsoluteConstraints(147, 77, 171, 31));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Price");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 120, 102, 31));
        jPanel1.add(txtPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(147, 121, 171, 31));
        jPanel1.add(txtModel, new org.netbeans.lib.awtextra.AbsoluteConstraints(147, 167, 171, 28));
        jPanel1.add(txtBrand, new org.netbeans.lib.awtextra.AbsoluteConstraints(147, 207, 171, 30));

        txtRentDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRentDateActionPerformed(evt);
            }
        });
        jPanel1.add(txtRentDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(147, 258, 171, 30));
        jPanel1.add(txtReturnDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(147, 308, 171, 30));

        txtProductID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProductIDActionPerformed(evt);
            }
        });
        jPanel1.add(txtProductID, new org.netbeans.lib.awtextra.AbsoluteConstraints(147, 356, 171, 31));

        btnBack.setBackground(new java.awt.Color(236, 213, 227));
        btnBack.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        jPanel1.add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 537, 102, 40));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Model");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 164, 102, 31));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("Brand");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 207, 102, 31));

        jLabel11.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("Rent Date");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 256, 102, 31));

        jLabel12.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel12.setText("Return Date");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 306, 102, 31));

        jLabel13.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel13.setText("Product ID");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 355, 102, 31));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 1300));

        jPanel2.setBackground(new java.awt.Color(236, 213, 227));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblLaptopList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Brand", "Model", "Status", "Price"
            }
        ));
        tblLaptopList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblLaptopListMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblLaptopList);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 260, 503, 124));

        btnRequest.setBackground(new java.awt.Color(217, 161, 200));
        btnRequest.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        btnRequest.setText("Request");
        btnRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRequestActionPerformed(evt);
            }
        });
        jPanel2.add(btnRequest, new org.netbeans.lib.awtextra.AbsoluteConstraints(372, 436, 115, 43));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Rent Laptop");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 128, 246, 60));

        btnLogout.setBackground(new java.awt.Color(217, 161, 200));
        btnLogout.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        btnLogout.setText("Log Out");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });
        jPanel2.add(btnLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(372, 519, 115, 43));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(394, 0, 1390, 1300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtRentDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRentDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRentDateActionPerformed

    private void btnRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRequestActionPerformed
        
      try {
          
          DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
                try{
                    formatter.parse(txtRentDate.getText());
                    formatter.parse(txtReturnDate.getText());

                } 
                catch(Exception e){
                     JOptionPane.showMessageDialog(this,"Please enter valid date format (MM/dd/yyyy)");
//                     txtRentDate.setText("");
//                     JOptionPane.showMessageDialog(this,"Please enter valid date format (MM/dd/yyyy)");
//                     txtReturnDate.setText("");
                     return;
                }
        String sql="UPDATE customers SET laptopaproove = 'Requested' ,laptopid = '"+txtProductID.getText()+"',laptoprentd = '"+txtRentDate.getText()+"',laptopreturnd = '"+txtReturnDate.getText()+"', laptopprice = '"+txtPrice.getText()+"' WHERE customerid = '"+txtCustomerId.getText()+"' ";
        c.updateDatabase(sql);
        JOptionPane.showMessageDialog(this," Successfully Requested");
         Reset();
         
            }
      catch (Exception ex) {
      System.out.println(ex);}
        
        
    }//GEN-LAST:event_btnRequestActionPerformed

    private void txtProductIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProductIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtProductIDActionPerformed

    private void tblLaptopListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblLaptopListMouseClicked
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) tblLaptopList.getModel();
        int MyIndex = tblLaptopList.getSelectedRow();
        txtProductID.setText(model.getValueAt(MyIndex,0).toString());
        txtModel.setText(model.getValueAt(MyIndex,2).toString());
        txtPrice.setText(model.getValueAt(MyIndex,4).toString());
        txtBrand.setText((model.getValueAt(MyIndex, 1).toString()));
    }//GEN-LAST:event_tblLaptopListMouseClicked

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        String s = txtCustomerId.getText();
         CustomerLanding lr = new CustomerLanding (s);
        lr.setVisible(true);
        this.dispose();
        
        
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        // TODO add your handling code here:
        HomeLanding lr = new HomeLanding();
                lr.setVisible(true);
                this.dispose();
    }//GEN-LAST:event_btnLogoutActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CustomerLaptopRent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustomerLaptopRent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustomerLaptopRent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustomerLaptopRent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CustomerLaptopRent().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnRequest;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblLaptopList;
    private javax.swing.JTextField txtBrand;
    private javax.swing.JTextField txtCustomerId;
    private javax.swing.JTextField txtModel;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtProductID;
    private javax.swing.JTextField txtRentDate;
    private javax.swing.JTextField txtReturnDate;
    // End of variables declaration//GEN-END:variables

    private void Display() {
         String reg,brand,carmodel,status,price;
        try{
//           
            String sql = "select * from laptop";
            ResultSet rs = c.selectDatabase(sql);
            DefaultTableModel model =(DefaultTableModel) tblLaptopList.getModel();
            int rowCount = model.getRowCount();
            for (int i = rowCount - 1; i >= 0; i--) 
            {
            model.removeRow(i);
            }


            while (rs.next()) {
                reg = rs.getString(1);
                brand = rs.getString(3);
                carmodel = rs.getString(4);
                status = rs.getString(5);
                price = rs.getString(6);
                String[] row = {reg,brand,carmodel,status,price};
                  model.addRow(row);
                               
            }
        
        } catch (SQLException e)
        {
            e.printStackTrace();      
        }
    
    }

    private void showData(String s) {
         txtCustomerId.setText(s);
      }
        
    public void Reset(){
//    txtCustomerId.setText("");
    txtProductID.setText("");
    txtModel.setText("");
    txtBrand.setText("");
    txtPrice.setText("");
    txtRentDate.setText("");
    txtReturnDate.setText("");
            }
    
    
}
