/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package CarRental;

/**
 *
 * @author tejas
 */
public class ManageCarJFrame extends javax.swing.JFrame {

    /**
     * Creates new form ManageCarJFrame
     */
    public ManageCarJFrame() {
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

        ManageCarPanel = new javax.swing.JPanel();
        LblManageCarHeading = new javax.swing.JLabel();
        ButtonsPanel = new javax.swing.JPanel();
        BtnReturnCar = new javax.swing.JButton();
        BtnRentCar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TblManageCars = new javax.swing.JTable();
        LblRegNo = new javax.swing.JLabel();
        TxtRegNo = new javax.swing.JTextField();
        LblBrand = new javax.swing.JLabel();
        TxtBrand = new javax.swing.JTextField();
        LblModel = new javax.swing.JLabel();
        TxtModel = new javax.swing.JTextField();
        LblStatus = new javax.swing.JLabel();
        LblPrice = new javax.swing.JLabel();
        TxtPrice = new javax.swing.JTextField();
        BtnSave = new javax.swing.JButton();
        BtnUpdate = new javax.swing.JButton();
        BtnDelete = new javax.swing.JButton();
        BtnReset = new javax.swing.JButton();
        CBStatus = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ManageCarPanel.setBackground(new java.awt.Color(12, 176, 176));

        LblManageCarHeading.setBackground(new java.awt.Color(161, 215, 215));
        LblManageCarHeading.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        LblManageCarHeading.setForeground(new java.awt.Color(255, 255, 255));
        LblManageCarHeading.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LblManageCarHeading.setText("Manage Cars");
        LblManageCarHeading.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        ButtonsPanel.setBackground(new java.awt.Color(0, 102, 102));

        BtnReturnCar.setBackground(new java.awt.Color(162, 215, 215));
        BtnReturnCar.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        BtnReturnCar.setText("Return Car");
        BtnReturnCar.setBorder(null);
        BtnReturnCar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnReturnCar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnReturnCarActionPerformed(evt);
            }
        });

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

        javax.swing.GroupLayout ButtonsPanelLayout = new javax.swing.GroupLayout(ButtonsPanel);
        ButtonsPanel.setLayout(ButtonsPanelLayout);
        ButtonsPanelLayout.setHorizontalGroup(
            ButtonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ButtonsPanelLayout.createSequentialGroup()
                .addContainerGap(51, Short.MAX_VALUE)
                .addGroup(ButtonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BtnRentCar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnReturnCar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37))
        );
        ButtonsPanelLayout.setVerticalGroup(
            ButtonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ButtonsPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BtnRentCar, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addComponent(BtnReturnCar, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(308, 308, 308))
        );

        TblManageCars.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        TblManageCars.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "RegNo", "Brand", "Model", "Status", "Price"
            }
        ));
        TblManageCars.setRowHeight(25);
        TblManageCars.setSelectionBackground(new java.awt.Color(167, 221, 221));
        jScrollPane1.setViewportView(TblManageCars);

        LblRegNo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        LblRegNo.setForeground(new java.awt.Color(255, 255, 255));
        LblRegNo.setText("RegNo :");

        TxtRegNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtRegNoActionPerformed(evt);
            }
        });

        LblBrand.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        LblBrand.setForeground(new java.awt.Color(255, 255, 255));
        LblBrand.setText("Brand :");

        TxtBrand.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtBrandActionPerformed(evt);
            }
        });

        LblModel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        LblModel.setForeground(new java.awt.Color(255, 255, 255));
        LblModel.setText("Model :");

        TxtModel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtModelActionPerformed(evt);
            }
        });

        LblStatus.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        LblStatus.setForeground(new java.awt.Color(255, 255, 255));
        LblStatus.setText("Status :");

        LblPrice.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        LblPrice.setForeground(new java.awt.Color(255, 255, 255));
        LblPrice.setText("Price :");

        TxtPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtPriceActionPerformed(evt);
            }
        });

        BtnSave.setText("Save");
        BtnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSaveActionPerformed(evt);
            }
        });

        BtnUpdate.setText("Update");

        BtnDelete.setText("Delete");

        BtnReset.setText("Reset");

        CBStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "select", "Available", "Booked", "In Service" }));

        javax.swing.GroupLayout ManageCarPanelLayout = new javax.swing.GroupLayout(ManageCarPanel);
        ManageCarPanel.setLayout(ManageCarPanelLayout);
        ManageCarPanelLayout.setHorizontalGroup(
            ManageCarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ManageCarPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ButtonsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ManageCarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ManageCarPanelLayout.createSequentialGroup()
                        .addGroup(ManageCarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ManageCarPanelLayout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addGroup(ManageCarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(LblBrand, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(LblModel, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(LblRegNo, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(29, 29, 29)
                                .addGroup(ManageCarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TxtRegNo, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TxtModel, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TxtBrand, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(116, 116, 116)
                                .addGroup(ManageCarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(ManageCarPanelLayout.createSequentialGroup()
                                        .addComponent(LblStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(CBStatus, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(ManageCarPanelLayout.createSequentialGroup()
                                        .addComponent(LblPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(TxtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(ManageCarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(ManageCarPanelLayout.createSequentialGroup()
                                    .addGap(43, 43, 43)
                                    .addComponent(LblManageCarHeading, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 842, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ManageCarPanelLayout.createSequentialGroup()
                        .addComponent(BtnSave)
                        .addGap(98, 98, 98)
                        .addComponent(BtnUpdate)
                        .addGap(109, 109, 109)
                        .addComponent(BtnDelete)
                        .addGap(84, 84, 84)
                        .addComponent(BtnReset)
                        .addGap(153, 153, 153))))
        );
        ManageCarPanelLayout.setVerticalGroup(
            ManageCarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ButtonsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(ManageCarPanelLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(LblManageCarHeading, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(ManageCarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LblRegNo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LblStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtRegNo, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CBStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(ManageCarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LblBrand, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LblPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtBrand, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(ManageCarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LblModel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtModel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(82, 82, 82)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67)
                .addGroup(ManageCarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnSave)
                    .addComponent(BtnUpdate)
                    .addComponent(BtnDelete)
                    .addComponent(BtnReset))
                .addContainerGap(163, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ManageCarPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ManageCarPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnReturnCarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnReturnCarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnReturnCarActionPerformed

    private void BtnRentCarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRentCarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnRentCarActionPerformed

    private void TxtRegNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtRegNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtRegNoActionPerformed

    private void TxtBrandActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtBrandActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtBrandActionPerformed

    private void TxtModelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtModelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtModelActionPerformed

    private void TxtPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtPriceActionPerformed

    private void BtnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSaveActionPerformed
        // TODO add your handling code here:   
    }//GEN-LAST:event_BtnSaveActionPerformed

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
            java.util.logging.Logger.getLogger(ManageCarJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManageCarJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManageCarJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManageCarJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManageCarJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnDelete;
    private javax.swing.JButton BtnRentCar;
    private javax.swing.JButton BtnReset;
    private javax.swing.JButton BtnReturnCar;
    private javax.swing.JButton BtnSave;
    private javax.swing.JButton BtnUpdate;
    private javax.swing.JPanel ButtonsPanel;
    private javax.swing.JComboBox<String> CBStatus;
    private javax.swing.JLabel LblBrand;
    private javax.swing.JLabel LblManageCarHeading;
    private javax.swing.JLabel LblModel;
    private javax.swing.JLabel LblPrice;
    private javax.swing.JLabel LblRegNo;
    private javax.swing.JLabel LblStatus;
    private javax.swing.JPanel ManageCarPanel;
    private javax.swing.JTable TblManageCars;
    private javax.swing.JTextField TxtBrand;
    private javax.swing.JTextField TxtModel;
    private javax.swing.JTextField TxtPrice;
    private javax.swing.JTextField TxtRegNo;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
