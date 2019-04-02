/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.HousingManagerRole;

import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.HelpCenterEnterprise;
import Business.Homeless.HomelessIndividual;
import Business.Organization.DoctorOrganization;
import Business.Organization.HousingOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkRequest.WorkRequest;
import UserInterface.ReceptionistRole.RaiseWorkRequest;

import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Varada
 */
public class HousingManagerWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form HousingManagerWorkAreaJPanel
     */
     JPanel jpanel;
    Enterprise enterprise;
    UserAccount account;
    EcoSystem ecosystem;
    HousingManagerHomeJPanel hm;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    private Organization org;
    public HousingManagerWorkAreaJPanel(JPanel jpanel,EcoSystem ecosystem, HelpCenterEnterprise enterprise, UserAccount useraccount) {
        initComponents();
         this.jpanel = jpanel;
        this.enterprise = enterprise;
        this.account = useraccount;
        this.ecosystem = ecosystem;
         for(Organization org : enterprise.getOrganizationDirectory().getOrganizationList()){
            if(org instanceof HousingOrganization)
                this.org = org;
        }
        this.hm = new HousingManagerHomeJPanel(jPanel2,org,useraccount);
        jPanel2.add("HousingManagerHomePanel", hm);
        CardLayout layout = (CardLayout)jPanel2.getLayout();
        layout.next(jPanel2);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        logoutBtn = new javax.swing.JButton();
        raiseRequestLbl = new javax.swing.JLabel();
        viewTicketsLbl = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();

        jPanel1.setBackground(new java.awt.Color(71, 120, 197));

        logoutBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        logoutBtn.setText("Logout");
        logoutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutBtnActionPerformed(evt);
            }
        });

        raiseRequestLbl.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        raiseRequestLbl.setForeground(new java.awt.Color(255, 255, 255));
        raiseRequestLbl.setText("Raise Accomodation Request");
        raiseRequestLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                raiseRequestLblMouseClicked(evt);
            }
        });

        viewTicketsLbl.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        viewTicketsLbl.setForeground(new java.awt.Color(255, 255, 255));
        viewTicketsLbl.setText("Generated Tickets");
        viewTicketsLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                viewTicketsLblMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(raiseRequestLbl)
                    .addComponent(logoutBtn)
                    .addComponent(viewTicketsLbl))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(127, 127, 127)
                .addComponent(raiseRequestLbl)
                .addGap(26, 26, 26)
                .addComponent(viewTicketsLbl)
                .addGap(26, 26, 26)
                .addComponent(logoutBtn)
                .addContainerGap(235, Short.MAX_VALUE))
        );

        jSplitPane1.setLeftComponent(jPanel1);

        jPanel2.setBackground(new java.awt.Color(120, 168, 252));
        jPanel2.setLayout(new java.awt.CardLayout());
        jSplitPane1.setRightComponent(jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 816, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void logoutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutBtnActionPerformed
        // TODO add your handling code here:
        jpanel.remove(this);
        CardLayout layout = (CardLayout)jpanel.getLayout();
        layout.previous(jpanel);
        dB4OUtil.storeSystem(ecosystem);
    }//GEN-LAST:event_logoutBtnActionPerformed

    private void raiseRequestLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_raiseRequestLblMouseClicked
        // TODO add your handling code here:
        if(hm.getSelectedPerson()!=null)
        {
            RaiseAccomodationRequestJPanel ra= new RaiseAccomodationRequestJPanel(jPanel2, (HelpCenterEnterprise) enterprise, account, hm.getSelectedPerson(), hm);
            jPanel2.add("RaiseAccomodationRequestJPanel", ra);
            CardLayout layout = (CardLayout)jPanel2.getLayout();
            layout.next(jPanel2);
        }
    }//GEN-LAST:event_raiseRequestLblMouseClicked

    private void viewTicketsLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewTicketsLblMouseClicked
        // TODO add your handling code here:
        GeneratedTicketsJPanel gtjp = new GeneratedTicketsJPanel(jPanel2, account);
        jPanel2.add("Generated Tickets JPanel", gtjp);
        CardLayout layout = (CardLayout)jPanel2.getLayout();
        layout.next(jPanel2);
    }//GEN-LAST:event_viewTicketsLblMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JButton logoutBtn;
    private javax.swing.JLabel raiseRequestLbl;
    private javax.swing.JLabel viewTicketsLbl;
    // End of variables declaration//GEN-END:variables
}
