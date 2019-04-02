/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.HousingManagerRole;

import Business.Enterprise.HelpCenterEnterprise;
import Business.Homeless.HomelessIndividual;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkRequest.HousingWorkRequest;
import Business.WorkRequest.ReceptionistWorkRequest;
import Business.WorkRequest.WorkRequest;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Varada
 */
public class HousingManagerHomeJPanel extends javax.swing.JPanel {
     JPanel jPanel2;
    HelpCenterEnterprise enterprise;
    private Organization organization;
    private UserAccount account;

    /**
     * Creates new form HousingManagerHomeJPanel
     */
   
DefaultTableModel model;
    HousingManagerHomeJPanel(JPanel jPanel2, Organization organization, UserAccount account) {
        initComponents();
        this.jPanel2 = jPanel2;
        this.organization = organization;
        this.account = account;
        populateTable();
        populateAccountTable();
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
        housingTbl = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txtsearch = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        accountReqTbl = new javax.swing.JTable();

        setBackground(new java.awt.Color(120, 168, 252));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        housingTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Person ID", "Person Name", "Message"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(housingTbl);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(152, 70, 300, 99));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel1.setText("Search:");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(152, 206, -1, -1));

        txtsearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtsearchKeyReleased(evt);
            }
        });
        add(txtsearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(251, 205, 99, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Housing Manager Work Area");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(141, 16, -1, -1));

        accountReqTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Person ID", "Person Name", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(accountReqTbl);
        if (accountReqTbl.getColumnModel().getColumnCount() > 0) {
            accountReqTbl.getColumnModel().getColumn(2).setHeaderValue("Status");
        }

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(152, 267, 300, 99));
    }// </editor-fold>//GEN-END:initComponents

    private void txtsearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtsearchKeyReleased
        // TODO add your handling code here:
         String query = txtsearch.getText().toLowerCase();
        filter(query);
    }//GEN-LAST:event_txtsearchKeyReleased

 public void populateTable(){
         model = (DefaultTableModel)housingTbl.getModel();
        model.setRowCount(0);
        
        for(WorkRequest request: organization.getWorkQueue().getWorkRequestList()){
            Object []row = new Object[4];
            row[0] = request;
            row[1] = request.getHomeless().getFirstName()+ " " + request.getHomeless().getLastName();
            row[2] = request.getMessage();
            model.addRow(row);
        }
        
    }
  public void filter(String query)
    {
       
        
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(model);
        housingTbl.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(query));
    }
 
 public void populateAccountTable(){
     DefaultTableModel model = (DefaultTableModel)accountReqTbl.getModel();
     model.setRowCount(0);
     
     for(WorkRequest request: account.getWorkQueue().getWorkRequestList()){
         Object []row = new Object[3];
         HousingWorkRequest housing = (HousingWorkRequest)request;
         row[0] = housing;
         row[1] = housing.getHomeless().getFirstName()+ " "+ housing.getHomeless().getLastName();
         row[2] = housing.getStatus();
         model.addRow(row);
     }
 }
    
    public HomelessIndividual getSelectedPerson(){
        if(housingTbl.getSelectedRow()<0){
            JOptionPane.showMessageDialog(null, "Please select a record");
            return null;
        }
        else{
            WorkRequest request = (WorkRequest)housingTbl.getValueAt(housingTbl.getSelectedRow(), 0);
            return request.getHomeless();
        }
         
        
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable accountReqTbl;
    private javax.swing.JTable housingTbl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField txtsearch;
    // End of variables declaration//GEN-END:variables
}