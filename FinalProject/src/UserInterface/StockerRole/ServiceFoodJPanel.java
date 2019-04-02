/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.StockerRole;
import java.text.SimpleDateFormat; 

import Business.Enterprise.HelpCenterEnterprise;
import Business.FoodPackets.FoodPackets;
import Business.Homeless.HomelessIndividual;
import Business.Organization.Organization;
import Business.Organization.StockerOrganization;
import Business.UserAccount.UserAccount;
import Business.WorkRequest.StockerWorkRequest;
import Business.WorkRequest.WorkRequest;
import java.awt.CardLayout;
import java.text.DateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Varada
 */
public class ServiceFoodJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ServiceFoodJPanel
     */
    HelpCenterEnterprise helpCenterEnterprise;
    JPanel jPanel1;
    UserAccount account;
    HomelessIndividual homeless;
    StockerHomeJPanel shjp;
    StockerWorkRequest request;
    public ServiceFoodJPanel(StockerHomeJPanel shjp, JPanel jpanel1, HelpCenterEnterprise helpCenterEnterprise, UserAccount account, HomelessIndividual homeless) {
        initComponents();
        this.jPanel1=jpanel1;
        this.helpCenterEnterprise=helpCenterEnterprise;
        this.account=account;
        this.shjp = shjp;
        this.homeless = homeless;
        populateAvailableTbl();
        personIdLbl.setText(String.valueOf(homeless.getId()));
        personNameLbl.setText(String.valueOf(homeless.getFirstName())+" "+homeless.getLastName());
        
    }
    
    public void populateAvailableTbl(){
        DefaultTableModel dtm = (DefaultTableModel)availableTbl.getModel();
        DateFormat df = new SimpleDateFormat("MM/dd/yyyy");
        Date todayDate = new Date();
        try{
            todayDate = df.parse(df.format(todayDate));
        }catch(Exception e){
            System.out.println(e);
        }
        dtm.setRowCount(0);
        Object[] row = new Object[4];
        for (FoodPackets foodPacket : helpCenterEnterprise.getFoodPacketDirectory().getFoodPacketDirectory()){
            Date foodPacketDate = new Date();
            try{
                foodPacketDate = df.parse(df.format(foodPacket.getExpiry()));
            }catch(Exception e){
                System.out.println(e);
            }
            if(filterFood.getSelectedItem().toString().equals("Available Food Packets")&& todayDate.before(foodPacketDate)){
                
            row[0] = foodPacket;
            row[1] = foodPacket.getSent();
            row[2] = foodPacket.getExpiry();
            row[3] = foodPacket.getQuantity();
            dtm.addRow(row);
        }else if(filterFood.getSelectedItem().toString().equals("Expired Food Packets")&& todayDate.after(foodPacketDate)){
            row[0] = foodPacket;
            row[1] = foodPacket.getSent();
            row[2] = foodPacket.getExpiry();
            row[3] = foodPacket.getQuantity();
            dtm.addRow(row);
        }
    }
        
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
        jScrollPane1 = new javax.swing.JScrollPane();
        availableTbl = new javax.swing.JTable();
        giveawayBtn = new javax.swing.JButton();
        personIdLbl = new javax.swing.JLabel();
        personNameLbl = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        requestedTxtField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        filterFood = new javax.swing.JComboBox();
        backBtn = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(120, 168, 252));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Person ID:");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(91, 295, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Person Name:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(91, 341, -1, -1));

        availableTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Sender ID", "Date Sent", "Date of Expiry", "Available Packets"
            }
        ));
        jScrollPane1.setViewportView(availableTbl);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(91, 124, 489, 100));

        giveawayBtn.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        giveawayBtn.setText("Giveaway");
        giveawayBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                giveawayBtnActionPerformed(evt);
            }
        });
        add(giveawayBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(473, 242, -1, -1));
        add(personIdLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(224, 297, 99, 20));
        add(personNameLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(224, 341, 99, 22));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Enter Quantity:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(91, 246, -1, -1));

        requestedTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestedTxtFieldActionPerformed(evt);
            }
        });
        add(requestedTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(224, 245, 84, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Filter Food:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(177, 48, -1, -1));

        filterFood.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        filterFood.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Available Food Packets", "Expired Food Packets" }));
        filterFood.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                filterFoodItemStateChanged(evt);
            }
        });
        add(filterFood, new org.netbeans.lib.awtextra.AbsoluteConstraints(307, 45, -1, -1));

        backBtn.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        backBtn.setText("Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });
        add(backBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(91, 391, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Service Food Packets");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 10, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void requestedTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requestedTxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_requestedTxtFieldActionPerformed

    private void giveawayBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_giveawayBtnActionPerformed
        // TODO add your handling code here:
        System.out.println(giveawayBtn.getText());
        if(giveawayBtn.getText().equals("Giveaway")){
            int requested = Integer.parseInt(requestedTxtField.getText());
            if(availableTbl.getSelectedRow()== -1){
                JOptionPane.showMessageDialog(null, "Please select food packet to send");
                return;
            }
            FoodPackets packet = (FoodPackets)availableTbl.getValueAt(availableTbl.getSelectedRow(), 0);
            if(packet.getQuantity()<requested){
                JOptionPane.showMessageDialog(null, "Not enough food packets available in this entry. Please select another one.");
                return;
            }
            int availableQuan = packet.getQuantity() - requested;
            WorkRequest.WorkStatusType type = WorkRequest.WorkStatusType.Completed;
            StockerWorkRequest request = new StockerWorkRequest();
            request.setHomeless(homeless);
            request.setStatus(type.getValue());
            request.setQuantity(requested);
            packet.setQuantity(availableQuan);
            helpCenterEnterprise.getFoodPacketDirectory().getFoodPacketDirectory().set(helpCenterEnterprise.getFoodPacketDirectory().getFoodPacketDirectory().indexOf(packet), packet);
            account.getWorkQueue().getWorkRequestList().add(request);
            for(Organization org: helpCenterEnterprise.getOrganizationDirectory().getOrganizationList()){
                if(org instanceof StockerOrganization){
                    for(WorkRequest req: org.getWorkQueue().getWorkRequestList()){
                        if(req.getHomeless()==homeless){
                            org.getWorkQueue().getWorkRequestList().remove(req);
                            break;
                        }
                    }
                    break;
                }
            }
            JOptionPane.showMessageDialog(null, "Food Packet sent!");
        }
        else if(giveawayBtn.getText().equals("Discard Food Item")){
            FoodPackets foodPacket = (FoodPackets)availableTbl.getValueAt(availableTbl.getSelectedRow(), 0);
            helpCenterEnterprise.getFoodPacketDirectory().getFoodPacketDirectory().remove(foodPacket);
        }
        populateAvailableTbl();
    }//GEN-LAST:event_giveawayBtnActionPerformed

    private void filterFoodItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_filterFoodItemStateChanged
        // TODO add your handling code here:
        if(filterFood.getSelectedItem()=="Expired Food Packets"){
            giveawayBtn.setText("Discard Food Item");
            requestedTxtField.setEnabled(false);
        }else if(filterFood.getSelectedItem()=="Available Food Packets"){
            giveawayBtn.setText("Giveaway");
            requestedTxtField.setEnabled(true);
        }
        populateAvailableTbl();
    }//GEN-LAST:event_filterFoodItemStateChanged

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        jPanel1.remove(this);
        CardLayout layout = (CardLayout)jPanel1.getLayout();
        layout.previous(jPanel1);
        shjp.populateFoodRequest();;
        shjp.populateLogTable();
    }//GEN-LAST:event_backBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable availableTbl;
    private javax.swing.JButton backBtn;
    private javax.swing.JComboBox filterFood;
    private javax.swing.JButton giveawayBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel personIdLbl;
    private javax.swing.JLabel personNameLbl;
    private javax.swing.JTextField requestedTxtField;
    // End of variables declaration//GEN-END:variables

    private Object Date() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
