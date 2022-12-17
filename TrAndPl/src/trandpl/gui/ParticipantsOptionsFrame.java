/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trandpl.gui;

import trandpl.pojo.CurrentUser;

/**
 *
 * @author ashut
 */
public class ParticipantsOptionsFrame extends javax.swing.JFrame {

    
    public ParticipantsOptionsFrame() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Participants Option Frame");
        lblName.setText(CurrentUser.getName());
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        btnEditProfile = new javax.swing.JButton();
        btnAllAvailableJobs = new javax.swing.JButton();
        btnAllAppliedJobs = new javax.swing.JButton();
        btnAllCompleteJobs = new javax.swing.JButton();
        btnLogOut1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(243, 246, 254));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/transparent logo.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 192, 67));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/World-Map.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 820, 150));

        btnBack.setBackground(new java.awt.Color(173, 192, 234));
        btnBack.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        jPanel1.add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 520, 124, 41));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/purepng.com-white-paper-planpaper-planeaeroplanepaper-gliderpaper-dartaircraftfolded-paperpaperboardclipartblack-1421526588279c5fht.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 230, 416, 226));

        jLabel4.setFont(new java.awt.Font("Lucida Fax", 3, 20)); // NOI18N
        jLabel4.setText("Welcome ,");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 108, 42));

        lblName.setFont(new java.awt.Font("Lucida Fax", 3, 20)); // NOI18N
        jPanel1.add(lblName, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 210, 249, 42));

        btnEditProfile.setBackground(new java.awt.Color(173, 192, 234));
        btnEditProfile.setFont(new java.awt.Font("Serif", 1, 16)); // NOI18N
        btnEditProfile.setText("Edit Profile");
        btnEditProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditProfileActionPerformed(evt);
            }
        });
        jPanel1.add(btnEditProfile, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, 211, 39));

        btnAllAvailableJobs.setBackground(new java.awt.Color(173, 192, 234));
        btnAllAvailableJobs.setFont(new java.awt.Font("Serif", 1, 16)); // NOI18N
        btnAllAvailableJobs.setText("View All Available Jobs");
        btnAllAvailableJobs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAllAvailableJobsActionPerformed(evt);
            }
        });
        jPanel1.add(btnAllAvailableJobs, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, 211, 42));

        btnAllAppliedJobs.setBackground(new java.awt.Color(173, 192, 234));
        btnAllAppliedJobs.setFont(new java.awt.Font("Serif", 1, 16)); // NOI18N
        btnAllAppliedJobs.setText("View All Appliaed Jobs");
        btnAllAppliedJobs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAllAppliedJobsActionPerformed(evt);
            }
        });
        jPanel1.add(btnAllAppliedJobs, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 390, 211, 44));

        btnAllCompleteJobs.setBackground(new java.awt.Color(173, 192, 234));
        btnAllCompleteJobs.setFont(new java.awt.Font("Serif", 1, 16)); // NOI18N
        btnAllCompleteJobs.setText("View All Completed Job");
        btnAllCompleteJobs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAllCompleteJobsActionPerformed(evt);
            }
        });
        jPanel1.add(btnAllCompleteJobs, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 450, 210, 42));

        btnLogOut1.setBackground(new java.awt.Color(173, 192, 234));
        btnLogOut1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnLogOut1.setText("Logout");
        btnLogOut1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogOut1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnLogOut1, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 520, 124, 41));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 608, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed

        new HrOptionsFrame().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnEditProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditProfileActionPerformed
        new PtEditProfileFrame().setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_btnEditProfileActionPerformed

    private void btnAllAvailableJobsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAllAvailableJobsActionPerformed
         new PtViewAllAvailableJobsFrame().setVisible(true);
         this.dispose();
    }//GEN-LAST:event_btnAllAvailableJobsActionPerformed

    private void btnAllAppliedJobsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAllAppliedJobsActionPerformed
        // TODO add your handling code here:
        new PtViewAllAppliedjobsFrame().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnAllAppliedJobsActionPerformed

    private void btnAllCompleteJobsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAllCompleteJobsActionPerformed
        // TODO add your handling code here:
        new PtViewAllCompletedJobsFrame().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnAllCompleteJobsActionPerformed

    private void btnLogOut1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogOut1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLogOut1ActionPerformed

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
            java.util.logging.Logger.getLogger(ParticipantsOptionsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ParticipantsOptionsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ParticipantsOptionsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ParticipantsOptionsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ParticipantsOptionsFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAllAppliedJobs;
    private javax.swing.JButton btnAllAvailableJobs;
    private javax.swing.JButton btnAllCompleteJobs;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnEditProfile;
    private javax.swing.JButton btnLogOut1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblName;
    // End of variables declaration//GEN-END:variables
}
