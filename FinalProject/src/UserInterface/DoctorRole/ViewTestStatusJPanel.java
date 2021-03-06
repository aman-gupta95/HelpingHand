/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.DoctorRole;

import Business.WorkRequest.LabTestWorkRequest;
import Business.WorkRequest.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author amans
 */
public class ViewTestStatusJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewTestStatusJPanel
     */
    JPanel jpanel;
    LabTestWorkRequest request;
    public ViewTestStatusJPanel(JPanel jpanel, WorkRequest request) {
        initComponents();
        this.jpanel = jpanel;
        this.request = (LabTestWorkRequest)request;
        setFields();
    }
    
    private void setFields(){
        patientNameTxtField.setText(request.getHomeless().getFirstName()+ " "+ request.getHomeless().getLastName());
        patientIdTxtField.setText(request.getTestSampleId());
        testTypeTxtField.setText(request.getTestType());
        testReportTxtField.setText(request.getTestResult());
        patientNameTxtField.setEnabled(false);
        patientIdTxtField.setEnabled(false);
        testTypeTxtField.setEnabled(false);
        testReportTxtField.setEnabled(false);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        patientNameTxtField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        patientIdTxtField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        testReportTxtField = new javax.swing.JTextArea();
        testTypeTxtField = new javax.swing.JTextField();
        okBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(120, 168, 252));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Patient Name:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 81, -1, -1));

        patientNameTxtField.setEditable(false);
        add(patientNameTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(326, 80, 166, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Patient ID:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 125, -1, -1));

        patientIdTxtField.setEditable(false);
        add(patientIdTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(326, 124, 166, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Test Type:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 169, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Test Report:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 212, -1, -1));

        testReportTxtField.setEditable(false);
        testReportTxtField.setColumns(20);
        testReportTxtField.setRows(5);
        jScrollPane1.setViewportView(testReportTxtField);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(326, 212, -1, -1));

        testTypeTxtField.setEditable(false);
        add(testTypeTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(326, 168, 166, -1));

        okBtn.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        okBtn.setText("OK");
        okBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okBtnActionPerformed(evt);
            }
        });
        add(okBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(358, 360, -1, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("View Test Status");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(307, 25, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void okBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okBtnActionPerformed
        // TODO add your handling code here:
        jpanel.remove(this);
        CardLayout layout = (CardLayout)jpanel.getLayout();
        layout.previous(jpanel);
    }//GEN-LAST:event_okBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton okBtn;
    private javax.swing.JTextField patientIdTxtField;
    private javax.swing.JTextField patientNameTxtField;
    private javax.swing.JTextArea testReportTxtField;
    private javax.swing.JTextField testTypeTxtField;
    // End of variables declaration//GEN-END:variables
}
