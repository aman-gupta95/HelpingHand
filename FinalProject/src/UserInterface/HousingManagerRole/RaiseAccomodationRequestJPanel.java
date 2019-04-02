/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.HousingManagerRole;

import Business.Accomodation.Accomodation;
import Business.Enterprise.HelpCenterEnterprise;
import Business.Homeless.HomelessIndividual;
import Business.Organization.HousingOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkRequest.HousingWorkRequest;
import Business.WorkRequest.WorkRequest;
import java.awt.CardLayout;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Varada
 */
public class RaiseAccomodationRequestJPanel extends javax.swing.JPanel {
    private JPanel jPanel;
    private HelpCenterEnterprise enterprise;
    private UserAccount account;
    private HomelessIndividual homeless;
    private HousingManagerHomeJPanel hmhjp;
    private int prevNoOfSpots;
    private boolean firstDateChange= false;
    DateFormat df = new SimpleDateFormat("MM/dd/yyyy");
    /**
     * Creates new form RaiseAccomodationRequestJPanel
     */

    public RaiseAccomodationRequestJPanel(JPanel jPanel, HelpCenterEnterprise enterprise, UserAccount account, HomelessIndividual homeless, HousingManagerHomeJPanel hmhjp) {
        initComponents();
        this.jPanel = jPanel;
        this.enterprise = enterprise;
        this.homeless = homeless;
        this.account = account;
        this.hmhjp = hmhjp;
        Date checkIn = new Date();
        try{
             checkIn = df.parse(df.format(checkIn));
        }catch(Exception e){
            System.out.println(e);
        }
        populateAccoTable(checkIn);
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
        availabilityTbl = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        generateTicketBtn = new javax.swing.JButton();
        jXDatePicker1 = new org.jdesktop.swingx.JXDatePicker();
        backBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(120, 168, 252));

        availabilityTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Accomodation Name", "Location", "No. of Spots Available"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(availabilityTbl);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Start Date:");

        generateTicketBtn.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        generateTicketBtn.setText("Generate Ticket");
        generateTicketBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generateTicketBtnActionPerformed(evt);
            }
        });

        jXDatePicker1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jXDatePicker1MouseClicked(evt);
            }
        });
        jXDatePicker1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jXDatePicker1ActionPerformed(evt);
            }
        });

        backBtn.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        backBtn.setText("Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Raise Accomodation Request");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(82, 82, 82)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(65, 65, 65)
                            .addComponent(jLabel1)
                            .addGap(9, 9, 9)
                            .addComponent(jXDatePicker1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGap(86, 86, 86)
                            .addComponent(backBtn)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(generateTicketBtn)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(176, 176, 176)
                        .addComponent(jLabel2)))
                .addContainerGap(107, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel2)
                .addGap(36, 36, 36)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jXDatePicker1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(generateTicketBtn)
                    .addComponent(backBtn))
                .addGap(62, 62, 62))
        );
    }// </editor-fold>//GEN-END:initComponents
private void populateAccoTable(Date date){
        DefaultTableModel model = (DefaultTableModel)availabilityTbl.getModel();
        
        model.setRowCount(0);
        boolean availabilityFlag = false;
        for(Accomodation acco: enterprise.getAccomodationDirectory().getAccomodationDirectory()){
            prevNoOfSpots = acco.getNoOfSpots();
            for(WorkRequest request: account.getWorkQueue().getWorkRequestList()){
                HousingWorkRequest housingReq = (HousingWorkRequest)request;
                if(date.after(housingReq.getCheckOut()) && housingReq.getAcco().getAccomodationName()==acco.getAccomodationName()){
                    availabilityFlag = true;
                }else
                    availabilityFlag = false;
            }
            if(availabilityFlag==true){
                if(!firstDateChange){
                    firstDateChange=true;
                    prevNoOfSpots++;
                    availabilityFlag=false;
                }else{
                    firstDateChange = false;
                }
            }
            Object[] row = new Object[3];
            row[0] = acco;
            row[1] = acco.getLocation();
            row[2] = prevNoOfSpots;
            model.addRow(row);
        }
        
    }

    
    public Accomodation getSelectedAccomodation(){
        Accomodation acco = (Accomodation)availabilityTbl.getValueAt(availabilityTbl.getSelectedRow(), 0);
        return acco;
    }
    private void jXDatePicker1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jXDatePicker1ActionPerformed
        // TODO add your handling code here:
        Date checkIn = new Date();
        try{
             checkIn = df.parse(df.format(jXDatePicker1.getDate()));
        }catch(Exception e){
            System.out.println(e);
        }
        populateAccoTable(checkIn);
    }//GEN-LAST:event_jXDatePicker1ActionPerformed

    private void jXDatePicker1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jXDatePicker1MouseClicked
        // TODO add your handling code here:
       
    }//GEN-LAST:event_jXDatePicker1MouseClicked

    private void generateTicketBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generateTicketBtnActionPerformed
        // TODO add your handling code here:
        Date checkIn = new Date();
        try{
             checkIn = df.parse(df.format(jXDatePicker1.getDate()));
        }catch(Exception e){
            System.out.println(e);
        }
        Calendar c = Calendar.getInstance();
        c.setTime(checkIn);
        c.add(Calendar.DAY_OF_MONTH,2);
        Date checkOut = new Date();
        try{
            checkOut = df.parse(df.format(c.getTime()));
        }catch(Exception e){
            System.out.println(e);
        }
        HousingWorkRequest housing = new HousingWorkRequest();
        housing.setCheckIn(checkIn);
        housing.setCheckOut(checkOut);
        housing.setHomeless(homeless);
        System.out.println(availabilityTbl.getSelectedRow());
        Accomodation acco = (Accomodation)availabilityTbl.getValueAt(availabilityTbl.getSelectedRow(), 0);
        int spots  = (int) availabilityTbl.getValueAt(availabilityTbl.getSelectedRow(), 2);
        if(acco.getNoOfSpots()==0){
            JOptionPane.showMessageDialog(null, "No spots available here. Please select another property");
            return;
        }
        housing.setAcco(acco);
        housing.setStatus(WorkRequest.WorkStatusType.Completed.getValue());
        acco.setNoOfSpots(spots-1);
        enterprise.getAccomodationDirectory().getAccomodationDirectory().set(enterprise.getAccomodationDirectory().getAccomodationDirectory().indexOf(acco), acco);
        account.getWorkQueue().getWorkRequestList().add(housing);
        Organization org = null;
        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()){
            if(organization instanceof HousingOrganization){
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
        JOptionPane.showMessageDialog(null, "Ticket generated");
    }//GEN-LAST:event_generateTicketBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        jPanel.remove(this);
        CardLayout layout = (CardLayout)jPanel.getLayout();
        layout.previous(jPanel);
        hmhjp.populateTable();;
        hmhjp.populateAccountTable();
    }//GEN-LAST:event_backBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable availabilityTbl;
    private javax.swing.JButton backBtn;
    private javax.swing.JButton generateTicketBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private org.jdesktop.swingx.JXDatePicker jXDatePicker1;
    // End of variables declaration//GEN-END:variables
}