/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package HomeLanding;

import BikeRental.ManageBikeJFrame;
import CarRental.ManageCarJFrame;
import javax.swing.JFrame;

/**
 *
 * @author sunilrudrakumar
 */
public class VehicleAdminLandingPage extends javax.swing.JFrame {

    /**
     * Creates new form VehicleAdminLandingPage
     */
    public VehicleAdminLandingPage() {
        initComponents();
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
        btnManageCar = new javax.swing.JButton();
        btnManageBike = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1300, 800));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(51, 51, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnManageCar.setText("Manage Car");
        btnManageCar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageCarActionPerformed(evt);
            }
        });
        jPanel1.add(btnManageCar, new org.netbeans.lib.awtextra.AbsoluteConstraints(111, 151, -1, -1));

        btnManageBike.setText("Manage Bike");
        btnManageBike.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageBikeActionPerformed(evt);
            }
        });
        jPanel1.add(btnManageBike, new org.netbeans.lib.awtextra.AbsoluteConstraints(281, 151, -1, -1));

        btnLogout.setText("Logout");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });
        jPanel1.add(btnLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(213, 263, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1660, 1110));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnManageCarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageCarActionPerformed
        // TODO add your handling code here:
        ManageCarJFrame mc = new ManageCarJFrame();
        mc.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_btnManageCarActionPerformed

    private void btnManageBikeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageBikeActionPerformed
        // TODO add your handling code here:
        ManageBikeJFrame mc = new ManageBikeJFrame();
        mc.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnManageBikeActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        // TODO add your handling code here:
        HomeLanding h = new HomeLanding();
        h.setVisible(true);
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
            java.util.logging.Logger.getLogger(VehicleAdminLandingPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VehicleAdminLandingPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VehicleAdminLandingPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VehicleAdminLandingPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VehicleAdminLandingPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnManageBike;
    private javax.swing.JButton btnManageCar;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}