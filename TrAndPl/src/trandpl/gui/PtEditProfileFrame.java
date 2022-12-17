/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trandpl.gui;

import java.io.File;
import java.io.FileNotFoundException;
import java.sql.SQLException;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import trandpl.dao.ParticipantDAO;
import trandpl.dao.UserDAO;
import trandpl.pojo.CurrentUser;
import trandpl.pojo.ParticipantPojo;

/**
 *
 * @author ashut
 */
public class PtEditProfileFrame extends javax.swing.JFrame {

    private File file;
    private String oldPwd,NewPwd,CnfrmPwd;
    public PtEditProfileFrame() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.pwdPanel.setVisible(false);
        this.resumePanel.setVisible(false);
        this.setTitle("Participants Edit Option Frame");
        loadData();
    }

    private void loadData(){
        try{
            ParticipantPojo pt=ParticipantDAO.getParticipantById(CurrentUser.getId());
            txtName.setText(pt.getName());
            txtMail.setText(pt.getUserId().toLowerCase());
            txtPhone.setText(pt.getPhone());
        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"DB Error In Edit Participant Profile","Error",JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }
    }
    private boolean validateInputs(){
        char []arrOldPwd=txtOldPwd.getPassword();
        char []arrNewPwd=txtNewPwd.getPassword();
        char []arrCnfrmPwd=txtCnfrmPwd.getPassword();
        if(arrOldPwd.length==0||arrNewPwd.length==0||arrCnfrmPwd.length==0)
            return false;
        oldPwd=String.valueOf(arrOldPwd);
        NewPwd=String.valueOf(arrNewPwd);
        CnfrmPwd=String.valueOf(arrCnfrmPwd);
        return true;
    }
    private boolean matchPassword(){
        return NewPwd.equals(CnfrmPwd);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        lblPid = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        txtPhone = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtMail = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        btnSaveChanges = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        chkPassword = new javax.swing.JCheckBox();
        jLabel7 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        pwdPanel = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtOldPwd = new javax.swing.JPasswordField();
        jLabel31 = new javax.swing.JLabel();
        txtNewPwd = new javax.swing.JPasswordField();
        jLabel32 = new javax.swing.JLabel();
        txtCnfrmPwd = new javax.swing.JPasswordField();
        jLabel29 = new javax.swing.JLabel();
        resumePanel = new javax.swing.JPanel();
        btnBrowser = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtFilePath = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        chkResume = new javax.swing.JCheckBox();
        btnLogin1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(243, 246, 254));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/transparent logo.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 181, 44));

        jPanel2.setBackground(new java.awt.Color(243, 246, 254));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/transparent logo.png"))); // NOI18N
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 181, 44));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/World-Map.png"))); // NOI18N
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 870, 127));

        lblPid.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        lblPid.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel2.add(lblPid, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 180, 110, 40));

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel18.setText("Name: -");
        jPanel2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 110, 30));

        txtPhone.setBackground(new java.awt.Color(173, 193, 234));
        txtPhone.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        txtPhone.setBorder(null);
        jPanel2.add(txtPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 300, 30));

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/TextFieldPic.png"))); // NOI18N
        jPanel2.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, -1, 50));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel8.setText("Email: -");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, 110, 40));

        txtMail.setBackground(new java.awt.Color(173, 193, 234));
        txtMail.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        txtMail.setBorder(null);
        jPanel2.add(txtMail, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 390, 300, 30));

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel25.setText("Mobile No: -");
        jPanel2.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 110, 40));

        jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/TextFieldPic.png"))); // NOI18N
        jPanel2.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, -1, 50));

        btnSaveChanges.setBackground(new java.awt.Color(173, 193, 234));
        btnSaveChanges.setText("Save Changes");
        btnSaveChanges.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveChangesActionPerformed(evt);
            }
        });
        jPanel2.add(btnSaveChanges, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 560, 190, 40));

        btnBack.setBackground(new java.awt.Color(173, 193, 234));
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        jPanel2.add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 560, 190, 40));

        jLabel3.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 240, 500, 10));

        jLabel4.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, 110, 40));

        txtName.setBackground(new java.awt.Color(173, 193, 234));
        txtName.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        txtName.setBorder(null);
        jPanel2.add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 300, 30));

        chkPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkPasswordActionPerformed(evt);
            }
        });
        jPanel2.add(chkPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 220, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel7.setText("Want to change Password");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 210, 230, 40));

        jLabel11.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 540, 850, 10));

        jLabel12.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 420, 850, 10));

        jLabel30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/TextFieldPic.png"))); // NOI18N
        jPanel2.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, -1, 50));

        pwdPanel.setBackground(new java.awt.Color(243, 246, 254));
        pwdPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel9.setText("Current Password");
        pwdPanel.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 160, 50));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel10.setText("New Current Password");
        pwdPanel.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 190, 40));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel6.setText("Confirm Current Password");
        pwdPanel.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 220, 40));

        txtOldPwd.setBackground(new java.awt.Color(173, 192, 234));
        txtOldPwd.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        txtOldPwd.setBorder(null);
        pwdPanel.add(txtOldPwd, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, 250, 30));

        jLabel31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/tg_image_915734271.png"))); // NOI18N
        pwdPanel.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, 290, 50));

        txtNewPwd.setBackground(new java.awt.Color(173, 192, 234));
        txtNewPwd.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        txtNewPwd.setBorder(null);
        pwdPanel.add(txtNewPwd, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 60, 250, 30));

        jLabel32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/tg_image_915734271.png"))); // NOI18N
        pwdPanel.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 50, 290, 50));

        txtCnfrmPwd.setBackground(new java.awt.Color(173, 192, 234));
        txtCnfrmPwd.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        txtCnfrmPwd.setBorder(null);
        pwdPanel.add(txtCnfrmPwd, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 120, 250, 30));

        jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/tg_image_915734271.png"))); // NOI18N
        pwdPanel.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 110, 290, 50));

        jPanel2.add(pwdPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 250, 510, 170));

        resumePanel.setBackground(new java.awt.Color(243, 246, 254));
        resumePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnBrowser.setBackground(new java.awt.Color(173, 193, 234));
        btnBrowser.setText("Browser File");
        btnBrowser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBrowserActionPerformed(evt);
            }
        });
        resumePanel.add(btnBrowser, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 30, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel5.setText("Upload Resume");
        resumePanel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 160, 40));

        txtFilePath.setBackground(new java.awt.Color(173, 193, 234));
        txtFilePath.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        txtFilePath.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        resumePanel.add(txtFilePath, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 370, 30));

        jPanel2.add(resumePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 470, 550, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel2.setText("Want to change Resume");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 430, 210, 40));

        chkResume.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkResumeActionPerformed(evt);
            }
        });
        jPanel2.add(chkResume, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 440, -1, -1));

        btnLogin1.setBackground(new java.awt.Color(173, 193, 234));
        btnLogin1.setText("Discard Changes");
        btnLogin1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogin1ActionPerformed(evt);
            }
        });
        jPanel2.add(btnLogin1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 560, 190, 40));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 890, 620));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 894, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 614, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 614, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBrowserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBrowserActionPerformed
        JFileChooser fileChooser=new JFileChooser();
        fileChooser.setDialogTitle("Select your Resume");
        fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        int result=fileChooser.showOpenDialog(null);
        if(result==JFileChooser.APPROVE_OPTION){
            file=fileChooser.getSelectedFile();
            txtFilePath.setText(file.getAbsolutePath());
        }
    }//GEN-LAST:event_btnBrowserActionPerformed

    private void btnSaveChangesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveChangesActionPerformed
        boolean pwdChanged=false;
        boolean resumeUpdate=false;
        if(chkPassword.isSelected()){
            if(validateInputs()==false){
                JOptionPane.showMessageDialog(null,"Please Fill All The Fields","Empty Fields",JOptionPane.ERROR_MESSAGE);
                return;
            }
            if(matchPassword()==false){
                JOptionPane.showMessageDialog(null,"Password And Confirm Password Do Not Match!","Password Mismatching",JOptionPane.ERROR_MESSAGE);
                return;
            }
            try{
                boolean resp=UserDAO.CheckOldPassword(CurrentUser.getId(),oldPwd);
                if(resp==true){
                    UserDAO.updateParticipantPassword(CurrentUser.getId(),NewPwd);
                    pwdChanged=true;
                }
                else{
                    JOptionPane.showMessageDialog(null,"Your Old Password is Wrong!","Password Mismatching",JOptionPane.ERROR_MESSAGE);
                    return;
                }
            }
            catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"DB Error In Edit Participant Password","Error",JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
          }
        }
        if(chkResume.isSelected()){
            if(txtFilePath.getText().trim()!=""){
                try{
                    ParticipantDAO.updateResume(CurrentUser.getId(),file);
                    resumeUpdate=true;
                }
                catch(SQLException ex){
                      JOptionPane.showMessageDialog(null,"DB Error In Edit Participant Resume","Error",JOptionPane.ERROR_MESSAGE);
                      ex.printStackTrace();
                }
                catch(FileNotFoundException ex){
                    JOptionPane.showMessageDialog(null,"DB Error In Edit Participant Resume","Error",JOptionPane.ERROR_MESSAGE);
                    ex.printStackTrace();
                }
            }
            
        }
        if(pwdChanged && resumeUpdate){
            JOptionPane.showMessageDialog(null,"Password And Resume Has Been Upadted Successfully!","Success!",JOptionPane.INFORMATION_MESSAGE);
        }
        else if(resumeUpdate){
            JOptionPane.showMessageDialog(null,"Resume Has Been Upadated Successfully!","Success!",JOptionPane.INFORMATION_MESSAGE);
        }
        else if(pwdChanged){
            JOptionPane.showMessageDialog(null,"Password Has Been Upadated Successfully!","Success!",JOptionPane.INFORMATION_MESSAGE);
        }
        else{
            JOptionPane.showMessageDialog(null,"No Changes Done!","Error!",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnSaveChangesActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        new ParticipantsOptionsFrame().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void chkPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkPasswordActionPerformed
        if(chkPassword.isSelected()){
            pwdPanel.setVisible(true);
        }
        else{
            pwdPanel.setVisible(false);
        }
    }//GEN-LAST:event_chkPasswordActionPerformed

    private void chkResumeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkResumeActionPerformed
        if(chkResume.isSelected()){
            resumePanel.setVisible(true);
        }
        else{
            resumePanel.setVisible(false);
        }
    }//GEN-LAST:event_chkResumeActionPerformed

    private void btnLogin1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogin1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLogin1ActionPerformed

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
            java.util.logging.Logger.getLogger(PtEditProfileFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PtEditProfileFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PtEditProfileFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PtEditProfileFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PtEditProfileFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnBrowser;
    private javax.swing.JButton btnLogin1;
    private javax.swing.JButton btnSaveChanges;
    private javax.swing.JCheckBox chkPassword;
    private javax.swing.JCheckBox chkResume;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblPid;
    private javax.swing.JPanel pwdPanel;
    private javax.swing.JPanel resumePanel;
    private javax.swing.JPasswordField txtCnfrmPwd;
    private javax.swing.JTextField txtFilePath;
    private javax.swing.JTextField txtMail;
    private javax.swing.JTextField txtName;
    private javax.swing.JPasswordField txtNewPwd;
    private javax.swing.JPasswordField txtOldPwd;
    private javax.swing.JTextField txtPhone;
    // End of variables declaration//GEN-END:variables
}
