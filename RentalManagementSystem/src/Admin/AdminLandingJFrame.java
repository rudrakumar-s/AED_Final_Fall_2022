/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Admin;

/**
 *
 * @author sunilrudrakumar
 */
public class AdminLandingJFrame extends javax.swing.JFrame {

    /**
     * Creates new form Splash
     */
    public AdminLandingJFrame() {
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

        jSplitPane2 = new javax.swing.JSplitPane();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        btnVehicleAdmin3 = new javax.swing.JButton();
        btnGadgetAdmin3 = new javax.swing.JButton();
        btnVehicleServicesAdmin3 = new javax.swing.JButton();
        btnGadgetServicesAdmin3 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(255, 185, 12));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Manage Admins");

        btnVehicleAdmin3.setBackground(new java.awt.Color(51, 51, 0));
        btnVehicleAdmin3.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        btnVehicleAdmin3.setForeground(new java.awt.Color(255, 255, 255));
        btnVehicleAdmin3.setText("Vehicle Admin");
        btnVehicleAdmin3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVehicleAdminActionPerformed(evt);
            }
        });

        btnGadgetAdmin3.setBackground(new java.awt.Color(51, 51, 0));
        btnGadgetAdmin3.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        btnGadgetAdmin3.setForeground(new java.awt.Color(255, 255, 255));
        btnGadgetAdmin3.setText("Gadget Admin");
        btnGadgetAdmin3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGadgetAdminActionPerformed(evt);
            }
        });

        btnVehicleServicesAdmin3.setBackground(new java.awt.Color(51, 51, 0));
        btnVehicleServicesAdmin3.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        btnVehicleServicesAdmin3.setForeground(new java.awt.Color(255, 255, 255));
        btnVehicleServicesAdmin3.setText("Vehicle Services Admin");
        btnVehicleServicesAdmin3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVehicleServicesAdminActionPerformed(evt);
            }
        });

        btnGadgetServicesAdmin3.setBackground(new java.awt.Color(51, 51, 51));
        btnGadgetServicesAdmin3.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        btnGadgetServicesAdmin3.setForeground(new java.awt.Color(255, 255, 255));
        btnGadgetServicesAdmin3.setText("Gadget Services Admin");
        btnGadgetServicesAdmin3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGadgetServicesAdminActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btnVehicleAdmin3)
                                .addComponent(btnGadgetAdmin3))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnGadgetServicesAdmin3))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnVehicleServicesAdmin3)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(jLabel5)
                .addGap(114, 114, 114)
                .addComponent(btnVehicleAdmin3)
                .addGap(30, 30, 30)
                .addComponent(btnGadgetAdmin3)
                .addGap(43, 43, 43)
                .addComponent(btnVehicleServicesAdmin3)
                .addGap(39, 39, 39)
                .addComponent(btnGadgetServicesAdmin3)
                .addContainerGap(220, Short.MAX_VALUE))
        );

        jSplitPane2.setLeftComponent(jPanel3);

        jPanel6.setBackground(new java.awt.Color(51, 51, 0));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("System Admin");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(172, 172, 172)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(184, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jLabel1)
                .addContainerGap(535, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jSplitPane2.setRightComponent(jPanel4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jSplitPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 746, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane2)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGadgetServicesAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGadgetServicesAdminActionPerformed
        GadgetServicesAdminPanel view = new GadgetServicesAdminPanel();
        jSplitPane2.setRightComponent(view);// TODO add your handling code here:
    }//GEN-LAST:event_btnGadgetServicesAdminActionPerformed

    private void btnVehicleServicesAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVehicleServicesAdminActionPerformed
        VehicleServicesAdminPanel view = new VehicleServicesAdminPanel();
        jSplitPane2.setRightComponent(view);
        // TODO add your handling code here:
    }//GEN-LAST:event_btnVehicleServicesAdminActionPerformed

    private void btnGadgetAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGadgetAdminActionPerformed
        GadgetAdminPanel view = new GadgetAdminPanel();
        jSplitPane2.setRightComponent(view);// TODO add your handling code here:
    }//GEN-LAST:event_btnGadgetAdminActionPerformed

    private void btnVehicleAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVehicleAdminActionPerformed
        VehicleAdminPanel view = new VehicleAdminPanel();
        jSplitPane2.setRightComponent(view);        // TODO add your handling code here:
    }//GEN-LAST:event_btnVehicleAdminActionPerformed

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
            java.util.logging.Logger.getLogger(AdminLandingJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminLandingJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminLandingJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminLandingJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminLandingJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGadgetAdmin;
    private javax.swing.JButton btnGadgetAdmin1;
    private javax.swing.JButton btnGadgetAdmin2;
    private javax.swing.JButton btnGadgetAdmin3;
    private javax.swing.JButton btnGadgetServicesAdmin;
    private javax.swing.JButton btnGadgetServicesAdmin1;
    private javax.swing.JButton btnGadgetServicesAdmin2;
    private javax.swing.JButton btnGadgetServicesAdmin3;
    private javax.swing.JButton btnVehicleAdmin;
    private javax.swing.JButton btnVehicleAdmin1;
    private javax.swing.JButton btnVehicleAdmin2;
    private javax.swing.JButton btnVehicleAdmin3;
    private javax.swing.JButton btnVehicleServicesAdmin;
    private javax.swing.JButton btnVehicleServicesAdmin1;
    private javax.swing.JButton btnVehicleServicesAdmin2;
    private javax.swing.JButton btnVehicleServicesAdmin3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JSplitPane jSplitPane2;
    // End of variables declaration//GEN-END:variables
}
