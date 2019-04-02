/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.AdminRole;

import Business.Employee.Employee;
import Business.Enterprise.Enterprise;import Business.Organization.Organization;
import Business.Role.Role;
import Business.UserAccount.UserAccountDirectory;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Varada
 */
public class ManageUserAccountJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageUserJPanel
     */
    JPanel jpanel;
    Enterprise enterprise;
    UserAccountDirectory usr;
    public ManageUserAccountJPanel(JPanel jpanel, Enterprise enterprise) {
        initComponents();
        this.usr = new UserAccountDirectory();
        this.jpanel = jpanel;
        this.enterprise = enterprise;
        
         popOrganizationComboBox();
         popData();
    }
    
    public void popOrganizationComboBox() {
        orgComboBox.removeAllItems();

        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
            orgComboBox.addItem(organization);
        }
    }
    
    public void populateEmployeeComboBox(Organization organization){
        employeeComboBox.removeAllItems();
        
        for (Employee employee : organization.getEmployeeDirectory().getEmployeeList()){
            employeeComboBox.addItem(employee);
        }
    }
    
    private void populateRoleComboBox(Organization organization){
        roleComboBox.removeAllItems();
        for (Role role : organization.getSupportedRole()){
            roleComboBox.addItem(role);
        }
    }

    public void popData() {

        DefaultTableModel model = (DefaultTableModel) userTable.getModel();

        model.setRowCount(0);

        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
            for (UserAccount ua : organization.getUserAccountDirectory().getUserAccountList()) {
                Object row[] = new Object[2];
                row[0] = ua;
                row[1] = ua.getRole();
                ((DefaultTableModel) userTable.getModel()).addRow(row);
            }
        }
    }
   public boolean checkIfUsernameIsUnique(String username){
         for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList())
         {
            for (UserAccount ua : organization.getUserAccountDirectory().getUserAccountList())
         {
            if(ua.getUsername().equals(username))
            
         
                     return false; 
         }
         }
          return true;
         }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor. 
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        userTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        orgComboBox = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        employeeComboBox = new javax.swing.JComboBox();
        role = new javax.swing.JLabel();
        roleComboBox = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        usernameTxtField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        passwordTxtField = new javax.swing.JTextField();
        addUserBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(120, 168, 252));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        userTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "UserName", "Role"
            }
        ));
        userTable.setEnabled(false);
        jScrollPane1.setViewportView(userTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 78, 400, 96));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Organization:");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 192, -1, -1));

        orgComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        orgComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orgComboBoxActionPerformed(evt);
            }
        });
        add(orgComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(206, 192, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Employee:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 237, -1, -1));

        employeeComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(employeeComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(206, 236, -1, -1));

        role.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        role.setForeground(new java.awt.Color(255, 255, 255));
        role.setText("Role:");
        add(role, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, -1, -1));

        roleComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(roleComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(206, 280, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Username:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 324, -1, -1));
        add(usernameTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(202, 324, 82, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Password:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 368, -1, -1));
        add(passwordTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(201, 368, 83, -1));

        addUserBtn.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        addUserBtn.setText("Add User");
        addUserBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addUserBtnActionPerformed(evt);
            }
        });
        add(addUserBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(202, 412, -1, -1));

        backBtn.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        backBtn.setText("Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });
        add(backBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 412, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Manage User Account");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(156, 16, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void orgComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orgComboBoxActionPerformed
        // TODO add your handling code here:
        Organization organization = (Organization) orgComboBox.getSelectedItem();
        if (organization != null){
            populateEmployeeComboBox(organization);
            populateRoleComboBox(organization);
        }
    }//GEN-LAST:event_orgComboBoxActionPerformed

    private void addUserBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addUserBtnActionPerformed
        // TODO add your handling code here:
       
        String userName = usernameTxtField.getText();
       
          
        if(checkIfUsernameIsUnique(userName)== false)
        {
            JOptionPane.showMessageDialog(null, "Username already exists");
            usernameTxtField.setText(" ");
            return;
        }
        
        String password = passwordTxtField.getText();
        Organization organization = (Organization) orgComboBox.getSelectedItem();
        Employee employee = (Employee) employeeComboBox.getSelectedItem();
        Role role = (Role) roleComboBox.getSelectedItem();
        
        organization.getUserAccountDirectory().createUserAccount(userName, password, employee, role);
        
        popData();
    }//GEN-LAST:event_addUserBtnActionPerformed

    private void usernameTxtFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_usernameTxtFieldFocusLost
        // TODO add your handling code here:
        
    }//GEN-LAST:event_usernameTxtFieldFocusLost

    private void usernameTxtFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_usernameTxtFieldKeyReleased
        // TODO add your handling code here:
         
    }//GEN-LAST:event_usernameTxtFieldKeyReleased

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
          jpanel.remove(this);
        CardLayout layout = (CardLayout)jpanel.getLayout();
        layout.previous(jpanel);
    }//GEN-LAST:event_backBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addUserBtn;
    private javax.swing.JButton backBtn;
    private javax.swing.JComboBox employeeComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox orgComboBox;
    private javax.swing.JTextField passwordTxtField;
    private javax.swing.JLabel role;
    private javax.swing.JComboBox roleComboBox;
    private javax.swing.JTable userTable;
    private javax.swing.JTextField usernameTxtField;
    // End of variables declaration//GEN-END:variables
}