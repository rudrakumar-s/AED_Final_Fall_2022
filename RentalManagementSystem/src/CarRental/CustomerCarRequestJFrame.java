/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package CarRental;
import Customers.CustomerLanding;
import HomeLanding.HomeLanding;
import MySQLConnection.MySQLConnection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.format.DateTimeFormatter;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author tejas
 */
public class CustomerCarRequestJFrame extends javax.swing.JFrame {

    /**
     * Creates new form CustomerCarRequestJFrame
     */
    MySQLConnection c = new MySQLConnection();
    public CustomerCarRequestJFrame() {
        initComponents();
        Display();
        TxtCustomerID.setEditable(false);
        TxtRegNo.setEditable(false);
        TxtPrice.setEditable(false);
        TxtModel.setEditable(false);
        TxtBrand.setEditable(false);
             this.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }
    public CustomerCarRequestJFrame(String s) {
        initComponents();
        showData(s);
        TxtCustomerID.setEditable(false);
        TxtCustomerID.setEditable(false);
        TxtRegNo.setEditable(false);
        TxtPrice.setEditable(false);
        TxtModel.setEditable(false);
        TxtBrand.setEditable(false);
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
        jScrollPane1 = new javax.swing.JScrollPane();
        TblCustReq = new javax.swing.JTable();
        BtnRequest = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        btnLogout = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        TxtCustomerID = new javax.swing.JTextField();
        TxtModel = new javax.swing.JTextField();
        TxtBrand = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        TxtRentDate = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        TxtReturnDate = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        TxtRegNo = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        TxtPrice = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1300, 800));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(236, 213, 227));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TblCustReq.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Brand", "Model", "Status", "Price"
            }
        ));
        TblCustReq.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TblCustReqMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TblCustReq);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 185, 464, 149));

        BtnRequest.setBackground(new java.awt.Color(217, 161, 200));
        BtnRequest.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        BtnRequest.setText("Request");
        BtnRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRequestActionPerformed(evt);
            }
        });
        jPanel2.add(BtnRequest, new org.netbeans.lib.awtextra.AbsoluteConstraints(363, 396, 115, 35));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Rent Car");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(122, 78, 246, 60));

        btnLogout.setBackground(new java.awt.Color(217, 161, 200));
        btnLogout.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        btnLogout.setText("Log Out");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });
        jPanel2.add(btnLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 400, 100, 30));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(402, 0, 1650, 1250));

        jPanel1.setBackground(new java.awt.Color(217, 161, 200));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TxtCustomerID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtCustomerIDActionPerformed(evt);
            }
        });
        jPanel1.add(TxtCustomerID, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 107, 155, 33));
        jPanel1.add(TxtModel, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 152, 155, 33));
        jPanel1.add(TxtBrand, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 197, 155, 33));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Customer ID");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 107, 102, 31));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("Brand");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, 197, 102, 31));

        jLabel11.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("Model");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 152, 102, 31));
        jPanel1.add(TxtRentDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 237, 155, 31));

        jLabel12.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel12.setText("Rent Date");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 236, 102, 31));
        jPanel1.add(TxtReturnDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 281, 155, 32));

        jLabel13.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel13.setText("Return Date");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 280, 102, 31));
        jPanel1.add(TxtRegNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 327, 155, 30));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Price");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 369, 102, 31));
        jPanel1.add(TxtPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 369, 155, 34));

        jLabel14.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel14.setText("Reg No");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 325, 102, 31));

        btnBack.setBackground(new java.awt.Color(236, 213, 227));
        btnBack.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        jPanel1.add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, 521, 102, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 1250));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TxtCustomerIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtCustomerIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtCustomerIDActionPerformed

    private void TblCustReqMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TblCustReqMouseClicked
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) TblCustReq.getModel();
        int MyIndex = TblCustReq.getSelectedRow();
        TxtRegNo.setText(model.getValueAt(MyIndex,0).toString());
        TxtModel.setText(model.getValueAt(MyIndex,2).toString());
        TxtPrice.setText(model.getValueAt(MyIndex,4).toString());
        TxtBrand.setText((model.getValueAt(MyIndex, 1).toString()));
    }//GEN-LAST:event_TblCustReqMouseClicked

    private void BtnRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRequestActionPerformed
        // TODO add your handling code here:
        int flag = 0;
        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
                try{
                    formatter.parse(TxtRentDate.getText());
                    formatter.parse(TxtReturnDate.getText());
                    

                } 
                catch(Exception e){
                     JOptionPane.showMessageDialog(this,"Please enter valid date format (MM/dd/yyyy)");
//                     TxtRentDate.setText("");
////                     JOptionPane.showMessageDialog(this,"Please enter valid date format (MM/dd/yyyy)");
//                     TxtReturnDate.setText("");
                     flag = 1;
                }
          if(flag == 0){
        String sql="UPDATE customers SET caraproove = 'Requested' ,carid = '"+TxtRegNo.getText()+"',carrentd = '"+TxtRentDate.getText()+"',carreturnd = '"+TxtReturnDate.getText()+"', carprice = '"+TxtPrice.getText()+"' WHERE customerid = '"+TxtCustomerID.getText()+"' ";
        c.updateDatabase(sql);
        JOptionPane.showMessageDialog(this," Successfully Requested");
         TxtRegNo.setText("");
         TxtRentDate.setText("");
         TxtReturnDate.setText("");
         TxtPrice.setText("");
         TxtBrand.setText("");
         TxtModel.setText("");
            }
        }
      catch (Exception ex) {
      System.out.println(ex);}
    }//GEN-LAST:event_BtnRequestActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        // TODO add your handling code here:
        HomeLanding lr = new HomeLanding();
        lr.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        String custid = TxtCustomerID.getText();
        CustomerLanding lr = new CustomerLanding (custid);
        lr.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_btnBackActionPerformed

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
            java.util.logging.Logger.getLogger(CustomerCarRequestJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustomerCarRequestJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustomerCarRequestJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustomerCarRequestJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CustomerCarRequestJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnRequest;
    private javax.swing.JTable TblCustReq;
    private javax.swing.JTextField TxtBrand;
    private javax.swing.JTextField TxtCustomerID;
    private javax.swing.JTextField TxtModel;
    private javax.swing.JTextField TxtPrice;
    private javax.swing.JTextField TxtRegNo;
    private javax.swing.JTextField TxtRentDate;
    private javax.swing.JTextField TxtReturnDate;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnLogout;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    private void Display() {
        String reg,brand,carmodel,status,price;
        try{
//           
            String sql = "select * from car";
            ResultSet rs = c.selectDatabase(sql);
            DefaultTableModel model =(DefaultTableModel) TblCustReq.getModel();
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
        TxtCustomerID.setText(s);
         }
}