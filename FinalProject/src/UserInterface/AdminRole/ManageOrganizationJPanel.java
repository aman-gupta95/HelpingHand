/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.AdminRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;
import Business.Organization.Organization.OrganizationType;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Varada
 */
public class ManageOrganizationJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageOrganizationJPanel
     */
    JPanel jpanel;
    Enterprise enterprise;
    public ManageOrganizationJPanel(JPanel jpanel, Enterprise enterprise) {
        initComponents();
        this.jpanel = jpanel;
        this.enterprise = enterprise;
        populateOrganizationTable();
        populateCombo();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane = new javax.swing.JScrollPane();
        organizationTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        organizationTypeComboBox = new javax.swing.JComboBox();
        addOrganizationBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(120, 168, 252));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        organizationTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Organization ID", "Name"
            }
        ));
        organizationTable.setEnabled(false);
        jScrollPane.setViewportView(organizationTable);

        add(jScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(119, 45, 368, 98));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Organization Type:");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(119, 198, -1, -1));

        organizationTypeComboBox.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        organizationTypeComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        organizationTypeComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                organizationTypeComboBoxActionPerformed(evt);
            }
        });
        add(organizationTypeComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(304, 195, -1, -1));

        addOrganizationBtn.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        addOrganizationBtn.setText("Add");
        addOrganizationBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addOrganizationBtnActionPerformed(evt);
            }
        });
        add(addOrganizationBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(304, 315, -1, -1));

        backBtn.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        backBtn.setText("Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });
        add(backBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(119, 315, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void addOrganizationBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addOrganizationBtnActionPerformed
        // TODO add your handling code here:
        Organization.OrganizationType type = (OrganizationType)organizationTypeComboBox.getSelectedItem();
        for(Organization org: enterprise.getOrganizationDirectory().getOrganizationList()){
            if(org.getName().equals(type.getValue())){
                JOptionPane.showMessageDialog(null, "Organization already exists");
                return;
            }
        }
        enterprise.getOrganizationDirectory().createAndAddOrganization(type);
        populateOrganizationTable();
    }//GEN-LAST:event_addOrganizationBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        jpanel.remove(this);
        CardLayout layout = (CardLayout)jpanel.getLayout();
        layout.previous(jpanel);
    }//GEN-LAST:event_backBtnActionPerformed

    private void organizationTypeComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_organizationTypeComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_organizationTypeComboBoxActionPerformed

    private void populateOrganizationTable(){
        DefaultTableModel model = (DefaultTableModel) organizationTable.getModel();
        
        model.setRowCount(0);
        
        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()){
            Object[] row = new Object[2];
            row[0] = organization.getOrganizationID();
            row[1] = organization.getName();
            
            model.addRow(row);
        }
    }
    private void populateCombo(){
        organizationTypeComboBox.removeAllItems();
        for (OrganizationType type : Organization.OrganizationType.values()){
            if (!type.getValue().equals(OrganizationType.Admin.getValue())){
                if(enterprise.getEnterpriseType().equals(Enterprise.EnterpriseType.HelpCenter)){
                    if(!(type.getValue().equals("Lab Organization")||type.getValue().equals("Pharmacist Organization")||type.getValue().equals("Food Manager Organization")||type.getValue().equals("Shelter Manager Organization"))){
                        organizationTypeComboBox.addItem(type);
                    }
                }else if(enterprise.getEnterpriseType().equals(Enterprise.EnterpriseType.Food)){
                        if(type.getValue().equals("Food Manager Organization"))
                            organizationTypeComboBox.addItem(type);
                }else if(enterprise.getEnterpriseType().equals(Enterprise.EnterpriseType.Hospital)){
                    if(type.getValue().equals("Pharmacist Organization")||type.getValue().equals("Lab Organization"))
                        organizationTypeComboBox.addItem(type);
                }else if(enterprise.getEnterpriseType().equals(Enterprise.EnterpriseType.ShelterHome)){
                    if(type.getValue().equals("Shelter Manager Organization")){
                        organizationTypeComboBox.addItem(type);
                    }
                }
            }
                
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addOrganizationBtn;
    private javax.swing.JButton backBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane;
    private javax.swing.JTable organizationTable;
    private javax.swing.JComboBox organizationTypeComboBox;
    // End of variables declaration//GEN-END:variables
}
