/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Drug;

import java.util.Date;

/**
 *
 * @author amans
 */
public class Drug {
    private int id;
    private String name;
    private Date date;
    private int quantity;
    
    public Drug(int id, String name, Date date, int quantity){
        this.setId(id);
        this.setName(name);
        this.setDate(date);
        this.setQuantity(quantity);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
    @Override
    public String toString(){
        return String.valueOf(this.getId());
    }
    
}
