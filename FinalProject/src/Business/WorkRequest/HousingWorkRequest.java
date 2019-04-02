/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkRequest;

import Business.Accomodation.Accomodation;
import java.util.Date;

/**
 *
 * @author amans
 */
public class HousingWorkRequest extends WorkRequest{
    String status;
    private Accomodation acco;
    private Date checkIn;
    private Date checkOut;

    public Date getCheckOut() {
        return checkOut;
    }

    public void setCheckOut(Date checkOut) {
        this.checkOut = checkOut;
    }
    
    public Date getCheckIn() {
        return checkIn;
    }

    public void setCheckIn(Date checkIn) {
        this.checkIn = checkIn;
    }

    
    public Accomodation getAcco() {
        return acco;
    }

    public void setAcco(Accomodation acco) {
        this.acco = acco;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
