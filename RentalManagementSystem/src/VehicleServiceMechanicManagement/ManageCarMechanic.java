/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package VehicleServiceMechanicManagement;

import GadgetServiceTechnicianManagement.*;
import HomeLanding.HomeLanding;
import MySQLConnection.MySQLConnection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author sunilrudrakumar
 */
public class ManageCarMechanic extends javax.swing.JFrame {

    /**
     * Creates new form ManageCarMechanic
     */
    MySQLConnection c = new MySQLConnection();
    public ManageCarMechanic() {
        initComponents();
        Display();
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

        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblMechanicList = new javax.swing.JTable();
        btnUpdate = new javax.swing.JButton();
        Save = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        txtPassword = new javax.swing.JTextField();
        txtMechanicId = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        btnLogout = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1300, 800));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(51, 51, 0));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 185, 12));
        jLabel5.setText("Name");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(165, 90, -1, 19));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 185, 12));
        jLabel7.setText("Mechanic ID");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(165, 144, -1, 19));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 185, 12));
        jLabel8.setText("Password");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(165, 210, -1, 19));

        tblMechanicList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mechanic ID", "Name", "Password"
            }
        ));
        tblMechanicList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblMechanicListMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblMechanicList);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(132, 397, -1, 166));

        btnUpdate.setBackground(new java.awt.Color(255, 185, 12));
        btnUpdate.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        btnUpdate.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdate.setText("Edit");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        jPanel2.add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(311, 319, -1, -1));

        Save.setBackground(new java.awt.Color(255, 185, 12));
        Save.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        Save.setForeground(new java.awt.Color(255, 255, 255));
        Save.setText("Save");
        Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveActionPerformed(evt);
            }
        });
        jPanel2.add(Save, new org.netbeans.lib.awtextra.AbsoluteConstraints(165, 319, -1, -1));

        btnDelete.setBackground(new java.awt.Color(255, 185, 12));
        btnDelete.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(255, 255, 255));
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        jPanel2.add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 319, -1, -1));
        jPanel2.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(309, 209, 142, -1));
        jPanel2.add(txtMechanicId, new org.netbeans.lib.awtextra.AbsoluteConstraints(308, 143, 143, -1));
        jPanel2.add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(308, 89, 143, -1));

        btnLogout.setBackground(new java.awt.Color(255, 185, 12));
        btnLogout.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        btnLogout.setForeground(new java.awt.Color(255, 255, 255));
        btnLogout.setText("Back");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });
        jPanel2.add(btnLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(307, 591, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 83, 1640, 880));

        jPanel1.setBackground(new java.awt.Color(255, 185, 12));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Car Mechanic");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(208, 25, 338, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1640, 90));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        
         if(txtMechanicId.getText().isEmpty() )
        {
            JOptionPane.showMessageDialog(this,"Select the Record to be deleted");
            
        }
        else {
        try {
          
            String Req = txtMechanicId.getText();
            String Query = "Delete from carmechanic where mechanicid ='"+Req+"'";
            c.updateDatabase(Query);
//            Statement Add = con.createStatement();
//            Add.executeUpdate(Query);
            JOptionPane.showMessageDialog(this,"Record Deleted Successfully");
            Display();
            Reset();
            
        } catch (Exception e){
            
            e.printStackTrace();
        }
        
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveActionPerformed

//            String sql = "select count(*) from laptoptechnician WHERE username = '"+txtUserName.getText()+"' or technicianid = '"+txtTechnicianId.getText()+"' ";
//            ResultSet rs = c.selectDatabase(sql);
//            if(rs.next()){
//                JOptionPane.showMessageDialog(this,"Details  Already Exists");
int flag = 0;
                
                //*************************************** Validation of Empty Name Field ***************************************//
                if(txtName.getText().isEmpty()){
                    JOptionPane optionPane = new JOptionPane("Name cannot be empty", JOptionPane.ERROR_MESSAGE);
                    JDialog dialog = optionPane.createDialog("Error Message");
                    dialog.setAlwaysOnTop(true);
                    dialog.setVisible(true);
                    flag = 1;
                }
//                 if(txtUserName.getText().isEmpty()){
//                    JOptionPane optionPane = new JOptionPane("UserName cannot be empty", JOptionPane.ERROR_MESSAGE);
//                    JDialog dialog = optionPane.createDialog("Error Message");
//                    dialog.setAlwaysOnTop(true);
//                    dialog.setVisible(true);
//                    flag = 1;
//                }
                  if(txtPassword.getText().isEmpty()){
                    JOptionPane optionPane = new JOptionPane("Password cannot be empty", JOptionPane.ERROR_MESSAGE);
                    JDialog dialog = optionPane.createDialog("Error Message");
                    dialog.setAlwaysOnTop(true);
                    dialog.setVisible(true);
                    flag = 1;
                }
                   if(txtMechanicId.getText().isEmpty()){
                    JOptionPane optionPane = new JOptionPane("Mechanic ID cannot be empty", JOptionPane.ERROR_MESSAGE);
                    JDialog dialog = optionPane.createDialog("Error Message");
                    dialog.setAlwaysOnTop(true);
                    dialog.setVisible(true);
                    flag = 1;
                }
                   if(flag==0){
                String sql1 = "Insert into carmechanic (mechanicid, name,password,productid )  values ('"+txtMechanicId.getText()+"','"+txtName.getText()+"', '"+txtPassword.getText()+"','Not Assigned') ";
                c.insertDatabase(sql1);
                JOptionPane.showMessageDialog(this,"Record added!");



            Display();
            Reset();  
                   } else{
                        JOptionPane.showMessageDialog(this,"Record Already exists");

                   }      
    }//GEN-LAST:event_SaveActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        int flag = 0;
              if(txtMechanicId.getText().isEmpty() )
        {
            JOptionPane.showMessageDialog(this,"Select the Record to be Updated");
            
        }
        else 
        {
              try{ 
//              {
//                  if(txtUserName.getText().isEmpty()){
//                    JOptionPane optionPane = new JOptionPane("UserName cannot be empty", JOptionPane.ERROR_MESSAGE);
//                    JDialog dialog = optionPane.createDialog("Error Message");
//                    dialog.setAlwaysOnTop(true);
//                    dialog.setVisible(true);
//                    flag = 1;
//                }
                  if(txtPassword.getText().isEmpty()){
                    JOptionPane optionPane = new JOptionPane("Password cannot be empty", JOptionPane.ERROR_MESSAGE);
                    JDialog dialog = optionPane.createDialog("Error Message");
                    dialog.setAlwaysOnTop(true);
                    dialog.setVisible(true);
                    flag = 1;
                }
                   if(txtMechanicId.getText().isEmpty()){
                    JOptionPane optionPane = new JOptionPane("Mechanic ID cannot be empty", JOptionPane.ERROR_MESSAGE);
                    JDialog dialog = optionPane.createDialog("Error Message");
                    dialog.setAlwaysOnTop(true);
                    dialog.setVisible(true);
                    flag = 1;
                }
      //            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/rent","root","12345678");
//                  String Req = txtTechnicianId.getText();
if(flag == 0){
                  String Query = "Update carmechanic set  name = '"+txtName.getText()+"', password = '"+txtPassword.getText()+"'"
                          + " where mechanicid = '"+txtMechanicId.getText()+"' ";
                  c.updateDatabase(Query);
      //            Statement Add = con.createStatement();
      //            Add.executeUpdate(Query);
                  JOptionPane.showMessageDialog(this,"Record Updated Successfully");
                  Display();
                  Reset();
}
              } catch (Exception e)
              {
            
            e.printStackTrace();
       				 }
        
        
      } 
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void tblMechanicListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblMechanicListMouseClicked
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) tblMechanicList.getModel();
        int MyIndex = tblMechanicList.getSelectedRow();
        txtMechanicId.setText(model.getValueAt(MyIndex,0).toString());
        txtName.setText(model.getValueAt(MyIndex,1).toString());
