/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Customers;


import MySQLConnection.MySQLConnection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author sunilrudrakumar
 */
public class CustomerLoginJFrame extends javax.swing.JFrame {

    /**
     * Creates new form CustomerLoginJFrame
     */
      MySQLConnection c = new MySQLConnection();
    public CustomerLoginJFrame() {
        initComponents();
             this.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblUserName = new javax.swing.JLabel();
        txtUserName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JTextField();
        btnSignIn = new javax.swing.JButton();
        btnSignUp = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblUserNameMessage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1300, 800));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 51));
        jPanel1.setForeground(new java.awt.Color(255, 185, 12));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblUserName.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        lblUserName.setForeground(new java.awt.Color(255, 185, 12));
        lblUserName.setText("UserName :");
        jPanel1.add(lblUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(233, 455, 106, 40));

        txtUserName.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtUserNameMouseClicked(evt);
            }
        });
        txtUserName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserNameActionPerformed(evt);
            }
        });
        jPanel1.add(txtUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(434, 457, 163, 40));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 185, 12));
        jLabel2.setText("Password :");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(233, 515, 106, 42));
        jPanel1.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(434, 517, 163, 42));

        btnSignIn.setBackground(new java.awt.Color(255, 185, 12));
        btnSignIn.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        btnSignIn.setForeground(new java.awt.Color(255, 255, 255));
        btnSignIn.setText("Sign In");
        btnSignIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignInActionPerformed(evt);
            }
        });
        jPanel1.add(btnSignIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(465, 596, 108, 36));

        btnSignUp.setBackground(new java.awt.Color(255, 185, 12));
        btnSignUp.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        btnSignUp.setForeground(new java.awt.Color(255, 255, 255));
        btnSignUp.setText("Sign Up");
        btnSignUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignUpActionPerformed(evt);
            }
        });
        jPanel1.add(btnSignUp, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 600, 108, 36));

        jLabel3.setBackground(new java.awt.Color(255, 185, 12));
        jLabel3.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 185, 12));
        jLabel3.setText("Create an Account...!");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 550, 150, 36));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 185, 12));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Great Value Enterprises");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 346, 522, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/car.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, -1, 328));

        lblUserNameMessage.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        lblUserNameMessage.setForeground(new java.awt.Color(255, 185, 12));
        jPanel1.add(lblUserNameMessage, new org.netbeans.lib.awtextra.AbsoluteConstraints(224, 596, 163, 36));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 12, 1840, 1260));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSignInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignInActionPerformed
        // TODO add your handling code here:
        int flag = 0;
                
                //*************************************** Validation of Empty Name Field ***************************************//
                if(txtUserName.getText().isEmpty()){
                    JOptionPane optionPane = new JOptionPane("UserName cannot be empty", JOptionPane.ERROR_MESSAGE);
                    JDialog dialog = optionPane.createDialog("Error Message");
                    dialog.setAlwaysOnTop(true);
                    dialog.setVisible(true);
                    flag = 1;
                }
                 if(txtPassword.getText().isEmpty()){
                    JOptionPane optionPane = new JOptionPane("Password cannot be empty", JOptionPane.ERROR_MESSAGE);
                    JDialog dialog = optionPane.createDialog("Error Message");
                    dialog.setAlwaysOnTop(true);
                    dialog.setVisible(true);
                    flag = 1;
                }
                String name7 = txtUserName.getText();
                Pattern pattern7 = Pattern.compile("^[a-zA-Z0-9- ]{1,50}$");
                Matcher matcher7 = pattern7.matcher(name7);
                if(!matcher7.matches())
                {
                    JOptionPane.showMessageDialog(this,"Enter a valid Name!");
                    flag = 1;
                    txtUserName.setText("");
                    
                }
                 
        
        
         if(flag == 0){   
          try {
                    
                    String sql = " SELECT customerid,password FROM customers WHERE customerid = '"+txtUserName.getText()+"' and password = '"+txtPassword.getText()+"' ";
                    ResultSet rs = c.selectDatabase(sql);
                    String  custid = txtUserName.getText();
              
              if(rs.next() == true)
              {
               
                CustomerLanding lr = new CustomerLanding(custid);
                lr.setVisible(true);
                this.dispose();
              }
              else{
                  JOptionPane.showMessageDialog(this,"Invalid Crednetials!");
              }
             
               } 
          catch (SQLException ex) 
          {
              Logger.getLogger(CustomerLoginJFrame.class.getName()).log(Level.SEVERE, null, ex);
          }
         } 
    }//GEN-LAST:event_btnSignInActionPerformed

    private void btnSignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignUpActionPerformed
        
        CustomerSignUpJFrame lr = new CustomerSignUpJFrame();
        lr.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_btnSignUpActionPerformed

    private void txtUserNameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtUserNameMouseClicked
//        // TODO add your handling code here:
//        if(txtUserName.getText().isEmpty() && txtPassword.getText().isEmpty()){
//                        lblUserNameMessage.setText("UserName is Empty");
//        }
    }//GEN-LAST:event_txtUserNameMouseClicked

    private void txtUserNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUserNameActionPerformed

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
            java.util.logging.Logger.getLogger(CustomerLoginJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustomerLoginJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustomerLoginJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustomerLoginJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CustomerLoginJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSignIn;
    private javax.swing.JButton btnSignUp;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblUserName;
    private javax.swing.JLabel lblUserNameMessage;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables
}
