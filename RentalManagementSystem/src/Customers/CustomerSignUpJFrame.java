/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Customers;

import MySQLConnection.MySQLConnection;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


/**
 *
 * @author sunilrudrakumar
 */
public class CustomerSignUpJFrame extends javax.swing.JFrame {

    /**
     * Creates new form CustomerSignUpJFrame
     */
    MySQLConnection c = new MySQLConnection();
    public CustomerSignUpJFrame() {
        initComponents();
             this.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtSSN = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        btnSignUp = new javax.swing.JButton();
        btnLogin = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1300, 800));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(51, 51, 0));
        jPanel1.setForeground(new java.awt.Color(51, 51, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 185, 12));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Name :");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(132, 144, -1, 30));
        jPanel1.add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(216, 146, 170, 30));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 185, 12));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Government ID :");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, -1, 33));
        jPanel1.add(txtSSN, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 310, 170, 31));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 185, 12));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Password :");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 400, 104, 33));
        jPanel1.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 400, 170, 29));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 185, 12));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Address :");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, -1, 27));
        jPanel1.add(txtAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 190, 170, 30));

        btnSignUp.setBackground(new java.awt.Color(255, 185, 12));
        btnSignUp.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        btnSignUp.setForeground(new java.awt.Color(255, 255, 255));
        btnSignUp.setText("Sign Up");
        btnSignUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignUpActionPerformed(evt);
            }
        });
        jPanel1.add(btnSignUp, new org.netbeans.lib.awtextra.AbsoluteConstraints(295, 498, -1, 40));

        btnLogin.setBackground(new java.awt.Color(255, 185, 12));
        btnLogin.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(255, 255, 255));
        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        jPanel1.add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(294, 588, 92, 40));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 185, 12));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Email :");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 250, 70, 30));
        jPanel1.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 250, 170, 30));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 185, 12));
        jLabel6.setText("Already have an account.?");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 588, 207, 40));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 185, 12));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Great Value Enterprises");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 15, 522, -1));

        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Ph_1.png"))); // NOI18N
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 726, -1, -1));

        jLabel19.setBackground(new java.awt.Color(255, 185, 12));
        jLabel19.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 185, 12));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("+1 (857)-101-1234");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 726, 141, 30));

        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/email (1).png"))); // NOI18N
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(209, 726, -1, -1));

        jLabel23.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 185, 12));
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("greatvaluerentalsystems@gmail.com");
        jPanel1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(251, 726, 217, 30));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 185, 12));
        jLabel9.setText("Government ID is your user name");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 350, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, -1, 1270));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Car Customer.png"))); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, -130, 1490, 1270));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        // TODO add your handling code here:
        
         CustomerLoginJFrame lr = new CustomerLoginJFrame();
                lr.setVisible(true);
                this.dispose();
    }//GEN-LAST:event_btnLoginActionPerformed

    private void btnSignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignUpActionPerformed

        try{
            int flag = 0;
                
                //*************************************** Validation of Empty Name Field ***************************************//
                if(txtName.getText().isEmpty()){
                    JOptionPane optionPane = new JOptionPane("Name cannot be empty", JOptionPane.ERROR_MESSAGE);
                    JDialog dialog = optionPane.createDialog("Error Message");
                    dialog.setAlwaysOnTop(true);
                    dialog.setVisible(true);
                    flag = 1;
                }
                 if(txtAddress.getText().isEmpty()){
                    JOptionPane optionPane = new JOptionPane("Address cannot be empty", JOptionPane.ERROR_MESSAGE);
                    JDialog dialog = optionPane.createDialog("Error Message");
                    dialog.setAlwaysOnTop(true);
                    dialog.setVisible(true);
                    flag = 1;
                }
                  if(txtEmail.getText().isEmpty()){
                    JOptionPane optionPane = new JOptionPane("Email cannot be empty", JOptionPane.ERROR_MESSAGE);
                    JDialog dialog = optionPane.createDialog("Error Message");
                    dialog.setAlwaysOnTop(true);
                    dialog.setVisible(true);
                    flag = 1;
                }
                   if(txtSSN.getText().isEmpty()){
                    JOptionPane optionPane = new JOptionPane("Goverment cannot be empty", JOptionPane.ERROR_MESSAGE);
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
                    
                String email1 = txtEmail.getText();
                Pattern pattern1 = Pattern.compile("^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$");
                Matcher matcher1 = pattern1.matcher(email1);
                if(!matcher1.matches())
                {
                    JOptionPane.showMessageDialog(this,"Enter a valid Email Address!");
                    flag = 1;
                    txtEmail.setText("");
                    
                }
                
                String employeeId2 = txtSSN.getText();
                Pattern pattern2 = Pattern.compile("^[a-zA-Z0-9- ]{1,50}$");
                Matcher matcher2 =pattern2.matcher(employeeId2);
                if(!matcher2.matches())
                {
                    JOptionPane.showMessageDialog(this,"Enter a Valid Goverment ID!");
                    flag = 1;
                    txtSSN.setText("");
                    
                    
                    
                }
                
            if(flag == 0){
            String sql="INSERT INTO customers (customerid, customername, password, address,email)" +
              " VALUES( '"+txtSSN.getText()+"','"+txtName.getText()+"','"+txtPassword.getText()+"','"+txtAddress.getText()+"' ,'"+txtEmail.getText()+"')";
            c.insertDatabase(sql);
            JOptionPane.showMessageDialog(this,"Account has been Created");
            Reset();
                }
        }

        
        catch(Exception e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnSignUpActionPerformed

    public void Reset(){
        txtName.setText("");
        txtSSN.setText("");
        txtPassword.setText("");
        txtAddress.setText("");
        txtEmail.setText("");

}
    
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
            java.util.logging.Logger.getLogger(CustomerSignUpJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustomerSignUpJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustomerSignUpJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustomerSignUpJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CustomerSignUpJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnSignUp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtSSN;
    // End of variables declaration//GEN-END:variables
}

