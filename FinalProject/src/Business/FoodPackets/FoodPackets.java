/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.FoodPackets;

import java.util.Date;

/**
 *
 * @author Varada
 */
public class FoodPackets {
    private int senderId;
    private int quantity;
    private Date expiry;
    private Date sent;
    public FoodPackets(int senderId, Date sent, Date expiry, int quantity){
    this.setSenderId(senderId);
    this.setSent(sent);
    this.setExpiry(expiry);
    this.setQuantity(quantity);
    }

    public int getSenderId() {
        return senderId;
    }

    public void setSenderId(int senderId) {
        this.senderId = senderId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Date getExpiry() {
        return expiry;
    }

    public void setExpiry(Date expiry) {
        this.expiry = expiry;
    }

    public Date getSent() {
        return sent;
    }

    public void setSent(Date sent) {
        this.sent = sent;
    }
    
    @Override
    public String toString(){
        return String.valueOf(this.getSenderId());
}
    
}
