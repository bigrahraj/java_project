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
import trandpl.pojo.ParticipantPojo;

public class SignUpFrame extends javax.swing.JFrame {
    
    
    private File file;
    private String pwd,cnfpwd;
    
    public SignUpFrame() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("SignUp Frame");
        loadId();
    }
    private void loadId(){
        try{
            int pId=ParticipantDAO.getNewParticipantId();
            lblPid.setText("P-"+pId);
        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"DB Error","Error In Generating Pid",JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }
    }
    private boolean validateInput(){
        char []chpwd=txtPass.getPassword();
        char []chcnfpwd=txtCnfPass.getPassword();
        if(txtName.getText().trim().isEmpty()||txtMail.getText().trim().isEmpty()||txtPhone.getText().trim().isEmpty()||chpwd.length==0||chcnfpwd.length==0||txtSkill1.getText().trim().isEmpty()||txtSkill2.getText().trim().isEmpty()||txtSkill3.getText().trim().isEmpty()||txtSkill4.getText().trim().isEmpty()||txtQualification.getText().trim().isEmpty()||txtFilePath.getText().trim().isEmpty())
           return false;
        return true;
    }
    private void clearAll(){
        txtName.setText("");
        txtPhone.setText("");
        txtMail.setText("");
        txtSkill1.setText("");
        txtSkill2.setText("");
        txtSkill3.setText("");
        txtSkill4.setText("");
        txtQualification.setText("");
        txtPass.setText("");
        txtCnfPass.setText("");
        txtFilePath.setText("");
    }
    private boolean matchPassword(){
        pwd=String.valueOf(txtPass.getPassword());
        cnfpwd=String.valueOf(txtCnfPass.getPassword());
        if(pwd.equals(cnfpwd))
           return true;
        return false;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField6 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        lblPid = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        txtPhone = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtMail = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        btnBrowser = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtQualification = new javax.swing.JTextField();
        txtSkill1 = new javax.swing.JTextField();
        txtSkill4 = new javax.swing.JTextField();
        txtSkill2 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtSkill3 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtFilePath = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        txtPass = new javax.swing.JPasswordField();
        jLabel20 = new javax.swing.JLabel();
        txtCnfPass = new javax.swing.JPasswordField();
        jLabel24 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        btnCreateAccount = new javax.swing.JButton();
        btnLogin = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();

        jTextField6.setBackground(new java.awt.Color(173, 193, 234));
        jTextField6.setBorder(null);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(243, 246, 254));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/transparent logo.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 181, 44));

        jPanel2.setBackground(new java.awt.Color(243, 246, 254));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/transparent logo.png"))); // NOI18N
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 181, 44));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/World-Map.png"))); // NOI18N
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 830, 127));

        lblPid.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        lblPid.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel2.add(lblPid, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 180, 110, 40));

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel17.setText("Participant id :-");
        jLabel17.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 370, 44));

        jLabel18.setText("Name: -");
        jPanel2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 110, 30));

        jLabel21.setText("Confirm PassWord: -");
        jPanel2.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 460, 160, 40));

        txtPhone.setBackground(new java.awt.Color(173, 193, 234));
        txtPhone.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        txtPhone.setBorder(null);
        jPanel2.add(txtPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 300, 30));

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/TextFieldPic.png"))); // NOI18N
        jPanel2.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, -1, 50));

        jLabel8.setText("Email: -");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 220, 110, 40));

        txtMail.setBackground(new java.awt.Color(173, 193, 234));
        txtMail.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        txtMail.setBorder(null);
        jPanel2.add(txtMail, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 260, 300, 30));

        jLabel5.setText("Upload Resume");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 290, 160, 40));

        btnBrowser.setBackground(new java.awt.Color(173, 193, 234));
        btnBrowser.setText("Browser File");
        btnBrowser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBrowserActionPerformed(evt);
            }
        });
        jPanel2.add(btnBrowser, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 320, -1, -1));

        jLabel7.setText("Qualification: -");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, 140, 40));

        txtQualification.setBackground(new java.awt.Color(173, 193, 234));
        txtQualification.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        txtQualification.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(txtQualification, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 430, 760, 30));

        txtSkill1.setBackground(new java.awt.Color(173, 193, 234));
        txtSkill1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        txtSkill1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(txtSkill1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, 170, 30));

        txtSkill4.setBackground(new java.awt.Color(173, 193, 234));
        txtSkill4.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        txtSkill4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(txtSkill4, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 380, 180, 30));

        txtSkill2.setBackground(new java.awt.Color(173, 193, 234));
        txtSkill2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        txtSkill2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(txtSkill2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 380, 180, 30));

        jLabel9.setText("Skills: -");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 80, 40));

        txtSkill3.setBackground(new java.awt.Color(173, 193, 234));
        txtSkill3.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        txtSkill3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(txtSkill3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 380, 200, 30));

        jLabel2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 800, 110));

        txtFilePath.setBackground(new java.awt.Color(173, 193, 234));
        txtFilePath.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        txtFilePath.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(txtFilePath, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 320, 190, 30));

        jLabel25.setText("Mobile No: -");
        jPanel2.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 110, 40));

        jLabel26.setText("PassWord: -");
        jPanel2.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 460, 110, 40));

        txtPass.setBackground(new java.awt.Color(173, 194, 243));
        txtPass.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        txtPass.setBorder(null);
        jPanel2.add(txtPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 500, 300, 30));

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/TextFieldPic.png"))); // NOI18N
        jPanel2.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 490, -1, 50));

        txtCnfPass.setBackground(new java.awt.Color(173, 194, 243));
        txtCnfPass.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        txtCnfPass.setBorder(null);
        jPanel2.add(txtCnfPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 500, 300, 30));

        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/TextFieldPic.png"))); // NOI18N
        jPanel2.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 490, -1, 50));

        jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/TextFieldPic.png"))); // NOI18N
        jPanel2.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 250, -1, 50));

        btnCreateAccount.setBackground(new java.awt.Color(173, 193, 234));
        btnCreateAccount.setText("Creat Account");
        btnCreateAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateAccountActionPerformed(evt);
            }
        });
        jPanel2.add(btnCreateAccount, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 560, 190, 40));

        btnLogin.setBackground(new java.awt.Color(173, 193, 234));
        btnLogin.setText("Login Page");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        jPanel2.add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 560, 190, 40));

        jLabel3.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 540, 810, 10));

        jLabel4.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, 110, 40));

        txtName.setBackground(new java.awt.Color(173, 193, 234));
        txtName.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        txtName.setBorder(null);
        jPanel2.add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 300, 30));

        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/TextFieldPic.png"))); // NOI18N
        jPanel2.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, -1, 50));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 680));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 610));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBrowserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBrowserActionPerformed
        // TODO add your handling code here:
        JFileChooser fileChooser=new JFileChooser();
        fileChooser.setDialogTitle("Select your Resume");
        fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        int result=fileChooser.showOpenDialog(null);
        if(result==JFileChooser.APPROVE_OPTION){
            file=fileChooser.getSelectedFile();
            txtFilePath.setText(file.getAbsolutePath());
        }
    }//GEN-LAST:event_btnBrowserActionPerformed

    private void btnCreateAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateAccountActionPerformed
        // TODO add your handling code here:
        if(validateInput()==false){
            JOptionPane.showMessageDialog(null,"Please Fill All The Fields","Empty SignUp",JOptionPane.WARNING_MESSAGE);
             return;
            }
        if(matchPassword()==false){
            JOptionPane.showMessageDialog(null,"PassWord do not matched!","Error",JOptionPane.WARNING_MESSAGE);
            return;
        }
        try{
            ParticipantPojo pt=new ParticipantPojo();
            pt.setId(lblPid.getText().trim());
            pt.setUserId(txtMail.getText().trim());
            pt.setName(txtName.getText().trim());
            pt.setPhone(txtPhone.getText().trim());
            pt.setResume(file);
            pt.setSkill(txtSkill1.getText().trim()+","+txtSkill2.getText().trim()+","+txtSkill3.getText().trim()+","+txtSkill4.getText().trim());
            pt.setQualifications(txtQualification.getText().trim());
            pt.setPassword(pwd);
            pt.setType("pt");
            int result=ParticipantDAO.addNewParticipant(pt);
            if(result==1){
               JOptionPane.showMessageDialog(null,"Participant added successfuly!","Success",JOptionPane.INFORMATION_MESSAGE);
               clearAll();
               loadId();
               return; 
            }
            else if(result==-1){
                JOptionPane.showMessageDialog(null,"Email_Id Already Taken!","Registration Failed",JOptionPane.ERROR_MESSAGE);
                
            }
            else{
                JOptionPane.showMessageDialog(null,"Participant Cann't added successfuly!","Error",JOptionPane.INFORMATION_MESSAGE);
                
            }
                
       }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"DB Error","Error In DB Communication",JOptionPane.WARNING_MESSAGE);
            ex.printStackTrace();
        }
        catch(FileNotFoundException ex){
            JOptionPane.showMessageDialog(null,"File Error","Error In Openning File",JOptionPane.WARNING_MESSAGE);
            ex.printStackTrace();
        }
            
    }//GEN-LAST:event_btnCreateAccountActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        // TODO add your handling code here:
        new LoginFrame().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnLoginActionPerformed

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
            java.util.logging.Logger.getLogger(SignUpFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignUpFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignUpFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignUpFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignUpFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBrowser;
    private javax.swing.JButton btnCreateAccount;
    private javax.swing.JButton btnLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JLabel lblPid;
    private javax.swing.JPasswordField txtCnfPass;
    private javax.swing.JTextField txtFilePath;
    private javax.swing.JTextField txtMail;
    private javax.swing.JTextField txtName;
    private javax.swing.JPasswordField txtPass;
    private javax.swing.JTextField txtPhone;
    private javax.swing.JTextField txtQualification;
    private javax.swing.JTextField txtSkill1;
    private javax.swing.JTextField txtSkill2;
    private javax.swing.JTextField txtSkill3;
    private javax.swing.JTextField txtSkill4;
    // End of variables declaration//GEN-END:variables
}
