/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package PhoneRental;


import HomeLanding.GadgetAdminLandingPage;
import Rental.Notification.Email;
import MySQLConnection.MySQLConnection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
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
public class PhoneRentJFrame extends javax.swing.JFrame {

    /**
     * Creates new form RentJFrame
     */
    MySQLConnection c = new MySQLConnection();
    Email e = new Email();
    public PhoneRentJFrame() {
        initComponents();

        DisplayLaptopOnRent();
        DisplayLaptopRentalRequest();
        txtCustomerId.setEditable(false);
        txtProductId.setEditable(false);
        txtRentDate.setEditable(false);
        txtReturnDate.setEditable(false);
        txtEmail.setVisible(false);
        jLabel8.setVisible(false);
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
        btnReturnLaptop = new javax.swing.JButton();
        btnManagelaptop = new javax.swing.JButton();
        btnLogout1 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblCustomerId = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtProductId = new javax.swing.JTextField();
        txtPrice = new javax.swing.JTextField();
        txtReturnDate = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtCustomerId = new javax.swing.JTextField();
        txtRentDate = new javax.swing.JTextField();
        txtRentID = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblLaptopOnRent = new javax.swing.JTable();
        btnAproove = new javax.swing.JButton();
        btnDeny = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblLaptopRentalRequest = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1300, 800));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 185, 12));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnReturnLaptop.setBackground(new java.awt.Color(51, 51, 0));
        btnReturnLaptop.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        btnReturnLaptop.setForeground(new java.awt.Color(255, 255, 255));
        btnReturnLaptop.setText("Return Laptop");
        btnReturnLaptop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReturnLaptopActionPerformed(evt);
            }
        });
        jPanel1.add(btnReturnLaptop, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 301, 151, -1));

        btnManagelaptop.setBackground(new java.awt.Color(51, 51, 0));
        btnManagelaptop.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        btnManagelaptop.setForeground(new java.awt.Color(255, 255, 255));
        btnManagelaptop.setText("Manage Phone");
        btnManagelaptop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManagelaptopActionPerformed(evt);
            }
        });
        jPanel1.add(btnManagelaptop, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 243, -1, -1));

        btnLogout1.setBackground(new java.awt.Color(51, 51, 0));
        btnLogout1.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        btnLogout1.setForeground(new java.awt.Color(255, 255, 255));
        btnLogout1.setText("Back");
        btnLogout1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogout1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnLogout1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 425, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 0, 220, 1320));

        jPanel4.setBackground(new java.awt.Color(51, 51, 0));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 185, 12));
        jLabel1.setText("Rent Phone");
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 94, 118, 34));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 185, 12));
        jLabel2.setText("Phones on Rent");
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 167, -1, -1));

        jLabel11.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 185, 12));
        jLabel11.setText("Rental Request");
        jPanel4.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 390, -1, -1));

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 185, 12));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Great Value Enterprises");
        jPanel4.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 6, 522, 62));

        jPanel2.setBackground(new java.awt.Color(51, 51, 0));

        lblCustomerId.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        lblCustomerId.setForeground(new java.awt.Color(255, 185, 12));
        lblCustomerId.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblCustomerId.setText("Customer ID :");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 185, 12));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Product ID :");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 185, 12));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Rent ID :");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 185, 12));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Rent Date :");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 185, 12));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Return Date :");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 185, 12));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Fee :");

        jLabel8.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 185, 12));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Email :");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCustomerId, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtProductId, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
                    .addComponent(txtPrice)
                    .addComponent(txtReturnDate)
                    .addComponent(txtEmail)
                    .addComponent(txtCustomerId)
                    .addComponent(txtRentDate)
                    .addComponent(txtRentID))
                .addGap(42, 42, 42))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCustomerId, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(txtCustomerId)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtProductId, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtRentID)))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRentDate, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtReturnDate, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE))
                .addGap(253, 253, 253))
        );

        jPanel4.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(487, 194, -1, 470));

        tblLaptopOnRent.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Rent ID", "Customer ID", "Rent Fee"
            }
        ));
        tblLaptopOnRent.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblLaptopOnRentMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tblLaptopOnRent);

        jPanel4.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 208, 423, 137));

        btnAproove.setBackground(new java.awt.Color(255, 185, 12));
        btnAproove.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        btnAproove.setForeground(new java.awt.Color(255, 255, 255));
        btnAproove.setText("Approve");
        btnAproove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAprooveActionPerformed(evt);
            }
        });
        jPanel4.add(btnAproove, new org.netbeans.lib.awtextra.AbsoluteConstraints(357, 626, -1, 38));

        btnDeny.setBackground(new java.awt.Color(255, 185, 12));
        btnDeny.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        btnDeny.setForeground(new java.awt.Color(255, 255, 255));
        btnDeny.setText("Deny");
        btnDeny.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDenyActionPerformed(evt);
            }
        });
        jPanel4.add(btnDeny, new org.netbeans.lib.awtextra.AbsoluteConstraints(357, 682, 92, -1));

        tblLaptopRentalRequest.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Customer ID", "Product ID", "Rent Date", "Return Date", "Fee"
            }
        ));
        tblLaptopRentalRequest.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblLaptopRentalRequestMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblLaptopRentalRequest);
        if (tblLaptopRentalRequest.getColumnModel().getColumnCount() > 0) {
            tblLaptopRentalRequest.getColumnModel().getColumn(1).setResizable(false);
        }

        jPanel4.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 444, 424, 132));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 0, 1990, 1450));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblLaptopRentalRequestMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblLaptopRentalRequestMouseClicked
