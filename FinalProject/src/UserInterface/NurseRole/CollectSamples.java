/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.NurseRole;

import Business.Drug.Drug;
import Business.Enterprise.HelpCenterEnterprise;
import Business.Homeless.HomelessIndividual;
import Business.Organization.Organization;
import Business.Organization.RelationManagerOrganization;
import Business.UserAccount.UserAccount;
import Business.WorkRequest.LabTestWorkRequest;
import Business.WorkRequest.WorkRequest;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Yash Lekhwani
 */
public class CollectSamples extends javax.swing.JPanel {
     JPanel jPanel2;
     HelpCenterEnterprise enterprise;
     LabTestWorkRequest labRequest;
     HomelessIndividual homeless;
     UserAccount account;
     DateFormat df = new SimpleDateFormat("MM/dd/yyyy");
    /**
     * Creates new form CollectSamples
     */
   

    CollectSamples(JPanel jPanel2, HelpCenterEnterprise enterprise, WorkRequest request, UserAccount account) {
        initComponents();
        this.jPanel2 = jPanel2;
        this.enterprise = enterprise;
        this.account = account;
        if(request instanceof LabTestWorkRequest){
                this.labRequest = (LabTestWorkRequest)request; 
                this.homeless = labRequest.getHomeless();
                WorkRequest.WorkStatusType type = WorkRequest.WorkStatusType.Accepted;
                this.labRequest.setTestStatus(type.getValue());
            }
        setFields();
        populateRequestsTable();
    }
    
    private void setFields(){
        patientIdTxtField.setText(String.valueOf(homeless.getId()));
        patientNameTxtField.setText(homeless.getFirstName()+" "+homeless.getLastName());
        testTypeTxtField.setText(labRequest.getTestType());
        patientIdTxtField.setEnabled(false);
        patientNameTxtField.setEnabled(false);
        testTypeTxtField.setEnabled(false);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        labTestRequestsTbl = new javax.swing.JTable();
        requestTestBtn = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        patientIdTxtField = new javax.swing.JTextField();
        patientNameTxtField = new javax.swing.JTextField();
        testTypeTxtField = new javax.swing.JTextField();
        sampleIdTxtField = new javax.swing.JTextField();

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Enterprise Name:");

        setBackground(new java.awt.Color(120, 168, 252));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labTestRequestsTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Sample ID", "Patient ID", "Patient Name", "Status"
            }
        ));
        jScrollPane2.setViewportView(labTestRequestsTbl);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 325, 520, 99));

        requestTestBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        requestTestBtn.setText("Request Test");
        requestTestBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestTestBtnActionPerformed(evt);
            }
        });
        add(requestTestBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(411, 277, 161, 32));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Collect Samples");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(262, 26, -1, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Patient Id:");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(163, 97, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Patient Name:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Test Type:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(163, 183, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Sample Id:");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(162, 225, -1, -1));

        patientIdTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patientIdTxtFieldActionPerformed(evt);
            }
        });
        add(patientIdTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(269, 98, 192, -1));
        add(patientNameTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(269, 141, 192, -1));
        add(testTypeTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(269, 183, 192, -1));
        add(sampleIdTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(269, 226, 192, -1));
    }// </editor-fold>//GEN-END:initComponents
    private void populateRequestsTable(){
        DefaultTableModel model = (DefaultTableModel)labTestRequestsTbl.getModel();
        model.setRowCount(0);
        Object []row = new Object[4];
        
        for(WorkRequest request: account.getWorkQueue().getWorkRequestList()){
            LabTestWorkRequest labReq = (LabTestWorkRequest)request;
            row[0] = labReq.getTestSampleId();
            row[1] = labReq;
            row[2] = labReq.getHomeless().getFirstName()+ " "+ labReq.getHomeless().getLastName();
            row[3] = labReq.getTestStatus();
            model.addRow(row);
        }
    }
    private void requestTestBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requestTestBtnActionPerformed
        // TODO add your handling code here:
        String sampleId = sampleIdTxtField.getText();
        labRequest.setTestSampleId(sampleId);
        labRequest.setTestStatus(WorkRequest.WorkStatusType.Pending.getValue());
        labRequest.setEnterprise(enterprise);
        try{labRequest.setRequestDate(df.parse(String.valueOf(new Date())));}
        catch(Exception e){
            System.out.println(e);
        }
        account.getWorkQueue().getWorkRequestList().add(labRequest);
        for( Organization org: enterprise.getOrganizationDirectory().getOrganizationList()){
            if(org instanceof RelationManagerOrganization){
                org.getWorkQueue().getWorkRequestList().add(labRequest);
                break;
            }
        }
        populateRequestsTable();
    }//GEN-LAST:event_requestTestBtnActionPerformed
    
    private void patientIdTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patientIdTxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_patientIdTxtFieldActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable labTestRequestsTbl;
    private javax.swing.JTextField patientIdTxtField;
    private javax.swing.JTextField patientNameTxtField;
    private javax.swing.JButton requestTestBtn;
    private javax.swing.JTextField sampleIdTxtField;
    private javax.swing.JTextField testTypeTxtField;
    // End of variables declaration//GEN-END:variables
}
