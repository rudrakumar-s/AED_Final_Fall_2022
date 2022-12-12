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
        jLabel2 = new javax.swing.JLabel();
        btnVehicleAdmin = new javax.swing.JButton();
        btnGadgetAdmin = new javax.swing.JButton();
        btnVehicleServicesAdmin = new javax.swing.JButton();
        btnGadgetServicesAdmin = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setText("Manage Admins");

        btnVehicleAdmin.setText("Vehicle Admin");
        btnVehicleAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVehicleAdminActionPerformed(evt);
            }
        });

        btnGadgetAdmin.setText("Gadget Admin");
        btnGadgetAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGadgetAdminActionPerformed(evt);
            }
        });

        btnVehicleServicesAdmin.setText("Vehicle Services Admin");
        btnVehicleServicesAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVehicleServicesAdminActionPerformed(evt);
            }
        });

        btnGadgetServicesAdmin.setText("Gadget Services Admin");
        btnGadgetServicesAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGadgetServicesAdminActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnGadgetServicesAdmin)
                    .addComponent(btnVehicleServicesAdmin)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnVehicleAdmin)
                            .addComponent(btnGadgetAdmin)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel2)
                .addGap(78, 78, 78)
                .addComponent(btnVehicleAdmin)
                .addGap(47, 47, 47)
                .addComponent(btnGadgetAdmin)
                .addGap(48, 48, 48)
                .addComponent(btnVehicleServicesAdmin)
                .addGap(78, 78, 78)
                .addComponent(btnGadgetServicesAdmin)
                .addContainerGap(226, Short.MAX_VALUE))
        );

        jSplitPane2.setLeftComponent(jPanel3);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 582, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 619, Short.MAX_VALUE)
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

    private void btnVehicleAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVehicleAdminActionPerformed
           VehicleAdminPanel view = new VehicleAdminPanel();
           jSplitPane2.setRightComponent(view);        // TODO add your handling code here:
    }//GEN-LAST:event_btnVehicleAdminActionPerformed

    private void btnVehicleServicesAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVehicleServicesAdminActionPerformed
            VehicleServicesAdminPanel view = new VehicleServicesAdminPanel();
            jSplitPane2.setRightComponent(view);
            // TODO add your handling code here:
    }//GEN-LAST:event_btnVehicleServicesAdminActionPerformed

    private void btnGadgetAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGadgetAdminActionPerformed
            GadgetAdminPanel view = new GadgetAdminPanel();
            jSplitPane2.setRightComponent(view);// TODO add your handling code here:
    }//GEN-LAST:event_btnGadgetAdminActionPerformed

    private void btnGadgetServicesAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGadgetServicesAdminActionPerformed
            GadgetServicesAdminPanel view = new GadgetServicesAdminPanel();
            jSplitPane2.setRightComponent(view);// TODO add your handling code here:
    }//GEN-LAST:event_btnGadgetServicesAdminActionPerformed

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
    private javax.swing.JButton btnGadgetServicesAdmin;
    private javax.swing.JButton btnVehicleAdmin;
    private javax.swing.JButton btnVehicleServicesAdmin;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSplitPane jSplitPane2;
    // End of variables declaration//GEN-END:variables
}