//        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) tblLaptopRentalRequest.getModel();
        int MyIndex = tblLaptopRentalRequest.getSelectedRow();
        txtCustomerId.setText(model.getValueAt(MyIndex,0).toString());
        txtRentDate.setText(model.getValueAt(MyIndex,2).toString());
        txtReturnDate.setText(model.getValueAt(MyIndex,3).toString());
        txtProductId.setText((model.getValueAt(MyIndex, 1).toString()));
        txtPrice.setText((model.getValueAt(MyIndex, 4).toString()));
        
        
    }//GEN-LAST:event_tblLaptopRentalRequestMouseClicked

    private void btnAprooveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAprooveActionPerformed
        // TODO add your handling code here:
        
        try{
            int flag = 0;
                
                //*************************************** Validation of Empty Name Field ***************************************//
                 if(txtRentID.getText().isEmpty()){
                    JOptionPane optionPane = new JOptionPane("Rent ID cannot be empty", JOptionPane.ERROR_MESSAGE);
                    JDialog dialog = optionPane.createDialog("Error Message");
                    dialog.setAlwaysOnTop(true);
                    dialog.setVisible(true);
                    flag = 1;
                }
                String cellPhoneNumber3 = txtRentID.getText();
                Pattern pattern3 = Pattern.compile("^[0-9]{3}$");
                Matcher matcher3 = pattern3.matcher(cellPhoneNumber3);
                if(!matcher3.matches())
                {
                    JOptionPane.showMessageDialog(this,"Enter a valid Rent ID!");
                    flag = 1;
                    txtRentID.setText("");
                    
                    
                }
                if(flag == 0)
             {   
            String sql="UPDATE phone SET customerid = '"+txtCustomerId.getText()+"', "
                    + "rentid = '"+txtRentID.getText()+"',status = 'Booked',rentdate = '"+txtRentDate.getText()+"' ,"
                    + "returndate = '"+txtReturnDate.getText()+"',price = '"+txtPrice.getText()+
                    "' WHERE productid = '"+txtProductId.getText()+"' ";
            c.updateDatabase(sql);
            JOptionPane.showMessageDialog(this,"Request Aprooved");
//************************************************************************************************************   
            String sql1 ="UPDATE customers SET phoneaproove = 'Booked'  WHERE customerid = '"+txtCustomerId.getText()+"' ";
            c.updateDatabase(sql1);          
//************************************************************************************************************
            String sql2 = "SELECT email From customers WHERE customerid = '"+txtCustomerId.getText()+"'";
            
            ResultSet rs = c.selectDatabase(sql2);
            if(rs.next()){
            String email;
            
            email = rs.getString(1);
//            System.out.println(rs.getString(email));
            txtEmail.setText(email);
            }
//                       String s =c.selectDatabase(sql2).getString(1);
                       
            String msg = "Your Rental Request has been Aprroved";
            e.sendMail(msg,"Phone" ,txtCustomerId.getText(), txtProductId.getText(), txtRentID.getText(), txtPrice.getText(),txtRentDate.getText(), txtReturnDate.getText(), txtEmail.getText());
            DisplayLaptopOnRent();
            DisplayLaptopRentalRequest();
            Reset();
             }
        }
        catch(Exception e)
        {
        e.printStackTrace();
    }
//        
    }//GEN-LAST:event_btnAprooveActionPerformed

    private void btnManagelaptopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManagelaptopActionPerformed
        // TODO add your handling code here:
        PhoneManageJFrame lm = new PhoneManageJFrame();
        lm.setVisible(true);
        this.dispose();
