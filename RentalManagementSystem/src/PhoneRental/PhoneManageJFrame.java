/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package PhoneRental;


import MySQLConnection.MySQLConnection;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import HomeLanding.HomeLanding;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JDialog;

/**
 *
 * @author sunilrudrakumar
 */
public class PhoneManageJFrame extends javax.swing.JFrame {

    /**
     * Creates new form PhoneManageJFrame
     */
    MySQLConnection c = new MySQLConnection();
    public PhoneManageJFrame() {
        initComponents();
          Display();
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
        btnRentLaptop = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        txtProductId = new javax.swing.JTextField();
        txtBrand = new javax.swing.JTextField();
        txtModel = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        cbStatus = new javax.swing.JComboBox<>();
        txtPrice = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblLaptopList = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        lblRentId = new javax.swing.JLabel();
        lblBrand = new javax.swing.JLabel();
        lblModel = new javax.swing.JLabel();
        lblStatus = new javax.swing.JLabel();
        lblPrice = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 185, 12));

        btnReturnLaptop.setBackground(new java.awt.Color(51, 51, 0));
        btnReturnLaptop.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        btnReturnLaptop.setForeground(new java.awt.Color(255, 255, 255));
        btnReturnLaptop.setText("Manage Return");
        btnReturnLaptop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReturnLaptopActionPerformed(evt);
            }
        });

        btnRentLaptop.setBackground(new java.awt.Color(51, 51, 0));
        btnRentLaptop.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        btnRentLaptop.setForeground(new java.awt.Color(255, 255, 255));
        btnRentLaptop.setText("Manage Rents");
        btnRentLaptop.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRentLaptopMouseClicked(evt);
            }
        });
        btnRentLaptop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRentLaptopActionPerformed(evt);
            }
        });

        btnLogout.setBackground(new java.awt.Color(51, 51, 0));
        btnLogout.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        btnLogout.setForeground(new java.awt.Color(255, 255, 255));
        btnLogout.setText("Logout");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnReturnLaptop)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(btnRentLaptop, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(23, 23, 23))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(btnLogout)
                                .addGap(46, 46, 46))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(206, 206, 206)
                .addComponent(btnRentLaptop)
                .addGap(40, 40, 40)
                .addComponent(btnReturnLaptop)
                .addGap(146, 146, 146)
                .addComponent(btnLogout)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(51, 51, 0));

        btnSave.setBackground(new java.awt.Color(255, 185, 12));
        btnSave.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        btnSave.setForeground(new java.awt.Color(255, 255, 255));
        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnUpdate.setBackground(new java.awt.Color(255, 185, 12));
        btnUpdate.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        btnUpdate.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnReset.setBackground(new java.awt.Color(255, 185, 12));
        btnReset.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        btnReset.setForeground(new java.awt.Color(255, 255, 255));
        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        btnDelete.setBackground(new java.awt.Color(255, 185, 12));
        btnDelete.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(255, 255, 255));
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        cbStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Available", "Booked", "In Service" }));

        tblLaptopList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product ID", "Brand", "Model", "Status", "Price"
            }
        ));
        tblLaptopList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblLaptopListMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblLaptopList);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 185, 12));
        jLabel1.setText("Manage Laptops");

        lblRentId.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        lblRentId.setForeground(new java.awt.Color(255, 185, 12));
        lblRentId.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblRentId.setText("Product Id :");

        lblBrand.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        lblBrand.setForeground(new java.awt.Color(255, 185, 12));
        lblBrand.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblBrand.setText("Brand :");

        lblModel.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        lblModel.setForeground(new java.awt.Color(255, 185, 12));
        lblModel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblModel.setText("Model :");

        lblStatus.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        lblStatus.setForeground(new java.awt.Color(255, 185, 12));
        lblStatus.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblStatus.setText("Status :");

        lblPrice.setBackground(new java.awt.Color(255, 185, 12));
        lblPrice.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        lblPrice.setForeground(new java.awt.Color(255, 185, 12));
        lblPrice.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblPrice.setText("Price :");

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 185, 12));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Great Value Enterprises");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblRentId, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                            .addComponent(lblModel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblBrand, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblStatus, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblPrice, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(32, 32, 32)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtProductId)
                            .addComponent(txtBrand)
                            .addComponent(txtModel)
                            .addComponent(cbStatus, 0, 135, Short.MAX_VALUE)
                            .addComponent(txtPrice))
                        .addGap(102, 102, 102)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnSave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnReset, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 477, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 87, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 522, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblRentId, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtProductId, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblBrand, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtBrand, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 9, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblModel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnReset, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE))
                    .addComponent(txtModel, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblStatus, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                    .addComponent(cbStatus)
                    .addComponent(btnDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblPrice, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPrice))
                .addGap(80, 80, 80)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        int flag = 0;
                
                //*************************************** Validation of Empty Name Field ***************************************//
                 if(txtProductId.getText().isEmpty()){
                    JOptionPane optionPane = new JOptionPane("Product ID cannot be empty", JOptionPane.ERROR_MESSAGE);
                    JDialog dialog = optionPane.createDialog("Error Message");
                    dialog.setAlwaysOnTop(true);
                    dialog.setVisible(true);
                    flag = 1;
                }
                 if(txtModel.getText().isEmpty()){
                    JOptionPane optionPane = new JOptionPane("Model cannot be empty", JOptionPane.ERROR_MESSAGE);
                    JDialog dialog = optionPane.createDialog("Error Message");
                    dialog.setAlwaysOnTop(true);
                    dialog.setVisible(true);
                    flag = 1;
                }
                  if(txtBrand.getText().isEmpty()){
                    JOptionPane optionPane = new JOptionPane("Brand cannot be empty", JOptionPane.ERROR_MESSAGE);
                    JDialog dialog = optionPane.createDialog("Error Message");
                    dialog.setAlwaysOnTop(true);
                    dialog.setVisible(true);
                    flag = 1;
                }
                   if(txtPrice.getText().isEmpty()){
                    JOptionPane optionPane = new JOptionPane("Price cannot be empty", JOptionPane.ERROR_MESSAGE);
                    JDialog dialog = optionPane.createDialog("Error Message");
                    dialog.setAlwaysOnTop(true);
                    dialog.setVisible(true);
                    flag = 1;
                }
                     
                   if(cbStatus.getSelectedItem().toString().isEmpty() || cbStatus.getSelectedItem().toString() == "Select" ){
                    JOptionPane optionPane = new JOptionPane("Please choose the Status", JOptionPane.ERROR_MESSAGE);
                    JDialog dialog = optionPane.createDialog("Error Message");
                    dialog.setAlwaysOnTop(true);
                    dialog.setVisible(true);
                    flag = 1;
                }
                 String name7 = txtProductId.getText();
                Pattern pattern7 = Pattern.compile("^[a-zA-Z0-9- ]{1,50}$");
                Matcher matcher7 = pattern7.matcher(name7);
                if(!matcher7.matches())
                {
                    JOptionPane.showMessageDialog(this,"Enter a valid Product ID!");
                    flag = 1;
                    txtProductId.setText("");
                    
                }
                
                 String employeeId2 = txtBrand.getText();
                Pattern pattern2 = Pattern.compile("^[a-zA-Z0-9- ]{1,50}$");
                Matcher matcher2 =pattern2.matcher(employeeId2);
                if(!matcher2.matches())
                {
                    JOptionPane.showMessageDialog(this,"Enter a Valid Brand!");
                    flag = 1;
                    txtBrand.setText("");   
                }
                String level4 = txtModel.getText();
                Pattern pattern4 = Pattern.compile("^[a-zA-Z0-9- ]{1,50}$");
                Matcher matcher4 = pattern4.matcher(level4);
                if(!matcher4.matches())
                {
                    JOptionPane.showMessageDialog(this,"Enter a valid Model!");
                    flag = 1;
                    txtModel.setText("");
                    
                }
                
                 String cellPhoneNumber3 = txtPrice.getText();
                Pattern pattern3 = Pattern.compile("^[0-9]{3}$");
                Matcher matcher3 = pattern3.matcher(cellPhoneNumber3);
                if(!matcher3.matches())
                {
                    JOptionPane.showMessageDialog(this,"Enter a valid Price!");
                    flag = 1;
                    txtPrice.setText("");
                    
                    
                }
                   if(flag == 0)
        {
        
        String sql = "INSERT INTO phone (productid,brand,model,status,price) "
                + " VALUES ('"+txtProductId.getText()+"','"+txtBrand.getText()+"','"+txtModel.getText()+"',"
                + "'"+cbStatus.getSelectedItem().toString()+"','"+txtPrice.getText()+"')";     
                c.insertDatabase(sql);
                JOptionPane.showMessageDialog(null,"Record Added Successfully!");
                Display();
                Reset();
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        
        if(txtProductId.getText().isEmpty() )
        {
            JOptionPane.showMessageDialog(this,"Select the Record to be deleted");
            
        }
        else {
        try {
          
            String Req = txtProductId.getText();
            String Query = "Delete from phone where productid ='"+Req+"'";
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

    private void tblLaptopListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblLaptopListMouseClicked
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) tblLaptopList.getModel();
        int MyIndex = tblLaptopList.getSelectedRow();
        txtProductId.setText(model.getValueAt(MyIndex,0).toString());
        txtBrand.setText(model.getValueAt(MyIndex,1).toString());
        txtModel.setText(model.getValueAt(MyIndex,2).toString());
        cbStatus.setSelectedItem(model.getValueAt(MyIndex,3).toString());
        txtPrice.setText(model.getValueAt(MyIndex,4).toString());
                
    }//GEN-LAST:event_tblLaptopListMouseClicked

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        // TODO add your handling code here:
          if(txtProductId.getText().isEmpty() )
        {
            JOptionPane.showMessageDialog(this,"Select the Record");
            
        }else{
        Reset();
    }//GEN-LAST:event_btnResetActionPerformed
    }
    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
         if(txtProductId.getText().isEmpty() )
        {
            JOptionPane.showMessageDialog(this,"Select the Record to be deleted");
            
        }else {
        try {
//            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/rent","root","12345678");
            String Req = txtProductId.getText();
            String Query = "Update phone set brand = '" +txtBrand.getText()+"', model = '"+txtModel.getText()+"', "
                    + "status = '"+cbStatus.getSelectedItem()+"', price = "+txtPrice.getText()+" where productid = '"+Req+"'" ;
            c.updateDatabase(Query);
//            Statement Add = con.createStatement();
//            Add.executeUpdate(Query);
            JOptionPane.showMessageDialog(this,"Record Updated Successfully");
            Display();
            Reset();
        } catch (Exception e){
            
            e.printStackTrace();
        }
        
        }
        
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnRentLaptopMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRentLaptopMouseClicked
        // TODO add your handling code here:
        PhoneRentJFrame  lr = new PhoneRentJFrame();
        lr.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRentLaptopMouseClicked

    private void btnRentLaptopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRentLaptopActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRentLaptopActionPerformed

    private void btnReturnLaptopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReturnLaptopActionPerformed
        // TODO add your handling code here:
        PhoneReturnJFrame  lr = new PhoneReturnJFrame();
        lr.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnReturnLaptopActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        // TODO add your handling code here:
        HomeLanding lr = new HomeLanding();
                lr.setVisible(true);
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
            java.util.logging.Logger.getLogger(PhoneManageJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PhoneManageJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PhoneManageJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PhoneManageJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new PhoneManageJFrame().setVisible(true);
            }
        });
    }

    
        private void Display(){
        String reg,brand,carmodel,status,price;
        try{
//            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/rent","root","12345678");
//            st = con.createStatement();
            String sql = "select * from phone";
          ResultSet  rs = c.selectDatabase(sql);
            
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
        private void Reset(){
        txtProductId.setText("");
        txtModel.setText("");
        cbStatus.setSelectedIndex(0);
        txtPrice.setText("");
        txtBrand.setText("");
    }
        
        
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnRentLaptop;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnReturnLaptop;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> cbStatus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblBrand;
    private javax.swing.JLabel lblModel;
    private javax.swing.JLabel lblPrice;
    private javax.swing.JLabel lblRentId;
    private javax.swing.JLabel lblStatus;
    private javax.swing.JTable tblLaptopList;
    private javax.swing.JTextField txtBrand;
    private javax.swing.JTextField txtModel;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtProductId;
    // End of variables declaration//GEN-END:variables
}
