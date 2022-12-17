/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trandpl.gui;

import java.sql.SQLException;
import javax.swing.JOptionPane;
import trandpl.dao.UserDAO;
import trandpl.pojo.CurrentUser;
import trandpl.pojo.UserPojo;


public class LoginFrame extends javax.swing.JFrame {

   private String userId;
   private String password;
   
    public LoginFrame() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Login Frame");
        
    }
    private boolean validateInputs(){
        userId=txtMail.getText().trim();
        char []pwd=txtPassword.getPassword();
        if(userId.isEmpty() || pwd.length==0)
            return false;
        password=String.valueOf(pwd);
            return true;
    }
    private String validateUser(){
        if(jrbAdmin.isSelected())
            return "Admin";
        else if(jrbHr.isSelected())
            return "Hr";
        else if(jrbUser.isSelected())
            return "pt";
        else
            return null;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtMail = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jrbAdmin = new javax.swing.JRadioButton();
        jrbUser = new javax.swing.JRadioButton();
        jrbHr = new javax.swing.JRadioButton();
        btnLogin = new javax.swing.JButton();
        btnSignUp = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(243, 246, 254));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 51, 51));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/homePage.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 80, 450, 360));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/transparent logo.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 222, 63));

        jLabel3.setFont(new java.awt.Font("Lucida Fax", 1, 16)); // NOI18N
        jLabel3.setText("Email or User Id :");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 286, 50));

        txtMail.setBackground(new java.awt.Color(173, 192, 234));
        txtMail.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        txtMail.setBorder(null);
        jPanel1.add(txtMail, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, 390, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/tg_image_1147698449.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 450, 50));

        jLabel5.setFont(new java.awt.Font("Lucida Fax", 1, 16)); // NOI18N
        jLabel5.setText("Password :");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, 240, 40));

        txtPassword.setBackground(new java.awt.Color(173, 192, 234));
        txtPassword.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        txtPassword.setBorder(null);
        jPanel1.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, 350, 20));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/tg_image_1147698449.png"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, -1, 60));

        jPanel2.setBackground(new java.awt.Color(243, 246, 254));
        jPanel2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 1, 0, new java.awt.Color(0, 0, 0)));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel7.setText("Select User Type :-");

        jrbAdmin.setBackground(new java.awt.Color(243, 246, 254));
        buttonGroup1.add(jrbAdmin);
        jrbAdmin.setFont(new java.awt.Font("Dubai", 0, 16)); // NOI18N
        jrbAdmin.setText("Admin");

        jrbUser.setBackground(new java.awt.Color(243, 246, 254));
        buttonGroup1.add(jrbUser);
        jrbUser.setFont(new java.awt.Font("Dubai", 0, 16)); // NOI18N
        jrbUser.setText("User");

        jrbHr.setBackground(new java.awt.Color(243, 246, 254));
        buttonGroup1.add(jrbHr);
        jrbHr.setFont(new java.awt.Font("Dubai", 0, 16)); // NOI18N
        jrbHr.setText("Company HR");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jrbAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jrbHr, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jrbUser, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jrbAdmin)
                    .addComponent(jrbHr, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jrbUser))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, 390, 100));

        btnLogin.setBackground(new java.awt.Color(173, 192, 234));
        btnLogin.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        jPanel1.add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 460, 140, 50));

        btnSignUp.setBackground(new java.awt.Color(173, 192, 234));
        btnSignUp.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnSignUp.setText("Sign Up");
        btnSignUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignUpActionPerformed(evt);
            }
        });
        jPanel1.add(btnSignUp, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 460, 140, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 548, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        if(validateInputs()==false){
            JOptionPane.showMessageDialog(null,"Please fill all the fields","Error!",JOptionPane.ERROR_MESSAGE);
            return;
        }
        String type=validateUser();
        if(type==null){
            JOptionPane.showMessageDialog(null,"Please select a user type ","Error!",JOptionPane.ERROR_MESSAGE);
            return;
        }
        UserPojo user=new UserPojo();
        user.setUserid(userId.toUpperCase());
        user.setPassword(password);
        user.setType(type);
        try
        {
            boolean result=UserDAO.validateUser(user);
            if(result){
                   if(CurrentUser.getType().equals("Admin")){
                       JOptionPane.showMessageDialog(null,"Welcome Admin "+CurrentUser.getName(),"Success",JOptionPane.INFORMATION_MESSAGE);
                       new AdminOptionsFrame().setVisible(result);
                       this.dispose();
                   }
                   else if(CurrentUser.getType().equals("Hr")){
                       JOptionPane.showMessageDialog(null,"Welcome Hr "+CurrentUser.getName(),"Success",JOptionPane.INFORMATION_MESSAGE);
                       new HrOptionsFrame().setVisible(result);
                       this.dispose();
                   }
                   else{
                       JOptionPane.showMessageDialog(null,"Welcome Strudent "+CurrentUser.getName(),"Success",JOptionPane.INFORMATION_MESSAGE);
                       new ParticipantsOptionsFrame().setVisible(result);
                       this.dispose();
                   } 
                       
            }
            else{
                JOptionPane.showMessageDialog(null,"Invalid Userid or password or UserType","Error!",JOptionPane.ERROR_MESSAGE);
                return;
            }
        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"DB Error","Error!",JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }
    }//GEN-LAST:event_btnLoginActionPerformed

    private void btnSignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignUpActionPerformed
        new SignUpFrame().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnSignUpActionPerformed

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
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnSignUp;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jrbAdmin;
    private javax.swing.JRadioButton jrbHr;
    private javax.swing.JRadioButton jrbUser;
    private javax.swing.JTextField txtMail;
    private javax.swing.JPasswordField txtPassword;
    // End of variables declaration//GEN-END:variables
}