//        PhoneRentJFrame lr = new  PhoneRentJFrame();
//        lr.setVisible(false);
    }//GEN-LAST:event_btnManagelaptopActionPerformed

    private void btnReturnLaptopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReturnLaptopActionPerformed
        // TODO add your handling code here:
        PhoneReturnJFrame lr = new PhoneReturnJFrame();
        lr.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnReturnLaptopActionPerformed

    private void tblLaptopOnRentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblLaptopOnRentMouseClicked


    }//GEN-LAST:event_tblLaptopOnRentMouseClicked

    private void btnDenyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDenyActionPerformed
        try {
            // TODO add your handling code here:
            String sql1 ="UPDATE customers SET phoneaproove = NULL  WHERE customerid = '"+txtCustomerId.getText()+"' ";
            c.updateDatabase(sql1);
            JOptionPane.showMessageDialog(this,"Request Denied");
            String msg = "Your Rental request has been Denied";
            e.sendMail(msg,"Phone" ,txtCustomerId.getText(), txtProductId.getText(), txtRentID.getText(), txtPrice.getText(),txtRentDate.getText(), txtReturnDate.getText(), txtEmail.getText());
            
        } catch (Exception ex) {
            Logger.getLogger(PhoneRentJFrame.class.getName()).log(Level.SEVERE, null, ex);
            
        }
            DisplayLaptopOnRent();
            DisplayLaptopRentalRequest();
            Reset();
    }//GEN-LAST:event_btnDenyActionPerformed

    private void btnLogout1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogout1ActionPerformed
        // TODO add your handling code here:
        GadgetAdminLandingPage hl = new GadgetAdminLandingPage();
        hl.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnLogout1ActionPerformed

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
            java.util.logging.Logger.getLogger(PhoneRentJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PhoneRentJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PhoneRentJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PhoneRentJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
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
                new PhoneRentJFrame().setVisible(true);
            }
        });
    }

    
    
//    private void DisplayLaptopList(){
//        String reg,brand,carmodel,status,price;
//        try{
//            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/rent","root","12345678");
//            st = con.createStatement();
//            rs = st.executeQuery("select * from laptop");
//            
//            DefaultTableModel model =(DefaultTableModel) tblLaptopList.getModel();
//            int rowCount = model.getRowCount();
//            for (int i = rowCount - 1; i >= 0; i--) 
//            {
//            model.removeRow(i);
//            }
//
//
//            while (rs.next()) {
//                 reg = rs.getString(1);
//                 brand = rs.getString(2);
//                 carmodel = rs.getString(3);
//                  status = rs.getString(4);
//                  price = rs.getString(5);
//                  String[] row = {reg,brand,carmodel,status,price};
//                  model.addRow(row);
//                               
//            }
//        
//        } catch (SQLException e)
//        {
//            e.printStackTrace();
//            
            
//        }
//        
//        
//        
//    }
    private void DisplayLaptopOnRent(){
        String reg,brand,carmodel,status,price;
        try{
            
            String sql = "select * from phone where (status = 'Booked' and rentid IS NOT NULL )";
            ResultSet rs = c.selectDatabase(sql);
            DefaultTableModel model =(DefaultTableModel) tblLaptopOnRent.getModel();
            int rowCount = model.getRowCount();
            for (int i = rowCount - 1; i >= 0; i--) 
            {
            model.removeRow(i);
            }


            while (rs.next()) 
            {
                 reg = rs.getString(2);
                 brand = rs.getString(9);
                 carmodel = rs.getString(6);
                  String[] row = {reg,brand,carmodel};
                  model.addRow(row);
                               
             }
        
        } catch (SQLException e)
        {
            e.printStackTrace();
            
            
        }
        
        
        
    }
    
    
    private void DisplayLaptopRentalRequest(){
        String reg,brand,status,price,carmodel;
        try{
            String sql = "SELECT * FROM customers where phoneaproove = 'Requested' ";
            ResultSet rs = c.selectDatabase(sql);
            DefaultTableModel model =(DefaultTableModel) tblLaptopRentalRequest.getModel();
            int rowCount = model.getRowCount();
            for (int i = rowCount - 1; i >= 0; i--) 
            {
            model.removeRow(i);
            }


            while (rs.next()) {
                reg = rs.getString(1);
                brand = rs.getString(34);
                
                status = rs.getString(42);
                price = rs.getString(46);
                carmodel = rs.getString(38);
                String[] row = {reg,brand,status,price,carmodel};
                  model.addRow(row);
                               
            }
        
        } catch (SQLException e)
        {
            e.printStackTrace();
            
            
        }
        
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAproove;
    private javax.swing.JButton btnDeny;
    private javax.swing.JButton btnLogout1;
    private javax.swing.JButton btnManagelaptop;
    private javax.swing.JButton btnReturnLaptop;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblCustomerId;
    private javax.swing.JTable tblLaptopOnRent;
    private javax.swing.JTable tblLaptopRentalRequest;
    private javax.swing.JTextField txtCustomerId;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtProductId;
    private javax.swing.JTextField txtRentDate;
    private javax.swing.JTextField txtRentID;
    private javax.swing.JTextField txtReturnDate;
    // End of variables declaration//GEN-END:variables

    private void Reset() {
        txtCustomerId.setText("");
        txtEmail.setText("");
        txtPrice.setText("");
        txtProductId.setText("");
        txtRentDate.setText("");
        txtRentID.setText("");
        txtReturnDate.setText("");
    }
}


