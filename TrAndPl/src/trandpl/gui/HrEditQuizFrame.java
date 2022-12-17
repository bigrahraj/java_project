/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trandpl.gui;

import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;
import trandpl.dao.QuestionDAO;
import trandpl.pojo.QuestionPojo;

/**
 *
 * @author ashut
 */
public class HrEditQuizFrame extends javax.swing.JFrame {

    /**
     * Creates new form HrEditQuizFrame
     */
    private int counter=0;
    private String jobId;
    private List<QuestionPojo> questionList;
    private QuestionPojo currentQuestion;
    
    public HrEditQuizFrame() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Hr Edit Quiz Frame");
    }
    public HrEditQuizFrame(String jobId){
        this();
        this.jobId=jobId;
        lblQueNo.setText(""+(counter+1));
        loadQuestionPaper();
    }
    private void loadQuestionPaper() {
        try{
            questionList=QuestionDAO.getQuestionPaperByJobId(jobId);
            showNextQuestionInFrame();
        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"DB Error In Edditing Quiz","Error",JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }
    }
    private void showNextQuestionInFrame(){
        currentQuestion=questionList.get(counter);
        txtQuestion.setText(currentQuestion.getQuestion());
        txtOption1.setText(currentQuestion.getOption1());
        txtOption2.setText(currentQuestion.getOption2());
        txtOption3.setText(currentQuestion.getOption3());
        txtOption4.setText(currentQuestion.getOption4());
        jcCorrectOption.setSelectedIndex(currentQuestion.getCorrectOption());
        
    }
    private boolean validateInput(){
        if(txtQuestion.getText().trim().isEmpty()||txtOption1.getText().trim().isEmpty()||txtOption2.getText().trim().isEmpty()||txtOption3.getText().trim().isEmpty()||txtOption4.getText().trim().isEmpty()||jcCorrectOption.getSelectedIndex()==0)
           return false;
        return true;
    }
    private void setQuestionInList(){
        currentQuestion.setQuestion(txtQuestion.getText().trim());
        currentQuestion.setOption1(txtOption1.getText().trim());
        currentQuestion.setOption2(txtOption2.getText().trim());
        currentQuestion.setOption3(txtOption3.getText().trim());
        currentQuestion.setOption4(txtOption4.getText().trim());
        currentQuestion.setCorrectOption(jcCorrectOption.getSelectedIndex());
        questionList.set(counter,currentQuestion);
    }

    @SuppressWarnings("unchecked")
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnSubmit = new javax.swing.JButton();
        btnPrevious = new javax.swing.JButton();
        txtOption1 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtOption2 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jcCorrectOption = new javax.swing.JComboBox<>();
        btnDiscardPaper = new javax.swing.JButton();
        txtOption3 = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtQuestion = new javax.swing.JTextArea();
        lblQue = new javax.swing.JLabel();
        txtOption4 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnNext = new javax.swing.JButton();
        lblQueNo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(243, 246, 254));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/transparent logo.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 192, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/World-Map.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 940, 144));

        btnSubmit.setBackground(new java.awt.Color(173, 192, 234));
        btnSubmit.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnSubmit.setText("Submit");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });
        jPanel1.add(btnSubmit, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 600, 130, 30));

        btnPrevious.setBackground(new java.awt.Color(173, 192, 234));
        btnPrevious.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnPrevious.setText("Previous");
        btnPrevious.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPreviousActionPerformed(evt);
            }
        });
        jPanel1.add(btnPrevious, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 600, 134, 30));

        txtOption1.setBackground(new java.awt.Color(173, 193, 234));
        txtOption1.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        txtOption1.setBorder(null);
        jPanel1.add(txtOption1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 350, 180, 30));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/phnNoBtnPic.png"))); // NOI18N
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 340, -1, -1));

        txtOption2.setBackground(new java.awt.Color(173, 192, 234));
        txtOption2.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        txtOption2.setBorder(null);
        jPanel1.add(txtOption2, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 350, 180, 30));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/phnNoBtnPic.png"))); // NOI18N
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 340, 220, -1));

        jcCorrectOption.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose Correct Option", " Option-1", " Option-2", " Option-3", " Option-4", " " }));
        jPanel1.add(jcCorrectOption, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 510, 330, 30));

        btnDiscardPaper.setBackground(new java.awt.Color(173, 192, 234));
        btnDiscardPaper.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnDiscardPaper.setText("Discard Paper");
        btnDiscardPaper.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDiscardPaperActionPerformed(evt);
            }
        });
        jPanel1.add(btnDiscardPaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 600, 170, 30));

        txtOption3.setBackground(new java.awt.Color(173, 192, 234));
        txtOption3.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        txtOption3.setBorder(null);
        jPanel1.add(txtOption3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 420, 180, 30));

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/phnNoBtnPic.png"))); // NOI18N
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 410, 220, -1));

        jLabel10.setBackground(new java.awt.Color(243, 246, 254));
        jLabel10.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 541, 930, 30));

        txtQuestion.setBackground(new java.awt.Color(173, 192, 234));
        txtQuestion.setColumns(20);
        txtQuestion.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        txtQuestion.setRows(5);
        jScrollPane1.setViewportView(txtQuestion);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 200, 840, -1));

        lblQue.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        lblQue.setText("Que.-");
        jPanel1.add(lblQue, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, 40));

        txtOption4.setBackground(new java.awt.Color(173, 192, 234));
        txtOption4.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        txtOption4.setBorder(null);
        jPanel1.add(txtOption4, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 420, 170, 30));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/phnNoBtnPic.png"))); // NOI18N
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 410, 220, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 3, 16)); // NOI18N
        jLabel6.setText("Options - 3");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 410, 100, 50));

        jLabel7.setFont(new java.awt.Font("Tahoma", 3, 16)); // NOI18N
        jLabel7.setText("Options - 1");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, 100, 50));

        jLabel8.setFont(new java.awt.Font("Tahoma", 3, 16)); // NOI18N
        jLabel8.setText("Option - 2");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 340, 100, 40));

        jLabel12.setFont(new java.awt.Font("Tahoma", 3, 16)); // NOI18N
        jLabel12.setText("Option - 4");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 410, 100, 40));

        jLabel4.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 920, 150));

        jLabel11.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel11.setText("Options -");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 120, 50));

        jLabel5.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel5.setText("Correct Option -");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 500, 160, 50));

        btnNext.setBackground(new java.awt.Color(173, 192, 234));
        btnNext.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnNext.setText("Next");
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });
        jPanel1.add(btnNext, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 600, 150, 30));

        lblQueNo.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jPanel1.add(lblQueNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, 40, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 654, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        if(validateInput()){
           setQuestionInList();
           try{
               boolean result=QuestionDAO.editQuestionPaper(questionList);
               if(result){
                   JOptionPane.showMessageDialog(null,"Question Paper Edited Successffully!","Success",JOptionPane.INFORMATION_MESSAGE);
                   new HrChooseJobForEditingQuizFrame();
                   this.dispose();
               }
           }
           catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"DB Error In Edditing Quiz","Error",JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }
        }
        else{
            JOptionPane.showMessageDialog(null,"Plz Fill All the fields","Empty Fields",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void btnPreviousActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPreviousActionPerformed
      if(validateInput()){
           setQuestionInList();
           --counter;
           if(counter==-1)
               counter=questionList.size()-1;
           lblQueNo.setText(" "+(counter+1));
           showNextQuestionInFrame();
        }
        else{
            JOptionPane.showMessageDialog(null,"Plz Fill All the fields","Empty Fields",JOptionPane.WARNING_MESSAGE);
        }
        
    }//GEN-LAST:event_btnPreviousActionPerformed

    private void btnDiscardPaperActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDiscardPaperActionPerformed
      new HrEditQuizFrame().setVisible(true);
      this.dispose();
    }//GEN-LAST:event_btnDiscardPaperActionPerformed

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        if(validateInput()){
           setQuestionInList();
           ++counter;
           if(counter==questionList.size())
               counter=0;
           lblQueNo.setText(" "+(counter+1));
           showNextQuestionInFrame();
        }
        else{
            JOptionPane.showMessageDialog(null,"Plz Fill All the fields","Empty Fields",JOptionPane.WARNING_MESSAGE);
        }
            
    }//GEN-LAST:event_btnNextActionPerformed

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
            java.util.logging.Logger.getLogger(HrEditQuizFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HrEditQuizFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HrEditQuizFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HrEditQuizFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HrEditQuizFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDiscardPaper;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnPrevious;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> jcCorrectOption;
    private javax.swing.JLabel lblQue;
    private javax.swing.JLabel lblQueNo;
    private javax.swing.JTextField txtOption1;
    private javax.swing.JTextField txtOption2;
    private javax.swing.JTextField txtOption3;
    private javax.swing.JTextField txtOption4;
    private javax.swing.JTextArea txtQuestion;
    // End of variables declaration//GEN-END:variables

    
}
