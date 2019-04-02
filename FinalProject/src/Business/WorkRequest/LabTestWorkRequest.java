/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkRequest;

import Business.Enterprise.HelpCenterEnterprise;
import java.util.HashMap;

/**
 *
 * @author amans
 */
public class LabTestWorkRequest extends WorkRequest{
    private String testResult;
    private String testStatus;
    private String testType;
    private String testSampleId;
    private HelpCenterEnterprise enterprise;
    private HashMap<String, Integer> prescription;

    public LabTestWorkRequest(){
        this.prescription = new HashMap<>();
    }
    public HashMap<String, Integer> getPrescription() {
        return prescription;
    }

    public void setPrescription(HashMap<String, Integer> prescription) {
        this.prescription = prescription;
    }
    
    
    public String getTestSampleId() {
        return testSampleId;
    }

    public void setTestSampleId(String testSampleId) {
        this.testSampleId = testSampleId;
    }

    public String getTestType() {
        return testType;
    }

    public void setTestType(String testType) {
        this.testType = testType;
    }
    
    public String getTestStatus() {
        return testStatus;
    }

    public void setTestStatus(String testStatus) {
        this.testStatus = testStatus;
    }
    
    public String getTestResult() {
        return testResult;
    }

    public void setTestResult(String testResult) {
        this.testResult = testResult;
    }

    public HelpCenterEnterprise getEnterprise() {
        return enterprise;
    }

    public void setEnterprise(HelpCenterEnterprise enterprise) {
        this.enterprise = enterprise;
    }
    @Override
    public String toString(){
        return this.getTestSampleId();
    }
}
