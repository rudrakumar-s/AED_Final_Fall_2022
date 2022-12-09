/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package CarRental;

/**
 *
 * @author tejas
 */
public class ReturnCarJFrame extends javax.swing.JFrame {

    /**
     * Creates new form ReturnCarJFrame
     */
    public ReturnCarJFrame() {
        initComponents();
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
        jScrollPane3 = new javax.swing.JScrollPane();
        TblRentalRequest = new javax.swing.JTable();
        LblRentalRequest = new javax.swing.JLabel();
        LblCustomerID = new javax.swing.JLabel();
        LblBrand = new javax.swing.JLabel();
        LblStatus = new javax.swing.JLabel();
        TxtCarID = new javax.swing.JTextField();
        TxtRentID = new javax.swing.JTextField();
        BtnConfirm = new javax.swing.JButton();
        LblModel = new javax.swing.JLabel();
        TxtCustomerID = new javax.swing.JTextField();
        TxtStatus = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ReturnCarPanel.setBackground(new java.awt.Color(12, 176, 176));

        LblReturnCarHeading.setBackground(new java.awt.Color(161, 215, 215));
        LblReturnCarHeading.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        LblReturnCarHeading.setForeground(new java.awt.Color(255, 255, 255));
        LblReturnCarHeading.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LblReturnCarHeading.setText("Return Cars");
        LblReturnCarHeading.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        ButtonsPanel.setBackground(new java.awt.Color(0, 102, 102));

        BtnRentCar.setBackground(new java.awt.Color(162, 215, 215));
        BtnRentCar.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        BtnRentCar.setText("Rent Car");
        BtnRentCar.setBorder(null);
        BtnRentCar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnRentCar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRentCarActionPerformed(evt);
            }
        });

        BtnManageCar.setBackground(new java.awt.Color(162, 215, 215));
        BtnManageCar.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        BtnManageCar.setText("Manage Car");
        BtnManageCar.setBorder(null);
        BtnManageCar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnManageCar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnManageCarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ButtonsPanelLayout = new javax.swing.GroupLayout(ButtonsPanel);
        ButtonsPanel.setLayout(ButtonsPanelLayout);
        ButtonsPanelLayout.setHorizontalGroup(
            ButtonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ButtonsPanelLayout.createSequentialGroup()
                .addContainerGap(51, Short.MAX_VALUE)
                .addGroup(ButtonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BtnManageCar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnRentCar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37))
        );
        ButtonsPanelLayout.setVerticalGroup(
            ButtonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ButtonsPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BtnManageCar, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addComponent(BtnRentCar, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(308, 308, 308))
        );

        TblRentalRequest.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Car ID", "Rent ID", "Customer ID", "Rent Fee"
            }
        ));
        jScrollPane3.setViewportView(TblRentalRequest);

        LblRentalRequest.setText("Rental Request");

        LblCustomerID.setText("Car ID");

        LblBrand.setText("Rent ID ");

        LblStatus.setText("Status");

        TxtCarID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtCarIDActionPerformed(evt);
            }
        });

        BtnConfirm.setText("Confirm");
        BtnConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnConfirmActionPerformed(evt);
            }
        });

        LblModel.setText("Customer ID ");

        TxtStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtStatusActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ReturnCarPanelLayout = new javax.swing.GroupLayout(ReturnCarPanel);
        ReturnCarPanel.setLayout(ReturnCarPanelLayout);
        ReturnCarPanelLayout.setHorizontalGroup(
            ReturnCarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ReturnCarPanelLayout.createSequentialGroup()
                .addComponent(ButtonsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(ReturnCarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ReturnCarPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(LblReturnCarHeading, javax.swing.GroupLayout.PREFERRED_SIZE, 799, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37))
                    .addGroup(ReturnCarPanelLayout.createSequentialGroup()
                        .addGroup(ReturnCarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ReturnCarPanelLayout.createSequentialGroup()
                                .addGap(108, 108, 108)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(ReturnCarPanelLayout.createSequentialGroup()
                                .addGap(294, 294, 294)
                                .addComponent(LblRentalRequest, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(ReturnCarPanelLayout.createSequentialGroup()
                                .addGroup(ReturnCarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(ReturnCarPanelLayout.createSequentialGroup()
                                        .addGap(168, 168, 168)
                                        .addGroup(ReturnCarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(ReturnCarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(LblCustomerID)
                                                .addComponent(LblBrand, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(LblModel, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(ReturnCarPanelLayout.createSequentialGroup()
                                        .addGap(186, 186, 186)
                                        .addComponent(LblStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(89, 89, 89)
                                .addGroup(ReturnCarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(BtnConfirm)
                                    .addComponent(TxtCustomerID)
                                    .addComponent(TxtStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TxtCarID, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                                    .addComponent(TxtRentID))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        ReturnCarPanelLayout.setVerticalGroup(
            ReturnCarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ButtonsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(ReturnCarPanelLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(LblReturnCarHeading, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addComponent(LblRentalRequest)
                .addGap(37, 37, 37)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64)
                .addGroup(ReturnCarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LblCustomerID)
                    .addComponent(TxtCarID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(ReturnCarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LblBrand)
                    .addComponent(TxtRentID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(ReturnCarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LblModel)
                    .addComponent(TxtCustomerID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(ReturnCarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LblStatus)
                    .addComponent(TxtStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(BtnConfirm)
                .addGap(100, 100, 100))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ReturnCarPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(ReturnCarPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnRentCarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRentCarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnRentCarActionPerformed

    private void BtnManageCarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnManageCarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnManageCarActionPerformed

    private void TxtCarIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtCarIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtCarIDActionPerformed

    private void BtnConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnConfirmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnConfirmActionPerformed

    private void TxtStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtStatusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtStatusActionPerformed

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
    private javax.swing.JLabel LblBrand;
    private javax.swing.JLabel LblCustomerID;
    private javax.swing.JLabel LblModel;
    private javax.swing.JLabel LblRentalRequest;
    private javax.swing.JLabel LblReturnCarHeading;
    private javax.swing.JLabel LblStatus;
    private javax.swing.JPanel ReturnCarPanel;
    private javax.swing.JTable TblRentalRequest;
    private javax.swing.JTextField TxtCarID;
    private javax.swing.JTextField TxtCustomerID;
    private javax.swing.JTextField TxtRentID;
    private javax.swing.JTextField TxtStatus;
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration//GEN-END:variables
}
