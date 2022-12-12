/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package CarRental;

import HomeLanding.HomeLanding;
import HomeLanding.VehicleAdminLandingPage;
import MySQLConnection.MySQLConnection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;



/**
 *
 * @author tejas
 */
public class ReturnCarJFrame extends javax.swing.JFrame {

    /**
     * Creates new form ReturnCarJFrame
     */
    MySQLConnection c = new MySQLConnection();
    public ReturnCarJFrame() {
        initComponents();
        DisplayCarOnRent();
//        TxtRegNo.setVisible(false);
        TxtRentID.setEditable(false);
        TxtCustomerID.setEditable(false);
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

        ReturnCarPanel = new javax.swing.JPanel();
        LblReturnCarHeading = new javax.swing.JLabel();
        ButtonsPanel = new javax.swing.JPanel();
        BtnRentCar = new javax.swing.JButton();
        BtnManageCar = new javax.swing.JButton();
        BtnReturnCar2 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        TblCarOnRent = new javax.swing.JTable();
        TxtCustomerID = new javax.swing.JTextField();
        TxtRentID = new javax.swing.JTextField();
        BtnConfirm = new javax.swing.JButton();
        TxtDelay = new javax.swing.JTextField();
        TxtRegNo = new javax.swing.JTextField();
        TxtFine = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1300, 800));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ReturnCarPanel.setBackground(new java.awt.Color(51, 51, 0));
        ReturnCarPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LblReturnCarHeading.setBackground(new java.awt.Color(161, 215, 215));
        LblReturnCarHeading.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        LblReturnCarHeading.setForeground(new java.awt.Color(255, 185, 12));
        LblReturnCarHeading.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LblReturnCarHeading.setText("Return Cars");
        LblReturnCarHeading.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ReturnCarPanel.add(LblReturnCarHeading, new org.netbeans.lib.awtextra.AbsoluteConstraints(209, 145, 243, -1));

        ButtonsPanel.setBackground(new java.awt.Color(255, 185, 12));
        ButtonsPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BtnRentCar.setBackground(new java.awt.Color(51, 51, 0));
        BtnRentCar.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        BtnRentCar.setForeground(new java.awt.Color(255, 255, 255));
        BtnRentCar.setText("Manage Rents");
        BtnRentCar.setBorder(null);
        BtnRentCar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnRentCar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRentCarActionPerformed(evt);
            }
        });
        ButtonsPanel.add(BtnRentCar, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 331, 136, 29));

        BtnManageCar.setBackground(new java.awt.Color(51, 51, 0));
        BtnManageCar.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        BtnManageCar.setForeground(new java.awt.Color(255, 255, 255));
        BtnManageCar.setText("Manage Cars");
        BtnManageCar.setBorder(null);
        BtnManageCar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnManageCar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnManageCarActionPerformed(evt);
            }
        });
        ButtonsPanel.add(BtnManageCar, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 261, 136, 29));

        BtnReturnCar2.setBackground(new java.awt.Color(51, 51, 0));
        BtnReturnCar2.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        BtnReturnCar2.setForeground(new java.awt.Color(255, 255, 255));
        BtnReturnCar2.setText("Back");
        BtnReturnCar2.setBorder(null);
        BtnReturnCar2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnReturnCar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnReturnCar2ActionPerformed(evt);
            }
        });
        ButtonsPanel.add(BtnReturnCar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 515, 115, 29));

        ReturnCarPanel.add(ButtonsPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 240, 1260));

        TblCarOnRent.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Customer ID", "Reg No", "Rent ID", "Rent Fee"
            }
        ));
        TblCarOnRent.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TblCarOnRentMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(TblCarOnRent);

        ReturnCarPanel.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(288, 505, 430, 139));

        TxtCustomerID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtCustomerIDActionPerformed(evt);
            }
        });
        ReturnCarPanel.add(TxtCustomerID, new org.netbeans.lib.awtextra.AbsoluteConstraints(461, 212, 137, 32));

        TxtRentID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtRentIDActionPerformed(evt);
            }
        });
        ReturnCarPanel.add(TxtRentID, new org.netbeans.lib.awtextra.AbsoluteConstraints(461, 256, 137, 32));

        BtnConfirm.setBackground(new java.awt.Color(255, 185, 12));
        BtnConfirm.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        BtnConfirm.setForeground(new java.awt.Color(255, 255, 255));
        BtnConfirm.setText("Confirm");
        BtnConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnConfirmActionPerformed(evt);
            }
        });
        ReturnCarPanel.add(BtnConfirm, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 290, -1, 33));
        ReturnCarPanel.add(TxtDelay, new org.netbeans.lib.awtextra.AbsoluteConstraints(461, 353, 137, 32));
        ReturnCarPanel.add(TxtRegNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(461, 308, 137, 31));
        ReturnCarPanel.add(TxtFine, new org.netbeans.lib.awtextra.AbsoluteConstraints(461, 399, 137, 32));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 185, 12));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Customer ID :");
        ReturnCarPanel.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(299, 210, -1, 32));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 185, 12));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Rent ID :");
        ReturnCarPanel.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(336, 255, -1, 32));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 185, 12));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Delay :");
        ReturnCarPanel.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(353, 351, -1, 32));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 185, 12));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("Reg No :");
        ReturnCarPanel.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 306, -1, 32));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 185, 12));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Fine :");
        ReturnCarPanel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(341, 397, 66, 32));

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 185, 12));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Great Value Enterprises");
        ReturnCarPanel.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(348, 32, -1, -1));

        getContentPane().add(ReturnCarPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1670, 1260));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnRentCarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRentCarActionPerformed
        // TODO add your handling code here:
        RentCarJFrame rc = new RentCarJFrame();
        rc.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BtnRentCarActionPerformed

    private void BtnManageCarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnManageCarActionPerformed
        // TODO add your handling code here:
        ManageCarJFrame mc = new ManageCarJFrame();
        mc.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BtnManageCarActionPerformed

    private void TxtCustomerIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtCustomerIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtCustomerIDActionPerformed

    private void BtnConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnConfirmActionPerformed
        // TODO add your handling code here:
        try{
            int flag = 0;
                
                //*************************************** Validation of Empty Name Field ***************************************//
                 if(TxtDelay.getText().isEmpty()){
                    JOptionPane optionPane = new JOptionPane("Delay Field cannot be empty", JOptionPane.ERROR_MESSAGE);
                    JDialog dialog = optionPane.createDialog("Error Message");
                    dialog.setAlwaysOnTop(true);
                    dialog.setVisible(true);
                    flag = 1;
                }
                 if(TxtFine.getText().isEmpty()){
                    JOptionPane optionPane = new JOptionPane("Fine Field cannot be empty", JOptionPane.ERROR_MESSAGE);
                    JDialog dialog = optionPane.createDialog("Error Message");
                    dialog.setAlwaysOnTop(true);
                    dialog.setVisible(true);
                    flag = 1;
                }
                String cellPhoneNumber3 = TxtFine.getText();
                Pattern pattern3 = Pattern.compile("^[0-9]{3}$");
                Matcher matcher3 = pattern3.matcher(cellPhoneNumber3);
                if(!matcher3.matches())
                {
                    JOptionPane.showMessageDialog(this,"Enter a Valid Fine Amount!");
                    flag = 1;
                    TxtFine.setText("");
                    
                    
                }
                String cellPhoneNumber2 = TxtDelay.getText();
                Pattern pattern2 = Pattern.compile("^[0-9]{3}$");
                Matcher matcher2 = pattern2.matcher(cellPhoneNumber2);
                if(!matcher3.matches())
                {
                    JOptionPane.showMessageDialog(this,"Enter a Valid Delay Period!");
                    flag = 1;
                    TxtDelay.setText("");
                    
                    
                }
                if(flag == 0){
            String sql="UPDATE customers SET customerid = '"+TxtCustomerID.getText()+"', cardelay = '"+TxtDelay.getText()+"', "
                    + "carfine= '"+TxtFine.getText()+"' WHERE customerid = '"+TxtCustomerID.getText()+"' ";
            c.updateDatabase(sql);
            JOptionPane.showMessageDialog(this,"Return Confirmed");
            String sql1 ="UPDATE car SET status = 'Available', rentid = NULL  WHERE productid = '"+TxtRegNo.getText()+"'";
            c.updateDatabase(sql1);
 
            DisplayCarOnRent();
            TxtDelay.setText("");
            TxtFine.setText("");
            TxtCustomerID.setText("");
            TxtRentID.setText("");
            TxtRegNo.setText("");
                }
        }
        catch(Exception e)
        {
        e.printStackTrace();
    }
    }//GEN-LAST:event_BtnConfirmActionPerformed

    private void TblCarOnRentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TblCarOnRentMouseClicked
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) TblCarOnRent.getModel();
        int MyIndex = TblCarOnRent.getSelectedRow();
        TxtCustomerID.setText(model.getValueAt(MyIndex,2).toString());
        TxtRentID.setText(model.getValueAt(MyIndex,1).toString());
        TxtRegNo.setText(model.getValueAt(MyIndex,0).toString());
    }//GEN-LAST:event_TblCarOnRentMouseClicked

    private void TxtRentIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtRentIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtRentIDActionPerformed

    private void BtnReturnCar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnReturnCar2ActionPerformed
        // TODO add your handling code here:
        VehicleAdminLandingPage hl = new VehicleAdminLandingPage();
        hl.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BtnReturnCar2ActionPerformed

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
            java.util.logging.Logger.getLogger(ReturnCarJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReturnCarJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReturnCarJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReturnCarJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReturnCarJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnConfirm;
    private javax.swing.JButton BtnManageCar;
    private javax.swing.JButton BtnRentCar;
    private javax.swing.JButton BtnReturnCar2;
    private javax.swing.JPanel ButtonsPanel;
    private javax.swing.JLabel LblReturnCarHeading;
    private javax.swing.JPanel ReturnCarPanel;
    private javax.swing.JTable TblCarOnRent;
    private javax.swing.JTextField TxtCustomerID;
    private javax.swing.JTextField TxtDelay;
    private javax.swing.JTextField TxtFine;
    private javax.swing.JTextField TxtRegNo;
    private javax.swing.JTextField TxtRentID;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration//GEN-END:variables

    private void DisplayCarOnRent() {
        String reg,brand,carmodel,status,price;
        try{
            String sql = "select * from car where status = 'Booked' and rentid IS NOT NULL";
            ResultSet rs = c.selectDatabase(sql);
            DefaultTableModel model =(DefaultTableModel) TblCarOnRent.getModel();
            int rowCount = model.getRowCount();
            for (int i = rowCount - 1; i >= 0; i--) {
            model.removeRow(i);
            }
            while (rs.next()) {
                reg = rs.getString(2);
                brand = rs.getString(9);
                carmodel = rs.getString(6);
                status = rs.getString(1);
                String[] row = {status,reg,brand,carmodel};
                model.addRow(row);                  
            }
        } 
        catch (SQLException e)
        {
            e.printStackTrace();    
        }
    
    }
}
