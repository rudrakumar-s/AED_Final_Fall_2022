/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package LaptopRental;

import HomeLanding.GadgetAdminLandingPage;
import MySQLConnection.MySQLConnection;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import HomeLanding.HomeLanding;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JDialog;
import javax.swing.JFrame;

/**
 *
 * @author sunilrudrakumar
 */
public class LaptopReturnJFrame extends javax.swing.JFrame {

    /**
     * Creates new form ReturnJFrame
     */
    MySQLConnection c = new MySQLConnection();
    public LaptopReturnJFrame() {
        initComponents();
        DisplayLaptopOnRent();
        txtProductId.setVisible(false);
        txtRentId.setEditable(false);
        txtCustomerId.setEditable(false);
             this.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }



    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnManageLaptop = new javax.swing.JButton();
        btnRentLaptop = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        btnConfirm = new javax.swing.JButton();
        txtRentId = new javax.swing.JTextField();
        txtProductId = new javax.swing.JTextField();
        txtCustomerId = new javax.swing.JTextField();
        txtDelay = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtFine = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblLaptopOnRent = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1300, 800));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 185, 12));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnManageLaptop.setBackground(new java.awt.Color(51, 51, 0));
        btnManageLaptop.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        btnManageLaptop.setForeground(new java.awt.Color(255, 255, 255));
        btnManageLaptop.setText("Manage Laptop");
        btnManageLaptop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageLaptopActionPerformed(evt);
            }
        });
        jPanel1.add(btnManageLaptop, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 178, -1, -1));

        btnRentLaptop.setBackground(new java.awt.Color(51, 51, 0));
        btnRentLaptop.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        btnRentLaptop.setForeground(new java.awt.Color(255, 255, 255));
        btnRentLaptop.setText("Rent Laptop");
        btnRentLaptop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRentLaptopActionPerformed(evt);
            }
        });
        jPanel1.add(btnRentLaptop, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 223, 151, -1));

        btnLogout.setBackground(new java.awt.Color(51, 51, 0));
        btnLogout.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        btnLogout.setForeground(new java.awt.Color(255, 255, 255));
        btnLogout.setText("Back");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });
        jPanel1.add(btnLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 441, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 220, 1170));

        jPanel2.setBackground(new java.awt.Color(51, 51, 0));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnConfirm.setBackground(new java.awt.Color(255, 185, 12));
        btnConfirm.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        btnConfirm.setForeground(new java.awt.Color(255, 255, 255));
        btnConfirm.setText("Confirm");
        btnConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmActionPerformed(evt);
            }
        });
        jPanel2.add(btnConfirm, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 317, -1, 33));
        jPanel2.add(txtRentId, new org.netbeans.lib.awtextra.AbsoluteConstraints(215, 115, 138, 34));
        jPanel2.add(txtProductId, new org.netbeans.lib.awtextra.AbsoluteConstraints(215, 168, 138, 33));
        jPanel2.add(txtCustomerId, new org.netbeans.lib.awtextra.AbsoluteConstraints(215, 221, 138, 32));
        jPanel2.add(txtDelay, new org.netbeans.lib.awtextra.AbsoluteConstraints(215, 267, 138, 32));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 185, 12));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Fine :");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 317, 66, 32));
        jPanel2.add(txtFine, new org.netbeans.lib.awtextra.AbsoluteConstraints(215, 319, 138, 32));

        tblLaptopOnRent.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product ID", "Rent ID", "Customer ID", "Rent Fee"
            }
        ));
        tblLaptopOnRent.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblLaptopOnRentMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tblLaptopOnRent);

        jPanel2.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 398, -1, 104));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 185, 12));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Customer ID :");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(73, 219, -1, 32));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 185, 12));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Delay :");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 265, 66, 32));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 185, 12));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Rent ID :");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 167, -1, 32));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 185, 12));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Product ID :");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(86, 114, -1, 32));

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 185, 12));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Great Value Enterprises");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(137, 6, 522, 62));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 185, 12));
        jLabel1.setText("Return Laptops");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 80, 164, 22));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(194, 0, 1630, 1170));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblLaptopOnRentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblLaptopOnRentMouseClicked
                // TODO add your handling code here:
                DefaultTableModel model = (DefaultTableModel) tblLaptopOnRent.getModel();
                int MyIndex = tblLaptopOnRent.getSelectedRow();
                txtCustomerId.setText(model.getValueAt(MyIndex,2).toString());
                txtRentId.setText(model.getValueAt(MyIndex,1).toString());
                txtProductId.setText(model.getValueAt(MyIndex,0).toString());

    }//GEN-LAST:event_tblLaptopOnRentMouseClicked

    private void btnConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmActionPerformed

         try{
             int flag = 0;
                
                //*************************************** Validation of Empty Name Field ***************************************//
                 if(txtDelay.getText().isEmpty()){
                    JOptionPane optionPane = new JOptionPane("Delay Field cannot be empty", JOptionPane.ERROR_MESSAGE);
                    JDialog dialog = optionPane.createDialog("Error Message");
                    dialog.setAlwaysOnTop(true);
                    dialog.setVisible(true);
                    flag = 1;
                }
                 if(txtFine.getText().isEmpty()){
                    JOptionPane optionPane = new JOptionPane("Fine Field cannot be empty", JOptionPane.ERROR_MESSAGE);
                    JDialog dialog = optionPane.createDialog("Error Message");
                    dialog.setAlwaysOnTop(true);
                    dialog.setVisible(true);
                    flag = 1;
                }
                String cellPhoneNumber3 = txtFine.getText();
                Pattern pattern3 = Pattern.compile("^[0-9]{3}$");
                Matcher matcher3 = pattern3.matcher(cellPhoneNumber3);
                if(!matcher3.matches())
                {
                    JOptionPane.showMessageDialog(this,"Enter a Valid Fine Amount!");
                    flag = 1;
                    txtFine.setText("");
                    
                    
                }
                String cellPhoneNumber2 = txtDelay.getText();
                Pattern pattern2 = Pattern.compile("^[0-9]{3}$");
                Matcher matcher2 = pattern2.matcher(cellPhoneNumber2);
                if(!matcher3.matches())
                {
                    JOptionPane.showMessageDialog(this,"Enter a Valid Delay Period!");
                    flag = 1;
                    txtDelay.setText("");
                    
                    
                }
                 if(flag == 0){
            String sql="UPDATE customers SET customerid = '"+txtCustomerId.getText()+"', laptopdelay = '"+txtDelay.getText()+"', laptopfine= '"+txtFine.getText()+"' WHERE customerid = '"+txtCustomerId.getText()+"' ";
            c.updateDatabase(sql);
            JOptionPane.showMessageDialog(this,"Return Confirmed");
//***********************************************************************************************************
            String sql1 ="UPDATE laptop SET status = 'Available', rentid = NULL  WHERE productid = '"+txtProductId.getText()+"'";
            c.updateDatabase(sql1);
            
//************************************************************** *********************************************   

            DisplayLaptopOnRent();
                  txtCustomerId.setText("");
            txtDelay.setText("");
            txtFine.setText("");
            txtProductId.setText("");
            txtRentId.setText("");


        }
        }
        catch(Exception e)
        {
        e.printStackTrace();
    }
    }//GEN-LAST:event_btnConfirmActionPerformed

    private void btnManageLaptopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageLaptopActionPerformed
        // TODO add your handling code here:
        LaptopManageJFrame lr = new LaptopManageJFrame();
        lr.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnManageLaptopActionPerformed

    private void btnRentLaptopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRentLaptopActionPerformed
        // TODO add your handling code here:
        
        LaptopRentJFrame lr = new LaptopRentJFrame();
        lr.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRentLaptopActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        // TODO add your handling code here:
        GadgetAdminLandingPage hl = new GadgetAdminLandingPage();
        hl.setVisible(true);
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
            java.util.logging.Logger.getLogger(LaptopReturnJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LaptopReturnJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LaptopReturnJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LaptopReturnJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LaptopReturnJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConfirm;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnManageLaptop;
    private javax.swing.JButton btnRentLaptop;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tblLaptopOnRent;
    private javax.swing.JTextField txtCustomerId;
    private javax.swing.JTextField txtDelay;
    private javax.swing.JTextField txtFine;
    private javax.swing.JTextField txtProductId;
    private javax.swing.JTextField txtRentId;
    // End of variables declaration//GEN-END:variables

    private void DisplayLaptopOnRent() {
           String reg,brand,carmodel,status,price;
        try{


            String sql = "select * from laptop where status = 'Booked' and rentid IS NOT NULL";
            ResultSet rs = c.selectDatabase(sql);
            
            DefaultTableModel model =(DefaultTableModel) tblLaptopOnRent.getModel();
            int rowCount = model.getRowCount();
            for (int i = rowCount - 1; i >= 0; i--) 
            {
            model.removeRow(i);
            }


            while (rs.next()) {
                 reg = rs.getString(2);
                 brand = rs.getString(9);
                 carmodel = rs.getString(6);
                 status = rs.getString(1);
//               
                  String[] row = {status,reg,brand,carmodel};
                  model.addRow(row);
                               
            }
        
        } catch (SQLException e)
        {
            e.printStackTrace();
            
            
        }
        
    }
}
