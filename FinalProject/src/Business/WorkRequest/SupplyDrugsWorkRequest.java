/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkRequest;

import Business.Drug.Drug;
import Business.Enterprise.HelpCenterEnterprise;
import java.util.HashMap;

/**
 *
 * @author amans
 */
public class SupplyDrugsWorkRequest extends WorkRequest{
    private String testStatus;
    private Drug drug;
    private int quantity;
    private HelpCenterEnterprise enterprise;
    
    public SupplyDrugsWorkRequest(){
    }

    public String getTestStatus() {
        return testStatus;
    }

    public void setTestStatus(String testStatus) {
        this.testStatus = testStatus;
    }

    public Drug getDrug() {
        return drug;
    }

    public void setDrug(Drug drug) {
        this.drug = drug;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public HelpCenterEnterprise getEnterprise() {
        return enterprise;
    }

    public void setEnterprise(HelpCenterEnterprise enterprise) {
        this.enterprise = enterprise;
    }
}
