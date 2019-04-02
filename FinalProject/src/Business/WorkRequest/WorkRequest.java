/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkRequest;

import Business.Accomodation.Accomodation;
import Business.Homeless.HomelessIndividual;
import Business.UserAccount.UserAccount;
import java.util.Date;

/**
 *
 * @author amans
 */
public abstract class WorkRequest {
    private int id;
    private String message;
    private UserAccount sender;
    private UserAccount receiver;
    private Date requestDate;
    private Date resolveDate;
    private HomelessIndividual homeless;
    
    
    public enum WorkStatusType{
        Pending("Pending"), Accepted("Accepted"), Processed("Processed"), Completed("Completed"), TestRequested("Test Requested"), Prescribed("Prescribed");
        private String value;
        private WorkStatusType(String value){
            this.value = value;
        }
        public String getValue() {
            return value;
        }
    }
    
    public WorkRequest(){
        requestDate = new Date();
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public UserAccount getSender() {
        return sender;
    }

    public void setSender(UserAccount sender) {
        this.sender = sender;
    }

    public UserAccount getReceiver() {
        return receiver;
    }

    public void setReceiver(UserAccount receiver) {
        this.receiver = receiver;
    }

    public Date getRequestDate() {
        return requestDate;
    }

    public void setRequestDate(Date requestDate) {
        this.requestDate = requestDate;
    }

    public Date getResolveDate() {
        return resolveDate;
    }

    public void setResolveDate(Date resolveDate) {
        this.resolveDate = resolveDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public HomelessIndividual getHomeless() {
        return homeless;
    }

    public void setHomeless(HomelessIndividual homeless) {
        this.homeless = homeless;
    }
    
    @Override
    public String toString(){
        return String.valueOf(this.getHomeless().getId());
    }
}
