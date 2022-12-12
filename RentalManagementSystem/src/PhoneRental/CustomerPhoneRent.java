/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package PhoneRental;


import Customers.CustomerLanding;
import MySQLConnection.MySQLConnection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.format.DateTimeFormatter;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author sunilrudrakumar
 */
public class CustomerPhoneRent extends javax.swing.JFrame {

    /**
     * Creates new form CustomerPhoneRent
     */
    MySQLConnection c = new MySQLConnection();
    public CustomerPhoneRent() {
        initComponents();
        Display(); 
        txtCustomerId.setEditable(false);
        txtProductID.setEditable(false);
        txtPrice.setEditable(false);
        txtModel.setEditable(false);
             this.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }
     public CustomerPhoneRent(String s) {
        initComponents();
        showData(s);
        txtCustomerId.setEditable(false);
        txtProductID.setEditable(false);
        txtPrice.setEditable(false);
        txtModel.setEditable(false);
             this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        Display();    
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtCustomerId = new javax.swing.JTextField();
        txtPrice = new javax.swing.JTextField();
        txtModel = new javax.swing.JTextField();
        txtBrand = new javax.swing.JTextField();
        txtRentDate = new javax.swing.JTextField();
        txtReturnDate = new javax.swing.JTextField();
        txtProductID = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblLaptopList = new javax.swing.JTable();
        btnRequest = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1300, 800));

        jPanel1.setBackground(new java.awt.Color(217, 161, 200));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Customer ID");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 76, 102, 31));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Price");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 119, 102, 31));

        btnBack.setBackground(new java.awt.Color(236, 213, 227));
        btnBack.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        jPanel1.add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 482, 102, 40));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Model");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 162, 102, 31));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("Brand");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 205, 102, 31));

        jLabel11.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("Rent Date");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 254, 102, 31));

        jLabel12.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel12.setText("Return Date");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 303, 102, 31));

        jLabel13.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel13.setText("Product ID");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 352, 102, 31));
        jPanel1.add(txtCustomerId, new org.netbeans.lib.awtextra.AbsoluteConstraints(147, 76, 162, 31));
        jPanel1.add(txtPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(147, 119, 162, 31));
        jPanel1.add(txtModel, new org.netbeans.lib.awtextra.AbsoluteConstraints(147, 162, 162, 31));
        jPanel1.add(txtBrand, new org.netbeans.lib.awtextra.AbsoluteConstraints(147, 205, 162, 31));

        txtRentDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRentDateActionPerformed(evt);
            }
        });
        jPanel1.add(txtRentDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(147, 254, 162, 31));
        jPanel1.add(txtReturnDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(147, 303, 162, 31));

        txtProductID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProductIDActionPerformed(evt);
            }
        });
        jPanel1.add(txtProductID, new org.netbeans.lib.awtextra.AbsoluteConstraints(147, 353, 162, 32));

        jPanel2.setBackground(new java.awt.Color(236, 213, 227));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Rent Phones");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 78, 246, 60));

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

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 178, 607, 124));

        btnRequest.setBackground(new java.awt.Color(217, 161, 200));
        btnRequest.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        btnRequest.setText("Request");
        btnRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRequestActionPerformed(evt);
            }
        });
        jPanel2.add(btnRequest, new org.netbeans.lib.awtextra.AbsoluteConstraints(454, 374, 105, 39));

        btnLogout.setBackground(new java.awt.Color(217, 161, 200));
        btnLogout.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        btnLogout.setText("Logout");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });
        jPanel2.add(btnLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 370, 105, 39));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 1535, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1163, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtRentDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRentDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRentDateActionPerformed

    private void btnRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRequestActionPerformed
        int flag = 0 ;
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
                        flag = 1;
                }
        if(flag == 0){        
        String sql="UPDATE customers SET phoneaproove = 'Requested' ,phoneid = '"+txtProductID.getText()+"',phonerentd = '"+txtRentDate.getText()+"',phonereturnd = '"+txtReturnDate.getText()+"', phoneprice = '"+txtPrice.getText()+"' WHERE customerid = '"+txtCustomerId.getText()+"' ";
        c.updateDatabase(sql);
        JOptionPane.showMessageDialog(this," Successfully Requested");
         Reset();
            }}
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
            java.util.logging.Logger.getLogger(CustomerPhoneRent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustomerPhoneRent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustomerPhoneRent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustomerPhoneRent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new CustomerPhoneRent().setVisible(true);
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
            String sql = "select * from phone";
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
