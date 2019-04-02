/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.DoctorRole;

import Business.Enterprise.Enterprise;
import Business.Enterprise.HelpCenterEnterprise;
import Business.Homeless.HomelessIndividual;
import Business.Organization.DoctorOrganization;
import Business.Organization.NurseOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkRequest.LabTestWorkRequest;
import Business.WorkRequest.WorkRequest;
import java.awt.CardLayout;
import java.util.Date;
import java.util.Iterator;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Varada
 */
public class RequestTestJPanel extends javax.swing.JPanel {

    /**
     * Creates new form RequestTestJPanel
     */
    DoctorWorkAreaHomeJPanel dwahjp;
    HelpCenterEnterprise enterprise;
    JPanel jPanel2;
    UserAccount account;
    HomelessIndividual homeless;
    LabTestWorkRequest request;
    public RequestTestJPanel(DoctorWorkAreaHomeJPanel dwahjp, JPanel jPanel2, HelpCenterEnterprise enterprise, UserAccount account, WorkRequest request) {
        initComponents();
        this.dwahjp = dwahjp;
        this.enterprise = enterprise;
        this.jPanel2 = jPanel2;
        this.account = account;
        this.homeless = request.getHomeless();
        this.request = new LabTestWorkRequest();    
        setFields();
    }
    
    private void setFields(){
        patientIdTxtField.setText(String.valueOf(homeless.getId()));
        patientNameTxtField.setText(homeless.getFirstName()+" "+homeless.getLastName());
        patientIdTxtField.setEnabled(false);
        patientNameTxtField.setEnabled(false);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        patientNameTxtField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        patientIdTxtField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        testDescriptionTxtArea = new javax.swing.JTextArea();
        requestBtn = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        testTypeComboBox = new javax.swing.JComboBox();
        backBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(120, 168, 252));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Request Test");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(175, 16, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Patient Name:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(87, 68, -1, -1));

        patientNameTxtField.setEditable(false);
        add(patientNameTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(241, 67, 166, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Patient ID:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(87, 112, -1, -1));

        patientIdTxtField.setEditable(false);
        add(patientIdTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(241, 111, 166, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Test Description:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(87, 199, -1, -1));

        testDescriptionTxtArea.setColumns(20);
        testDescriptionTxtArea.setRows(5);
        jScrollPane1.setViewportView(testDescriptionTxtArea);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(241, 199, -1, -1));

        requestBtn.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        requestBtn.setText("Request");
        requestBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestBtnActionPerformed(evt);
            }
        });
        add(requestBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(314, 313, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Test Type:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(87, 156, -1, -1));

        testTypeComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Blood Test", "Urine Test" }));
        add(testTypeComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(241, 155, 166, -1));

        backBtn.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        backBtn.setText("Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });
        add(backBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(121, 313, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void requestBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requestBtnActionPerformed
        // TODO add your handling code here:
         WorkRequest.WorkStatusType type = WorkRequest.WorkStatusType.TestRequested;
        
        request.setSender(account);
        request.setMessage(testDescriptionTxtArea.getText());
        request.setTestType(testTypeComboBox.getSelectedItem().toString());
        request.setRequestDate(new Date());
        request.setTestStatus(type.getValue());
        request.setHomeless(homeless);
        
        Organization org = null;
        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()){
            if (organization instanceof NurseOrganization){
                org = organization;
                org.getWorkQueue().getWorkRequestList().add(request);
                account.getWorkQueue().getWorkRequestList().add(request);
                break;
            }
        }
        
        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()){
            if (organization instanceof DoctorOrganization){
                org = organization;
                for(Iterator<WorkRequest> iterator = org.getWorkQueue().getWorkRequestList().iterator(); iterator.hasNext();){
                    WorkRequest req = iterator.next();
                    if(req.getHomeless() == homeless){
                        iterator.remove();
                    }
                }
                break;
            }
        }
        JOptionPane.showMessageDialog(null, "Test requested");
    }//GEN-LAST:event_requestBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        jPanel2.remove(this);
        CardLayout layout = (CardLayout)jPanel2.getLayout();
        layout.previous(jPanel2);
        dwahjp.populateAccountRequests();
        dwahjp.populateWorkRequests();
    }//GEN-LAST:event_backBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField patientIdTxtField;
    private javax.swing.JTextField patientNameTxtField;
    private javax.swing.JButton requestBtn;
    private javax.swing.JTextArea testDescriptionTxtArea;
    private javax.swing.JComboBox testTypeComboBox;
    // End of variables declaration//GEN-END:variables
}
