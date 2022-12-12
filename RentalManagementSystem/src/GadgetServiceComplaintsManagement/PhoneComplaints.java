/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GadgetServiceComplaintsManagement;

import GadgetServiceTechnicianManagement.ManageTechnicians;
import HomeLanding.HomeLanding;
import MySQLConnection.MySQLConnection;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author sunilrudrakumar
 */
public class PhoneComplaints extends javax.swing.JFrame {

    /**
     * Creates new form PhoneComplaints
     */
         MySQLConnection c = new MySQLConnection();
    public PhoneComplaints() {
        initComponents();
         DisplayComplaints();
        DisplayTechnicians();
        txtProductId.setEditable(false);
        txtCustomerId.setEditable(false);
        txtTechnicianId.setEditable(false);
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tblComplaints = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblTechnician = new javax.swing.JTable();
        txtProductId = new javax.swing.JTextField();
        txtCustomerId = new javax.swing.JTextField();
        txtTechnicianId = new javax.swing.JTextField();
        btnAssign = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnLogout = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1300, 800));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(51, 51, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblComplaints.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product ID", "Customer ID", "Brand", "Model"
            }
        ));
        tblComplaints.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblComplaintsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblComplaints);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, -1, 152));

        tblTechnician.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Technician ID", "Name", "Product ID"
            }
        ));
        tblTechnician.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblTechnicianMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblTechnician);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 345, -1, 147));
        jPanel1.add(txtProductId, new org.netbeans.lib.awtextra.AbsoluteConstraints(786, 160, 112, -1));
        jPanel1.add(txtCustomerId, new org.netbeans.lib.awtextra.AbsoluteConstraints(786, 217, 112, -1));
        jPanel1.add(txtTechnicianId, new org.netbeans.lib.awtextra.AbsoluteConstraints(786, 271, 111, -1));

        btnAssign.setBackground(new java.awt.Color(255, 185, 12));
        btnAssign.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        btnAssign.setText("Assign");
        btnAssign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssignActionPerformed(evt);
            }
        });
        jPanel1.add(btnAssign, new org.netbeans.lib.awtextra.AbsoluteConstraints(786, 345, 100, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 185, 12));
        jLabel3.setText("Phone Complaints");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(256, 36, 229, -1));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 185, 12));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Product ID");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(646, 160, -1, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 185, 12));
        jLabel2.setText("CustomerID");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(646, 217, -1, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 185, 12));
        jLabel4.setText("Technician ID");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 280, 120, -1));

        btnLogout.setBackground(new java.awt.Color(255, 185, 12));
        btnLogout.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        btnLogout.setText("Back");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });
        jPanel1.add(btnLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(814, 448, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 2100, 1130));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblComplaintsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblComplaintsMouseClicked
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) tblComplaints.getModel();
        int MyIndex = tblComplaints.getSelectedRow();
        txtCustomerId.setText(model.getValueAt(MyIndex,1).toString());
        //        txtRentDate.setText(model.getValueAt(MyIndex,2).toString());
        //        txtReturnDate.setText(model.getValueAt(MyIndex,3).toString());
        txtProductId.setText((model.getValueAt(MyIndex, 0).toString()));
        //        txtPrice.setText((model.getValueAt(MyIndex, 4).toString()));
    }//GEN-LAST:event_tblComplaintsMouseClicked

    private void tblTechnicianMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblTechnicianMouseClicked
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) tblTechnician.getModel();
        int MyIndex = tblTechnician.getSelectedRow();
        txtTechnicianId.setText(model.getValueAt(MyIndex,0).toString());
        //        txtRentDate.setText(model.getValueAt(MyIndex,2).toString());
        //        txtReturnDate.setText(model.getValueAt(MyIndex,3).toString());
        //        txtProductId.setText((model.getValueAt(MyIndex, 0).toString()));
    }//GEN-LAST:event_tblTechnicianMouseClicked

    private void btnAssignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssignActionPerformed
        // TODO add your handling code here:
        if(txtTechnicianId.getText().isEmpty() )
        {
            JOptionPane.showMessageDialog(this,"Select the Record to Assign");

        }
        else
        {
            try {
                //            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/rent","root","12345678");
                String Req = txtTechnicianId.getText();
                String Query = "Update phonetechnician set  productid = '"+txtProductId.getText()+"' where technicianid = '"+txtTechnicianId.getText()+"' ";
                 c.updateDatabase(Query);
                String sql1 = "Update phone set technicianid = '"+txtTechnicianId.getText()+"' where productid = '"+txtProductId.getText()+"'  ";
                c.updateDatabase(sql1);

                JOptionPane.showMessageDialog(this,"Record Updated Successfully");
                DisplayComplaints();
                DisplayTechnicians();
                Reset();

            } catch (Exception e)
            {

                e.printStackTrace();
            }

        }
    }//GEN-LAST:event_btnAssignActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        // TODO add your handling code here:
        ManageTechnicians hl = new ManageTechnicians();
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
            java.util.logging.Logger.getLogger(PhoneComplaints.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PhoneComplaints.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PhoneComplaints.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PhoneComplaints.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PhoneComplaints().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAssign;
    private javax.swing.JButton btnLogout;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblComplaints;
    private javax.swing.JTable tblTechnician;
    private javax.swing.JTextField txtCustomerId;
    private javax.swing.JTextField txtProductId;
    private javax.swing.JTextField txtTechnicianId;
    // End of variables declaration//GEN-END:variables

    private void DisplayComplaints() {
        String reg,brand,carmodel,status,price;
        try{
//           
            String sql = "select * from phone where service = 'Requested' ";
            ResultSet rs = c.selectDatabase(sql);
            DefaultTableModel model =(DefaultTableModel) tblComplaints.getModel();
            int rowCount = model.getRowCount();
            for (int i = rowCount - 1; i >= 0; i--) 
            {
            model.removeRow(i);
            }


            while (rs.next()) {
                reg = rs.getString(1);
                brand = rs.getString(9);
                carmodel = rs.getString(3);
                status = rs.getString(4);
//                price = rs.getString(6);
                String[] row = {reg,brand,carmodel,status};
                  model.addRow(row);
                               
            }
        
        } catch (SQLException e)
        {
            e.printStackTrace();      
        }
    }

    private void DisplayTechnicians() {
        String reg,brand,carmodel,status,price;
        try{
//           
            String sql = "select * from phonetechnician";
            ResultSet rs = c.selectDatabase(sql);
            DefaultTableModel model =(DefaultTableModel) tblTechnician.getModel();
            int rowCount = model.getRowCount();
            for (int i = rowCount - 1; i >= 0; i--) 
            {
            model.removeRow(i);
            }


            while (rs.next()) {
                reg = rs.getString(4);
                brand = rs.getString(1);
                carmodel = rs.getString(5);
//                status = rs.getString(5);
//                price = rs.getString(6);
                String[] row = {reg,brand,carmodel};
                  model.addRow(row);
                               
            }
        
        } catch (SQLException e)
        {
            e.printStackTrace();      
        }
    }

    private void Reset() {
        txtProductId.setText("");
        txtCustomerId.setText("");
        txtTechnicianId.setText("");
        
    }
}
