/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkRequest;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author amans
 */
public class PrescribeMedsWorkRequest extends WorkRequest{
    
    private String testStatus;
    private HashMap<String, Integer> prescription;
    
    public PrescribeMedsWorkRequest(){
        this.prescription = new HashMap<>();
    }
    
    public String getTestStatus() {
        return testStatus;
    }

    public void setTestStatus(String testStatus) {
        this.testStatus = testStatus;
    }

    public HashMap<String, Integer> getPrescription() {
        return prescription;
    }

}