//        txtUserName.setText(model.getValueAt(MyIndex,2).toString());
        txtPassword.setText((model.getValueAt(MyIndex, 2).toString()));
        TextEdit();
//        txtPrice.setText((model.getValueAt(MyIndex, 4).toString()));
    }//GEN-LAST:event_tblMechanicListMouseClicked

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        // TODO add your handling code here:
        ManageMechanics hl = new ManageMechanics();
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
            java.util.logging.Logger.getLogger(ManageCarMechanic.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManageCarMechanic.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManageCarMechanic.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManageCarMechanic.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManageCarMechanic().setVisible(true);
            }
        });
    }
    
    
    private void Display() {
        
        String reg,brand,carmodel,status,price;
        try{
//            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/rent","root","12345678");
//            st = con.createStatement();
            String sql = "select * from carmechanic";
          ResultSet  rs = c.selectDatabase(sql);
            
            DefaultTableModel model =(DefaultTableModel) tblMechanicList.getModel();
            int rowCount = model.getRowCount();
            for (int i = rowCount - 1; i >= 0; i--) 
            {
            model.removeRow(i);
            }


            while (rs.next()) {
                reg = rs.getString(4);
                brand = rs.getString(1);
                carmodel = rs.getString(3);
//                status = rs.getString(3);
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
       txtMechanicId.setText("");
        txtName.setText("");
//       txtUserName.setText("");
        txtPassword.setText("");
//        txtBrand.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Save;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblMechanicList;
    private javax.swing.JTextField txtMechanicId;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPassword;
    // End of variables declaration//GEN-END:variables

    private void TextEdit() {
//        txtTechnicianId.setEditable(false);
        
    }
}
