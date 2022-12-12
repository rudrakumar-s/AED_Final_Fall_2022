/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package CarRental;

import MySQLConnection.MySQLConnection;
import java.sql.ResultSet;
import java.sql.SQLException;
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
        btnLogout = new javax.swing.JButton();
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
        setUndecorated(true);

        ReturnCarPanel.setBackground(new java.awt.Color(51, 51, 0));

        LblReturnCarHeading.setBackground(new java.awt.Color(161, 215, 215));
        LblReturnCarHeading.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        LblReturnCarHeading.setForeground(new java.awt.Color(255, 185, 12));
        LblReturnCarHeading.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LblReturnCarHeading.setText("Return Cars");
        LblReturnCarHeading.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        ButtonsPanel.setBackground(new java.awt.Color(255, 185, 12));

        BtnRentCar.setBackground(new java.awt.Color(51, 51, 0));
        BtnRentCar.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        BtnRentCar.setForeground(new java.awt.Color(255, 255, 255));
        BtnRentCar.setText("Rent Car");
        BtnRentCar.setBorder(null);
        BtnRentCar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnRentCar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRentCarActionPerformed(evt);
            }
        });

        BtnManageCar.setBackground(new java.awt.Color(51, 51, 0));
        BtnManageCar.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        BtnManageCar.setForeground(new java.awt.Color(255, 255, 255));
        BtnManageCar.setText("Manage Car");
        BtnManageCar.setBorder(null);
        BtnManageCar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnManageCar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnManageCarActionPerformed(evt);
            }
        });

        btnLogout.setBackground(new java.awt.Color(51, 51, 0));
        btnLogout.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        btnLogout.setForeground(new java.awt.Color(255, 255, 255));
        btnLogout.setText("Logout");
        btnLogout.setBorder(null);
        btnLogout.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ButtonsPanelLayout = new javax.swing.GroupLayout(ButtonsPanel);
        ButtonsPanel.setLayout(ButtonsPanelLayout);
        ButtonsPanelLayout.setHorizontalGroup(
            ButtonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ButtonsPanelLayout.createSequentialGroup()
                .addContainerGap(36, Short.MAX_VALUE)
                .addGroup(ButtonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(ButtonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(BtnManageCar, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                        .addComponent(BtnRentCar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(0, 31, Short.MAX_VALUE))
        );
        ButtonsPanelLayout.setVerticalGroup(
            ButtonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ButtonsPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BtnManageCar, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(BtnRentCar, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(108, 108, 108)
                .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(243, 243, 243))
        );

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

        TxtCustomerID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtCustomerIDActionPerformed(evt);
            }
        });

        TxtRentID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtRentIDActionPerformed(evt);
            }
        });

        BtnConfirm.setBackground(new java.awt.Color(255, 185, 12));
        BtnConfirm.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        BtnConfirm.setForeground(new java.awt.Color(255, 255, 255));
        BtnConfirm.setText("Confirm");
        BtnConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnConfirmActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 185, 12));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Customer ID :");

        jLabel8.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 185, 12));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Rent ID :");

        jLabel9.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 185, 12));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Delay :");

        jLabel10.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 185, 12));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("Reg No :");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 185, 12));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Fine :");

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 185, 12));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Great Value Enterprises");

        javax.swing.GroupLayout ReturnCarPanelLayout = new javax.swing.GroupLayout(ReturnCarPanel);
        ReturnCarPanel.setLayout(ReturnCarPanelLayout);
        ReturnCarPanelLayout.setHorizontalGroup(
            ReturnCarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ReturnCarPanelLayout.createSequentialGroup()
                .addComponent(ButtonsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(ReturnCarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ReturnCarPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LblReturnCarHeading, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ReturnCarPanelLayout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addGroup(ReturnCarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel6)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(54, 54, 54)
                        .addGroup(ReturnCarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(TxtCustomerID, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)
                            .addComponent(TxtRentID)
                            .addComponent(TxtRegNo)
                            .addComponent(TxtDelay)
                            .addComponent(TxtFine))
                        .addGap(79, 79, 79)
                        .addComponent(BtnConfirm))
                    .addGroup(ReturnCarPanelLayout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ReturnCarPanelLayout.createSequentialGroup()
                        .addGap(145, 145, 145)
                        .addComponent(jLabel11)))
                .addContainerGap(91, Short.MAX_VALUE))
        );
        ReturnCarPanelLayout.setVerticalGroup(
            ReturnCarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ButtonsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(ReturnCarPanelLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel11)
                .addGap(57, 57, 57)
                .addComponent(LblReturnCarHeading)
                .addGap(36, 36, 36)
                .addGroup(ReturnCarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtCustomerID, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(ReturnCarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(ReturnCarPanelLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(TxtRentID, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(ReturnCarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtRegNo, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(ReturnCarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtDelay, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(ReturnCarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtFine, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(74, 74, 74)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(96, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ReturnCarPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(ReturnCarPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
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
            String sql="UPDATE customers SET customerid = '"+TxtCustomerID.getText()+"', delay = '"+TxtDelay.getText()+"', fine= '"+TxtFine.getText()+"',carapprove = 'Returned' WHERE customerid = '"+TxtCustomerID.getText()+"' ";
            c.updateDatabase(sql);
            JOptionPane.showMessageDialog(this,"Return Confirmed");
            String sql1 ="UPDATE car SET status = 'Available', rentid = NULL  WHERE Regno = '"+TxtRegNo.getText()+"'";
            c.updateDatabase(sql1);
 
            DisplayCarOnRent();

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

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        // TODO add your handling code here:
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
    private javax.swing.JPanel ButtonsPanel;
    private javax.swing.JLabel LblReturnCarHeading;
    private javax.swing.JPanel ReturnCarPanel;
    private javax.swing.JTable TblCarOnRent;
    private javax.swing.JTextField TxtCustomerID;
    private javax.swing.JTextField TxtDelay;
    private javax.swing.JTextField TxtFine;
    private javax.swing.JTextField TxtRegNo;
    private javax.swing.JTextField TxtRentID;
    private javax.swing.JButton btnLogout;
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
