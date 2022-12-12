/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package BikeRental;


import Rental.Notification.Email;
import MySQLConnection.MySQLConnection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author tejas
 */
public class RentBikeJFrame extends javax.swing.JFrame {

    /**
     * Creates new form ManageBikeJFrame
     */
    MySQLConnection c = new MySQLConnection();
    Email e = new Email();
    public RentBikeJFrame() {
        initComponents();
        DisplayCarOnRent();
        DisplayCarRentalRequest();
        TxtRegNo.setEditable(false);
        TxtCustomerID.setEditable(false);
        TxtRentDate.setEditable(false);
        TxtReturnDate.setEditable(false);
        TxtPrice.setEditable(false);
//     ss   TxtProductId.setEditable(false);
        TxtEmail.setVisible(false);
        jLabel8.setVisible(false);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        RentBikePanel = new javax.swing.JPanel();
        ButtonsPanel = new javax.swing.JPanel();
        BtnReturnBike = new javax.swing.JButton();
        BtnManageBike = new javax.swing.JButton();
        BtnReturnBike1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        TblBikeOnRent = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        TblBikeRentalRequest = new javax.swing.JTable();
        BtnApprove = new javax.swing.JButton();
        BtnDeny = new javax.swing.JButton();
        LblCarsOnRent1 = new javax.swing.JLabel();
        LblCarsOnRent = new javax.swing.JLabel();
        LblRentCarHeading = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lblCustomerId = new javax.swing.JLabel();
        TxtCustomerID = new javax.swing.JTextField();
        TxtRegNo = new javax.swing.JTextField();
        lblCustomerId1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        TxtRentDate = new javax.swing.JTextField();
        TxtReturnDate = new javax.swing.JTextField();
        TxtRentID = new javax.swing.JTextField();
        TxtPrice = new javax.swing.JTextField();
        TxtEmail = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        RentBikePanel.setBackground(new java.awt.Color(51, 51, 0));

        ButtonsPanel.setBackground(new java.awt.Color(255, 185, 12));

        BtnReturnBike.setBackground(new java.awt.Color(51, 51, 0));
        BtnReturnBike.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        BtnReturnBike.setForeground(new java.awt.Color(255, 255, 255));
        BtnReturnBike.setText("Return Bike");
        BtnReturnBike.setBorder(null);
        BtnReturnBike.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnReturnBike.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnReturnBikeActionPerformed(evt);
            }
        });

        BtnManageBike.setBackground(new java.awt.Color(51, 51, 0));
        BtnManageBike.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        BtnManageBike.setForeground(new java.awt.Color(255, 255, 255));
        BtnManageBike.setText("Manage Bike");
        BtnManageBike.setBorder(null);
        BtnManageBike.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnManageBike.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnManageBikeActionPerformed(evt);
            }
        });

        BtnReturnBike1.setBackground(new java.awt.Color(51, 51, 0));
        BtnReturnBike1.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        BtnReturnBike1.setForeground(new java.awt.Color(255, 255, 255));
        BtnReturnBike1.setText("Logout");
        BtnReturnBike1.setBorder(null);
        BtnReturnBike1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnReturnBike1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnReturnBike1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ButtonsPanelLayout = new javax.swing.GroupLayout(ButtonsPanel);
        ButtonsPanel.setLayout(ButtonsPanelLayout);
        ButtonsPanelLayout.setHorizontalGroup(
            ButtonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ButtonsPanelLayout.createSequentialGroup()
                .addContainerGap(55, Short.MAX_VALUE)
                .addGroup(ButtonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BtnReturnBike1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnManageBike, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnReturnBike, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37))
        );
        ButtonsPanelLayout.setVerticalGroup(
            ButtonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ButtonsPanelLayout.createSequentialGroup()
                .addContainerGap(206, Short.MAX_VALUE)
                .addComponent(BtnManageBike, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(BtnReturnBike, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(98, 98, 98)
                .addComponent(BtnReturnBike1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(371, 371, 371))
        );

        TblBikeOnRent.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Rent ID", "Customer ID", "Rent Fee"
            }
        ));
        TblBikeOnRent.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TblBikeOnRentMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(TblBikeOnRent);

        TblBikeRentalRequest.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Customer ID", "Reg No", "Rent Date", "Return Date", "Fee"
            }
        ));
        TblBikeRentalRequest.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TblBikeRentalRequestMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(TblBikeRentalRequest);

        BtnApprove.setBackground(new java.awt.Color(255, 185, 12));
        BtnApprove.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        BtnApprove.setForeground(new java.awt.Color(255, 255, 255));
        BtnApprove.setText("Approve");
        BtnApprove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnApproveActionPerformed(evt);
            }
        });

        BtnDeny.setBackground(new java.awt.Color(255, 185, 12));
        BtnDeny.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        BtnDeny.setForeground(new java.awt.Color(255, 255, 255));
        BtnDeny.setText("Deny");
        BtnDeny.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnDenyActionPerformed(evt);
            }
        });

        LblCarsOnRent1.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        LblCarsOnRent1.setForeground(new java.awt.Color(255, 185, 12));
        LblCarsOnRent1.setText("Bikes On Rent");

        LblCarsOnRent.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        LblCarsOnRent.setForeground(new java.awt.Color(255, 185, 12));
        LblCarsOnRent.setText("Rental Request");

        LblRentCarHeading.setBackground(new java.awt.Color(255, 185, 12));
        LblRentCarHeading.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        LblRentCarHeading.setForeground(new java.awt.Color(255, 185, 12));
        LblRentCarHeading.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LblRentCarHeading.setText("Rent Bikes");
        LblRentCarHeading.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 185, 12));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Great Value Enterprises");

        jPanel1.setBackground(new java.awt.Color(51, 51, 0));

        lblCustomerId.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        lblCustomerId.setForeground(new java.awt.Color(255, 185, 12));
        lblCustomerId.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblCustomerId.setText("Customer ID :");

        TxtCustomerID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtCustomerIDActionPerformed(evt);
            }
        });

        TxtRegNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtRegNoActionPerformed(evt);
            }
        });

        lblCustomerId1.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        lblCustomerId1.setForeground(new java.awt.Color(255, 185, 12));
        lblCustomerId1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblCustomerId1.setText("Reg No :");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 185, 12));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Rent ID :");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 185, 12));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Rent Date :");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 185, 12));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Return Date :");

        jLabel8.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 185, 12));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Fee :");

        jLabel9.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 185, 12));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Email :");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblCustomerId, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblCustomerId1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TxtEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
                    .addComponent(TxtPrice)
                    .addComponent(TxtRegNo)
                    .addComponent(TxtRentDate)
                    .addComponent(TxtReturnDate)
                    .addComponent(TxtCustomerID)
                    .addComponent(TxtRentID))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCustomerId, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtCustomerID, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtRegNo, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCustomerId1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtRentID, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtRentDate, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(TxtReturnDate, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TxtPrice, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TxtEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE))
                .addGap(146, 146, 146))
        );

        javax.swing.GroupLayout RentBikePanelLayout = new javax.swing.GroupLayout(RentBikePanel);
        RentBikePanel.setLayout(RentBikePanelLayout);
        RentBikePanelLayout.setHorizontalGroup(
            RentBikePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RentBikePanelLayout.createSequentialGroup()
                .addComponent(ButtonsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(RentBikePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(RentBikePanelLayout.createSequentialGroup()
                        .addGap(183, 183, 183)
                        .addComponent(jLabel10)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(RentBikePanelLayout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(RentBikePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(RentBikePanelLayout.createSequentialGroup()
                                .addComponent(LblRentCarHeading, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(RentBikePanelLayout.createSequentialGroup()
                                .addComponent(LblCarsOnRent1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(RentBikePanelLayout.createSequentialGroup()
                                .addGroup(RentBikePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(LblCarsOnRent, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(RentBikePanelLayout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(RentBikePanelLayout.createSequentialGroup()
                                        .addGap(326, 326, 326)
                                        .addGroup(RentBikePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(BtnDeny, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(BtnApprove))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26))))))
        );
        RentBikePanelLayout.setVerticalGroup(
            RentBikePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RentBikePanelLayout.createSequentialGroup()
                .addGroup(RentBikePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ButtonsPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(RentBikePanelLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabel10)
                        .addGap(18, 18, 18)
                        .addComponent(LblRentCarHeading, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22)
                        .addComponent(LblCarsOnRent1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(RentBikePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(RentBikePanelLayout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(37, 37, 37)
                                .addComponent(LblCarsOnRent)
                                .addGap(35, 35, 35)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35)
                                .addComponent(BtnApprove)
                                .addGap(34, 34, 34)
                                .addComponent(BtnDeny)))))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(RentBikePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(RentBikePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 739, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BtnReturnBikeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnReturnBikeActionPerformed
        // TODO add your handling code here:
        ReturnBikeJFrame rc = new ReturnBikeJFrame();
        rc.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BtnReturnBikeActionPerformed

    private void BtnManageBikeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnManageBikeActionPerformed
        // TODO add your handling code here:
        ManageBikeJFrame mc = new ManageBikeJFrame();
        mc.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BtnManageBikeActionPerformed

    private void TxtCustomerIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtCustomerIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtCustomerIDActionPerformed

    private void BtnApproveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnApproveActionPerformed
        // TODO add your handling code here:
        
        
        try{
            int flag = 0;
                
                //*************************************** Validation of Empty Name Field ***************************************//
                 if(TxtRentID.getText().isEmpty()){
                    JOptionPane optionPane = new JOptionPane("Rent ID cannot be empty", JOptionPane.ERROR_MESSAGE);
                    JDialog dialog = optionPane.createDialog("Error Message");
                    dialog.setAlwaysOnTop(true);
                    dialog.setVisible(true);
                    flag = 1;
                }
                String cellPhoneNumber3 = TxtRentID.getText();
                Pattern pattern3 = Pattern.compile("^[0-9]{3}$");
                Matcher matcher3 = pattern3.matcher(cellPhoneNumber3);
                if(!matcher3.matches())
                {
                    JOptionPane.showMessageDialog(this,"Enter a Valid Rent ID!");
                    flag = 1;
                    TxtRentID.setText("");
                    
                    
                }
            String sql="UPDATE bike SET customerid = '"+TxtCustomerID.getText()+"', rentid = '"+TxtRentID.getText()+"',status = 'Booked',rentdate = '"+TxtRentDate.getText()+"' ,returndate = '"+TxtReturnDate.getText()+"',price = '"+TxtPrice.getText()+"' WHERE Regno = '"+TxtRegNo.getText()+"' ";
            c.updateDatabase(sql);
            JOptionPane.showMessageDialog(this,"Request Aprooved");  
            String sql1 ="UPDATE customers SET carapproved = 'Booked'  WHERE customerid = '"+TxtCustomerID.getText()+"' ";
            c.updateDatabase(sql1);          

            String sql2 = "SELECT email From customers WHERE customerid = '"+TxtCustomerID.getText()+"'";
            
            ResultSet rs = c.selectDatabase(sql2);
            if(rs.next()){
            String email;
            
            email = rs.getString(1);
//            System.out.println(rs.getString(email));
            TxtEmail.setText(email);
            }
//                       String s =c.selectDatabase(sql2).getString(1);
                       
            String msg = "Your Rental Request has been Aprroved";
            e.sendMail(msg,"Car" ,TxtCustomerID.getText(), TxtRegNo.getText(), TxtRentID.getText(), TxtPrice.getText(),TxtRentDate.getText(), TxtReturnDate.getText(), TxtEmail.getText());
            DisplayCarOnRent();
            DisplayCarRentalRequest();
            Reset();

        }
        catch(Exception e)
        {
        e.printStackTrace();
    }
    }//GEN-LAST:event_BtnApproveActionPerformed

    private void TblBikeOnRentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TblBikeOnRentMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_TblBikeOnRentMouseClicked

    private void TblBikeRentalRequestMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TblBikeRentalRequestMouseClicked
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) TblBikeRentalRequest.getModel();
        int MyIndex = TblBikeRentalRequest.getSelectedRow();
        TxtCustomerID.setText(model.getValueAt(MyIndex,0).toString());
        TxtRentDate.setText(model.getValueAt(MyIndex,2).toString());
        TxtReturnDate.setText(model.getValueAt(MyIndex,3).toString());
        TxtRegNo.setText((model.getValueAt(MyIndex, 1).toString()));
        TxtPrice.setText((model.getValueAt(MyIndex, 4).toString()));
    }//GEN-LAST:event_TblBikeRentalRequestMouseClicked

    private void BtnDenyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnDenyActionPerformed
        // TODO add your handling code here:
        try {
            // TODO add your handling code here:
            String sql1 ="UPDATE customers SET carapprove = NULL  WHERE customerid = '"+TxtCustomerID.getText()+"' ";
            c.updateDatabase(sql1);
            JOptionPane.showMessageDialog(this,"Request Denied");
            String msg = "Your Rental request has been Denied";
            e.sendMail(msg,"Car" ,TxtCustomerID.getText(), TxtRegNo.getText(), TxtRentID.getText(), TxtPrice.getText(),TxtRentDate.getText(), TxtReturnDate.getText(), TxtEmail.getText());
            
        } catch (Exception ex) {
            Logger.getLogger(RentBikeJFrame.class.getName()).log(Level.SEVERE, null, ex);
            
        }
            DisplayCarOnRent();
            DisplayCarRentalRequest();
            Reset();
    }//GEN-LAST:event_BtnDenyActionPerformed

    private void BtnReturnBike1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnReturnBike1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnReturnBike1ActionPerformed

    private void TxtRegNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtRegNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtRegNoActionPerformed

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
            java.util.logging.Logger.getLogger(RentBikeJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RentBikeJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RentBikeJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RentBikeJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RentBikeJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnApprove;
    private javax.swing.JButton BtnDeny;
    private javax.swing.JButton BtnManageBike;
    private javax.swing.JButton BtnReturnBike;
    private javax.swing.JButton BtnReturnBike1;
    private javax.swing.JPanel ButtonsPanel;
    private javax.swing.JLabel LblCarsOnRent;
    private javax.swing.JLabel LblCarsOnRent1;
    private javax.swing.JLabel LblRentCarHeading;
    private javax.swing.JPanel RentBikePanel;
    private javax.swing.JTable TblBikeOnRent;
    private javax.swing.JTable TblBikeRentalRequest;
    private javax.swing.JTextField TxtCustomerID;
    private javax.swing.JTextField TxtEmail;
    private javax.swing.JTextField TxtPrice;
    private javax.swing.JTextField TxtRegNo;
    private javax.swing.JTextField TxtRentDate;
    private javax.swing.JTextField TxtRentID;
    private javax.swing.JTextField TxtReturnDate;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblCustomerId;
    private javax.swing.JLabel lblCustomerId1;
    // End of variables declaration//GEN-END:variables



    private void DisplayCarOnRent() {
        String reg,brand,carmodel,status,price;
        try{
            
            String sql = "select * from bike where (status = 'Booked' and rentid IS NOT NULL )";
            ResultSet rs = c.selectDatabase(sql);
            DefaultTableModel model =(DefaultTableModel) TblBikeOnRent.getModel();
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

    private void DisplayCarRentalRequest() {
        String reg,brand,status,price,carmodel;
        try{
            String sql = "SELECT * FROM customers where bikeapprove = 'Requested' ";
            ResultSet rs = c.selectDatabase(sql);
            DefaultTableModel model =(DefaultTableModel)TblBikeRentalRequest.getModel();
            int rowCount = model.getRowCount();
            for (int i = rowCount - 1; i >= 0; i--) 
            {
            model.removeRow(i);
            }


            while (rs.next()) {
                reg = rs.getString(1);
                brand = rs.getString(7);
                
                status = rs.getString(6);
                price = rs.getString(5);
                carmodel = rs.getString(15);
                String[] row = {reg,brand,status,price,carmodel};
                model.addRow(row);
                               
            }
        
        } catch (SQLException e)
        {
            e.printStackTrace();
            
            
        }
    }

    private void Reset() {
        TxtCustomerID.setText("");
        TxtEmail.setText("");
        TxtPrice.setText("");
        TxtRegNo.setText("");
        TxtRentDate.setText("");
        TxtRentID.setText("");
        TxtReturnDate.setText("");
    }
}
