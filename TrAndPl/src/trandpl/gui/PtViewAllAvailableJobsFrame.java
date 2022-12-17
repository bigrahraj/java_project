/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trandpl.gui;

import java.sql.SQLException;
import java.util.List;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import trandpl.dao.JobDAO;
import trandpl.dao.ResultDAO;
import trandpl.pojo.CurrentUser;
import trandpl.pojo.ParticipantJobPojo;
import trandpl.pojo.ResultsPojo;


public class PtViewAllAvailableJobsFrame extends javax.swing.JFrame {

    private DefaultTableModel model;
    private List<ParticipantJobPojo> allOpenJobsList;
    public PtViewAllAvailableJobsFrame() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("View All Available Jobs Option Frame");
        lblName.setText(CurrentUser.getName());
        model=(DefaultTableModel)tblAllJobs.getModel();
        loadOpenJobsDetails();
    }
    private void loadOpenJobsDetails(){
        try{
            allOpenJobsList=JobDAO.getAvailableJobs();
            for(ParticipantJobPojo job:allOpenJobsList){
                Vector<String> row=new Vector<>();
                row.add(job.getJobId());
                row.add(job.getJobTitle());
                row.add(job.getCompanyName());
                row.add(job.getTags());
                model.addRow(row);
            }
            if(allOpenJobsList.isEmpty()){
                JOptionPane.showMessageDialog(null,"No Open Job Present!","Open Job Not Present!",JOptionPane.INFORMATION_MESSAGE);
            }
        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"DB Error","Error",JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnLogOut = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblAllJobs = new javax.swing.JTable();
        jTextField2 = new javax.swing.JTextField();
        btnApplyForJob = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(243, 246, 254));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/transparent logo.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 192, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/World-Map.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 730, 144));

        btnLogOut.setBackground(new java.awt.Color(173, 192, 234));
        btnLogOut.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnLogOut.setText("Logout");
        btnLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogOutActionPerformed(evt);
            }
        });
        jPanel1.add(btnLogOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 510, 124, 41));

        btnBack.setBackground(new java.awt.Color(173, 192, 234));
        btnBack.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        jPanel1.add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 510, 134, 42));

        jLabel4.setFont(new java.awt.Font("Lucida Fax", 3, 20)); // NOI18N
        jLabel4.setText("Welcome ,");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 208, 108, 42));

        lblName.setFont(new java.awt.Font("Lucida Fax", 3, 20)); // NOI18N
        jPanel1.add(lblName, new org.netbeans.lib.awtextra.AbsoluteConstraints(169, 208, 281, 42));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/viewAllJob.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 180, 190));

        jLabel5.setFont(new java.awt.Font("Tahoma", 3, 16)); // NOI18N
        jLabel5.setText("All  Jobs-");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 250, 160, 40));

        tblAllJobs.setBackground(new java.awt.Color(173, 192, 234));
        tblAllJobs.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Job ID", "Job Title", " Company Name", " Skills Required"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblAllJobs);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 290, 520, 170));

        jTextField2.setBackground(new java.awt.Color(243, 246, 254));
        jTextField2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 470, 720, 20));

        btnApplyForJob.setBackground(new java.awt.Color(173, 192, 234));
        btnApplyForJob.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnApplyForJob.setText("Apply For Job");
        btnApplyForJob.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApplyForJobActionPerformed(evt);
            }
        });
        jPanel1.add(btnApplyForJob, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 510, 160, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 764, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 576, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogOutActionPerformed

        new LoginFrame().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnLogOutActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        new ParticipantsOptionsFrame().setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnApplyForJobActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApplyForJobActionPerformed
        int row=tblAllJobs.getSelectedRow();
        if(row==-1){
            JOptionPane.showMessageDialog(null,"Please select a row first!");
            return;
        }
        ResultsPojo result=new ResultsPojo();
        result.setpId(CurrentUser.getId());
        result.setPercentage(-1.0);
        result.setJobId(tblAllJobs.getValueAt(row,0).toString().trim());
        result.setSelectedByHr("No");
            try{
                boolean response=ResultDAO.applyForJob(result);
                if(response){
                    JOptionPane.showMessageDialog(null,"Apply for Job Successfully!\nNow You Can Appear For Test ViewAppliedJobs","Success!",JOptionPane.INFORMATION_MESSAGE);
                    return;
                }
                else{
                    JOptionPane.showMessageDialog(null,"Could Not Apply For Job!","Application Unsccessful!",JOptionPane.INFORMATION_MESSAGE);
                }
            }
            catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"DB Error","Error",JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }
        
    }//GEN-LAST:event_btnApplyForJobActionPerformed

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
            java.util.logging.Logger.getLogger(PtViewAllAvailableJobsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PtViewAllAvailableJobsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PtViewAllAvailableJobsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PtViewAllAvailableJobsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PtViewAllAvailableJobsFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnApplyForJob;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnLogOut;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JLabel lblName;
    private javax.swing.JTable tblAllJobs;
    // End of variables declaration//GEN-END:variables
}
