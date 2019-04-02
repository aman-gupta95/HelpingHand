/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Homeless;

import java.util.Date;

/**
 *
 * @author amans
 */
public class HomelessIndividual {
    private static int count=0;
    private int id;
    private String FirstName;
    private String LastName;
    private String ssn;
    private Date date;
    private String sex;
    
    public HomelessIndividual(int id, String firstName, String lastName, String ssn, Date date, String sex){
        this.setDate(date);
        this.setFirstName(firstName);
        this.setId(id);
        this.setLastName(lastName);
        this.setSex(sex);
        this.setSsn(ssn);
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
    @Override
    public String toString() {
        return String.valueOf(this.getId());
    }
}
