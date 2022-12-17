/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trandpl.gui;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import trandpl.dao.QuestionDAO;
import trandpl.dao.ResultDAO;
import trandpl.pojo.CurrentUser;
import trandpl.pojo.QuestionPojo;
import trandpl.pojo.ResultsPojo;

/**
 *
 * @author ashut
 */
public class PtTakeQuizFrame extends javax.swing.JFrame {

    private int counter=0;
    private String jobId;
    private String jobTitle;
    private List<QuestionPojo> questionList;
    private List<Integer> answerList;
    private QuestionPojo currentQuestion;
    public PtTakeQuizFrame() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Take Quiz Frame");
    }
    public PtTakeQuizFrame(String jobId,String jobTitle){
        this();
        this.jobId=jobId;
        this.jobTitle=jobTitle;
        lblTitle.setText("Paper For "+this.jobTitle);
        lblQueNo.setText(""+(counter+1));
        this.setVisible(true);
        loadQuestionPaper();
        
    }
    private void loadQuestionPaper() {
        try{
            questionList=QuestionDAO.getQuestionPaperByJobId(jobId);
            answerList=new ArrayList<>(questionList.size());
            for(int i=0;i<questionList.size();i++){
                answerList.add(i,0);
            }
            showNextQuestionInFrame();
        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"DB Error In Quiz","Error",JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }
    }
    private void showNextQuestionInFrame(){
        currentQuestion=questionList.get(counter);
        txtQuestion.setText(currentQuestion.getQuestion());
        jrbOption1.setText(currentQuestion.getOption1());
        jrbOption2.setText(currentQuestion.getOption2());
        jrbOption3.setText(currentQuestion.getOption3());
        jrbOption4.setText(currentQuestion.getOption4());
        int answer=answerList.get(counter);
        switch(answer){
            case 1:
                  jrbOption1.setSelected(true);
                  break;
            case 2:
                  jrbOption2.setSelected(true);
                  break;
            case 3:
                  jrbOption3.setSelected(true);
                  break;
            case 4:
                  jrbOption4.setSelected(true);
                  break;
            default:
                buttonGroup1.clearSelection();
        }
    }
    private int validateChooseOption(){
        if(jrbOption1.isSelected())
            return 1;
        else if(jrbOption2.isSelected())
            return 2;
        else if(jrbOption3.isSelected())
            return 3;
        else if(jrbOption4.isSelected())
            return 4;
        else
            return 0;
                    
    }
    private double getPercentage(){
        int marksObtained=0;
        for(int i=0;i<questionList.size();i++){
            QuestionPojo question=questionList.get(i);
            if(question.getCorrectOption()==answerList.get(i)){
                ++marksObtained;
            }
        }
        double per=((double)marksObtained/questionList.size())*100;
        return per;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnSubmit = new javax.swing.JButton();
        btnPrevious = new javax.swing.JButton();
        btnDiscardPaper = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtQuestion = new javax.swing.JTextArea();
        lblQue = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        btnNext = new javax.swing.JButton();
        lblQueNo = new javax.swing.JLabel();
        lblTitle = new javax.swing.JLabel();
        jrbOption1 = new javax.swing.JRadioButton();
        jLabel9 = new javax.swing.JLabel();
        jrbOption2 = new javax.swing.JRadioButton();
        jLabel13 = new javax.swing.JLabel();
        jrbOption3 = new javax.swing.JRadioButton();
        jLabel19 = new javax.swing.JLabel();
        jrbOption4 = new javax.swing.JRadioButton();
        jLabel14 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(243, 246, 254));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/transparent logo.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 192, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/World-Map.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 930, 144));

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

        btnDiscardPaper.setBackground(new java.awt.Color(173, 192, 234));
        btnDiscardPaper.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnDiscardPaper.setText("Discard Paper");
        btnDiscardPaper.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDiscardPaperActionPerformed(evt);
            }
        });
        jPanel1.add(btnDiscardPaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 600, 170, 30));

        txtQuestion.setBackground(new java.awt.Color(173, 192, 234));
        txtQuestion.setColumns(20);
        txtQuestion.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        txtQuestion.setRows(5);
        jScrollPane1.setViewportView(txtQuestion);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 240, 840, -1));

        lblQue.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        lblQue.setText("Que.-");
        jPanel1.add(lblQue, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, -1, 40));

        jLabel6.setFont(new java.awt.Font("Tahoma", 3, 16)); // NOI18N
        jLabel6.setText("Options - 3");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 470, 100, 50));

        jLabel7.setFont(new java.awt.Font("Tahoma", 3, 16)); // NOI18N
        jLabel7.setText("Options - 1");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 400, 100, 50));

        jLabel8.setFont(new java.awt.Font("Tahoma", 3, 16)); // NOI18N
        jLabel8.setText("Option - 2");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 400, 100, 40));

        jLabel12.setFont(new java.awt.Font("Tahoma", 3, 16)); // NOI18N
        jLabel12.setText("Option - 4");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 470, 100, 40));

        jLabel11.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel11.setText("Options -");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, 120, 50));

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
        jPanel1.add(lblQueNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, 40, 40));

        lblTitle.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblTitle.setText("Title");
        jPanel1.add(lblTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 190, 200, 40));

        jrbOption1.setBackground(new java.awt.Color(173, 192, 234));
        jrbOption1.setText("jRadioButton1");
        jrbOption1.setBorder(null);
        jPanel1.add(jrbOption1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 410, -1, 30));
        buttonGroup1.add(jrbOption1);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/phnNoBtnPic.png"))); // NOI18N
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 400, -1, -1));

        jrbOption2.setBackground(new java.awt.Color(173, 192, 234));
        jrbOption2.setText("jRadioButton2");
        jrbOption2.setBorder(null);
        jPanel1.add(jrbOption2, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 410, -1, 30));
        buttonGroup1.add(jrbOption2);

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/phnNoBtnPic.png"))); // NOI18N
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 400, 220, -1));

        jrbOption3.setBackground(new java.awt.Color(173, 192, 234));
        jrbOption3.setText("jRadioButton3");
        jrbOption3.setBorder(null);
        jPanel1.add(jrbOption3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 480, -1, 30));
        buttonGroup1.add(jrbOption3);

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/phnNoBtnPic.png"))); // NOI18N
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 470, 220, -1));

        jrbOption4.setBackground(new java.awt.Color(173, 192, 234));
        jrbOption4.setText("jRadioButton4");
        jrbOption4.setBorder(null);
        jPanel1.add(jrbOption4, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 480, -1, 30));
        buttonGroup1.add(jrbOption4);

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/phnNoBtnPic.png"))); // NOI18N
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 470, 220, -1));

        jLabel4.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, 920, 150));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 663, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        int res=validateChooseOption();
          if(res==0){
              JOptionPane.showMessageDialog(null,"Please select Option","No Option Selected",JOptionPane.WARNING_MESSAGE);
              return;
          }
          answerList.set(counter, res);
          double per=getPercentage();
          ResultsPojo result=new ResultsPojo();
          result.setJobId(jobId);
          result.setpId(CurrentUser.getId());
          if(per<5)
              per=5.0;
          result.setPercentage(per);
          result.setSelectedByHr("No");
          try{
              boolean resp=ResultDAO.setResult(result);
              if(resp==true){
                 JOptionPane.showMessageDialog(null,"You Got "+per+"% marks+\nAnd Result Has Been Sent On Your Mail","Result",JOptionPane.WARNING_MESSAGE);
                 new PtViewAllAppliedjobsFrame().setVisible(true); 
                 this.dispose();
              }
          }
          catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"DB Error In Take Test","Error",JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void btnPreviousActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPreviousActionPerformed
        int res=validateChooseOption();
          if(res==0){
              JOptionPane.showMessageDialog(null,"Please select Option","No Option Selected",JOptionPane.WARNING_MESSAGE);
              return;
          }
          answerList.set(counter, res);
          --counter;
          if(counter==-1){
              counter=questionList.size()-1;
          }
          showNextQuestionInFrame();
          lblQueNo.setText(""+(counter+1));
    }//GEN-LAST:event_btnPreviousActionPerformed

    private void btnDiscardPaperActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDiscardPaperActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_btnDiscardPaperActionPerformed

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
          int res=validateChooseOption();
          if(res==0){
              JOptionPane.showMessageDialog(null,"Please select Option","No Option Selected",JOptionPane.WARNING_MESSAGE);
              return;
          }
          answerList.set(counter, res);
          ++counter;
          if(counter==questionList.size()){
              counter=0;
          }
          showNextQuestionInFrame();
          lblQueNo.setText(""+(counter+1));
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
            java.util.logging.Logger.getLogger(PtTakeQuizFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PtTakeQuizFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PtTakeQuizFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PtTakeQuizFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PtTakeQuizFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDiscardPaper;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnPrevious;
    private javax.swing.JButton btnSubmit;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton jrbOption1;
    private javax.swing.JRadioButton jrbOption2;
    private javax.swing.JRadioButton jrbOption3;
    private javax.swing.JRadioButton jrbOption4;
    private javax.swing.JLabel lblQue;
    private javax.swing.JLabel lblQueNo;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTextArea txtQuestion;
    // End of variables declaration//GEN-END:variables
}
